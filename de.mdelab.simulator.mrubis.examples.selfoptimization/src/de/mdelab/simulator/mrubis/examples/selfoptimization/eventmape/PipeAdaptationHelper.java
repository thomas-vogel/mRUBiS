package de.mdelab.simulator.mrubis.examples.selfoptimization.eventmape;

import java.util.LinkedList;
import java.util.List;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Helper for the adaptation strategies that adapt a pipe of filter components.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class PipeAdaptationHelper {

	/**
	 * Retrieves the query service component of the given tenant. This component is
	 * the start of the pipe of filter components as it is connected to the first
	 * filter of the pipe.
	 * 
	 * @param tenant
	 *            the given tenant
	 * @return the query service component of the given tenant
	 */
	public Component getQueryService(Tenant tenant) {
		Component queryService = null;
		OUTERLOOP: for (Component c : tenant.getComponents()) {
			for (ProvidedInterface pi : c.getProvidedInterfaces()) {
				if (pi.getType().getFqName().equals(MRubisNames.basicQueryService_InterfaceType_FqName)) {
					queryService = c;
					break OUTERLOOP;
				}
			}
		}
		return queryService;
	}

	/**
	 * Retrieves the list of the filter components connected to the query service
	 * component (see {@link #getQueryService(Tenant)}).
	 * 
	 * @param queryService
	 *            the query service component
	 * @return the list of the filter components in the pipe in the same order as
	 *         the filters are locate in the pipe
	 */
	public List<Component> getFilters(Component queryService) {
		List<Component> filters = new LinkedList<Component>();

		// -- get first filter component
		Component filter = null;
		for (RequiredInterface reqInterface : queryService.getRequiredInterfaces()) {
			if (reqInterface.getType().getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
				Connector c = reqInterface.getConnector();
				if (c != null && c.getTarget() != null) {
					filter = c.getTarget().getComponent();
					break;
				}
			}
		}
		filters.add(filter);
		// -- get iteratively the next filter
		while (filter != null) {
			Connector c = filter.getRequiredInterfaces().get(0).getConnector();
			if (c != null && c.getTarget() != null) {
				Component nextFilter = c.getTarget().getComponent();
				filters.add(nextFilter);
				// next iteration
				filter = nextFilter;
			} else {
				// c == null || c.getTarget() == null
				filter = null;
			}

		}

		return filters;
	}

	/**
	 * Returns the slope of the filter component preceding the given filter.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the slope of the filter component preceding the given filter
	 */
	public double getSlopeOfPrecedingFilter(Component filter) {
		Component precedingFilter = this.getPrecedingFilter(filter);
		if (precedingFilter != null) {
			return this.getSlopeOfFilter(precedingFilter);
		} else {
			return Double.MAX_VALUE;
		}
	}

	/**
	 * Returns the slope of the filter component succeeding the given filter.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the slope of the filter component succeeding the given filter
	 */
	public double getSlopeOfSubsequentFilter(Component filter) {
		Component subsequentFilter = this.getSubsequentFilter(filter);
		if (subsequentFilter != null) {
			return this.getSlopeOfFilter(subsequentFilter);
		} else {
			return -Double.MAX_VALUE;
		}
	}

	/**
	 * Returns the filter component preceding the given filter. If the preceding
	 * component is not a filter but the query service (see
	 * {@link #getQueryService(Tenant)}), <code>null</code> is returned.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the filter component preceding the given filter or <code>null</code>
	 *         if the preceding component is not a filter.
	 */
	// assumption: pipe is not broken, that is, a well-structured pipe of
	// filters
	public Component getPrecedingFilter(Component filter) {
		Component usingComponent = this.getPrecedingComponent(filter);
		if (this.isFilter(usingComponent)) {
			return usingComponent;
		} else {
			return null;
		}
	}

	/**
	 * Returns the component preceding the given filter. This component is either a
	 * filter component or the query service component (see
	 * {@link #getQueryService(Tenant)}).
	 * 
	 * @param filter
	 *            the given filter
	 * @return the component preceding the given filter.
	 */
	public Component getPrecedingComponent(Component filter) {
		// each filter just provides and requires one interface, the ItemFilter
		// interface!
		ProvidedInterface pi = filter.getProvidedInterfaces().get(0);
		// Each filter is used by exactly one other filter or the QueryService!
		Connector connector = pi.getConnectors().get(0);
		return connector.getSource().getComponent();
	}

	/**
	 * Returns the filter component succeeding the given filter or <code>null</code>
	 * if there is no succeeding filter component (in this case the given filter is
	 * the last filter of the pipe).
	 * 
	 * @param filter
	 *            the given filter
	 * @return the component succeeding the given filter or <code>null</code> if
	 *         there is no succeeding filter component.
	 */
	public Component getSubsequentFilter(Component filter) {
		// each filter just provides and requires one interface, the ItemFilter
		// interface!
		RequiredInterface ri = filter.getRequiredInterfaces().get(0);
		if (ri.getConnector() != null) {
			return ri.getConnector().getTarget().getComponent();
		} else {
			return null;
		}
	}

	/**
	 * Returns the monitored property belonging to the given component and having
	 * the given name.
	 * 
	 * @param component
	 *            the given component
	 * @param propName
	 *            the given property name
	 * @return the corresponding monitored property
	 */
	private MonitoredProperty getMonitoredPropertyByName(Component component, String propName) {
		MonitoredProperty prop = null;
		for (MonitoredProperty p : component.getMonitoredProperties()) {
			if (p.getName().equals(propName)) {
				prop = p;
				break;
			}
		}
		return prop;
	}

	/**
	 * Returns the local computation time of the given filter.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the local computation time of the given filter.
	 */
	public long getLocalComputationTime(Component filter) {
		MonitoredProperty c = this.getLocalComputationTimeProperty(filter);
		return Long.parseLong(c.getValue());
	}

	/**
	 * Returns the {@link MonitoredProperty} for the local computation time of the
	 * given filter.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the {@link MonitoredProperty} for the local computation time of the
	 *         given filter.
	 */
	private MonitoredProperty getLocalComputationTimeProperty(Component filter) {
		return this.getMonitoredPropertyByName(filter, MRubisNames.localComputationTime_MonitoredProperty_Name);
	}

	/**
	 * Returns the selection rate of the given filter.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the selection rate of the given filter.
	 */
	public double getSelectionRate(Component filter) {
		MonitoredProperty s = this.getSelectionRateProperty(filter);
		return Double.parseDouble(s.getValue());
	}

	/**
	 * Returns the {@link MonitoredProperty} for the selection rate of the given
	 * filter.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the {@link MonitoredProperty} for the selection rate of the given
	 *         filter.
	 */
	private MonitoredProperty getSelectionRateProperty(Component filter) {
		return this.getMonitoredPropertyByName(filter, MRubisNames.selectionRate_MonitoredProperty_Name);
	}

	/**
	 * Returns the slope of the given filter component.
	 * 
	 * @param filter
	 *            the given filter component
	 * @return the slope of the given filter component
	 */
	public double getSlopeOfFilter(Component filter) {
		return this.getSelectionRate(filter) / this.getLocalComputationTime(filter);
	}

	/**
	 * Returns <code>true</code> if the given component is a filter, otherwise
	 * <code>false</code>,
	 * 
	 * @param component
	 *            the given component
	 * @return <code>true</code> if the given component is a filter, otherwise
	 *         <code>false</code>,
	 */
	public boolean isFilter(Component component) {
		boolean isFilter = false;
		for (ProvidedInterface pi : component.getProvidedInterfaces()) {
			// a filter provides the item filter interface
			if (pi.getType().getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
				isFilter = true;
				break;
			}
		}
		return isFilter;
	}

	/**
	 * Retrieves all filter components of the given tenant that are stopped or
	 * undeployed (see {@link Component#getState()}.
	 * 
	 * @param tenant
	 *            the given tenant
	 * @return all stopped and undeployed filter components of the given tenant.
	 */
	public List<Component> getUndeployedOrStoppedFiltersOfTenant(Tenant tenant) {
		List<Component> undeployedFilters = new LinkedList<Component>();
		for (Component c : tenant.getComponents()) {
			if (c.getState() == ComponentState.UNDEPLOYED || c.getState() == ComponentState.DEPLOYED) {
				// is filter?
				for (ProvidedInterface pi : c.getProvidedInterfaces()) {
					if (pi.getType().getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
						undeployedFilters.add(c);
						break;
					}
				}
			}
		}
		return undeployedFilters;
	}

}
