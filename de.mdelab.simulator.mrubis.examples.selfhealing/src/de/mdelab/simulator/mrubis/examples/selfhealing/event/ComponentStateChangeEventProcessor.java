package de.mdelab.simulator.mrubis.examples.selfhealing.event;

import java.util.Queue;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.simulator.events.ComponentStateChangeEvent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.LightWeightRedeployComponent;

/**
 * Event processor for change events notifying about changes of
 * {@link Component} states. It identifies and handles CF1 issues.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ComponentStateChangeEventProcessor {

	/**
	 * Processes the change events notifying about changes of {@link Component}
	 * states. If a CF1 issue is identified, the affected component is redeployed in
	 * a light-weight manner (see {@link LightWeightRedeployComponent}).
	 * 
	 * @param events
	 *            the queue of {@link ComponentStateChangeEvent}s.
	 */
	public void process(Queue<ComponentStateChangeEvent> events) {
		while (!events.isEmpty()) {
			// process event
			ComponentStateChangeEvent event = events.poll();
			// check condition
			boolean conditionSatisfied = this.checkCF1Condition(event);
			if (conditionSatisfied) {
				// perform action
				new LightWeightRedeployComponent().enact(event.getComponent());
			}
		}
	}

	/**
	 * Checks the condition for a CF1 issue.
	 * 
	 * @param event
	 *            the event for which the condition will be checked.
	 * @return <code>true</code> if the condition for a CF1 issue is satisfied,
	 *         otherwise <code>false</code>
	 */
	private boolean checkCF1Condition(ComponentStateChangeEvent event) {
		// first part checks the event whether the state of the component has been set
		// to UNKNOWN, second part checks the model whether the component is still in
		// state UNKNOWN.
		return event.getNewState() == ComponentState.UNKNOWN
				& event.getComponent().getState() == ComponentState.UNKNOWN;
	}

}
