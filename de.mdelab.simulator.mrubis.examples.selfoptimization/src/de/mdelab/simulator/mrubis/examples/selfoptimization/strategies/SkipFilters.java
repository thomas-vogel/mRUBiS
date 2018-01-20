package de.mdelab.simulator.mrubis.examples.selfoptimization.strategies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.RequiredInterface;

/**
 * Adaptation strategy that skips filter components from the end of a pipe.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class SkipFilters {

	/**
	 * Skips filters from the end of the pipe by iteratively disconnecting the last
	 * filter from the pipe and stopping this filter until the last filter of the
	 * pipe is the given <code>newLastFilterOfPipe</code>.
	 * 
	 * @param newLastFilterOfPipe
	 *            the designated new last of filter component of the pipe. All
	 *            filters that are located after this filter are disconnected from
	 *            the pipe and stopped.
	 */
	public void enact(Component newLastFilterOfPipe) {
		// Skip (disconnect and stop) iteratively the last filter of the pipe until
		// reaching the newLastFilterOfPipe

		List<Component> filtersToSkip = new LinkedList<Component>();

		Component nextFilter = newLastFilterOfPipe;
		while (nextFilter != null) {
			RequiredInterface rInterface = nextFilter.getRequiredInterfaces().get(0);
			Connector c = rInterface.getConnector();
			if (c != null && c.getTarget() != null) {
				nextFilter = c.getTarget().getComponent();
				filtersToSkip.add(nextFilter);
			} else {
				nextFilter = null;
			}
		}

		// skip the filters
		for (int i = filtersToSkip.size() - 1; i >= 0; i--) {
			Component skipFilter = filtersToSkip.get(i);
			// remove connector
			Connector removeConnector = skipFilter.getProvidedInterfaces().get(0).getConnectors().get(0);
			EcoreUtil.delete(removeConnector, true);
			// stop filter
			skipFilter.setState(ComponentState.DEPLOYED);
		}
	}
}
