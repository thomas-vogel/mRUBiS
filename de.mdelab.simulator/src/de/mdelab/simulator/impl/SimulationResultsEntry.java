package de.mdelab.simulator.impl;

/**
 * An entry of results collected during the simulation.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public abstract class SimulationResultsEntry {

	/**
	 * The simulation round in which the entry has been obtained.
	 */
	protected int round;

	/**
	 * Constructor.
	 * 
	 * @param round
	 *            the simulation round in which the entry has been obtained.
	 */
	protected SimulationResultsEntry(int round) {
		this.round = round;
	}

	/**
	 * Returns the simulation round in which the entry has been obtained.
	 * 
	 * @return the simulation round in which the entry has been obtained.
	 */
	public int getRound() {
		return this.round;
	}

}
