package de.mdelab.simulator.mrubis.utility;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.UtilityFunction;
import de.mdelab.simulator.mrubis.MRubisNames;
import de.mdelab.simulator.mrubis.injectors.CF1_Injector;
import de.mdelab.simulator.mrubis.injectors.CF2_Injector;
import de.mdelab.simulator.mrubis.injectors.CF3_Injector;
import de.mdelab.simulator.mrubis.injectors.CF5_Injector;
import de.mdelab.simulator.mrubis.validators.MRubisMinConfigurationValidator;
import de.mdelab.simulator.validators.MinConfigurationValidator;

/**
 * The utility function to compute the utility of mRUBiS for the self-healing
 * case.
 * 
 * The utility of mRUBiS is the sum of the utilities of all {@link Tenant}s. The
 * utility of a tenant is the sum of the utilities of all
 * {@link ComponentState#STARTED} {@link Component}s of this tenant. The utility
 * of a component <code>c</code> is
 * <code>c.type.reliability x c.criticality x c.connectivity</code> while the
 * connectivity of a component is the number of {@link Connector}s associated to
 * the {@link RequiredInterface}s and {@link ProvidedInterface}s of this
 * component. However, if a required interface of the component is not connected
 * (there is no connector), the connectivity is zero.
 * 
 * Consequently, the utility of mRUBiS is decreased to the extent a component
 * provides value to the utility if the component:
 * <ul>
 * <li>is not started but especially in state {@link ComponentState#UNKNOWN}.
 * This happens when a CF1 occurs (see {@link CF1_Injector}). To address the
 * issue that a self-adaptation just deploys and starts arbitrary many
 * components to increase the utility, the hard constraint that each
 * {@link ComponentType} should only be instantiated once to a deployed and
 * started component for each {@link Tenant} must be satisfied. This constraint
 * is checked by the simulator (see {@link MinConfigurationValidator} and
 * {@link MRubisMinConfigurationValidator}).</li>
 * <li>throws too many {@link Exception}s. This corresponds to a CF2 (see
 * {@link CF2_Injector}).</li>
 * <li>has been removed from mRUBiS and therefore does not exist anymore. This
 * corresponds to a CF3 (see {@link CF3_Injector}).</li>
 * <li>loses its connectivity, that is, if one of its required interface is not
 * associated to a connector. This corresponds to CF5 (see
 * {@link CF5_Injector}).</li>
 * </ul>
 * 
 * In this context, CF4 does not directly cause a decrease of the utility since
 * it only refers to situations where a CF1 or CF2 occurs, which are already
 * addressed by the utility function.
 * 
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class MRubisSelfHealingUtilityFunction implements UtilityFunction {

	private int exceptionThreshold;

	/**
	 * Constructor.
	 * 
	 * @param exceptionThreshold
	 *            threshold for how many exceptions a provided interface of a
	 *            component may throw without becoming an issue.
	 */
	public MRubisSelfHealingUtilityFunction(int exceptionThreshold) {
		this.exceptionThreshold = exceptionThreshold;
	}

	/**
	 * @see UtilityFunction#computeUtility(Architecture)
	 */
	@Override
	public double computeUtility(Architecture architecture) {
		double utility = 0.0;
		for (Tenant tenant : architecture.getTenants()) {
			utility += this.computeUtility(tenant);
		}
		return utility;
	}

	/**
	 * Computes the utility of the given tenant.
	 * 
	 * @param tenant
	 *            the given tenant
	 * @return the utility of the given tenant
	 */
	protected double computeUtility(Tenant tenant) {
		double utility = 0.0;
		for (Component component : tenant.getComponents()) {
			// only existent components are checked. Thus, CF3 is addressed.
			if (component.getState() == ComponentState.STARTED) {
				// only started components are checked. Thus, CF1 is addressed.
				if (!tooManyExceptions(component)) {
					// only components that do not throw too many exceptions are checked. Thus, CF2
					// is addressed.
					if (wellConnected(component)) {
						// only well-connected components are checked. Each required interface of the
						// component has a connector. Thus, CF5 is addressed.
						double componentUtility = this.computeUtilityForComponent(component);
						utility += componentUtility;
					}

				}
			}
		}
		return utility;
	}

	/**
	 * Computes the utility of the given component as reliability x criticality x
	 * connectivity.
	 * 
	 * @param component
	 *            the given component
	 * @return the utility of the component
	 */
	protected double computeUtilityForComponent(Component component) {
		double reliability = component.getType().getReliability();
		double criticality = component.getCriticality();

		int connectivity = 0;
		for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
			connectivity += providedInterface.getConnectors().size();
		}
		// each required interface has exactly one component
		connectivity += component.getRequiredInterfaces().size();
		return reliability * criticality * connectivity;
	}

	/**
	 * Checks for the occurrence of a CF2 for the given component.
	 * 
	 * @param component
	 *            the component to be checked.
	 * @return <code>true</code> if there is a CF2 and thus, the utility should be
	 *         decreased, else <code>false</code>.
	 */
	private boolean tooManyExceptions(Component component) {
		boolean tooManyExceptions = false;
		for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
			if (providedInterface.getExceptions().size() > this.exceptionThreshold) {
				tooManyExceptions = true;
				break;
			}
		}
		return tooManyExceptions;
	}

	/**
	 * Checks for the occurrence of a CF5 for the given component, that is, whether
	 * one of its provided interfaces is not associated to a connector. Filter
	 * components are not considered.
	 * 
	 * @param component
	 *            the component to be checked.
	 * @return <code>true</code> if each provided interface of the component has a
	 *         connector (there is no CF5), otherwise <code>false</code> meaning
	 *         that there is a CF5 and the utility should be decreased.
	 */
	private boolean wellConnected(Component component) {
		boolean wellConnected = true;
		for (RequiredInterface requiredInterface : component.getRequiredInterfaces()) {
			if (!requiredInterface.getType().getFqName()
					.contentEquals(MRubisNames.itemFilterService_InterfaceType_FqName)
					&& requiredInterface.getConnector() == null) {
				wellConnected = false;
				break;
			}
		}
		return wellConnected;
	}

}
