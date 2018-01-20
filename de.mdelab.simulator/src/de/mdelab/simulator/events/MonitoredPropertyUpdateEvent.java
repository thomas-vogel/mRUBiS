package de.mdelab.simulator.events;

import de.mdelab.comparch.MonitoredProperty;

/**
 * Change event notifying about an update of the value of a
 * {@link MonitoredProperty}. The value can be obtained by
 * {@link MonitoredProperty#getValue()}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class MonitoredPropertyUpdateEvent extends ChangeEvent {

	/**
	 * The updated property.
	 */
	private MonitoredProperty property;
	/**
	 * The value of the property before the update.
	 */
	private String oldValue;
	/**
	 * The value of the property after the update.
	 */
	private String newValue;

	/**
	 * Constructor.
	 * 
	 * @param property
	 *            the updated property.
	 * @param oldValue
	 *            the value of the property before the update.
	 * @param newValue
	 *            the value of the property after the update.
	 */
	public MonitoredPropertyUpdateEvent(MonitoredProperty property, String oldValue, String newValue) {
		super();
		this.property = property;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	/**
	 * Returns the updated property.
	 * 
	 * @return the updated property.
	 */
	public MonitoredProperty getProperty() {
		return this.property;
	}

	/**
	 * Returns the value of the property before the update.
	 * 
	 * @return the value of the property before the update.
	 */
	public String getOldValue() {
		return this.oldValue;
	}

	/**
	 * Returns the value of the property after the update.
	 * 
	 * @return the value of the property after the update.
	 */
	public String getNewValue() {
		return this.newValue;
	}

}
