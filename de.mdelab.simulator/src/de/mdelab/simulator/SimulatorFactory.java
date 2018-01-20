package de.mdelab.simulator;

import java.util.logging.Level;

import de.mdelab.comparch.Architecture;

/**
 * Factory to obtain an instance of the {@link Simulator}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class SimulatorFactory {

	/**
	 * Creates and returns an instance of the {@link Simulator}.
	 * 
	 * @param architecture
	 *            the {@link Architecture} element of the model (i.e., the root
	 *            element of the model).
	 * @param utilityFunction
	 *            the {@link UtilityFunction} to compute the utility of the
	 *            architecture (i.e., of the system described in the model).
	 * @param scenario
	 *            The scenario defining the {@link Injection}s to be performed in
	 *            each simulation round.
	 * @param totalRounds
	 *            number of rounds the simulator should run in total. One round is
	 *            performed when invoking {@link Simulator#injectIssues()} which
	 *            injects issues into the model. Issues injected by one round of the
	 *            simulator should be handled by one run of the feedback loop.
	 * @param injectionDelayMS
	 *            delay in milliseconds (must be a value greater than 0) before the
	 *            issues are injected in one round. A delay avoids overlapping of
	 *            the points in time when a feedback loop has finished and when new
	 *            issues are injected. This is achieved by postponing the injections
	 *            for <code>injectionDelayMS</code> milliseconds.
	 * @param eventTrackingEnabled
	 *            if <code>true</code> the simulator tracks and provides events
	 *            notifying about changes of the model, otherwise no events are
	 *            tracked and provided.
	 * @param logLevel
	 *            the log level of the simulator.
	 * @param logToConsole
	 *            if <code>true</code>, logs are printed to the console, otherwise
	 *            not.
	 * @return an instance of the {@link Simulator} configured by the given
	 *         parameters.
	 */
	public Simulator createSimulator(Architecture architecture, UtilityFunction utilityFunction, Scenario scenario,
			int totalRounds, long injectionDelayMS, boolean eventTrackingEnabled, Level logLevel,
			boolean logToConsole) {
		Simulator simulator = new SimulatorImpl(architecture, utilityFunction, scenario, totalRounds, injectionDelayMS,
				eventTrackingEnabled, logLevel, logToConsole);
		return simulator;
	}

}
