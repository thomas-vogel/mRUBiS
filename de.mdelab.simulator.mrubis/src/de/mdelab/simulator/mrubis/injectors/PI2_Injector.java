package de.mdelab.simulator.mrubis.injectors;

import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.Injector;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Injects a PI2 by changing the {@link PerformanceStats} of the personalized
 * search within the given {@link Tenant} so that the average response time of
 * the search is above the given threshold.
 * 
 * The personalized search is provided by the method
 * {@link MRubisNames#getPersonalizedItems_Signature} of the interface
 * {@link MRubisNames#browseCategoriesService_InterfaceType_FqName}.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class PI2_Injector extends Abstract_PI_Injector implements Injector<Tenant> {

	private int responseTimeUpperThreshold;

	/**
	 * Constructor.
	 * 
	 * @param performanceMonitoringIntervall
	 *            interval in terms of invocation counts between two performance
	 *            measurements.
	 * @param responseTimeUpperThreshold
	 *            upper threshold of the average response time. Injecting a PI2 sets
	 *            the average response time to a value greater than this threshold.
	 */
	public PI2_Injector(int performanceMonitoringIntervall, int responseTimeUpperThreshold) {
		super(performanceMonitoringIntervall);
		this.responseTimeUpperThreshold = responseTimeUpperThreshold;
	}

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(Tenant tenant) {
		return super.changeResponseTime(tenant, this.responseTimeUpperThreshold + SimulatorUtil.randInt(50, 150));
	}

}
