package de.mdelab.simulator.events;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;

/**
 * Change event notifying about the removal of a {@link Component} from a
 * {@link ComponentType}, that is, when an instance of the component type is
 * removed (see {@link ComponentType#getInstances()}).
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ComponentTypeInstanceRemovalEvent extends ComponentChangeEvent {

	/**
	 * The type of the removed component.
	 */
	private ComponentType componentType;

	/**
	 * Constructor.
	 * 
	 * @param componentType
	 *            the type of the removed component.
	 * @param component
	 *            the removed component.
	 * @param componentId
	 *            the uid of the removed component.
	 * @param componentName
	 *            the name of the removed component.
	 */
	public ComponentTypeInstanceRemovalEvent(ComponentType componentType, Component component, String componentId,
			String componentName) {
		super(component, componentId, componentName);
		this.componentType = componentType;
	}

	/**
	 * Returns the type of the removed component.
	 * 
	 * @return the type of the removed component.
	 */
	public ComponentType getComponentType() {
		return this.componentType;
	}

}
