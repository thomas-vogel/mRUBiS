package de.mdelab.simulator.impl;

/**
 * Simulation result entry of the performance of one run of the feedback loop in
 * one simulation round.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class PerformanceEntry extends SimulationResultsEntry {

	/**
	 * Execution time in milliseconds of one run of a feedback loop.
	 */
	private long executionTime;

	/**
	 * Constructor.
	 * 
	 * @param executionTime
	 *            Execution time in milliseconds of one run of a feedback loop in
	 *            the given simulation round.
	 * @param round
	 *            the simulation round.
	 */
	public PerformanceEntry(long executionTime, int round) {
		super(round);
		this.executionTime = executionTime;
	}

	/**
	 * Returns the execution time in milliseconds of one run of a feedback loop.
	 * 
	 * @return the execution time in milliseconds of one run of a feedback loop.
	 */
	public long getExecutionTime() {
		return this.executionTime;
	}

}
