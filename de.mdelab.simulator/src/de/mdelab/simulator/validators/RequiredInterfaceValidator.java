package de.mdelab.simulator.validators;

import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;

/**
 * Validates for each {@link Tenant} architecture whether each
 * {@link RequiredInterface} is connected to a {@link ProvidedInterface} of a
 * {@link ComponentState#STARTED} {@link Component} within the same
 * {@link Tenant}.
 * 
 * An issue is raised for each required interface that is not connected or that
 * is connected to a component of another tenant.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class RequiredInterfaceValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(RequiredInterfaceValidator.class.getName());

	/**
	 * Constructor.
	 */
	public RequiredInterfaceValidator() {

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

			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.STARTED) {
					for (RequiredInterface reqInterface : component.getRequiredInterfaces()) {
						Connector connector = reqInterface.getConnector();
						if (connector == null) {
							// there is no connector
							LOGGER.severe("[ISSUE] No connector for " + SimulatorUtil.elementToString(reqInterface)
									+ " of " + SimulatorUtil.elementToString(component));
							tenantIssueCount++;
						} else {
							// there is a connector
							ProvidedInterface proInterface = connector.getTarget();
							if (proInterface == null) {
								// connector points to null
								LOGGER.severe("[ISSUE] No provided interface set for "
										+ SimulatorUtil.elementToString(connector) + " of "
										+ SimulatorUtil.elementToString(reqInterface) + " of "
										+ SimulatorUtil.elementToString(component));
								tenantIssueCount++;
							} else {
								// connector points to a provided interface
								if (!proInterface.getType().equals(reqInterface.getType())) {
									// Interface types do not match
									LOGGER.severe("[ISSUE] Non-matching interfaces are connected by "
											+ SimulatorUtil.elementToString(connector) + "\n\t--"
											+ SimulatorUtil.elementToString(reqInterface) + "\n\t--"
											+ SimulatorUtil.elementToString(proInterface));

									tenantIssueCount++;
								} else {
									// Interface types match
									Component targetComponent = proInterface.getComponent();
									// requiring and providing components should belong to the same tenant
									if (!tenant.equals(targetComponent.getTenant())) {
										LOGGER.severe("[ISSUE] " + SimulatorUtil.elementToString(reqInterface) + " of "
												+ SimulatorUtil.elementToString(component) + " from "
												+ SimulatorUtil.elementToString(tenant) + " is connected to "
												+ SimulatorUtil.elementToString(proInterface) + " of "
												+ SimulatorUtil.elementToString(targetComponent)
												+ " from the different "
												+ SimulatorUtil.elementToString(targetComponent.getTenant())
												+ ". Connected components must belong to the same tenant!");
										tenantIssueCount++;
									} else {
										if (targetComponent.getState() != ComponentState.STARTED) {
											// Target component should be started
											LOGGER.severe("[ISSUE] " + SimulatorUtil.elementToString(reqInterface)
													+ " is connected to " + SimulatorUtil.elementToString(proInterface)
													+ " provided by the non-STARTED"
													+ SimulatorUtil.elementToString(targetComponent));
											tenantIssueCount++;
										} else {
											LOGGER.finer("[OK] " + SimulatorUtil.elementToString(reqInterface)
													+ " is properly connected to "
													+ SimulatorUtil.elementToString(proInterface));
										}
									}

								}
							}
						}

					}

				}
			}

			// log summary
			if (tenantIssueCount == 0) {
				LOGGER.info("[OK] All required interfaces are properly connected.");
			} else {
				LOGGER.severe("[ISSUES] " + tenantIssueCount + " required interfaces are not properly connected.");
			}
			issueCount = issueCount + tenantIssueCount;

		} // next tenant
		return issueCount;
	}

}
