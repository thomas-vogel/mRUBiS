package de.mdelab.simulator.mrubis.examples.selfoptimization.eventmape;

import de.mdelab.simulator.events.ChangeEventQueues;

/**
 * Monitor activity of the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Monitor {

	/**
	 * Checks whether there might be any relevant change of the model that requires
	 * further analysis and thus further execution of the feedback loop.
	 * 
	 * @param queues
	 *            the queues of change events provided by the simulator
	 * @return <code>true</code> if further execution of the feedback loop is
	 *         needed, otherwise <code>false</code>
	 */
	public boolean monitor(ChangeEventQueues queues) {
		boolean eventsOccurred = !queues.getMonitoredPropertyUpdateEvents().isEmpty()
				|| !queues.getPerformanceStatsUpdateEvents().isEmpty();
		return eventsOccurred;
	}

}
