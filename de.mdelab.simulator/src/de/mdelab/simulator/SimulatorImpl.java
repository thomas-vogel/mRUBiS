package de.mdelab.simulator;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.Architecture;
import de.mdelab.simulator.events.ChangeEventObserver;
import de.mdelab.simulator.events.ChangeEventQueues;
import de.mdelab.simulator.impl.InjectionController;
import de.mdelab.simulator.impl.LogUtil;
import de.mdelab.simulator.impl.PerformanceEntry;
import de.mdelab.simulator.impl.PerformanceResults;
import de.mdelab.simulator.impl.Timer;
import de.mdelab.simulator.impl.UtilityEntry;
import de.mdelab.simulator.impl.UtilityResults;
import de.mdelab.simulator.validators.events.ValidatorChangeEventObserver;

/**
 * Implementation of the {@link Simulator}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class SimulatorImpl implements Simulator {

	private final static Logger LOGGER = Logger.getLogger(SimulatorImpl.class.getName());

	// params
	private Architecture architecture;
	private UtilityFunction utilityFunction;
	private int rounds;
	private long injectionDelayMS = 50;

	// simulator classes
	private InjectionController injectionController;
	private List<Validator> validators;
	private ChangeEventQueues changeEventQueues;

	// number of the current simulation round
	private int roundCount;
	// utility over time
	private UtilityResults utilityLogs;
	// performance over time
	private PerformanceResults performanceLogs;
	// snapshot counter
	private int snapshotCount = 0;

	// measuring execution time of the feedback loop
	private Timer feedbackLoop;
	// measuring execution time of delays
	private Timer delayTimer;
	// util
	private DecimalFormat df = new DecimalFormat("#.####");

	/**
	 * @see {@link SimulatorFactory#createSimulator(Architecture, UtilityFunction, Scenario, int, long, boolean, Level, boolean)}
	 */
	SimulatorImpl(Architecture architecture, UtilityFunction utilityFunction, Scenario scenario, int totalRounds,
			long injectionDelayMS, boolean eventTrackingEnabled, Level logLevel, boolean logToConsole) {

		LogUtil.configLogging(logLevel, logToConsole);

		this.architecture = architecture;
		// observe change events for the validators used in the simulator
		this.architecture.eAdapters().add(new ValidatorChangeEventObserver());
		// observe change events for the feedback loops
		if (eventTrackingEnabled) {
			this.changeEventQueues = new ChangeEventQueues();
			this.architecture.eAdapters().add(new ChangeEventObserver(this.changeEventQueues));
		}

		this.utilityFunction = utilityFunction;
		this.injectionController = new InjectionController(scenario);
		this.rounds = totalRounds;
		if (injectionDelayMS > 0) {
			this.injectionDelayMS = injectionDelayMS;
		} else {
			LOGGER.warning("The injection delay must be greater than 0. The default value of " + this.injectionDelayMS
					+ " ms is used.");
		}

		this.validators = new LinkedList<Validator>();
		this.feedbackLoop = new Timer();
		this.delayTimer = new Timer();
		this.utilityLogs = new UtilityResults(this.rounds);
		this.performanceLogs = new PerformanceResults(this.rounds);
		this.roundCount = 0;
	}

	/**
	 * @see Simulator#isSimulationCompleted()
	 */
	@Override
	public boolean isSimulationCompleted() {
		return this.roundCount == this.rounds;
	}

	/**
	 * @return <code>true</code> if the simulation has started yet, otherwise
	 *         <code>false</code>.
	 */
	private boolean hasSimulationStarted() {
		return this.roundCount > 0;
	}

	/**
	 * @see Simulator#addValidator(Validator)
	 */
	@Override
	public void addValidator(Validator validator) {
		if (this.roundCount == 0) {
			this.validators.add(validator);
		} else {
			LOGGER.warning("Simulation is alredy running. Analyzers cannot be added any more.");
		}
	}

	/**
	 * @see Simulator#validateModel()
	 */
	@Override
	public int validateModel() {
		PerformanceEntry currentPerformance = null;
		if (this.hasSimulationStarted()) {
			// at least one round of injections and one feedback loop has happened
			// stop logging feedback loop execution time
			long lastFeedbackLoopExecutionTime = this.feedbackLoop.stop();
			currentPerformance = new PerformanceEntry(lastFeedbackLoopExecutionTime, this.roundCount);
			this.performanceLogs.addEntry(currentPerformance);
		}

		LOGGER.info(LogUtil.H2 + "\nValidating the model and the adaptation...\n" + LogUtil.H2);
		if (this.validators.size() == 0) {
			LOGGER.warning("No validators are available.");
		}

		// validate the adaptation and the model
		int issueCount = 0;
		for (Validator validator : this.validators) {
			String validatorName = validator.getClass().getSimpleName();
			LOGGER.info(LogUtil.H4 + "\n" + validatorName + "\n" + LogUtil.H4);
			int issues = validator.validate(this.architecture);
			LOGGER.info(
					LogUtil.H4 + "\n" + issues + " issue(s) identified by " + validatorName + "\n" + LogUtil.H4 + "\n");
			issueCount += issues;
		}

		UtilityEntry currentUtility = this.computeUtility();
		this.utilityLogs.addEntry(currentUtility);

		this.logValidationRoundReport(issueCount, currentUtility, currentPerformance);

		if (this.hasSimulationStarted()) {
			// starts the delay timer since the feedback loop may not immediately invoke the
			// injectIssues() method after this method terminates. The delay timer measure
			// the time until the injectIssues() method is invoked.
			this.delayTimer.start();
		}
		return issueCount;
	}

	/**
	 * Logs a report of the validation,
	 * 
	 * @param issueCount
	 *            the number of issues identified by the validation
	 * @param utilityLog
	 *            the current utility data
	 * @param currentPerformance
	 *            the current performance data
	 */
	private void logValidationRoundReport(int issueCount, UtilityEntry utilityLog,
			PerformanceEntry currentPerformance) {
		StringBuffer roundReport = new StringBuffer(LogUtil.H3);
		roundReport.append("\nRound: ");
		roundReport.append(this.roundCount);
		roundReport.append("\nIdentified issues: ");
		roundReport.append(issueCount);
		roundReport.append("\n");
		roundReport.append(this.logUtility(utilityLog));
		if (this.roundCount > 0) {
			roundReport.append("\nExecution time of the last feedback loop run in ms: ");
			roundReport.append(currentPerformance.getExecutionTime());
			roundReport.append("\nTotal feedback loop execution time in ms: ");
			roundReport.append(this.performanceLogs.getTotalExcutionTime());
			roundReport.append("\nAverage feedback loop execution time per round in ms: ");
			roundReport.append(this.df.format(this.performanceLogs.getMeanExecutionTime()));
			roundReport.append("\nStandard deviation of the feedback loop execution time per round in ms: "
					+ this.df.format(this.performanceLogs.getStandardDeviation()));
			roundReport.append("\nTotal delay time in ms: ");
			roundReport.append(this.delayTimer.getTime());

		}
		roundReport.append("\n");
		roundReport.append(LogUtil.H3);
		LOGGER.info(roundReport.toString());
	}

	/**
	 * @see Simulator#injectIssues()
	 */
	@Override
	public void injectIssues() {
		if (this.feedbackLoop.isRunning()) {
			throw new SimulatorException("The methods injectIssues() and validateModel() must be invoked alternately.");
		}

		if (!this.hasSimulationStarted()) {
			// initial validation of the model
			this.validateModel();
		} else {
			// stops the delay timer started when the validateModel() has finished execution
			// to measure the time between finishing the validateModel() method and starting
			// the injectIssues() method, both invoked by the feedback loop.
			this.delayTimer.stop();
		}

		// delay the injection of issues
		this.delayInjection();

		// start next round of injections
		this.roundCount++;
		LOGGER.info("\n\n" + LogUtil.H1 + "\n" + this.roundCount + ". round of injecting issues\n" + LogUtil.H1);
		// inject issues
		this.injectionController.injectIssues(this.roundCount);
		// clear internal event queue as the internal event queues uses only events
		// caused by the feedback loop
		ValidatorChangeEventObserver.INTERNAL_EVENT_QUEUES.clearEvents();

		// compute and log utility
		UtilityEntry currentUtility = this.computeUtility();
		this.utilityLogs.addEntry(currentUtility);

		LOGGER.info(LogUtil.H4 + "\n" + this.logUtility(currentUtility) + "\n" + LogUtil.H4);

		// return to let the feedback loop perform the adaptation and to observe
		// the change events due to adaptation
		LOGGER.info("\n" + LogUtil.H3 + "\nFeedback loop should be run now...\n" + LogUtil.H3 + "\n\n");
		// start measuring feedback loop execution time
		this.feedbackLoop.start();
	}

	/**
	 * Delays the execution of the simulator, used for delaying the injection of
	 * issues.
	 */
	private void delayInjection() {
		this.delayTimer.start();
		try {
			Thread.sleep(this.injectionDelayMS);
		} catch (InterruptedException e) {
			LOGGER.warning("Simulator has been interrupted when delaying the injection of issues.");
		}
		this.delayTimer.stop();
	}

	/**
	 * @see Simulator#showResults()
	 */
	public void showResults() {
		if (this.isSimulationCompleted()) {
			Date timestamp = new Date(System.currentTimeMillis());
			this.utilityLogs.saveResults(timestamp);
			this.performanceLogs.saveResults(timestamp);
		} else {
			LOGGER.warning("Simulation results cannot only be created and shown when the simulation has completed.");
		}
	}

	/**
	 * Computes and returns the current utility of the managed system.
	 * 
	 * @return the current utility computed for the managed system.
	 */
	private UtilityEntry computeUtility() {
		double currentUtilityValue = this.utilityFunction.computeUtility(this.architecture);
		double lastUtilityValue = 0d;
		List<UtilityEntry> utilities = this.utilityLogs.getEntries();
		if (utilities.size() > 0) {
			UtilityEntry lastUtility = utilities.get(utilities.size() - 1);
			if (lastUtility != null) {
				lastUtilityValue = lastUtility.getUtilityValue();
			}
		}
		return new UtilityEntry(currentUtilityValue, this.feedbackLoop.getTime() + this.delayTimer.getTime(),
				this.roundCount, currentUtilityValue - lastUtilityValue);
	}

	/**
	 * Returns a String for logging the utility.
	 * 
	 * @param utility
	 *            the utility to be logged
	 * @return a String representation of the utility
	 */
	private String logUtility(UtilityEntry utility) {
		StringBuffer log = new StringBuffer("Current utility: ");
		log.append(this.df.format(utility.getUtilityValue()));
		if (this.roundCount > 0) {
			log.append(" (");
			double diffUtility = utility.getDiffUtilityValue();
			if (diffUtility > 0) {
				log.append("+");
			} else if (diffUtility == 0.0) {
				log.append("+/-");
			}
			log.append(this.df.format(diffUtility));
			log.append(")");
		}
		return log.toString();
	}

	/**
	 * @see Simulator#getChangeEventsQueues()
	 */
	@Override
	public ChangeEventQueues getChangeEventsQueues() {
		return this.changeEventQueues;
	}

	/**
	 * @see Simulator#snapshotModel()
	 */
	@Override
	public void snapshotModel() {
		this.snapshotCount++;
		String prefix = "";
		if (this.snapshotCount < 10) {
			prefix = "00";
		} else if (this.snapshotCount < 100) {
			prefix = "0";
		}
		ResourceSet rs = new ResourceSetImpl();
		String file = "./results/model_snapshot_" + prefix + this.snapshotCount + ".comparch";
		URI uri = URI.createFileURI(file);
		Resource snapshot = rs.createResource(uri);
		snapshot.getContents().add(EcoreUtil.copy(this.architecture));
		try {
			snapshot.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			LOGGER.warning("Cannot save snapshot " + file);
			e.printStackTrace();
		}
	}

}
