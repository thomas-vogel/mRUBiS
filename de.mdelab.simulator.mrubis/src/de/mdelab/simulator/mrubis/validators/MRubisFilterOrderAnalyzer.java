package de.mdelab.simulator.mrubis.validators;

import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisModelQuery;

/**
 * Validates the ordering of filter components in each pipe of all
 * {@link Tenant}s. The ordering is determined by the individual slope of the
 * selection rate <code>c</code> and local computation time <code>c</code>
 * (i.e., <code>s/c</code>) of each filter of the pipe. A filter component with
 * a bigger slope is located before any other filter component with a smaller
 * slope in the pipe. Thus, the slopes of filter components decreases from the
 * front to the back of the pipe and they determine the ordering of the filter
 * components in the pipe..
 * 
 * An issue is raised for each filter component that is not well located in the
 * pipe with respect to its neighboring filter components.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisFilterOrderAnalyzer implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisFilterOrderAnalyzer.class.getName());

	/**
	 * Constructor.
	 */
	public MRubisFilterOrderAnalyzer() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));
			int tenantIssueCount = 0;
			String report = "";

			List<Component> filters = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant).getFilters();
			if (filters.size() == 0) {
				LOGGER.warning("The order of filters cannot be checked.");
				return issueCount;
			}

			Double[] slopes = new Double[filters.size()];

			// calculate slopes
			for (int i = 0; i < filters.size(); i++) {
				Component filter = filters.get(i);
				double slope = MRubisModelQuery.INSTANCE.getSlopeOfFilter(filter);
				slopes[i] = slope;
			}

			// compare slopes
			for (int j = 0; j < slopes.length - 1; j++) {
				int position = j + 1;
				if ((slopes[j] - slopes[j + 1]) < 0) {
					LOGGER.severe("[ISSUE] The " + position + ". filter \"" + filters.get(j).getName()
							+ "\" is not located at its optimal position in the pipe.\n" + "Its slope is " + slopes[j]
							+ " and the slope of its subsequent filter is " + slopes[j + 1]);
					tenantIssueCount++;
				}
				report = report + "Slope of the ";
				if (position < 10) {
					report = report + " ";
				}
				report = report + position + ". filter: " + slopes[j] + "\t Filter: " + filters.get(j).getName()
						+ "(uid: " + filters.get(j).getUid() + ")" + "\n";
			}
			// add last filter to the report
			report = report + "Slope of the ";
			if (slopes.length < 10) {
				report = report + " ";
			}
			report = report + slopes.length + ". filter: " + slopes[slopes.length - 1] + "\t Filter: "
					+ filters.get(slopes.length - 1).getName() + "(uid: " + filters.get(slopes.length - 1).getUid()
					+ ")\n";

			if (tenantIssueCount == 0) {
				LOGGER.info("[OK] All filters are well-ordered in the pipe.\n");
			} else {
				LOGGER.severe("[ISSUES] " + tenantIssueCount + " filters are not well-ordered in the pipe:\n" + report);
			}

			issueCount += tenantIssueCount;
		} // next tenant
		return issueCount;
	}

}
