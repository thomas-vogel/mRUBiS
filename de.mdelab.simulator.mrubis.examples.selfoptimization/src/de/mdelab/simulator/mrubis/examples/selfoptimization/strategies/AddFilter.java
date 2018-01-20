package de.mdelab.simulator.mrubis.examples.selfoptimization.strategies;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;

/**
 * Adaptation strategy that adds a filter {@link Component} to a pipe, which
 * increases the size of the pipe.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class AddFilter {

	/**
	 * Adds the given filter {@link Component} to the pipe. The pipe is identified
	 * by the given <code>newPrecedingFilter</code> and
	 * <code>newSubsequentFilter</code> components, in-between which the
	 * <code>filterToAdd</code> will be added.
	 * 
	 * @param filterToAdd
	 *            the filter component to be added
	 * @param newPrecedingFilter
	 *            the preceding filter component of the filter to be added in the
	 *            pipe
	 * @param newSubsequentFilter
	 *            the subsequent filter component of the filter to be added in the
	 *            pipe
	 */
	public void enact(Component filterToAdd, Component newPrecedingFilter, Component newSubsequentFilter) {
		if (filterToAdd.getState() == ComponentState.UNDEPLOYED) {
			filterToAdd.setState(ComponentState.DEPLOYED);
		}
		if (filterToAdd.getState() == ComponentState.DEPLOYED) {
			filterToAdd.setState(ComponentState.STARTED);
		}

		FilterIntegrator integrator = new FilterIntegrator();
		integrator.integrateStartedFilter(filterToAdd, newPrecedingFilter, newSubsequentFilter);
	}
}
