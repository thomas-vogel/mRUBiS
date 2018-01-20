package de.mdelab.simulator.events;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Tenant;

/**
 * Change event notifying about the removal of a {@link Tenant} from the
 * {@link Architecture}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class TenantRemovalEvent extends TenantEvent {

	/**
	 * Constructor.
	 * 
	 * @param architecture
	 *            the architecture from which the tenant has been removed. It is the
	 *            single root element of the model.
	 * @param tenant
	 *            the removed tenant.
	 */
	public TenantRemovalEvent(Architecture architecture, Tenant tenant) {
		super(architecture, tenant);
	}

}
