package de.mdelab.simulator.mrubis.examples.selfoptimization.eventmape;

import java.util.logging.Level;

import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.Simulator;
import de.mdelab.simulator.UtilityFunction;
import de.mdelab.simulator.events.ChangeEventQueues;
import de.mdelab.simulator.mrubis.examples.selfoptimization.SelfOptimizationConfig;
import de.mdelab.simulator.mrubis.examples.selfoptimization.SelfOptimizationScenario;
import de.mdelab.simulator.mrubis.utility.MRubisSelfOptimizationUtilityFunction;

/**
 * A feedback loop for self-optimizing the performance of mRUBiS by handling the
 * issues PI1, PI2, and PI3.
 * 
 * The feedback loop is event-based, that is, it uses events notifying about
 * changes of the model (these changes were made by the simulator when injecting
 * issues into the model) to locate changes in the model instead of searching
 * the whole model for issues.
 * 
 * Moreover, the feedback loop is structured in four activities according to
 * MAPE-K. The knowledge is captured in the model and the activities communicate
 * with each other using {@link Annotations} in the model.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class EventBasedMapeFeedbackLoop {

	/**
	 * Runs the self-optimization feedback loop.
	 * 
	 * @param architecture
	 *            the root element of the model
	 * @param queues
	 *            the queues of the change events provided by the simulator
	 * @param responseTimeUpperThreshold
	 *            the upper threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeLowerThreshold
	 *            the lower threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeGoal
	 *            the goal for the average response time of the personalized search
	 */
	public void run(Architecture architecture, ChangeEventQueues queues, int responseTimeUpperThreshold,
			int responseTimeLowerThreshold, int responseTimeGoal) {
		Annotations annotations = architecture.getAnnotations();
		Monitor m = new Monitor();
		if (m.monitor(queues)) {
			PipeAdaptationHelper helper = new PipeAdaptationHelper();

			Analyze a = new Analyze(helper);
			a.analyze(annotations, queues, responseTimeUpperThreshold, responseTimeLowerThreshold);

			Plan p = new Plan(helper);
			p.plan(annotations, responseTimeGoal);

			Execute e = new Execute();
			e.execute(annotations);
		}
	}

	/**
	 * Main to run the simulator and feedback loop.
	 * 
	 * @param args
	 *            <code>null</code>
	 */
	public static void main(String[] args) {
		// load the model
		String modelURI = "./model/mRUBiS_performance.comparch";
		Architecture architecture = SelfOptimizationConfig.loadModel(modelURI);

		// parameters for the self-optimization case:
		// - threshold for the number of exceptions; required for computing the utility
		// - performance monitoring interval in terms of invocation counts between two
		// performance measurements
		// - the goal, the upper threshold, and the lower threshold for the average
		// response time of the personalized search
		int exceptionThreshold = 5;
		int performanceMonitoringIntervall = 50;
		int responseTimeGoal = 1000;
		int responseTimeUpperThreshold = 1150;
		int responseTimeLowerThreshold = 850;

		// Instantiate the utility function and scenario
		UtilityFunction utilityFunction = new MRubisSelfOptimizationUtilityFunction(exceptionThreshold,
				responseTimeUpperThreshold);
		Scenario scenario = new SelfOptimizationScenario(architecture, performanceMonitoringIntervall,
				responseTimeUpperThreshold, responseTimeLowerThreshold);

		// parameters for the simulator
		int rounds = 4;
		long injectionDelayMS = 100;
		boolean eventTrackingEnabled = true;
		boolean logToConsole = true;

		// get an instance of the simulator
		Simulator simulator = Simulator.FACTORY.createSimulator(architecture, utilityFunction, scenario, rounds,
				injectionDelayMS, eventTrackingEnabled, Level.CONFIG, logToConsole);
		// add the validators for self-optimization to the simulator
		SelfOptimizationConfig.addValidators(simulator, responseTimeUpperThreshold, responseTimeLowerThreshold,
				responseTimeGoal, performanceMonitoringIntervall);

		// instantiate the feedback loop
		EventBasedMapeFeedbackLoop loop = new EventBasedMapeFeedbackLoop();

		// run the simulation
		do {
			// trigger the simulator to inject issues
			simulator.injectIssues();

			// run feedback loop and repair the issues
			loop.run(architecture, simulator.getChangeEventsQueues(), responseTimeUpperThreshold,
					responseTimeLowerThreshold, responseTimeGoal);

			// trigger the simulator to validate the model
			simulator.validateModel();

			// snapshot the model
			// simulator.snapshotModel();

			// repeat until the simulation is completed
		} while (!simulator.isSimulationCompleted());

		// create and show final results (see folder "results" of the project)
		simulator.showResults();
	}

}
