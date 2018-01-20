package de.mdelab.simulator.events;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Tenant;

/**
 * Change event notifying about the addition of a {@link Tenant} to the
 * {@link Architecture}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class TenantAdditionEvent extends TenantEvent {

	/**
	 * Constructor.
	 * 
	 * @param architecture
	 *            the architecture to which the tenant has been added. It is the
	 *            single root element of the model.
	 * @param tenant
	 *            the added tenant.
	 */
	public TenantAdditionEvent(Architecture architecture, Tenant tenant) {
		super(architecture, tenant);
	}

}
