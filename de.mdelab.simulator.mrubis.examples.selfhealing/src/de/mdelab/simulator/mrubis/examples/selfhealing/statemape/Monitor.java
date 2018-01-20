package de.mdelab.simulator.mrubis.examples.selfhealing.statemape;

import de.mdelab.comparch.Architecture;

/**
 * Monitoring activity of the state-based feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Monitor {

	/**
	 * Performs the monitoring.
	 * 
	 * @param architecture
	 *            the root element of the model
	 * @return <code>true</code> if the model has been changed by the simulator and
	 *         thus, there might be issues in the model that must be repaired,
	 *         otherwise <code>false</code>
	 */
	public boolean monitor(Architecture architecture) {
		// perform monitoring, for instance, by checking whether the model has been
		// changed by the simulator
		boolean changeHappened = true;
		return changeHappened;
	}
}
