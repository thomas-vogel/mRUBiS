package de.mdelab.simulator;

import de.mdelab.comparch.ArchitecturalElement;

/**
 * Specification of an injection of an issue to the model. The injection is
 * going to be performed by the simulator. It specifies the target of the issue
 * and the injector to be used.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 * @param <T>
 *            the type of model element to which the issue is injected.
 * 
 */
public class Injection<T extends ArchitecturalElement> {

	private T target;
	private Injector<T> injector;
	private boolean success;

	/**
	 * Creates an injection specification.
	 * 
	 * @param target
	 *            the model element to which the issue is going to be injected.
	 * @param injector
	 *            the injector that injects the issue to the <code>target</code>.
	 */
	public Injection(T target, Injector<T> injector) {
		super();
		this.injector = injector;
		this.target = target;
	}

	/**
	 * @return the specified model element to which an issue is (going to be)
	 *         injected.
	 */
	public T getTarget() {
		return this.target;
	}

	/**
	 * @return the specified injector that will inject the issue to the target.
	 */
	public Injector<T> getInjector() {
		return this.injector;
	}

	/**
	 * @return the name of the specified injector in terms of the class name.
	 */
	public String getInjectorName() {
		return this.injector.getClass().getCanonicalName();
	}

	/**
	 * @return after the injection has been performed, <code>true</code> if the
	 *         simulator successfully injected the issue, otherwise
	 *         <code>false</code>.
	 */
	public boolean isSuccess() {
		return this.success;
	}

	/**
	 * Sets the success of the injection. This method is used by the simulator to
	 * notify about the success of performing this injection.
	 * 
	 * @param success
	 *            <code>true</code> if the simulator successfully injected the
	 *            issue, otherwise <code>false</code>.
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

}
