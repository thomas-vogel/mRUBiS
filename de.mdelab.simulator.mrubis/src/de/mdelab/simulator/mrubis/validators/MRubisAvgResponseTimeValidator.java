package de.mdelab.simulator.mrubis.validators;

import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisModelQuery;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Validates the average response time for the method
 * {@link MRubisNames#getPersonalizedItems_Signature} of the interface
 * {@link MRubisNames#browseCategoriesService_InterfaceType_FqName} for each
 * {@link Tenant} based on the corresponding {@link PerformanceStats} elements.
 * Ideally, the average response time should be around a response time goal and
 * between a lower and an upper boundary.
 * 
 * An issue is raise either when the average response time is above the upper
 * boundary and the pipe contains more than one filter, or when the average
 * response time is below the lower boundary and the pipe does not use all
 * available filters (i.e., unused filters could be added to the pipe).
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisAvgResponseTimeValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisAvgResponseTimeValidator.class.getName());

	private int responseTimeUpperThreshold;
	private int responseTimeLowerThreshold;
	private int responseTimeGoal;

	/**
	 * Constructor.
	 * 
	 * @param responseTimeUpperThreshold
	 *            the upper threshold (boundary) of the average response time.
	 * @param responseTimeLowerThreshold
	 *            the lower threshold (boundary) of the average response time.
	 * @param responseTimeGoal
	 *            the goal (target value) for the average response time
	 */
	public MRubisAvgResponseTimeValidator(int responseTimeUpperThreshold, int responseTimeLowerThreshold,
			int responseTimeGoal) {
		this.responseTimeUpperThreshold = responseTimeUpperThreshold;
		this.responseTimeLowerThreshold = responseTimeLowerThreshold;
		this.responseTimeGoal = responseTimeGoal;
	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;
		int numberOfAvailableFilterTypes = MRubisModelQuery.INSTANCE.getNumberOfAvailableFilterTypes(architecture);

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant)
					+ "\n\tCheck average response time of method " + MRubisNames.getPersonalizedItems_Signature
					+ " of interface " + MRubisNames.browseCategoriesService_InterfaceType_FqName);
			try {
				PerformanceStats targetMethodStats = MRubisModelQuery.INSTANCE
						.getPerformanceStatsOfPersonalizedSearch(tenant);

				long totalTime = targetMethodStats.getTotalTime();
				long invocationCount = targetMethodStats.getInvocationCount();
				long avgResponseTime = totalTime / invocationCount;

				int numberOfFilters = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant).getFilters().size();

				if (avgResponseTime > this.responseTimeUpperThreshold) {
					// exceeding the upper threshold is considered as an issue
					// if the size of the pipe is > 1.
					if (numberOfFilters > 1) {
						LOGGER.severe("[ISSUE] The average response time is " + avgResponseTime
								+ " and greater than the upper threshold of " + this.responseTimeUpperThreshold
								+ " while the pipe has " + numberOfFilters + " filters.");
						issueCount++;
					} else {
						LOGGER.warning("[WARNING] The average response time is " + avgResponseTime
								+ " and greater than the upper threshold of " + this.responseTimeUpperThreshold
								+ " while the pipe has only " + numberOfFilters + " filter.");
					}
				} else if (avgResponseTime < this.responseTimeLowerThreshold) {
					// this is only an issue if less than the available filters are employed in the
					// pipe. Hence, if the pipe does not contain a filter of each available type,
					// then it is is an issue.

					if (numberOfFilters == numberOfAvailableFilterTypes) {
						// each filter type is instantiated and used at least once in the pipe. Whether
						// a type is instantiated more than once is checked by another validator.
						// Hence, we assume that the pipe has the maximal length.
						LOGGER.info("[OK] The average response time is " + avgResponseTime
								+ " and smaller than the lower threshold of " + this.responseTimeLowerThreshold
								+ " but the pipe already has the maximal length of " + numberOfAvailableFilterTypes
								+ " filters.");
					} else if (numberOfFilters < numberOfAvailableFilterTypes) {
						// The pipe does not have the maximal length.
						LOGGER.severe("[ISSUE] The average response time is " + avgResponseTime
								+ " and smaller than the lower threshold of " + this.responseTimeLowerThreshold
								+ " while the pipe with its " + numberOfFilters
								+ " filters does not have the maximal length of " + numberOfAvailableFilterTypes
								+ " filters.");
						issueCount++;
					} else {
						// numberOfFilters > numberOfAvailableFilterTypes
						LOGGER.severe("[ISSUE] The average response time is " + avgResponseTime
								+ " and smaller than the lower threshold of " + this.responseTimeLowerThreshold
								+ " while the pipe with its " + numberOfFilters + " filters has more than "
								+ numberOfAvailableFilterTypes
								+ " filters. There is additionally something wrong with the pipe configuration.");
						issueCount++;
					}

				} else {
					LOGGER.info("[OK] The average response time is " + avgResponseTime
							+ " and thus acceptable with respect to the goal of " + this.responseTimeGoal
							+ " and the lower/upper thresholds of " + this.responseTimeLowerThreshold + "/"
							+ this.responseTimeUpperThreshold + ". (The pipe has " + numberOfFilters + " filters).");
				}
			} catch (Exception e) {
				LOGGER.severe("Simulator cannot analyze the average response time to check the runtime model: "
						+ e.getMessage());
			}

		} // next tenant
		return issueCount;
	}

}
