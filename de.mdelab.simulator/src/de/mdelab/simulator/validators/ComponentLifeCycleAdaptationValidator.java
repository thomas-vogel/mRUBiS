package de.mdelab.simulator.validators;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.events.ComponentStateChangeEvent;
import de.mdelab.simulator.validators.events.ValidatorChangeEventObserver;

/**
 * Validates a self-adaptation that adjust the life cycle state of a
 * {@link Component} (see {@link Component#getState()}), for instance, to start
 * or stop a component. The validation checks whether such a self-adaptation
 * conforms to the life cycle of a component. If not, an issue is identified by
 * this validator.
 * 
 * If a self-adaptation does not follow the life cycle, the state of the
 * component effected by the self-adaptation is set to
 * {@link ComponentState#UNKNOWN}.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ComponentLifeCycleAdaptationValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(ComponentLifeCycleAdaptationValidator.class.getName());

	/**
	 * Constructor.
	 */
	public ComponentLifeCycleAdaptationValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;

		Set<Component> componentsToSetAsUnknown = new HashSet<Component>();
		Queue<ComponentStateChangeEvent> events = ValidatorChangeEventObserver.INTERNAL_EVENT_QUEUES
				.getComponentStateChangeEvents();
		Queue<ComponentStateChangeEvent> copiedEvents = new LinkedList<ComponentStateChangeEvent>(events);

		LOGGER.info("Validating component state adaptations: " + copiedEvents.size()
				+ " component state change events to be checked ...");

		if (copiedEvents.size() == 0) {
			LOGGER.info("[OK] No adaptation of a component state has happened. There is nothing to validate.");
		} else {
			while (copiedEvents.peek() != null) {
				ComponentStateChangeEvent event = copiedEvents.poll();
				Component component = event.getComponent();
				ComponentState source = event.getOldState();
				ComponentState target = event.getNewState();
				LOGGER.info("\tValidating state change of " + SimulatorUtil.elementToString(component) + " of "
						+ SimulatorUtil.elementToString(component.getTenant()));
				boolean valid = this.isValidTransition(source, target);
				if (!valid) {
					componentsToSetAsUnknown.add(component);
					issueCount++;
				} else {
					// erase exceptions
					if (this.hasComponentBeStoppedOrUndeployed(source, target)) {
						for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
							if (providedInterface.getExceptions().size() > 0) {
								List<Exception> exceptions = new LinkedList<Exception>(
										providedInterface.getExceptions());
								for (Exception e : exceptions) {
									EcoreUtil.delete(e, true);
								}
							}
						}

						// LOGGER.info("Occurring exceptions thrown by " +
						// SimulatorUtil.elementToString(component)
						// + " have been removed.");
					}
				}
			}

			for (Component c : componentsToSetAsUnknown) {
				c.setState(ComponentState.UNKNOWN);
				LOGGER.warning("Due to an invalid transition of the component state, the state of "
						+ SimulatorUtil.elementToString(c) + " is set to UNKNOWN.");
			}
		}

		return issueCount;
	}

	/**
	 * Checks whether a component state change from <code>source</code> to
	 * <code>target</code> is valid.
	 * 
	 * @param source
	 *            the source state
	 * @param target
	 *            the target state
	 * @return <code>true</code> if the state change is valid, otherwise
	 *         <code>false</code>.
	 */
	private boolean isValidTransition(ComponentState source, ComponentState target) {
		boolean isValid = false;

		StringBuffer msg = new StringBuffer("Transition check: ");
		msg.append(source);
		msg.append(" => ");
		msg.append(target);
		msg.append(" = ");

		// deploy
		if (source == ComponentState.UNDEPLOYED & target == ComponentState.DEPLOYED) {
			isValid = true;
			msg.append("------------ DEPLOY ------------");
		}
		// undeploy
		else if (source == ComponentState.DEPLOYED & target == ComponentState.UNDEPLOYED) {
			isValid = true;
			msg.append("------------ UNDEPLOY ------------");
		} else if (source == ComponentState.UNKNOWN & target == ComponentState.UNDEPLOYED) {
			isValid = true;
			msg.append("------------ UNDEPLOY ------------");
		}
		// start
		else if (source == ComponentState.DEPLOYED & target == ComponentState.STARTED) {
			isValid = true;
			msg.append("------------ START ------------");
		}
		// stop
		else if (source == ComponentState.STARTED & target == ComponentState.DEPLOYED) {
			isValid = true;
			msg.append("------------ STOP ------------");
		}
		// invalid transition
		else {
			msg.append("----- INVALID TRANSITION -----");
		}

		if (isValid) {
			LOGGER.info("\t[OK] " + msg.toString());
		} else {
			LOGGER.severe("\t[ISSUE] " + msg.toString());
		}
		return isValid;
	}

	/**
	 * Checks whether a component has been stopped or undeployed.
	 * 
	 * @param source
	 *            the source state of the component.
	 * @param target
	 *            the target state of the component.
	 * @return <code>true</code> if the transition from the source to the target
	 *         state corresponds to a stop or undeployment of a component, otherwise
	 *         <code>false</code>.
	 */
	private boolean hasComponentBeStoppedOrUndeployed(ComponentState source, ComponentState target) {
		boolean erase = false;
		// STOP
		if (source == ComponentState.STARTED & target == ComponentState.DEPLOYED) {
			erase = true;
		} else
		// UNDEPLOY
		if ((source == ComponentState.DEPLOYED || source == ComponentState.UNKNOWN)
				& target == ComponentState.UNDEPLOYED) {
			erase = true;
		}
		return erase;
	}
}
