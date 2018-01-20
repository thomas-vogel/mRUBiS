package de.mdelab.simulator.validators;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;
import de.mdelab.simulator.events.ReroutingEvent;
import de.mdelab.simulator.validators.events.ValidatorChangeEventObserver;

/**
 * Validates a self-adaptation whether it replaces a {@link Component} with a
 * {@link Component} of another {@link ComponentType}. Both components provide
 * the same functionality in terms of {@link ProvidedInterface}s but they are
 * realized differently and are therefore of a different type (see
 * {@link Component#getType()}).
 * 
 * This validator does not identify any issues but provides information about
 * how a self-adaptation has been performed when changing the structure of the
 * architecture.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ComponentReplacementValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(ComponentReplacementValidator.class.getName());

	/**
	 * Constructor.
	 */
	public ComponentReplacementValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		Queue<ReroutingEvent> events = ValidatorChangeEventObserver.INTERNAL_EVENT_QUEUES.getReroutingEvents();
		Queue<ReroutingEvent> copiedEvents = new LinkedList<ReroutingEvent>(events);

		LOGGER.info(
				"Validating component replacements: " + copiedEvents.size() + " rerouting events to be checked ...");

		while (copiedEvents.peek() != null) {
			ReroutingEvent event = copiedEvents.poll();
			RequiredInterface requiredInterface = event.getRequiredInterface();
			Component reqComponent = requiredInterface.getComponent();
			String requiredInterfaceInfo = SimulatorUtil.elementToString(requiredInterface) + " of "
					+ SimulatorUtil.elementToString(reqComponent) + " in "
					+ SimulatorUtil.elementToString(reqComponent.getTenant());
			Connector oldConnector = event.getOldConnector();
			Connector newConnector = event.getNewConnector();

			// BEGIN LOG FINER
			String msg = "Reroute " + requiredInterfaceInfo;
			if (oldConnector != null) {
				ProvidedInterface pi = oldConnector.getTarget();
				if (pi != null) {
					Component oldTarget = pi.getComponent();
					msg = msg + "\n\tfrom " + SimulatorUtil.elementToString(pi) + " of "
							+ SimulatorUtil.elementToString(oldTarget);
				} else {
					msg = msg + "\n\tfrom null";
				}
			} else {
				msg = msg + "\n\tfrom null";
			}

			if (newConnector != null) {
				ProvidedInterface pi = newConnector.getTarget();
				if (pi != null) {
					Component newTarget = pi.getComponent();
					msg = msg + "\n\tto " + SimulatorUtil.elementToString(pi) + " of "
							+ SimulatorUtil.elementToString(newTarget);
				} else {
					msg = msg + "\n\tto null";
				}
			} else {
				msg = msg + "\n\tto null";
			}
			LOGGER.finer(msg);
			// END LOG FINER DEBUG

			if (oldConnector == null) {
				if (newConnector == null) {
					LOGGER.warning("Still disconnected (no connector) " + requiredInterfaceInfo);
					// TODO issueCount++;
				} else {
					ProvidedInterface providedInterface = newConnector.getTarget();
					if (providedInterface != null) {
						Component providingComponent = providedInterface.getComponent();
						LOGGER.info(requiredInterfaceInfo + " is now connected to "
								+ SimulatorUtil.elementToString(providedInterface) + " of "
								+ SimulatorUtil.elementToString(providingComponent));
					} else {
						LOGGER.warning("Still disconnected (connector with target not set) " + requiredInterfaceInfo);
						// TODO issueCount++;
					}
				}
				LOGGER.info(" -- Before it was not connected (no connector).");
			} else {
				// oldConnector != null
				ProvidedInterface oldProvidedInterface = oldConnector.getTarget();
				String oldProvidedInterfaceInfo = "null (connector with no target set)";
				if (oldProvidedInterface != null) {
					oldProvidedInterfaceInfo = SimulatorUtil.elementToString(oldProvidedInterface) + " of "
							+ SimulatorUtil.elementToString(oldProvidedInterface.getComponent());
				}

				if (newConnector == null) {
					LOGGER.warning("Now disconnected (no connector) " + requiredInterfaceInfo);
					// TODO issueCount++;
				} else {
					ProvidedInterface providedInterface = newConnector.getTarget();
					if (providedInterface != null) {
						Component providingComponent = providedInterface.getComponent();
						LOGGER.info(requiredInterfaceInfo + " is now connected to "
								+ SimulatorUtil.elementToString(providedInterface) + " of "
								+ SimulatorUtil.elementToString(providingComponent));
						// here a properly connected required interface has been rerouted from one
						// provided interface to another provided interface. Check if the new provided
						// interface is provided by a component of a different type than before.
						if (oldProvidedInterface != null) {
							ComponentType oldProvidingComponentType = oldProvidedInterface.getComponent().getType();
							ComponentType newProvidingComponentType = providingComponent.getType();
							if (oldProvidingComponentType.equals(newProvidingComponentType)) {
								LOGGER.info(
										" -- The rerouting caused the use of a component of a different type than before.");
							} else {
								LOGGER.info(
										" -- The rerouting caused the use of a component of the same type as before.");
							}
						}
					} else {
						LOGGER.warning("Now disconnected (connector with target not set) " + requiredInterfaceInfo);
						// TODO issueCount++;
					}
				}
				LOGGER.info(" -- Before it was connected to " + oldProvidedInterfaceInfo);
			}
		}
		return 0;
	}
}
