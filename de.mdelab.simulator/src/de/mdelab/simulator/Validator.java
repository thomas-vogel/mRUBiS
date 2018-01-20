package de.mdelab.simulator;

import de.mdelab.comparch.Architecture;

/**
 * Validates the model after one run of the feedback loop, that is, after an
 * adaptation has been performed on the model. A validator may, for instance,
 * check whether an adaptation has successfully resolved an issue in the model.
 * 
 * A validator is identified by the unqualified name of its implementation
 * class.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public interface Validator {

	/**
	 * Validates the model and returns the number of issues identified by the
	 * validation of the model. It is up to the validator to define the notion of an
	 * issue here.
	 * 
	 * @param architecture
	 *            the root element of the model
	 * @return the number of issues identified in the model by this validator.
	 */
	public int validate(Architecture architecture);

}
