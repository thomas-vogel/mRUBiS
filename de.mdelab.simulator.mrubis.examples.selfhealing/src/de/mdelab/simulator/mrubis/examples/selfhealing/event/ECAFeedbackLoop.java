package de.mdelab.simulator.mrubis.examples.selfhealing.event;

import java.util.Queue;
import java.util.logging.Level;

import de.mdelab.comparch.Architecture;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.Simulator;
import de.mdelab.simulator.UtilityFunction;
import de.mdelab.simulator.events.ChangeEventQueues;
import de.mdelab.simulator.events.ComponentRemovalEvent;
import de.mdelab.simulator.events.ComponentStateChangeEvent;
import de.mdelab.simulator.events.ExceptionOccurrenceEvent;
import de.mdelab.simulator.events.ReroutingEvent;
import de.mdelab.simulator.mrubis.examples.selfhealing.SelfHealingConfig;
import de.mdelab.simulator.mrubis.examples.selfhealing.SelfHealingScenario;
import de.mdelab.simulator.mrubis.utility.MRubisSelfHealingUtilityFunction;

/**
 * A feedback loop for self-healing mRUBiS and especially the issues CF1, CF2,
 * CF3, and CF5.
 * 
 * The feedback loop follows an event-condition-action approach, that is, it
 * uses events notifying about changes of the model (these changes were made by
 * the simulator when injecting issues into the model) to locate changes in the
 * model instead of searching the whole model for issues. For the located
 * changes, conditions identifying the issues are checked. If a condition is
 * satisfied, the corresponding action, that is, an adaptation is immediately
 * performed to the model to repair the identified issue.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ECAFeedbackLoop {

	private int exceptionThreshold;

	/**
	 * Creates the self-healing feedback loop.
	 * 
	 * @param exceptionThreshold
	 *            threshold for the numbers of exceptions that causes a CF2.
	 */
	public ECAFeedbackLoop(int exceptionThreshold) {
		this.exceptionThreshold = exceptionThreshold;
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
		int runs = 4;
		long injectionDelayMS = 100;
		boolean eventTrackingEnabled = true;
		boolean logToConsole = true;
		// get an instance of the simulator
		Simulator simulator = Simulator.FACTORY.createSimulator(architecture, utilityFunction, scenario, runs,
				injectionDelayMS, eventTrackingEnabled, Level.CONFIG, logToConsole);
		// add the validators for self-healing to the simulator
		SelfHealingConfig.addValidators(simulator, exceptionThreshold, minPipeSize);

		// instantiate the feedback loop
		ECAFeedbackLoop loop = new ECAFeedbackLoop(exceptionThreshold);

		// run the simulation
		do {
			// trigger the simulator to inject issues
			simulator.injectIssues();

			// run feedback loop and repair the issues
			loop.run(architecture, simulator.getChangeEventsQueues());

			// trigger the simulator to validate the model
			simulator.validateModel();

			// snapshot the model
			// simulator.snapshotModel();

			// repeat until the simulation is completed
		} while (!simulator.isSimulationCompleted());

		// create and show final results (see folder "results" of the project)
		simulator.showResults();

	}

	/**
	 * Runs the feedback loop.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 * @param queues
	 *            the queues of the change events provided by the simulator
	 */
	public void run(Architecture architecture, ChangeEventQueues queues) {

		// process component state change events (potential CF1 issues)
		Queue<ComponentStateChangeEvent> componentStateChangeEvents = queues.getComponentStateChangeEvents();
		if (!componentStateChangeEvents.isEmpty()) {
			new ComponentStateChangeEventProcessor().process(componentStateChangeEvents);
		}

		// process exception occurrence events (potential CF2 issues)
		Queue<ExceptionOccurrenceEvent> exceptionOccurrenceEvents = queues.getExceptionOccurrenceEvents();
		if (!exceptionOccurrenceEvents.isEmpty()) {
			new ExceptionOccurrenceEventProcessor().process(exceptionOccurrenceEvents, this.exceptionThreshold);
		}

		// process component removal events (potential CF3 issues)
		Queue<ComponentRemovalEvent> componentRemovalEvents = queues.getComponentRemovalEvents();
		if (!componentRemovalEvents.isEmpty()) {
			new ComponentRemovalEventProcessor().process(componentRemovalEvents,
					queues.getComponentTypeInstanceRemovalEvents());
		}

		// process rerouting events, esp. removals of connectors (potential CF5 issues)
		Queue<ReroutingEvent> reroutingEvents = queues.getReroutingEvents();
		if (!reroutingEvents.isEmpty()) {
			new ReroutingEventProcessor().process(reroutingEvents);
		}

		// clear all (other) queues
		queues.clearEvents();
	}

}
