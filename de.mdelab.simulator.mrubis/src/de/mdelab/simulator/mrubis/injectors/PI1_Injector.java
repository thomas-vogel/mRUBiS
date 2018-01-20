package de.mdelab.simulator.mrubis.injectors;

import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.Injector;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.MRubisModelQuery;
import de.mdelab.simulator.mrubis.MRubisModelQuery.Pipe;

/**
 * Injects a PI1 by changing the selection rate and/or the local computation
 * time of a filter {@link Component} so that the filter component is not
 * located any more at its optimal position in the pipe of filters.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class PI1_Injector implements Injector<Tenant> {

	private final static Logger LOGGER = Logger.getLogger(PI1_Injector.class.getName());

	/**
	 * Constructor.
	 */
	public PI1_Injector() {

	}

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(Tenant tenant) {
		// get all filters of the given tenant
		Pipe pipe = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant);
		List<Component> filters = pipe.getFilters();
		final int numberOfFilters = filters.size();
		if (numberOfFilters <= 1) {
			LOGGER.warning(" -- Filter characteristics cannot be changed. " + "The pipe consits of only "
					+ numberOfFilters + " filters in " + SimulatorUtil.elementToString(tenant));
			return false;
		} else {
			// select one random filter of the tenant's filters
			int index = SimulatorUtil.randInt(0, numberOfFilters - 1);
			Component selectedFilter = filters.get(index);
			// get MonitoredProperties of the selected filter
			MonitoredProperty s = MRubisModelQuery.INSTANCE.getSelectionRateProperty(selectedFilter);
			double s_value = Double.parseDouble(s.getValue());
			MonitoredProperty c = MRubisModelQuery.INSTANCE.getLocalComputationTimeProperty(selectedFilter);
			long c_value = Long.parseLong(c.getValue());

			// set values if they are 0.
			if (s_value == 0) {
				s_value = 0.01;
			}
			if (c_value == 0) {
				c_value = 30;
			}

			double scalar = this.calculateScalar(filters, numberOfFilters, selectedFilter, index, s_value / c_value);

			// multiply selection rate with scalar
			double new_s_value = s_value * scalar;

			// adjust local computation time
			long new_c_value;
			if (scalar > 1) {
				// the selection rate has been improved. Improve the computation time too.
				new_c_value = (long) (c_value * .85);
			} else {
				// the selection rate got worse. Increase the computation time.
				new_c_value = (long) (c_value * 1.15);
			}

			// update the property
			s.setValue("" + new_s_value);
			c.setValue("" + new_c_value);

			LOGGER.info("Performance change of filter " + SimulatorUtil.elementToString(selectedFilter) + "\n\tin "
					+ SimulatorUtil.elementToString(tenant) + "\n\t  - Selection rate changed from " + s_value + " to "
					+ new_s_value + "\n\t  - Local computation time changed from " + c_value + " to " + new_c_value);

			return true;
		}

	}

	/**
	 * Assumes at least two filters in the pipe. It calculates a scalar to scale the
	 * selection rate of one filter so that the filter is not located any more at
	 * its optimal position in the pipe.
	 * 
	 * @param filters
	 *            all filters of the pipe
	 * @param numberOfFilters
	 *            the number of filters in the pipe
	 * @param selectedFilter
	 *            the filter whose selection rate should be adjusted
	 * @param positionOfSelectedFilter
	 *            the position of the selected filter in the pipe
	 * @param slopeOfSelectedFilter
	 *            the slope of the selected filter
	 * @return the scalar to scale the selection rate of the selected filter
	 */
	private double calculateScalar(List<Component> filters, int numberOfFilters, Component selectedFilter,
			int positionOfSelectedFilter, double slopeOfSelectedFilter) {

		int newPosition = positionOfSelectedFilter;
		double middlePosition = numberOfFilters / 2;

		int shift = 0;
		if (numberOfFilters >= 6) {
			// shift by two positions
			shift = 2;
		} else {
			// shift by one position
			shift = 1;
		}

		if (positionOfSelectedFilter < middlePosition) {
			// shift to the back of the pipe
			newPosition += shift;
		} else {
			// shift to the front of the pipe
			newPosition -= shift;
		}

		Component otherFilter = filters.get(newPosition);
		double slopeOfOtherFilter = MRubisModelQuery.INSTANCE.getSlopeOfFilter(otherFilter);

		return slopeOfOtherFilter / slopeOfSelectedFilter;
	}

}
