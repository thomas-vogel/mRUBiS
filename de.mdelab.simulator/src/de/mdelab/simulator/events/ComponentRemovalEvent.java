package de.mdelab.simulator.events;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.Tenant;

/**
 * Change event notifying about the removal of a {@link Component} from a
 * {@link Tenant}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ComponentRemovalEvent extends ComponentChangeEvent {

	/**
	 * The tenant from which a component has been removed.
	 */
	private Tenant tenant;

	/**
	 * Constructor.
	 * 
	 * @param tenant
	 *            the tenant from which a component has been removed.
	 * @param component
	 *            the component that has been removed.
	 * @param componentId
	 *            the uid of the removed component.
	 * @param componentName
	 *            the name of the removed component.
	 */
	public ComponentRemovalEvent(Tenant tenant, Component component, String componentId, String componentName) {
		super(component, componentId, componentName);
		this.tenant = tenant;
	}

	/**
	 * Returns the tenant from which a component has been removed.
	 * 
	 * @return the tenant from which a component has been removed
	 */
	public Tenant getTenant() {
		return this.tenant;
	}

}
