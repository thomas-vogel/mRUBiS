package de.mdelab.simulator.mrubis.injectors;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.simulator.Injector;

/**
 * Injects a CF1, that is, it sets the state of the given {@link Component} (see
 * {@link Component#getState()} to {@link ComponentState#UNKNOWN} if the
 * component is currently in state {@link ComponentState#STARTED}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class CF1_Injector implements Injector<Component> {

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(Component component) {
		if (component.getState() == ComponentState.STARTED) {
			component.setState(ComponentState.UNKNOWN);
			return true;
		} else {
			return false;
		}
	}

}
