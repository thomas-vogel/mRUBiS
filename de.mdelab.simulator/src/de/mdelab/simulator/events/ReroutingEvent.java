package de.mdelab.simulator.events;

import de.mdelab.comparch.Connector;
import de.mdelab.comparch.RequiredInterface;

/**
 * Change event notifying about a re-routing, that is, the removal and addition
 * of a {@link Connector} to (re-)wire a required interface to a different
 * provided interface than before.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ReroutingEvent extends ChangeEvent {

	/**
	 * The required interface that is re-routed.
	 */
	private RequiredInterface requiredInterface;
	/**
	 * The connector before the re-routing.
	 */
	private Connector oldConnector;
	/**
	 * The connector after the re-routing.
	 */
	private Connector newConnector;

	/**
	 * Constructor.
	 * 
	 * @param requiredInterface
	 *            the required interface that is re-routed.
	 * @param oldConnector
	 *            the connector before the re-routing.
	 * @param newConnector
	 *            the connector after the re-routing.
	 */
	public ReroutingEvent(RequiredInterface requiredInterface, Connector oldConnector, Connector newConnector) {
		super();
		this.requiredInterface = requiredInterface;
		this.oldConnector = oldConnector;
		this.newConnector = newConnector;
	}

	/**
	 * Returns the required interface that is re-routed.
	 * 
	 * @return the required interface that is re-routed.
	 */
	public RequiredInterface getRequiredInterface() {
		return this.requiredInterface;
	}

	/**
	 * Returns the connector before the re-routing.
	 * 
	 * @return the connector before the re-routing.
	 */
	public Connector getOldConnector() {
		return this.oldConnector;
	}

	/**
	 * Returns the connector after the re-routing.
	 * 
	 * @return the connector after the re-routing..
	 */
	public Connector getNewConnector() {
		return this.newConnector;
	}

}
