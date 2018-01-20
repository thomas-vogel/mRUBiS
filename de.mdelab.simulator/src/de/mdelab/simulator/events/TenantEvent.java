package de.mdelab.simulator.events;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Tenant;

/**
 * Change event notifying about changes of a {@link Tenant}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public abstract class TenantEvent extends ChangeEvent {

	/**
	 * The architecture where the tenants belongs to. The single root element of the
	 * model.
	 */
	private Architecture architecture;
	/**
	 * The changed tenant.
	 */
	private Tenant tenant;

	/**
	 * Constructor.
	 * 
	 * @param architecture
	 *            the architecture where the tenants belongs to. The single root
	 *            element of the model.
	 * @param tenant
	 *            the changed tenant.
	 */
	public TenantEvent(Architecture architecture, Tenant tenant) {
		super();
		this.architecture = architecture;
		this.tenant = tenant;
	}

	/**
	 * Returns the architecture where the tenants belongs to. The single root
	 * element of the model.
	 * 
	 * @return the architecture where the tenants belongs to. The single root
	 *         element of the model.
	 */
	public Architecture getArchitecture() {
		return this.architecture;
	}

	/**
	 * Returns the changed tenant.
	 * 
	 * @return the changed tenant.
	 */
	public Tenant getTenant() {
		return this.tenant;
	}

}
