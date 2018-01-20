package de.mdelab.simulator.mrubis.examples.selfhealing.strategies;

import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Adaptation Strategy that connects the given {@link RequiredInterface} to a
 * {@link ProvidedInterface} within the same {@link Tenant}. It creates a new
 * {@link Connector} that wires the given required interface to a provided
 * interface.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class RecreateConnector {

	/**
	 * Connects the given required interface to a provided interface
	 * 
	 * @param requiredInterface
	 *            the required interface that will be connected to a provided
	 *            interface
	 */
	public void enact(RequiredInterface requiredInterface) {
		System.out.println("RecreateConnector for " + SimulatorUtil.elementToString(requiredInterface) + " of "
				+ SimulatorUtil.elementToString(requiredInterface.getComponent()));

		Tenant tenant = requiredInterface.getComponent().getTenant();
		InterfaceType requiredInterfaceType = requiredInterface.getType();

		Connector connector = ComparchFactory.eINSTANCE.createConnector();
		connector.setSource(requiredInterface);

		ProvidedInterface target = null;
		// find target within the same tenant
		STOPSEARCH: for (Component c : tenant.getComponents()) {
			if (c.getState() == ComponentState.STARTED) {
				for (ProvidedInterface providedInterface : c.getProvidedInterfaces()) {
					if (providedInterface.getType().equals(requiredInterfaceType)) {
						if (requiredInterfaceType.getFqName()
								.equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
							if (providedInterface.getConnectors().size() == 0) {
								target = providedInterface;
								break STOPSEARCH;
							}
						} else {
							target = providedInterface;
							break STOPSEARCH;
						}
					}
				}
			}
		}
		connector.setTarget(target);
	}
}
