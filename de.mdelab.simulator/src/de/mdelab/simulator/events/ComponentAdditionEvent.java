package de.mdelab.simulator.events;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.Tenant;

/**
 * Change event notifying about the addition of a {@link Component} to a
 * {@link Tenant}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ComponentAdditionEvent extends ComponentChangeEvent {

	/**
	 * The tenant to which a component has been added.
	 */
	private Tenant tenant;

	/**
	 * Constructor.
	 * 
	 * @param tenant
	 *            the tenant to which a component has been added.
	 * @param component
	 *            the component that has been added.
	 * @param componentId
	 *            the uid of the added component.
	 * @param componentName
	 *            the name of the added component.
	 */
	public ComponentAdditionEvent(Tenant tenant, Component component, String componentId, String componentName) {
		super(component, componentId, componentName);
		this.tenant = tenant;
	}

	/**
	 * Returns the tenant to which a component has been added.
	 * 
	 * @return the tenant to which a component has been added.
	 */
	public Tenant getTenant() {
		return this.tenant;
	}

}
