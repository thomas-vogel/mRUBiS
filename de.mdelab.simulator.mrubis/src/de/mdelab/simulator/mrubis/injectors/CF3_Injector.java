package de.mdelab.simulator.mrubis.injectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.simulator.Injector;

/**
 * Injects a CF3, that is, it completely removes a
 * {@link ComponentState#STARTED} {@link Component} from the model including its
 * contained elements, which are the {@link Parameter}s,
 * {@link ProvidedInterface}s, and {@link RequiredInterface}s with the
 * associated {@link Connector}s.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class CF3_Injector implements Injector<Component> {

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(Component component) {
		if (component.getState() == ComponentState.STARTED) {
			EcoreUtil.delete(component, true);
			return true;
		} else {
			// Component is not started
			return false;
		}
	}

}
