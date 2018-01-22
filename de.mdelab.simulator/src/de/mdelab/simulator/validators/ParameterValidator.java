package de.mdelab.simulator.validators;

import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;

/**
 * Validates for each {@link Tenant} architecture whether each {@link Parameter}
 * of a {@link ComponentState#STARTED} {@link Component} has a value assigned
 * (see {@link Parameter#getValue()}). An issue is raised if such a parameter
 * has no value assigned.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ParameterValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(ParameterValidator.class.getName());

	/**
	 * Constructor.
	 */
	public ParameterValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));

			boolean propertiesFound = false;
			int tenantIssueCount = 0;

			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.STARTED) {
					for (Parameter parameter : component.getParameters()) {
						propertiesFound = true;
						Object value = parameter.getValue();
						if (value == null) {
							LOGGER.severe("[ISSUE] No value assigned to " + SimulatorUtil.elementToString(parameter)
									+ " of " + SimulatorUtil.elementToString(component));
							tenantIssueCount++;
						} else {
							LOGGER.finer("[OK] Value assigned to " + SimulatorUtil.elementToString(parameter) + " of "
									+ SimulatorUtil.elementToString(component));
						}
					}
				}
			}

			if (!propertiesFound) {
				LOGGER.info("[OK] No parameters found.");
			}

			// log summary
			if (tenantIssueCount == 0) {
				LOGGER.info("[OK] All parameters have a value assigned.");
			} else {
				LOGGER.severe("[ISSUES] " + tenantIssueCount + " parameters have no value assigned.");
			}
			issueCount = issueCount + tenantIssueCount;
		} // next tenant

		return issueCount;
	}

}
