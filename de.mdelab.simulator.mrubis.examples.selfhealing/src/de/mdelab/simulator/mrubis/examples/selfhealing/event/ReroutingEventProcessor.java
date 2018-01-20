package de.mdelab.simulator.mrubis.examples.selfhealing.event;

import java.util.Queue;

import de.mdelab.comparch.Connector;
import de.mdelab.simulator.events.ReroutingEvent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.RecreateConnector;

/**
 * Event processor for change events notifying about re-routings, that is,
 * changes to {@link Connector}s. It identifies and handles CF5 issues.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ReroutingEventProcessor {

	/**
	 * Processes the change events notifying about re-routings, that is, changes to
	 * {@link Connector}s. If a CF5 issue is identified, an appropriate connector is
	 * recreated (see {@link RecreateConnector}).
	 * 
	 * @param events
	 *            the queue of {@link ReroutingEvent}s.
	 */
	public void process(Queue<ReroutingEvent> events) {
		while (!events.isEmpty()) {
			// process event
			ReroutingEvent event = events.poll();
			// check condition
			boolean conditionSatisfied = this.checkCF5Condition(event);
			if (conditionSatisfied) {
				// perform action
				new RecreateConnector().enact(event.getRequiredInterface());
			}
		}
	}

	/**
	 * Checks the condition for a CF5 issue.
	 * 
	 * @param event
	 *            the event for which the condition will be checked.
	 * @return <code>true</code> if the condition for a CF5 issue is satisfied,
	 *         otherwise <code>false</code>
	 */
	private boolean checkCF5Condition(ReroutingEvent event) {
		// the second condition checks whether the required interface is still
		// disconnected in the model. It could have been connected in the meantime due
		// to repairing before a CF3.
		return event.getNewConnector() == null & event.getRequiredInterface().getConnector() == null;
	}
}
