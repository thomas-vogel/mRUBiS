package de.mdelab.simulator;

/**
 * Exception if something goes wrong during the simulation.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class SimulatorException extends RuntimeException {

	/**
	 * Serial version uid.
	 */
	private static final long serialVersionUID = 7069307100805432813L;

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *            failure message.
	 */
	public SimulatorException(String msg) {
		super(msg);
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *            failure message.
	 * @param cause
	 *            the cause for raising this exception.
	 */
	public SimulatorException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
