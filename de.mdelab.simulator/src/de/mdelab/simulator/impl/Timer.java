package de.mdelab.simulator.impl;

import java.util.concurrent.TimeUnit;

import de.mdelab.simulator.SimulatorException;

/**
 * Timer for measuring the elapsed wall-clock time.
 * 
 * Based on "Microbenchmarks in Java and C#" by Peter Sestoft.
 * (https://www.itu.dk/~sestoft/papers/benchmarking.pdf)
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Timer {

	/**
	 * Time stamp in nanoseconds when starting the timer.
	 */
	private long startTime = 0;

	/**
	 * Total time spent in nanoseconds.
	 */
	private long timeSpent = 0;

	/**
	 * <code>true</code> when the timer is running and <code>false</code> when the
	 * timer is paused.
	 */
	private boolean isRunning = false;

	/**
	 * Creates the timer.
	 */
	public Timer() {

	}

	/**
	 * Returns the time the timer has run in milliseconds.
	 * 
	 * @return the time in milliseconds the timer has spent.
	 */
	public long getTime() {
		if (this.isRunning) {
			return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startTime + this.timeSpent);
		} else {
			return TimeUnit.NANOSECONDS.toMillis(this.timeSpent);
		}
	}

	/**
	 * Pauses the timer.
	 * 
	 * @return the time in milliseconds since the timer has been started the last
	 *         time.
	 */
	public long stop() {
		if (this.isRunning) {
			long lastRun = System.nanoTime() - this.startTime;
			this.timeSpent += lastRun;
			this.isRunning = false;
			return TimeUnit.NANOSECONDS.toMillis(lastRun);
		} else {
			throw new SimulatorException(
					"Timer is already stopped and cannot be stopped again until it has not been started inbetween.");
		}
	}

	/**
	 * Initially starts the timer or resumes the timer after a pause.
	 */
	public void start() {
		if (!this.isRunning) {
			this.isRunning = true;
			this.startTime = System.nanoTime();
		} else {
			throw new SimulatorException(
					"Timer is already started and cannot be started again until it has not been stopped inbetween.");
		}
	}

	/**
	 * Returns <code>true</code> if the timer is running, otherwise
	 * <code>false</code>.
	 * 
	 * @return <code>true</code> if the timer is running, otherwise
	 *         <code>false</code>.
	 */
	public boolean isRunning() {
		return this.isRunning;
	}
}