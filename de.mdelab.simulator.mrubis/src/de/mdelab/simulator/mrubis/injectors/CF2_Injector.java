package de.mdelab.simulator.mrubis.injectors;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.simulator.Injector;
import de.mdelab.simulator.SimulatorUtil;

/**
 * Injects a CF2, that is, it creates and adds {@link Exception}s to the given
 * {@link ProvidedInterface} if the component providing the interface is started
 * and if at least one started component is using the provided interface. The
 * number of exception added is between the given threshold plus one and twice
 * the threshold.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class CF2_Injector extends AbstractCF2_Injector {

	/**
	 * Constructor.
	 * 
	 * @param failureThreshold
	 *            number of exceptions that cause a CF2.
	 */
	public CF2_Injector(int failureThreshold) {
		super(failureThreshold);
	}

	/**
	 * @see Injector#inject(de.mdelab.comparch.ArchitecturalElement)
	 */
	@Override
	public boolean inject(ProvidedInterface providedInterface) {
		Component component = providedInterface.getComponent();

		if (component.getState() == ComponentState.STARTED) {

			// identify whether the provided interface is used by at least
			// one STARTED component.
			boolean isUsed = false;
			for (Connector conn : providedInterface.getConnectors()) {
				RequiredInterface ri = conn.getSource();
				if (ri != null) {
					Component c = ri.getComponent();
					if (c != null && c.getState() == ComponentState.STARTED) {
						isUsed = true;
						break;
					}
				}
			}

			if (isUsed) {
				int numberOfExceptions = this.failureThreshold + SimulatorUtil.randInt(1, this.failureThreshold);
				for (int i = 0; i < numberOfExceptions; i++) {
					this.addException(providedInterface, "java.lang.RuntimeException", "exception_#" + i);
				}
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
