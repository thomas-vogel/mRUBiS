package de.mdelab.simulator.mrubis.examples.selfhealing.event;

import java.util.Queue;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.events.ComponentRemovalEvent;
import de.mdelab.simulator.events.ComponentTypeInstanceRemovalEvent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.HeavyWeightRedeployComponent;

/**
 * Event processor for change events notifying about removals of
 * {@link Component}s. It identifies and handles CF3 issues.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ComponentRemovalEventProcessor {

	/**
	 * Processes the change events notifying about removals of {@link Component}s.
	 * If a CF3 issue is identified, the affected component is newly instantiated,
	 * configured, and redeployed (see {@link HeavyWeightRedeployComponent}).
	 * 
	 * @param events
	 *            the queue of {@link ComponentRemovalEvent}s notifying of removals
	 *            of components from tenants. These events provide information about
	 *            the tenant the removed component has belonged to.
	 * @param typeEvents
	 *            the queue of {@link ComponentTypeInstanceRemovalEvent}s notifying
	 *            of removals of components from their component types. These events
	 *            provide information about the component type of the removed
	 *            component.
	 */
	public void process(Queue<ComponentRemovalEvent> events, Queue<ComponentTypeInstanceRemovalEvent> typeEvents) {
		while (!events.isEmpty()) {
			// process event
			ComponentRemovalEvent event = events.poll();
			Component removedComponent = event.getComponent();
			// removedComponent.getType() is null s.t. the type must be identified using
			// another event
			ComponentType removedComponentType = null;
			for (ComponentTypeInstanceRemovalEvent e : typeEvents) {
				if (e.getComponent().equals(removedComponent)) {
					removedComponentType = e.getComponentType();
					break;
				}
			}
			// check condition
			boolean conditionSatisfied = this.checkCF3Condition(event, removedComponentType);
			if (conditionSatisfied) {
				// perform action
				new HeavyWeightRedeployComponent().enact(event.getTenant(), removedComponentType, null);
			}
		}
	}

	/**
	 * Checks the condition for a CF3 issue.
	 * 
	 * @param event
	 *            the event for which the condition will be checked.
	 * @param removedComponentType
	 *            the event for which the condition will be checked.
	 * @return <code>true</code> if the condition for a CF3 issue is satisfied,
	 *         otherwise <code>false</code>
	 */
	private boolean checkCF3Condition(ComponentRemovalEvent event, ComponentType removedComponentType) {
		// checks whether a component of the same type as the removed component has not
		// been added again to the tenant
		boolean conditionSatisfied = true;
		Tenant tenant = event.getTenant();
		for (Component c : tenant.getComponents()) {
			if (c.getType().equals(removedComponentType)) {
				conditionSatisfied = false;
				break;
			}
		}
		return conditionSatisfied;
	}
}
