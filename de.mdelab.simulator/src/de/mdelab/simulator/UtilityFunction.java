package de.mdelab.simulator;

import de.mdelab.comparch.Architecture;

/**
 * Utility function to compute the utility of the managed system. The system is
 * described by the CompArch model whose root element is of type
 * {@link Architecture}.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public interface UtilityFunction {

	/**
	 * Computes the utility of a managed system described by its
	 * {@link Architecture}.
	 * 
	 * @param architecture
	 *            the system for which the utility should be computed. This object
	 *            is the root element of a CompArch model.
	 * @return the utility for the given {@link Architecture}.
	 */
	public double computeUtility(Architecture architecture);

}
