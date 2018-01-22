package de.mdelab.simulator.mrubis.validators;

import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Validates for each {@link Tenant} architecture whether each
 * {@link RequiredInterface} is connected to a {@link ProvidedInterface} of a
 * {@link ComponentState#STARTED} {@link Component} within the same
 * {@link Tenant} and whether the connected {@link RequiredInterface} and
 * {@link ProvidedInterface} are of the same {@link InterfaceType}.
 * 
 * It further takes into account that in each tenant one required interface is
 * not connected by design; this interface belongs to the last filter in the
 * pipe. Thus, this unconnected required interface does cause an issue.
 * 
 * An issue is raised if any of the previously mentioned criteria are not
 * satisfied.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class MRubisRequiredInterfaceValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(MRubisRequiredInterfaceValidator.class.getName());

	/**
	 * Constructor.
	 */
	public MRubisRequiredInterfaceValidator() {

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
			// last item filters are started filters that have no subsequent
			// filter. For each tenant, there should be at most 1.
			int numberOfLastItemFilters = 0;

			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.STARTED) {
					for (RequiredInterface reqInterface : component.getRequiredInterfaces()) {
						Connector connector = reqInterface.getConnector();
						if (connector == null) {
							// there is no connector
							if (reqInterface.getType().getFqName()
									.equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
								// filter components
								LOGGER.warning("No connector for " + SimulatorUtil.elementToString(reqInterface)
										+ " of " + SimulatorUtil.elementToString(component));
								numberOfLastItemFilters++;
							} else {
								// other components
								LOGGER.severe("[ISSUE] No connector for " + SimulatorUtil.elementToString(reqInterface)
										+ " of " + SimulatorUtil.elementToString(component));
								tenantIssueCount++;
							}
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
			if (numberOfLastItemFilters > 1) {
				LOGGER.severe(
						"[ISSUE] " + numberOfLastItemFilters + " and therefore more than one STARTED filter component "
								+ "have no connector to a subsequent filter component.");
				// increase issue count by the number of filters that have no subsequent filter
				// - 1. Minus 1 since the last filter of the pipe has no subsequent filter,
				// which does not cause an issue.
				issueCount += numberOfLastItemFilters - 1;
			} else if (numberOfLastItemFilters == 1) {
				LOGGER.info("[OK] Exactly one STARTED filter has no connector to a subsequent filter component. "
						+ "This filter component ought to be the last filter of this tenant's pipe.");
			}

			// log summary
			if (tenantIssueCount == 0) {
				LOGGER.info("[OK] All required interfaces are properly connected.");
			} else {
				LOGGER.severe("[ISSUES] " + tenantIssueCount + " required interfaces are not properly connected.");
			}
			issueCount += tenantIssueCount;

		} // next tenant
		return issueCount;
	}

}
