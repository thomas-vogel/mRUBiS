package de.mdelab.simulator.events;

import de.mdelab.comparch.PerformanceStats;

/**
 * Change event notifying about the update of the {@link PerformanceStats} for a
 * method. An update changes any attribute of the performance statistics:
 * {@link PerformanceStats#getMinTime()}, {@link PerformanceStats#getMaxTime()},
 * {@link PerformanceStats#getTotalTime()}, or
 * {@link PerformanceStats#getInvocationCount()}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class PerformanceStatsUpdateEvent extends ChangeEvent {

	/**
	 * The updated performance stats.
	 */
	private PerformanceStats stats;
	// old values of the attributes of stats (minTime, maxTime, totalTime,
	// invocationCount) are not needed. It is important to know that a change
	// happened.

	/**
	 * Constructor.
	 * 
	 * @param stats
	 *            the updated performance stats
	 */
	public PerformanceStatsUpdateEvent(PerformanceStats stats) {
		super();
		this.stats = stats;
	}

	/**
	 * Returns the updated performance stats.
	 * 
	 * @return the updated performance stats.
	 */
	public PerformanceStats getPerformanceStats() {
		return this.stats;
	}

}
