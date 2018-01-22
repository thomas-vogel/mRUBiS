package de.mdelab.simulator.mrubis.validators;

import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisModelQuery;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Validates the model after a self-adaptation to check whether all filter
 * {@link Component}s have a {@link MonitoredProperty} for the selection rate
 * and a {@link MonitoredProperty} for the local computation time. In the case
 * that these properties are missing for a filter component, this validator
 * creates and adds them to the filter.
 * 
 * For instance, if a filter component has been removed, and a new filter
 * component of the same type has been deployed, this new filter component has
 * no {@link MonitoredProperty} elements. In this case, this validator adds
 * these property elements.
 * 
 * Using a real system, the monitored properties are added to the model by
 * monitoring the running system and updating the model.
 * 
 * This validator does not raise any issues.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisMissingMonitoredPropertyValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisMissingMonitoredPropertyValidator.class.getName());

	/**
	 * Constructor.
	 */
	public MRubisMissingMonitoredPropertyValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));
			List<Component> filters = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant).getFilters();

			boolean missingElements = false;
			boolean blackListTenant = false;
			int position = 0;
			for (Component filter : filters) {
				// MonitoredProperty: selection rate
				MonitoredProperty selectionRate = MRubisModelQuery.INSTANCE.getSelectionRateProperty(filter);

				// Property does not exist. Create it with an empty value.
				if (selectionRate == null) {
					selectionRate = this.createSelectionRateProperty(null);
					filter.getMonitoredProperties().add(selectionRate);
					LOGGER.finer(" -- Filter \"" + filter.getName()
							+ "\" has no MonitoredProperty for the selection rate. Property without a concrete value has been added.");
				}

				// Property exists but has no value. Calculate and set the value if needed.
				String value = selectionRate.getValue();
				LOGGER.finer(" -- Filter \"" + filter.getName() + "\" has a MonitoredProperty with a selection rate of "
						+ value);

				if (value == null || value.equals("")) {
					// Selection rate to be calculated.
					double selectionRateValue = 0;
					if (position == 0) {
						// first filter
						if (filters.size() >= 2) {
							Component rightNeighbor = filters.get(1);
							double neighborSelectionRateValue = MRubisModelQuery.INSTANCE
									.getSelectionRate(rightNeighbor);
							selectionRateValue = neighborSelectionRateValue * 1.1;
						} else {
							// there is only one filter in the pipe. Assign a selection rate of 0.25
							selectionRateValue = 0.25;
						}

					} else if (position >= 1 && position < filters.size() - 1) {
						// filter in between
						Component leftNeighbor = filters.get(position - 1);
						double leftNeighborSelectionRateValue = MRubisModelQuery.INSTANCE
								.getSelectionRate(leftNeighbor);
						Component rightNeighbor = filters.get(position + 1);
						double rightNeighborSelectionRateValue = MRubisModelQuery.INSTANCE
								.getSelectionRate(rightNeighbor);
						selectionRateValue = (leftNeighborSelectionRateValue + rightNeighborSelectionRateValue) / 2;

					} else if (position > 0 && position == filters.size() - 1) {
						// last filter; there is at least one filter before
						Component leftNeighbor = filters.get(position - 1);
						double leftNeighborSelectionRateValue = MRubisModelQuery.INSTANCE
								.getSelectionRate(leftNeighbor);
						selectionRateValue = leftNeighborSelectionRateValue * 0.9;

					}

					// set the selection rate value
					selectionRate.setValue("" + selectionRateValue);

					blackListTenant = true;
					missingElements = true;
					LOGGER.info("  -- Filter \"" + filter.getName() + "\" has now the selection rate of "
							+ selectionRateValue);

				}

				// MonitoredProperty: local computation time
				MonitoredProperty localComputationTime = MRubisModelQuery.INSTANCE
						.getLocalComputationTimeProperty(filter);

				// Property does not exist. Create it with an empty value.
				if (localComputationTime == null) {
					localComputationTime = this.createLocalComputationTimeProperty(null);
					filter.getMonitoredProperties().add(localComputationTime);
					LOGGER.finer(" -- Filter \"" + filter.getName()
							+ "\" has no MonitoredProperty for the local computation time. Property without a concrete value has been added.");
				}

				// Property exists but has no value. Calculate and set the value if needed.
				String time = localComputationTime.getValue();

				LOGGER.finer(" -- Filter \"" + filter.getName()
						+ "\" has a MonitoredProperty with a local computation time of " + time);

				if (time == null || time.equals("")) {
					// time to be calculated
					long compTimeValue = 0;
					// add property
					if (position == 0) {
						// first filter
						if (filters.size() >= 2) {
							Component rightNeighbor = filters.get(1);
							long neighborCompTimeValue = MRubisModelQuery.INSTANCE
									.getLocalComputationTime(rightNeighbor);
							compTimeValue = (long) (neighborCompTimeValue * 0.95);
						} else {
							// there is only one filter in the pipe. Assign a computation time of 45
							compTimeValue = 45;
						}

					} else if (position >= 1 && position < filters.size() - 1) {
						// filter in between
						Component leftNeighbor = filters.get(position - 1);
						long leftNeighborCompTimeValue = MRubisModelQuery.INSTANCE
								.getLocalComputationTime(leftNeighbor);
						Component rightNeighbor = filters.get(position + 1);
						long rightNeighborCompTimeValue = MRubisModelQuery.INSTANCE
								.getLocalComputationTime(rightNeighbor);
						compTimeValue = (leftNeighborCompTimeValue + rightNeighborCompTimeValue) / 2;

					} else if (position > 0 && position == filters.size() - 1) {
						// last filter; there is at least one filter before
						Component leftNeighbor = filters.get(position - 1);
						long leftNeighborCompTimeValue = MRubisModelQuery.INSTANCE
								.getLocalComputationTime(leftNeighbor);
						compTimeValue = (long) (leftNeighborCompTimeValue * 1.05);

					}

					// Set the time value to the property.
					localComputationTime.setValue("" + compTimeValue);

					blackListTenant = true;
					missingElements = true;
					LOGGER.info("  -- Filter \"" + filter.getName() + "\" has been set the local computation time of "
							+ compTimeValue);

				}

				// =========================
				position = position + 1;
			} // next filter

			if (blackListTenant) {
				// TODO blacklist tenant?
			}

			if (!missingElements && filters.size() > 0) {
				LOGGER.info(
						"  -- All filters have the MonitoredPropery elements for the selection rate and local computation time.");
			} else if (missingElements && filters.size() > 0) {
				LOGGER.info(
						"  -- All filters now have the MonitoredPropery elements for the selection rate and local computation time.");
			}

		} // next tenant
		return 0;
	}

	private MonitoredProperty createSelectionRateProperty(String value) {
		MonitoredProperty property = ComparchFactory.eINSTANCE.createMonitoredProperty();
		property.setName(MRubisNames.selectionRate_MonitoredProperty_Name);
		if (value != null) {
			property.setValue(value);
		}
		property.setType(MRubisNames.selectionRate_MonitoredProperty_Type);
		property.setUnit(MRubisNames.selectionRate_MonitoredProperty_Unit);
		property.setDescription(MRubisNames.selectionRate_MonitoredProperty_Description);
		return property;
	}

	private MonitoredProperty createLocalComputationTimeProperty(String value) {
		MonitoredProperty property = ComparchFactory.eINSTANCE.createMonitoredProperty();
		property.setName(MRubisNames.localComputationTime_MonitoredProperty_Name);
		if (value != null) {
			property.setValue(value);
		}
		property.setType(MRubisNames.localComputationTime_MonitoredProperty_Type);
		property.setUnit(MRubisNames.localComputationTime_MonitoredProperty_Unit);
		property.setDescription(MRubisNames.localComputationTime_MonitoredProperty_Description);
		return property;
	}

}
