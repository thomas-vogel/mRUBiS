package de.mdelab.simulator.mrubis;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;

/**
 * Reusable and stateless queries of the model.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class MRubisModelQuery {

	/**
	 * The singleton instance of the class.
	 */
	public final static MRubisModelQuery INSTANCE = new MRubisModelQuery();

	private final static Logger LOGGER = Logger.getLogger(MRubisModelQuery.class.getName());

	/**
	 * Returns the pipe of filter components of the given tenant.
	 * 
	 * @param tenant
	 *            the given tenant
	 * @return the pipe of filter components of the given tenant.
	 */
	public Pipe getPipeOfFilters(Tenant tenant) {
		Component queryService = null;
		OUTERLOOP: for (Component c : tenant.getComponents()) {
			for (ProvidedInterface pi : c.getProvidedInterfaces()) {
				if (pi.getType().getFqName().equals(MRubisNames.basicQueryService_InterfaceType_FqName)) {
					queryService = c;
					break OUTERLOOP;
				}
			}
		}

		List<Component> filters = new LinkedList<>();

		if (queryService == null) {
			LOGGER.warning("Filters cannot be obtained since " + "the \"Query Service\" cannot be found for "
					+ SimulatorUtil.elementToString(tenant));
			return new Pipe(filters, true, false, false);
		} else {

			// -- get first filter component
			Component filter = null;
			for (RequiredInterface reqInterface : queryService.getRequiredInterfaces()) {
				if (reqInterface.getType().getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
					Connector c = reqInterface.getConnector();
					if (c != null && c.getTarget() != null) {
						filter = c.getTarget().getComponent();
						break;
					} else {
						LOGGER.warning("Filters cannot be obtained since "
								+ "the \"Query Service\" is not connected to any filter in "
								+ SimulatorUtil.elementToString(queryService.getTenant()));
						return new Pipe(filters, false, true, false);
					}
				}
			}
			filters.add(filter);
			// -- get iteratively the next filter
			while (filter != null) {
				if (filter.getRequiredInterfaces().size() > 0) {
					Connector c = filter.getRequiredInterfaces().get(0).getConnector();
					if (c != null) {
						if (c.getTarget() != null) {
							Component nextFilter = c.getTarget().getComponent();
							if (nextFilter.equals(filter)) {
								LOGGER.severe("Filter " + SimulatorUtil.elementToString(filter)
										+ " is connected to itself. This is an invalid configuration of the pipe.");
								return new Pipe(filters, false, false, true);
							}
							if (filters.contains(nextFilter)) {
								// the filter has already been collected and
								// thus it has been visited more than one time.

								// create log message
								String msg = "";
								int pos = 1;
								for (Component f : filters) {
									msg = msg + "    (" + pos + ") " + SimulatorUtil.elementToString(f) + "\n";
									pos++;
								}
								msg = msg + "    (" + pos + ") " + SimulatorUtil.elementToString(nextFilter);
								LOGGER.severe(
										"The pipe contains a cycle among the filters. This is an invalid configuration of the pipe:\n"
												+ msg);
								return new Pipe(filters, false, false, true);
							}
							filters.add(nextFilter);
							// next iteration
							filter = nextFilter;
						} else {
							// c.getTarget() == null
							filter = null;
						}

					} else {
						// c == null
						filter = null;
					}
				} else {
					filter = null;
				}
			}
			return new Pipe(filters, false, false, false);
		}
	}

	/**
	 * Represents a pipe of filter components.
	 * 
	 * @author thomas vogel
	 * @version 0.41
	 *
	 */
	public class Pipe {
		private List<Component> filters;
		private boolean queryServiceNotFound = false;
		private boolean queryServiceNotConnected = false;
		private boolean containsCycle = false;

		/**
		 * @param filters
		 *            the filter components of the pipe
		 * @param queryServiceNotFound
		 *            <code>true</code> if the QueryService component as the start of
		 *            the pipe cannot be found, otherwise <code>false</code>. If
		 *            <code>true</code>, then the <code>filters</code> is empty.
		 * @param queryServiceNotConnected
		 *            <code>true</code> if the QueryService component as the start of
		 *            the pipe is connected to any filter, otherwise <code>false</code>.
		 *            If <code>true</code>, then the <code>filters</code> is empty.
		 * @param containsCycle
		 *            <code>true</code> if pipe contains a cycle of filter components,
		 *            otherwise <code>false</code>.
		 */
		public Pipe(List<Component> filters, boolean queryServiceNotFound, boolean queryServiceNotConnected,
				boolean containsCycle) {
			super();
			this.filters = filters;
			this.queryServiceNotFound = queryServiceNotFound;
			this.queryServiceNotConnected = queryServiceNotConnected;
			this.containsCycle = containsCycle;
		}

		/**
		 * Returns ordered list of filter components; the order is the same as the order
		 * of the filters in the pipe of the tenant.
		 * 
		 * @return ordered list of filter components; the order is the same as the order
		 *         of the filters in the pipe of the tenant.
		 */
		public List<Component> getFilters() {
			if (this.filters == null) {
				this.filters = new LinkedList<Component>();
			}
			return this.filters;
		}

		/**
		 * @return <code>true</code> if the QueryService component as the start of the
		 *         pipe cannot be found, otherwise <code>false</code>. If
		 *         <code>true</code>, then the <code>filters</code> is empty.
		 */
		public boolean queryServiceNotFound() {
			return this.queryServiceNotFound;
		}

		/**
		 * @return <code>true</code> if the QueryService component as the start of the
		 *         pipe is connected to any filter, otherwise <code>false</code>. If
		 *         <code>true</code>, then the <code>filters</code> is empty.
		 */
		public boolean queryServiceNotConnected() {
			return this.queryServiceNotConnected;
		}

		/**
		 * @return <code>true</code> if pipe contains a cycle of filter components,
		 *         otherwise <code>false</code>.
		 */
		public boolean containsCycle() {
			return this.containsCycle;
		}

	}

	/**
	 * Returns the first occurrence of a {@link ProvidedInterface} with the given
	 * <code>fullyQualifiedInterfaceName</code> in the given {@link Tenant}.
	 * 
	 * Should be used for provided interface types that are only provided once in a
	 * tenant. Hence, it does not work for item filter interfaces that are provided
	 * by multiple filter components in one tenant.
	 * 
	 * @param tenant
	 *            the given tenant
	 * @param fullyQualifiedInterfaceName
	 *            the given fully qualified interface name
	 * @return the corresponding firstly found provided interface
	 */
	public ProvidedInterface getProvidedInterfaceByName(Tenant tenant, String fullyQualifiedInterfaceName) {
		ProvidedInterface providedInterface = null;
		OUTERLOOP: for (Component c : tenant.getComponents()) {
			for (ProvidedInterface pi : c.getProvidedInterfaces()) {
				if (pi.getType().getFqName().equals(fullyQualifiedInterfaceName)) {
					providedInterface = pi;
					break OUTERLOOP;
				}
			}
		}
		return providedInterface;
	}

	/**
	 * Returns the {@link MethodSpecification} belonging to the given
	 * {@link ProvidedInterface} and having the given <code>signature</code>.
	 * 
	 * @param pi
	 *            the given provided interface
	 * @param signature
	 *            the given signature
	 * @return the method specification
	 */
	public MethodSpecification findMethodSpecification(ProvidedInterface pi, String signature) {
		MethodSpecification result = null;
		for (MethodSpecification m : pi.getType().getMethodSpecifications()) {
			if (m.getSignature().equals(signature)) {
				result = m;
				break;
			}
		}
		return result;
	}

	/**
	 * Returns the {@link Parameter} belonging to the given {@link Component} and
	 * having the given <code>paramName</code> as its name.
	 * 
	 * @param component
	 *            the given component
	 * @param paramName
	 *            the given parameter name
	 * @return the corresponding parameter
	 */
	public Parameter getParameterByName(Component component, String paramName) {
		Parameter param = null;
		for (Parameter p : component.getParameters()) {
			if (p.getType().getName().equals(paramName)) {
				param = p;
				break;
			}
		}
		return param;
	}

	/**
	 * Returns the {@link MonitoredProperty} belonging to the given
	 * {@link Component} and having the given <code>propName</code> as its name.
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
	 * Returns the values of the local computation time of the given
	 * <code>filter</code> {@link Component}.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the value of the local computation time of the given filter
	 */
	public long getLocalComputationTime(Component filter) {
		MonitoredProperty c = MRubisModelQuery.INSTANCE.getLocalComputationTimeProperty(filter);
		return Long.parseLong(c.getValue());
	}

	/**
	 * Returns the {@link MonitoredProperty} for the local computation time of the
	 * given <code>filter</code> {@link Component}.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the monitored property for the local computation time of the given
	 *         filter
	 */
	public MonitoredProperty getLocalComputationTimeProperty(Component filter) {
		return MRubisModelQuery.INSTANCE.getMonitoredPropertyByName(filter,
				MRubisNames.localComputationTime_MonitoredProperty_Name);
	}

	/**
	 * Returns the values of the selection rate of the given <code>filter</code>
	 * {@link Component}.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the value of the selection rate of the given filter
	 */
	public double getSelectionRate(Component filter) {
		MonitoredProperty s = MRubisModelQuery.INSTANCE.getSelectionRateProperty(filter);
		return Double.parseDouble(s.getValue());
	}

	/**
	 * Returns the {@link MonitoredProperty} for the selection rate of the given
	 * <code>filter</code> {@link Component}.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the monitored property for the selection rate of the given filter
	 */
	public MonitoredProperty getSelectionRateProperty(Component filter) {
		return MRubisModelQuery.INSTANCE.getMonitoredPropertyByName(filter,
				MRubisNames.selectionRate_MonitoredProperty_Name);
	}

	/**
	 * Returns the slope of the given filter component as the selection rate divided
	 * by the local computation time of the given <code>filter</code>
	 * {@link Component}.
	 * 
	 * @param filter
	 *            the given filter component
	 * @return the slope of the given filter component
	 */
	public double getSlopeOfFilter(Component filter) {
		return this.getSelectionRate(filter) / this.getLocalComputationTime(filter);
	}

	/**
	 * Returns all filter {@link ComponentType}s that are available in the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 * @return list of all filter types available in the model. A filter type is a
	 *         component type that provided the interface of type
	 *         <code>de.hpi.sam.rubis.filter.ItemFilter</code> (see
	 *         {@link MRubisNames#itemFilterService_InterfaceType_FqName}).
	 */
	public List<ComponentType> getAllFilterTypes(Architecture architecture) {
		List<ComponentType> filterTypes = new LinkedList<>();
		for (ComponentType ct : architecture.getComponentTypes()) {
			for (InterfaceType it : ct.getProvidedInterfaceTypes()) {
				if (it.getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
					filterTypes.add(ct);
					break; // break inner loop and check next component type
				}
			}
		}
		return filterTypes;

	}

	/**
	 * Returns the number of all filter {@link ComponentType}s that are available in
	 * the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 * @return the number of filter component types available in the model.
	 * @see #getAllFilterTypes(Architecture)
	 */
	public int getNumberOfAvailableFilterTypes(Architecture architecture) {
		return this.getAllFilterTypes(architecture).size();
	}

	/**
	 * Returns the {@link PerformanceStats} of the given <code>method</code> that
	 * belongs to the given <code>providedInterface</code>.
	 * 
	 * @param providedInterface
	 *            the given provided interface.
	 * @param method
	 *            the given method.
	 * @return the performance statistics of the method for the provided interface.
	 */
	public PerformanceStats getStatsForMethod(ProvidedInterface providedInterface, MethodSpecification method) {
		PerformanceStats stats = null;
		for (PerformanceStats s : providedInterface.getPerformanceStats()) {
			if (s.getMethod().equals(method)) {
				stats = s;
				break;
			}
		}
		return stats;
	}

	/**
	 * Returns the {@link PerformanceStats} of the personalized search of the given
	 * tenant, that is, for the method
	 * {@code MrubisNames#GET_PERSONALIZED_ITEMS_SIGNATURE} belonging to the
	 * interface {@code MrubisNames#BROWSE_CATEGORIES_SERVICE_INTERFACE} provided by
	 * a component of the given tenant.
	 * 
	 * @param tenant
	 *            the given tenant.
	 * @return the corresponding performance statistics
	 */
	public PerformanceStats getPerformanceStatsOfPersonalizedSearch(Tenant tenant) {
		// find browseCategoriesInterface
		ProvidedInterface browseCategoriesInterface = getProvidedInterfaceByName(tenant,
				MRubisNames.browseCategoriesService_InterfaceType_FqName);
		// find method
		MethodSpecification targetMethod = findMethodSpecification(browseCategoriesInterface,
				MRubisNames.getPersonalizedItems_Signature);
		// find performance stats
		PerformanceStats targetMethodStats = getStatsForMethod(browseCategoriesInterface, targetMethod);
		return targetMethodStats;
	}
}
