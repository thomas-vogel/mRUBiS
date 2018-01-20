package de.mdelab.simulator.mrubis.injectors;

import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.Injector;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Injects a PI3 by changing the {@link PerformanceStats} of the personalized
 * search within the given {@link Tenant} so that the average response time of
 * the search is below the given threshold.
 * 
 * The personalized search is provided by the method
 * {@link MRubisNames#getPersonalizedItems_Signature} of the interface
 * {@link MRubisNames#browseCategoriesService_InterfaceType_FqName}.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class PI3_Injector extends Abstract_PI_Injector implements Injector<Tenant> {

	private int responseTimeLowerThreshold;

	/**
	 * Constructor.
	 * 
	 * @param performanceMonitoringIntervall
	 *            interval in terms of invocation counts between two performance
	 *            measurements.
	 * @param responseTimeLowerThreshold
	 *            lower threshold of the average response time. Injecting a PI3 sets
	 *            the average response time to a value smaller than this threshold.
	 */
	public PI3_Injector(int performanceMonitoringIntervall, int responseTimeLowerThreshold) {
		super(performanceMonitoringIntervall);
		this.responseTimeLowerThreshold = responseTimeLowerThreshold;
	}

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(Tenant tenant) {
		return super.changeResponseTime(tenant, this.responseTimeLowerThreshold - 50);
	}

}
