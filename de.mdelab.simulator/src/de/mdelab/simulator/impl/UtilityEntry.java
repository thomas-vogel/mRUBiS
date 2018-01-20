package de.mdelab.simulator.impl;

/**
 * Simulation result entry of the utility of the managed system at a specific
 * point in time and simulation round.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class UtilityEntry extends SimulationResultsEntry {

	/**
	 * The utility value of the managed system.
	 */
	private double utilityValue;

	/**
	 * The relative time in ms from the start of the simulation when the utility has
	 * been computed.
	 */
	private long timeStamp;

	/**
	 * Difference to the utility value of the previous computation.
	 */
	private double diffUtilityValue;

	/**
	 * Constructor.
	 * 
	 * @param utilityValue
	 *            the utility value of the managed system.
	 * @param timeStamp
	 *            the relative time in ms from the start of the simulation when the
	 *            utility has been computed.
	 * @param round
	 *            the simulation round in which the utility has been computed.
	 * @param diffUtilityValue
	 *            the absolute difference of this utility entry to the previous
	 *            utility entry, that is, to the utility value of the previous
	 *            computation.
	 */
	public UtilityEntry(double utilityValue, long timeStamp, int round, double diffUtilityValue) {
		super(round);
		this.utilityValue = utilityValue;
		this.timeStamp = timeStamp;
		this.diffUtilityValue = diffUtilityValue;
	}

	/**
	 * Returns the utility value of the managed system.
	 * 
	 * @return the utility value of the managed system.
	 */
	public double getUtilityValue() {
		return this.utilityValue;
	}

	/**
	 * Returns the relative time in ms from the start of the simulation when the
	 * utility has been computed.
	 * 
	 * @return the relative time in ms from the start of the simulation when the
	 *         utility has been computed.
	 */
	public long getTimeStamp() {
		return this.timeStamp;
	}

	/**
	 * Returns the absolute difference of this utility entry to the previous utility
	 * entry, that is, to the utility value of the previous computation.
	 * 
	 * @return the absolute difference of this utility entry to the previous utility
	 *         entry, that is, to the utility value of the previous computation.
	 */
	public double getDiffUtilityValue() {
		return this.diffUtilityValue;
	}

}
