package de.mdelab.simulator.validators;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;

/**
 * Validates for a minimal configuration of each {@link Tenant} architecture. A
 * minimal configuration is one where each {@link ComponentType} is only
 * instantiated at most once per {@link Tenant}, that is, there are no two
 * {@link ComponentState#STARTED} {@link Component}s of the same
 * {@link ComponentType} in one {@link Tenant}.
 * 
 * An issue is raised if one component type is instantiated more than once per
 * tenant.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MinConfigurationValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MinConfigurationValidator.class.getName());

	/**
	 * Constructor.
	 */
	public MinConfigurationValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));
			Map<ComponentType, List<Component>> compType2Instances = new HashMap<>();

			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.STARTED) {
					ComponentType comType = component.getType();
					List<Component> instances = compType2Instances.get(comType);
					if (instances == null) {
						instances = new LinkedList<Component>();
						compType2Instances.put(comType, instances);
					}
					instances.add(component);
				}
			}

			for (ComponentType compType : compType2Instances.keySet()) {
				List<Component> instances = compType2Instances.get(compType);

				StringBuffer list = new StringBuffer();
				for (Component instance : instances) {
					list.append("\t-" + SimulatorUtil.elementToString(instance) + "\n");
				}

				int numberOfInstances = instances.size();
				if (numberOfInstances >= 2) {
					LOGGER.severe("[ISSUE] " + numberOfInstances + " started components of type "
							+ SimulatorUtil.elementToString(compType) + "\n" + list.toString());
					issueCount++;
				} else {
					LOGGER.finer("[OK] " + numberOfInstances + " started component of type "
							+ SimulatorUtil.elementToString(compType) + "\n" + list.toString());
				}

			}

		} // next tenant
		return issueCount;
	}

}
