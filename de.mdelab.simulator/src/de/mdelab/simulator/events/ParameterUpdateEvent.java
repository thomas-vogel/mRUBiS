package de.mdelab.simulator.events;

import de.mdelab.comparch.Parameter;

/**
 * Change event notifying about an update of the value of a {@link Parameter}.
 * The value can be obtained by {@link Parameter#getValue()}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ParameterUpdateEvent extends ChangeEvent {

	/**
	 * The updated parameter.
	 */
	private Parameter parameter;
	/**
	 * The value of the parameter before the update.
	 */
	private String oldValue;
	/**
	 * The value of the parameter after the update.
	 */
	private String newValue;

	/**
	 * Constructor.
	 * 
	 * @param parameter
	 *            the updated parameter.
	 * @param oldValue
	 *            the value of the parameter before the update.
	 * @param newValue
	 *            the value of the parameter after the update.
	 */
	public ParameterUpdateEvent(Parameter parameter, String oldValue, String newValue) {
		super();
		this.parameter = parameter;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	/**
	 * Returns the updated parameter.
	 * 
	 * @return the updated parameter.
	 */
	public Parameter getParameter() {
		return this.parameter;
	}

	/**
	 * Returns the value of the parameter before the update.
	 * 
	 * @return the value of the parameter before the update.
	 */
	public String getOldValue() {
		return this.oldValue;
	}

	/**
	 * Returns the value of the parameter after the update.
	 * 
	 * @return the value of the parameter after the update.
	 */
	public String getNewValue() {
		return this.newValue;
	}

}
