package de.mdelab.simulator.events;

import de.mdelab.comparch.Exception;
import de.mdelab.comparch.ProvidedInterface;

/**
 * Change event notifying about the occurrence of an exception, that is, an
 * {@link Exception} is added to a {@link ProvidedInterface}. In other terms, an
 * exception was thrown when using the provided interface.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ExceptionOccurrenceEvent extends ChangeEvent {

	/**
	 * The provided interface throwing the exception.
	 */
	private ProvidedInterface providedInterface;
	/**
	 * The thrown exception.
	 */
	private Exception exception;

	/**
	 * Constructor.
	 * 
	 * @param providedInterface
	 *            the provided interface throwing the exception.
	 * @param exception
	 *            the thrown exception.
	 */
	public ExceptionOccurrenceEvent(ProvidedInterface providedInterface, Exception exception) {
		super();
		this.providedInterface = providedInterface;
		this.exception = exception;
	}

	/**
	 * Returns the provided interface throwing the exception.
	 * 
	 * @return the provided interface throwing the exception.
	 */
	public ProvidedInterface getProvidedInterface() {
		return this.providedInterface;
	}

	/**
	 * Returns the thrown exception.
	 * 
	 * @return the thrown exception.
	 */
	public Exception getException() {
		return this.exception;
	}

}
