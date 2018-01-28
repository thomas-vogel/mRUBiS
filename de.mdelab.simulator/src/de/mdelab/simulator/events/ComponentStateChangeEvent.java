package de.mdelab.simulator.events;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;

/**
 * Change event notifying about a change of the life cycle state (see
 * {@link Component#getState()}) of a {@link Component}.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ComponentStateChangeEvent extends ComponentChangeEvent {

	/**
	 * The state of the component before the change.
	 */
	private ComponentState oldState;
	/**
	 * The state of the component after the change.
	 */
	private ComponentState newState;

	/**
	 * Constructor.
	 * 
	 * @param component
	 *            the component whose state has changed
	 * @param componentId
	 *            the uid of the component whose state has changed
	 * @param componentName
	 *            the name the component whose state has changed
	 * @param oldState
	 *            the state of the component before the change.
	 * @param newState
	 *            the state of the component after the change.
	 */
	public ComponentStateChangeEvent(Component component, String componentId, String componentName,
			ComponentState oldState, ComponentState newState) {
		super(component, componentId, componentName);
		this.oldState = oldState;
		this.newState = newState;
	}

	/**
	 * Returns the state of the component before the change.
	 * 
	 * @return state of the component before the change
	 */
	public ComponentState getOldState() {
		return this.oldState;
	}

	/**
	 * Returns the state of the component after the change.
	 * 
	 * @return the state of the component after the change
	 */
	public ComponentState getNewState() {
		return this.newState;
	}

}
