package de.mdelab.simulator.mrubis.validators;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisModelQuery;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Validates that each filter {@link Component} of a {@link Tenant}'s pipe is of
 * a different filter {@link ComponentType}. (It does not make sense to apply
 * more than one filter of the same type within one pipe since they realize the
 * same functionality).
 * 
 * A filter component is one that provides a {@link ProvidedInterface} of the
 * {@link InterfaceType} with the fully qualified name (see
 * {@link InterfaceType#getFqName()})
 * {@link MRubisNames#itemFilterService_InterfaceType_FqName}.
 * 
 * An issue is raised for each additional instance of the same filter
 * {@link ComponentType} within the same pipe.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisFilterTypeValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisFilterTypeValidator.class.getName());

	/**
	 * Constructor.
	 */
	public MRubisFilterTypeValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));

			Map<ComponentType, List<Component>> filterTypes2Filters = new HashMap<>();
			List<Component> filters = MRubisModelQuery.INSTANCE.getPipeOfFilters(tenant).getFilters();
			for (Component filter : filters) {
				ComponentType filterType = filter.getType();
				List<Component> instances = filterTypes2Filters.get(filterType);
				if (instances == null) {
					instances = new LinkedList<>();
					filterTypes2Filters.put(filterType, instances);
				}
				instances.add(filter);
			}

			// LOG the pipe
			String debug = "Debug the pipe ...";
			for (ComponentType type : filterTypes2Filters.keySet()) {
				debug = debug + "\n-- Of " + SimulatorUtil.elementToString(type)
						+ " the following components are part of the pipe:";
				List<Component> comps = filterTypes2Filters.get(type);
				for (Component c : comps) {
					debug = debug + "\n\t-- " + SimulatorUtil.elementToString(c);
				}
			}
			LOGGER.finer(debug);
			// LOG the pipe

			boolean isFailure = false;
			for (ComponentType filterType : filterTypes2Filters.keySet()) {
				int numberOfOccurences = filterTypes2Filters.get(filterType).size();
				if (numberOfOccurences >= 2) {
					isFailure = true;
					LOGGER.severe("[ISSUE] The pipe contains " + numberOfOccurences
							+ " (hence, more than one) filters of type " + SimulatorUtil.elementToString(filterType));
					issueCount++;
				}
			}

			if (!isFailure) {
				LOGGER.info("[OK] All filters of the pipe are of a different type.");
			}

		} // next tenant
		return issueCount;
	}
}