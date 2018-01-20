package de.mdelab.simulator;

import de.mdelab.comparch.ArchitecturalElement;

/**
 * Injects an issue into the model. An injector is identified by the unqualified
 * name of its implementation class. It is up to the injector to define the
 * notion of an issue.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 * @param <T>
 *            the type of model element to which the issue is injected.
 * 
 */
public interface Injector<T extends ArchitecturalElement> {

	/**
	 * Injects an issue into the model, particularly, to the given target.
	 * 
	 * @param target
	 *            The target to which the issue should be injected.
	 * @return <code>true</code> if the issue was successfully injected, otherwise
	 *         <code>false</code>.
	 */
	public boolean inject(T target);

}
