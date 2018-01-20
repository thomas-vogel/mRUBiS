package de.mdelab.simulator.mrubis.injectors;

import java.util.List;

import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.simulator.Injector;
import de.mdelab.simulator.SimulatorUtil;

/**
 * Abstract injector for injecting a CF2 either by injecting more
 * {@link Exception}s than the given threshold (in this case, it is actually a
 * CF2) or by injecting less {@link Exception}s than the given threshold (in
 * this case, exceptions occur but they do not cause a CF2).
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public abstract class AbstractCF2_Injector implements Injector<ProvidedInterface> {

	protected int failureThreshold;

	/**
	 * Constructor.
	 * 
	 * @param failureThreshold
	 *            threshold for number of exceptions that causes a CF2.
	 */
	protected AbstractCF2_Injector(int failureThreshold) {
		this.failureThreshold = failureThreshold;
	}

	/**
	 * Creates and adds an {@link Exception} to the given {@link ProvidedInterface}
	 * pointing to a random {@link MethodSpecification} of the related type of the
	 * provided interface. The added exception does not contain any stack trace.
	 * 
	 * @param providedInterface
	 *            the given provided interface
	 * @param type
	 *            the type of the exception
	 * @param message
	 *            the message of the exception
	 */
	void addException(ProvidedInterface providedInterface, String type, String message) {
		Exception exception = ComparchFactory.eINSTANCE.createException();
		exception.setType(type);
		exception.setMessage(message);

		List<MethodSpecification> methodSpec = providedInterface.getType().getMethodSpecifications();
		int numberOfMethods = methodSpec.size();
		if (numberOfMethods > 1) {
			int no = SimulatorUtil.randInt(0, numberOfMethods - 1);
			exception.setMethod(methodSpec.get(no));
		} else if (numberOfMethods == 1) {
			exception.setMethod(methodSpec.get(0));
		}
		providedInterface.getExceptions().add(exception);
	}

}
