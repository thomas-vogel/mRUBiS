package de.mdelab.simulator.mrubis.utility;

import java.util.List;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.UtilityFunction;
import de.mdelab.simulator.mrubis.MRubisModelQuery;

/**
 * The utility function to compute the utility of mRUBiS for the
 * self-optimization case.
 * 
 * The utility of mRUBiS is computed in the same way as for the self-healing.
 * Therefore, see {@link MRubisSelfHealingUtilityFunction}. Thus, the utility is
 * higher the more filter components are deployed and running in each tenant
 * (i.e., longer pipes of filter components have a higher utility than shorter
 * pipes). This utility is decreased by this utility function if there are
 * performance issues (PIs) in the model:
 * 
 * <ul>
 * <li>For each filter component that is not at its optimal position in the pipe
 * of filters (PI1), the overall utility is decreased by the half of the utility
 * of this filter component. The utility of each component is computed according
 * to the {@link MRubisSelfHealingUtilityFunction}.</li>
 * <li>For each tenant in which the average response time of the personalized
 * search is above a given threshold (PI2), the overall utility of the tenant is
 * reduced by 20\%.</li>
 * <li>If there is a PI3, that is, the average response time of the personalized
 * search is below the lower threshold in a tenant, the overall utility is not
 * reduced since the performance is better than desired. However, there might be
 * potential for improving the utility by adding filter components to the tenant
 * if the pipe does not already have the maximum size (maximum size means that
 * all available filter types are instantiated and used). Adding filters
 * increases the response time of the personalized search, which might resolve a
 * PI3, and increases the overall utility to the amount of the utilities enabled
 * by the added filters.</li>
 * </ul>
 * 
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class MRubisSelfOptimizationUtilityFunction extends MRubisSelfHealingUtilityFunction {

	int responseTimeUpperThreshold;

	/**
	 * Constructor.
	 * 
	 * @param exceptionThreshold
	 *            threshold for the numbers of exceptions that would cause a CF2
	 *            issue in the self-healing case.
	 * @param responseTimeUpperThreshold
	 *            the upper threshold for the average response time of the
	 *            personalized search
	 */
	public MRubisSelfOptimizationUtilityFunction(int exceptionThreshold, int responseTimeUpperThreshold) {
		super(exceptionThreshold);
		this.responseTimeUpperThreshold = responseTimeUpperThreshold;
	}

	/**
	 * @see UtilityFunction#computeUtility(Architecture)
	 */
	@Override
	public double computeUtility(Architecture architecture) {
		double utility = 0.0;

		for (Tenant tenant : architecture.getTenants()) {
			double tenantUtility = super.computeUtility(tenant);
			List<Component> filters = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant).getFilters();

			if (filters.size() > 0) {
				Double[] slopes = new Double[filters.size()];

				// calculate slopes
				for (int i = 0; i < filters.size(); i++) {
					Component filter = filters.get(i);
					double slope = MRubisModelQuery.INSTANCE.getSlopeOfFilter(filter);
					slopes[i] = slope;
				}

				// compare slopes
				for (int j = 0; j < slopes.length - 1; j++) {
					if ((slopes[j] - slopes[j + 1]) < 0) {
						// remove 50% of the utility of the j. filter
						double utilityOfFilter = super.computeUtilityForComponent(filters.get(j));
						tenantUtility -= utilityOfFilter * 0.5;
					}

				}

			}

			// check avg response time
			PerformanceStats stats = MRubisModelQuery.INSTANCE.getPerformanceStatsOfPersonalizedSearch(tenant);
			double avgResponseTime = stats.getTotalTime() / stats.getInvocationCount();
			if (avgResponseTime > this.responseTimeUpperThreshold) {
				tenantUtility *= 0.8;
			}

			utility += tenantUtility;
		}
		return utility;
	}

}
