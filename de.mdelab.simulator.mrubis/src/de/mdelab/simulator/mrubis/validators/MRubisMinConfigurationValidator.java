package de.mdelab.simulator.mrubis.validators;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Validates for the minimal configuration of each {@link Tenant} architecture
 * in terms of provided interfaces and the number of components providing each
 * interface within one tenant.
 * 
 * Each interface, that is, {@link InterfaceType} should only be provided as a
 * {@link ProvidedInterface} by exactly one {@link ComponentState#STARTED}
 * {@link Component} within one {@link Tenant}. Otherwise, more than one
 * component providing the same functionality is running and consuming
 * resources.
 * 
 * This holds for each service interface except of
 * {@link MRubisNames#itemFilterService_InterfaceType_FqName} as there is
 * usually a pipe of more than one filer component deployed.
 * 
 * An issue is raised if more than one started component within one tenant
 * provides the same service interface.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisMinConfigurationValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisMinConfigurationValidator.class.getName());

	/**
	 * Constructor.
	 */
	public MRubisMinConfigurationValidator() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));
			Map<InterfaceType, List<Component>> provInterfaceComp = new HashMap<InterfaceType, List<Component>>();

			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.STARTED) {
					for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
						InterfaceType interfaceType = providedInterface.getType();
						// consider interfaces that are not ItemFilters
						if (!interfaceType.getFqName().equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
							List<Component> providingComponents = provInterfaceComp.get(interfaceType);
							if (providingComponents == null) {
								providingComponents = new LinkedList<Component>();
								provInterfaceComp.put(interfaceType, providingComponents);
							}
							providingComponents.add(component);
						}
					}
				}
			}

			int tenantIssueCount = 0;
			for (InterfaceType interfaceType : provInterfaceComp.keySet()) {
				List<Component> providingComponents = provInterfaceComp.get(interfaceType);
				if (providingComponents.size() == 1) {
					LOGGER.finer("[OK] The interface \"" + interfaceType.getFqName() + "\" is provided by one started "
							+ SimulatorUtil.elementToString(providingComponents.get(0)));
				} else {
					String severeMsg = "[ISSUE] The interface \"" + interfaceType.getFqName() + "\" is provided by "
							+ providingComponents.size() + " started components:";
					for (Component c : providingComponents) {
						severeMsg = severeMsg + "\n\t\t --" + SimulatorUtil.elementToString(c);
					}
					LOGGER.severe(severeMsg);
					tenantIssueCount++;
				}
			}
			issueCount = issueCount + tenantIssueCount;

			// log summary
			if (tenantIssueCount == 0) {
				LOGGER.info("[OK] Each interface is provided by one started component.");
			} else {
				LOGGER.severe("[ISSUES] " + tenantIssueCount
						+ " interfaces are provided by more than one started component.");
			}

			// list not used component types of the tenant
			List<ComponentType> types = new LinkedList<ComponentType>(architecture.getComponentTypes());
			for (Component c : tenant.getComponents()) {
				types.remove(c.getType());
			}
			String msg = "[INFO] The following component types are not used:";
			if (types.size() == 0) {
				msg += "\n\t None";
			} else {
				for (ComponentType ct : types) {
					msg += "\n\t" + SimulatorUtil.elementToString(ct);
				}
			}
			LOGGER.info(msg + "\n");

		} // next tenant
		return issueCount;
	}
}