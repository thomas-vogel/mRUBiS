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
 * Does not inject a CF2 but it creates and adds {@link Exception}s to the given
 * {@link ProvidedInterface} if the component providing the interface is started
 * (see {@link ComponentState#STARTED}) and if at least one started component is
 * using the provided interface. The number of exception added is below the
 * given threshold that would otherwise cause a CF2.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class NoCF2_Injector extends AbstractCF2_Injector {

	/**
	 * Constructor.
	 * 
	 * @param failureThreshold
	 *            threshold for the number of exceptions that causes a CF2.
	 */
	public NoCF2_Injector(int failureThreshold) {
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
				int numbersOfFailures = SimulatorUtil.randInt(1, this.failureThreshold - 1);
				for (int i = 0; i < numbersOfFailures; i++) {
					this.addException(providedInterface, "java.lang.RuntimeException", "Failure #" + i);
				}

				return true;
			} else {
				// The provided interface is not used
				return false;
			}
		} else {
			// component is not started
			return false;
		}
	}

}
