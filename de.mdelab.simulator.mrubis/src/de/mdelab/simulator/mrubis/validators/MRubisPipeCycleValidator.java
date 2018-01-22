package de.mdelab.simulator.mrubis.validators;

import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisModelQuery;
import de.mdelab.simulator.mrubis.MRubisModelQuery.Pipe;

/**
 * Validates the pipe of filter {@link Component}s in each {@link Tenant}
 * architecture whether the pipe contains any cycle among the filter components
 * or not.
 * 
 * An issue is raised if there is a cycle among the filter components of a pipe.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class MRubisPipeCycleValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisPipeCycleValidator.class.getName());

	/**
	 * Constructor.
	 */
	public MRubisPipeCycleValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;
		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));
			Pipe pipe = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant);
			if (pipe.containsCycle()) {
				issueCount++;
			}
		}
		return issueCount;
	}

}
