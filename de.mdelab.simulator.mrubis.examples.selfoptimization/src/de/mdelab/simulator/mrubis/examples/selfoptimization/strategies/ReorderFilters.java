package de.mdelab.simulator.mrubis.examples.selfoptimization.strategies;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;

/**
 * Adaptation strategy that reorders the filter components of a pipe.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ReorderFilters {

	/**
	 * Reorders the filter components so that the given <code>filter</code> will be
	 * located after the <code>newPrecedingComponent</code> (either a filter
	 * component or the query service component) and before the
	 * <code>newSubsequentFilter</code> in the pipe.
	 * 
	 * @param filter
	 *            the filter to be relocated
	 * @param newPrecedingComponent
	 *            the component that will precede the relocated filter in its new
	 *            position in the pipe.
	 * @param newSubsequentFilter
	 *            the component that will succeed the relocated filter in its new
	 *            position in the pipe.
	 */
	public void enact(Component filter, Component newPrecedingComponent, Component newSubsequentFilter) {
		Component g = filter;
		Component d = newPrecedingComponent;
		Component e = newSubsequentFilter;

		FilterIntegrator helper = new FilterIntegrator();

		// skip filter g from the pipe and connect the old preceding and
		// subsequent filters.
		this.removeFilterFromPipe(g, helper);

		// d is never null. It is either a filter component or the QueryService
		// component. e can be null when the filter should be added at the end
		// of the pipe. Integrate filter g between d and e.
		helper.integrateStartedFilter(g, d, e);

	}

	/**
	 * Removes the given filter from the pipe by removing connectors to the
	 * neighboring filters (preceding and subsequent neighbors) and wiring these
	 * neighboring filters with each other.
	 * 
	 * @param g
	 *            the filter to be removed or rather disconnected from the pipe.
	 * @param helper
	 *            helper to adapt the pipe, see {@link FilterIntegrator}.
	 */
	private void removeFilterFromPipe(Component g, FilterIntegrator helper) {
		// Assuming the preceding filter of g is f and the subsequent filter of
		// g is h.

		// remove the connector to and from the filter g
		ProvidedInterface pInterfaceOfG = g.getProvidedInterfaces().get(0);
		Connector connectorFtoG = pInterfaceOfG.getConnectors().get(0);
		RequiredInterface rInterfaceOfF = connectorFtoG.getSource();
		EcoreUtil.delete(connectorFtoG, true);

		RequiredInterface rInterfaceOfG = g.getRequiredInterfaces().get(0);
		Connector connectorGtoH = rInterfaceOfG.getConnector();
		ProvidedInterface pInterfaceOfH = null;
		if (connectorGtoH != null) {
			pInterfaceOfH = connectorGtoH.getTarget();
			EcoreUtil.delete(connectorGtoH, true);
		}

		// Connect f and h if h exists
		if (pInterfaceOfH != null) {
			Connector connectorFtoH = ComparchFactory.eINSTANCE.createConnector();
			connectorFtoH.setSource(rInterfaceOfF);
			connectorFtoH.setTarget(pInterfaceOfH);
		}
	}
}
