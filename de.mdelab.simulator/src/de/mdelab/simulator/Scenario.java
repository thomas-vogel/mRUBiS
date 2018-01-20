package de.mdelab.simulator;

import java.util.List;

import de.mdelab.comparch.ArchitecturalElement;

/**
 * A scenario defines the simulation in terms of the injection of issues in each
 * simulation round. That is, the simulator consults the scenario in each
 * simulation round (i.e., each run of the feedback loop) to obtain the
 * {@link Injection}s to be performed in this round.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public interface Scenario {

	/**
	 * For each simulation round (i.e., one run of the feedback loop), the simulator
	 * consults the scenario to obtain the injections to be performed in this round
	 * by using this method.
	 * 
	 * @param currentRound
	 *            the number of the current simulation round.
	 * @return the list of injections to be performed by the simulator.
	 */
	public List<Injection<? extends ArchitecturalElement>> getInjections(int currentRound);

	/**
	 * The simulator notifies the scenario immediately after one simulation round
	 * about the success of the injections using this callback method. This
	 * information can be used as feedback to adjust the scenario in the subsequent
	 * simulation rounds. The methods must not necessarily be implemented.
	 * 
	 * @param injections
	 *            the list of injections defined by this scenario and whose
	 *            individual success attributes have been set (see
	 *            {@link Injection#isSuccess()}) by the simulator.
	 */
	public void notifyAboutSuccess(List<Injection<? extends ArchitecturalElement>> injections);

}
