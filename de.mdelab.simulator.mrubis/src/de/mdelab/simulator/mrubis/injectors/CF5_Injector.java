package de.mdelab.simulator.mrubis.injectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.simulator.Injector;

/**
 * Injects a CF5, that is, it removes a {@link Connector} between two
 * {@link ComponentState#STARTED} {@link Component}s. Consequently, the two
 * components are disconnected.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class CF5_Injector implements Injector<Connector> {

	/**
	 * Constuctor.
	 */
	public CF5_Injector() {

	}

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(Connector connector) {
		// check if connector is properly connected, that is, source and
		// target exist and they belong to started components.
		if (connector.getSource() != null && connector.getSource().getComponent() != null
				&& connector.getSource().getComponent().getState() == ComponentState.STARTED
				&& connector.getTarget() != null && connector.getTarget().getComponent() != null
				&& connector.getTarget().getComponent().getState() == ComponentState.STARTED) {
			// remove connector
			EcoreUtil.delete(connector, true);
			return true;
		} else {
			// connector is not properly connected
			return false;
		}
	}

}
