package de.mdelab.simulator.mrubis.examples.selfhealing.strategies;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.simulator.SimulatorUtil;

/**
 * Adaptation strategy that performs a light-weight redeployment of the given
 * {@link Component}. Such a redeployment keeps the current configuration of the
 * redeployed {@link Component}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class LightWeightRedeployComponent {

	/**
	 * Performs the light-weight redeployment of the given component
	 * 
	 * @param component
	 *            the component that will be redeployed
	 */
	public void enact(Component component) {
		System.out.println("LightWeightRedeployComponent of " + SimulatorUtil.elementToString(component));

		component.setState(ComponentState.UNDEPLOYED);
		component.setState(ComponentState.DEPLOYED);
		component.setState(ComponentState.STARTED);
	}
}
