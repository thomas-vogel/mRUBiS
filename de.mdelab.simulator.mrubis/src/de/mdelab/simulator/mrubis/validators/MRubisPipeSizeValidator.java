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
 * Validates the pipe of filter {@link Component}s in each {@link Tenant}
 * whether the pipe contains at least so many filter components as the given
 * threshold.
 * 
 * An issue is raised for each pipe that contains less filters than the given
 * threshold.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisPipeSizeValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisPipeSizeValidator.class.getName());

	private int minimalPipeSize;

	/**
	 * Constructor.
	 * 
	 * @param minimalPipeSize
	 *            the minimal size a pipe should have in terms of number of filters.
	 */
	public MRubisPipeSizeValidator(int minimalPipeSize) {
		this.minimalPipeSize = minimalPipeSize;
	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;
		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));
			List<Component> filters = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant).getFilters();
			if (filters.size() == 0) {
				LOGGER.warning("The size of the pipe cannot be checked.");
			} else if (filters.size() < this.minimalPipeSize) {
				LOGGER.warning("[SEVERE] The pipe contains only " + filters.size() + " filters, which is less than "
						+ this.minimalPipeSize);
				issueCount++;
			} else {
				LOGGER.info("[OK] The pipe contains " + filters.size() + " filters, which is more than "
						+ this.minimalPipeSize + " filters.");
			}
		} // next tenant
		return issueCount;
	}

}
