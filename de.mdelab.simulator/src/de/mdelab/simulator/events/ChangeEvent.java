package de.mdelab.simulator.events;

/**
 * Super class for all events notifying about changes of the model. Such events
 * are called <i>change events</i>.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public abstract class ChangeEvent {

	/**
	 * Timestamp when the change has happened.
	 */
	private long timestamp;

	/**
	 * Constructor.
	 */
	ChangeEvent() {
		super();
		this.timestamp = System.currentTimeMillis();
	}

	/**
	 * @return the timestamp when the change has happened.
	 */
	public long getTimestamp() {
		return timestamp;
	}

}
