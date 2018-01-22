package de.mdelab.simulator.mrubis.examples.selfhealing.statemape;

import java.util.logging.Level;

import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.Simulator;
import de.mdelab.simulator.UtilityFunction;
import de.mdelab.simulator.mrubis.examples.selfhealing.SelfHealingConfig;
import de.mdelab.simulator.mrubis.examples.selfhealing.SelfHealingScenario;
import de.mdelab.simulator.mrubis.utility.MRubisSelfHealingUtilityFunction;

/**
 * A feedback loop for self-healing mRUBiS and especially the issues CF1, CF2,
 * CF3, and CF5.
 * 
 * The feedback loop is state-based, that is, it does not use any change events
 * to drive the self-adaptation process but it queries and searches the whole
 * model for issues.
 * 
 * The feedback loop is structured in four activities according to MAPE-K. The
 * knowledge is captured in the model and the activities communicate with each
 * other using {@link Annotations} in the model.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class StateBasedMapeFeedbackLoop {

	private int exceptionThreshold;

	/**
	 * Creates the self-healing feedback loop.
	 * 
	 * @param exceptionThreshold
	 *            threshold for the numbers of exceptions that causes a CF2.
	 */
	public StateBasedMapeFeedbackLoop(int exceptionThreshold) {
		this.exceptionThreshold = exceptionThreshold;
	}

	/**
	 * Runs the feedback loop.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	public void run(Architecture architecture) {
		// MONITOR
		Monitor m = new Monitor();
		if (m.monitor(architecture)) {
			// ANALYZE
			Analyze a = new Analyze();
			a.analyze(architecture, this.exceptionThreshold);
			// PLAN
			Plan p = new Plan();
			p.plan(architecture);
			// EXECUTE
			Execute e = new Execute();
			e.execute(architecture);
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
		String modelURI = "./model/mRUBiS.comparch";
		Architecture architecture = SelfHealingConfig.loadModel(modelURI);

		// parameters for the self-healing case:
		// - threshold for the number of exceptions that causes a CF2.
		// - minimum number of filter components that should be part of a pipe.
		int exceptionThreshold = 5;
		int minPipeSize = 4;

		// Instantiate the utility function and scenario
		UtilityFunction utilityFunction = new MRubisSelfHealingUtilityFunction(exceptionThreshold);
		Scenario scenario = new SelfHealingScenario(architecture, exceptionThreshold);

		// parameters for the simulator
		int rounds = 4;
		long injectionDelayMS = 100;
		boolean eventTrackingEnabled = false; // state-based loop; no events needed.
		boolean logToConsole = true;
		// get an instance of the simulator
		Simulator simulator = Simulator.FACTORY.createSimulator(architecture, utilityFunction, scenario, rounds,
				injectionDelayMS, eventTrackingEnabled, Level.CONFIG, logToConsole);
		// add the validators for self-healing to the simulator
		SelfHealingConfig.addValidators(simulator, exceptionThreshold, minPipeSize);

		// instantiate the feedback loop
		StateBasedMapeFeedbackLoop loop = new StateBasedMapeFeedbackLoop(exceptionThreshold);

		// run the simulation
		do {
			// trigger the simulator to inject issues
			simulator.injectIssues();

			// run feedback loop and repair the issues
			loop.run(architecture);

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
