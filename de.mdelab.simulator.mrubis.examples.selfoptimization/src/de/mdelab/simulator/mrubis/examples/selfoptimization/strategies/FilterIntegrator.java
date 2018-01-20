package de.mdelab.simulator.mrubis.examples.selfoptimization.strategies;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Helper for adaptation strategies to integrate filter {@link Component}s into
 * a pipe of filters. The integration means re-wiring filter components of the
 * pipe such that the new filter is integrated into the pipe.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class FilterIntegrator {

	/**
	 * Re-wires the filter components such that the given <code>filter</code> is
	 * integrated in the pipe after the given <code>newPrecedingFilter</code>
	 * component and before the given <code>newSubsequentFilter</code> component.
	 * 
	 * It assumes that all three filter components are started (see
	 * {@link Component#getState() is ComponentState#STARTED}).
	 * 
	 * @param filter
	 *            the filter component to be integrated into the pipe
	 * @param newPrecedingFilter
	 *            the filter component preceding the filter component to be
	 *            integrated in the pipe
	 * @param newSubsequentFilter
	 *            the filter component succeeding the filter component to be
	 *            integrated in the pipe
	 */
	public void integrateStartedFilter(Component filter, Component newPrecedingFilter, Component newSubsequentFilter) {

		Component g = filter;
		Component d = newPrecedingFilter;
		Component e = newSubsequentFilter;

		// d is never null. It is either a filter component or the QueryService
		// component.
		// e can be null when the filter should be added at the end of the pipe
		// d and e are directly connected to each other by a connector.

		RequiredInterface rInterfaceOfD = this.getRequiredItemFilterInterface(d);
		Connector connectorFromD = rInterfaceOfD.getConnector();

		ProvidedInterface pInterfaceOfE = null;
		// remove connector between d and e
		if (e != null) {
			pInterfaceOfE = e.getProvidedInterfaces().get(0);
			if (pInterfaceOfE.getConnectors().size() > 0) {
				Connector connectorToE = pInterfaceOfE.getConnectors().get(0);
				if (!connectorFromD.equals(connectorToE)) {
					throw new RuntimeException(
							"newPrecedingFilter and newSubsequentFilter exist but are not connected.");
				} else {
					EcoreUtil.delete(connectorToE, true);
				}
			}
		}

		// connect d and g
		Connector connectorDtoG = ComparchFactory.eINSTANCE.createConnector();
		connectorDtoG.setSource(rInterfaceOfD);
		connectorDtoG.setTarget(g.getProvidedInterfaces().get(0));

		// connect g and e
		if (e != null) {
			Connector connectorGtoE = ComparchFactory.eINSTANCE.createConnector();
			connectorGtoE.setSource(g.getRequiredInterfaces().get(0));
			connectorGtoE.setTarget(pInterfaceOfE);
		}

	}

	/**
	 * Returns the {@link RequiredInterface} of type
	 * {@link MRubisNames#itemFilterService_InterfaceType_FqName} of the given
	 * component.
	 * 
	 * @param c
	 *            the component for which the required interface is search
	 * @return the {@link RequiredInterface} of type
	 *         {@link MRubisNames#itemFilterService_InterfaceType_FqName} of the
	 *         given component.
	 */
	private RequiredInterface getRequiredItemFilterInterface(Component c) {
		RequiredInterface itemFilterInterface = null;
		for (RequiredInterface ri : c.getRequiredInterfaces()) {
			if (ri.getType().getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
				itemFilterInterface = ri;
				break;
			}
		}
		return itemFilterInterface;
	}

}
