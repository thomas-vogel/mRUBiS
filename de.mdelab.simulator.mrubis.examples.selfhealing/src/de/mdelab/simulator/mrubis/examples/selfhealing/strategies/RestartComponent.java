package de.mdelab.simulator.mrubis.examples.selfhealing.strategies;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.simulator.SimulatorUtil;

/**
 * Adaptation strategy that restarts a {@link Component}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class RestartComponent {

	/**
	 * Restarts the given component
	 * 
	 * @param component
	 *            the component that will be restarted
	 */
	public void enact(Component component) {
		System.out.println("RestartComponent of " + SimulatorUtil.elementToString(component));

		component.setState(ComponentState.DEPLOYED);
		component.setState(ComponentState.STARTED);
	}
}
