package de.mdelab.simulator.events;

import de.mdelab.comparch.Component;

/**
 * Change event referring to changes of {@link Component}s.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public abstract class ComponentChangeEvent extends ChangeEvent {

	/**
	 * The component where the change happened.
	 */
	private Component component;
	/**
	 * The uid of the changed component.
	 */
	private String componentId;
	/**
	 * The name of the changed component.
	 */
	private String componentName;

	/**
	 * Constructor.
	 * 
	 * @param component
	 *            the changed component.
	 * @param componentId
	 *            the uid of the changed component.
	 * @param componentName
	 *            the name of the changed component.
	 */
	public ComponentChangeEvent(Component component, String componentId, String componentName) {
		super();
		this.component = component;
		this.componentId = componentId;
		this.componentName = componentName;
	}

	/**
	 * Returns the changed component.
	 * 
	 * @return the changed component
	 */
	public Component getComponent() {
		return this.component;
	}

	/**
	 * Returns the uid of the changed component.
	 * 
	 * @return the the uid of the changed component
	 */
	public String getComponentId() {
		return this.componentId;
	}

	/**
	 * Returns the name of the changed component.
	 * 
	 * @return the name of the changed component
	 */
	public String getComponentName() {
		return this.componentName;
	}

}
