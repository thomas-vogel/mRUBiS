package de.mdelab.simulator.validators;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;

/**
 * Validates each {@link Tenant} architecture whether its
 * {@link ComponentState#STARTED} {@link Component}s provide together all given
 * interfaces such that the tenant actually provides the necessary functionality
 * to be operable. An issue is raised for each of the given interfaces that are
 * not provided by a started component in each tenant.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ProvidedInterfaceValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(ProvidedInterfaceValidator.class.getName());

	private Set<String> serviceInterfaceNames;

	/**
	 * Constructor.
	 * 
	 * @param serviceInterfaceNames
	 *            List of fully qualified interface names that should be provided by
	 *            started components in each tenant.
	 */
	public ProvidedInterfaceValidator(Set<String> serviceInterfaceNames) {
		this.serviceInterfaceNames = serviceInterfaceNames;
	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));

			Set<String> allInterfaces = new HashSet<String>(this.serviceInterfaceNames);
			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.STARTED) {
					for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
						String fqName = providedInterface.getType().getFqName();
						if (allInterfaces.contains(fqName)) {
							LOGGER.finer("[OK] Interface \"" + fqName + "\" is provided by "
									+ SimulatorUtil.elementToString(component));
							allInterfaces.remove(fqName);
						}
					}
				}
			}

			if (allInterfaces.size() == 0) {
				LOGGER.info("[OK] All necessary interfaces are provided by a started component.");
			} else {
				String msg = "[ISSUES] The following interfaces are not provided by a started component:\n";
				for (String interfaceName : allInterfaces) {
					msg += "\t-[ISSUE] \"" + interfaceName + "\"\n";
					issueCount++;
				}
				LOGGER.severe(msg);
			}
		}
		return issueCount;
	}

}
