package de.mdelab.simulator.validators;

import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;

/**
 * Validates for each {@link Tenant} architecture if and how many
 * {@link Exception}s are thrown by {@link ProvidedInterface}s. It becomes an
 * issue if the number of exceptions thrown by one provided interface exceeds
 * the given threshold.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ExceptionValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(ExceptionValidator.class.getName());

	private int exceptionThreshold;

	/**
	 * Constructor.
	 * 
	 * @param exceptionThreshold
	 *            threshold for number of exceptions for each provided interface.
	 */
	public ExceptionValidator(int exceptionThreshold) {
		this.exceptionThreshold = exceptionThreshold;
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
				for (ProvidedInterface provInterface : component.getProvidedInterfaces()) {
					List<Exception> exceptions = provInterface.getExceptions();
					if (exceptions == null || exceptions.size() == 0) {
						LOGGER.finer("[OK] No exception thrown by " + SimulatorUtil.elementToString(provInterface)
								+ " of " + SimulatorUtil.elementToString(provInterface.getComponent()));
					} else {
						int numberOfExceptions = exceptions.size();
						if (numberOfExceptions > this.exceptionThreshold) {
							LOGGER.severe("[ISSUE] " + numberOfExceptions + " exceptions thrown by "
									+ SimulatorUtil.elementToString(provInterface) + " of "
									+ SimulatorUtil.elementToString(provInterface.getComponent()));
							tenantIssueCount++;
						} else {
							LOGGER.warning(numberOfExceptions + " exceptions thrown by "
									+ SimulatorUtil.elementToString(provInterface) + " of "
									+ SimulatorUtil.elementToString(provInterface.getComponent()));
						}
					}
				}
			}

			if (tenantIssueCount == 0) {
				LOGGER.info("[OK] No provided interface has thrown too many exceptions.");
			} else {
				LOGGER.severe("[ISSUES] " + tenantIssueCount + " provided interfaces have thrown too many exceptions.");
				issueCount = issueCount + tenantIssueCount;
			}

		} // next tenant
		return issueCount;
	}

}
