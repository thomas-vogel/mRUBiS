package de.mdelab.simulator.mrubis.injectors;

import java.util.logging.Logger;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.MRubisModelQuery;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Abstract class for injectors of performance issues.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Abstract_PI_Injector {
	private final static Logger LOGGER = Logger.getLogger(Abstract_PI_Injector.class.getName());

	private int performanceMonitoringInterval;

	/**
	 * Constructor.
	 * 
	 * @param performanceMonitoringInterval
	 *            interval in terms of invocation counts between two performance
	 *            measurements.
	 */
	protected Abstract_PI_Injector(int performanceMonitoringInterval) {
		this.performanceMonitoringInterval = performanceMonitoringInterval;
	}

	/**
	 * Changes the average response time of the method
	 * {@link MRubisNames#getPersonalizedItems_Signature} of the interface
	 * {@link MRubisNames#browseRegionService_InterfaceType_FqName} provided by
	 * exactly one component of the given tenant. Thus, the corresponding
	 * {@link PerformanceStats} element is updated by setting new values to its
	 * attributes such that the average response time is
	 * <code>avgResponseTime</code>.
	 * 
	 * 
	 * @param target
	 *            the give tenant
	 * @param avgResponseTime
	 *            the average response time to be set
	 * @return <code>true</code> if the average response could be successfully
	 *         updated, otherwise<code>false</code>.
	 */
	protected boolean changeResponseTime(Tenant tenant, long avgResponseTime) {

		// find the provided interface
		// "de.hpi.sam.rubis.itemmgmt.BrowseCategoriesService"
		ProvidedInterface browseCategoriesInterface = MRubisModelQuery.INSTANCE.getProvidedInterfaceByName(tenant,
				MRubisNames.browseCategoriesService_InterfaceType_FqName);
		if (browseCategoriesInterface == null) {
			LOGGER.warning(" -- The provided interface \"" + MRubisNames.browseCategoriesService_InterfaceType_FqName
					+ "\" cannot be found for " + SimulatorUtil.elementToString(tenant));
			return false;
		} else {
			// get component providing the interface
			Component itemMgmtService = browseCategoriesInterface.getComponent();

			// find method
			// "getPersonalizedItems(java.lang.String,java.lang.String)"
			MethodSpecification targetMethod = MRubisModelQuery.INSTANCE
					.findMethodSpecification(browseCategoriesInterface, MRubisNames.getPersonalizedItems_Signature);
			if (targetMethod == null) {
				LOGGER.warning(
						" -- The method \"" + MRubisNames.getPersonalizedItems_Signature + "\" cannot be found for the "
								+ SimulatorUtil.elementToString(browseCategoriesInterface.getType()));
				return false;
			} else {
				// find performance stats element for the method
				PerformanceStats targetMethodStats = MRubisModelQuery.INSTANCE
						.getStatsForMethod(browseCategoriesInterface, targetMethod);
				if (targetMethodStats == null) {
					LOGGER.warning(" -- The are no performance stats for the method \""
							+ MRubisNames.getPersonalizedItems_Signature + "\" of the "
							+ SimulatorUtil.elementToString(browseCategoriesInterface) + " of "
							+ SimulatorUtil.elementToString(itemMgmtService) + " in "
							+ SimulatorUtil.elementToString(tenant));
					return false;
				} else {
					// update the average response time by updating the totalTime and the
					// invocationCount of the performance stats element
					long totalTime = targetMethodStats.getTotalTime();
					long invocationCount = targetMethodStats.getInvocationCount();
					long old_avgResponseTime = totalTime / invocationCount;

					long new_invocationCount = invocationCount + this.performanceMonitoringInterval;
					long new_totalTime = new_invocationCount * avgResponseTime;

					targetMethodStats.setTotalTime(new_totalTime);
					targetMethodStats.setInvocationCount(new_invocationCount);
					LOGGER.info(" -- Update of the performance stats of the method \"" + targetMethod.getSignature()
							+ "\" of " + SimulatorUtil.elementToString(browseCategoriesInterface) + " of "
							+ SimulatorUtil.elementToString(itemMgmtService) + " in "
							+ SimulatorUtil.elementToString(tenant) + "\n\t-Total time:\t\t" + totalTime + " => "
							+ new_totalTime + "\n\t-Invocation Count:\t" + invocationCount + " => "
							+ new_invocationCount + "\n\tAverage response time:\t" + old_avgResponseTime + " => "
							+ avgResponseTime);

					// scale all other performance stats of this tenant
					// linearly such that the average response time
					// remain the same for these other stats elements.
					this.scaleOtherPerformanceStats(tenant, targetMethodStats);
					return true;
				}
			}
		}

	}

	/**
	 * Scale all performance stats, except of the given
	 * <code>targetMethodStats</code>, of the given tenant linearly such that the
	 * average response time remains the same for these stats elements.
	 * 
	 * @param tenant
	 *            the tenant
	 * @param targetMethodStats
	 *            the performace stats element of the method to be excluded from the
	 *            scaling
	 */
	private void scaleOtherPerformanceStats(Tenant tenant, PerformanceStats targetMethodStats) {
		for (Component comp : tenant.getComponents()) {
			for (ProvidedInterface pi : comp.getProvidedInterfaces()) {
				for (PerformanceStats ps : pi.getPerformanceStats()) {
					if (!ps.equals(targetMethodStats)) {
						// only scale stats of methods that are used
						if (ps.getInvocationCount() > 0) {
							long ps_avgResponseTime = ps.getTotalTime() / ps.getInvocationCount();
							ps.setInvocationCount(ps.getInvocationCount() + this.performanceMonitoringInterval);
							ps.setTotalTime(ps_avgResponseTime * ps.getInvocationCount());
						}
					}
				}
			}
		}
	}

}
