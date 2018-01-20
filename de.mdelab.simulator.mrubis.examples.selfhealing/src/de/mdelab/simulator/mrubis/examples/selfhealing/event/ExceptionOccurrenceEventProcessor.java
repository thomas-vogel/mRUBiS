package de.mdelab.simulator.mrubis.examples.selfhealing.event;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import de.mdelab.comparch.Component;
import de.mdelab.comparch.Exception;
import de.mdelab.simulator.events.ExceptionOccurrenceEvent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.RestartComponent;

/**
 * Event processor for change events notifying about occurrences of
 * {@link Exception}s. It identifies and handles CF2 issues.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ExceptionOccurrenceEventProcessor {

	/**
	 * Processes the change events notifying about occurrences of
	 * {@link Exception}s. If a CF2 issue is identified, the affected component is
	 * restarted (see {@link RestartComponent}).
	 * 
	 * @param events
	 *            the queue of {@link ExceptionOccurrenceEvent}s.
	 * @param exceptionThreshold
	 *            threshold for the numbers of exceptions that causes a CF2 issue.
	 */
	public void process(Queue<ExceptionOccurrenceEvent> events, int exceptionThreshold) {
		List<Component> alreadyRestartedComponents = new LinkedList<Component>();

		while (!events.isEmpty()) {
			// process event
			ExceptionOccurrenceEvent event = events.poll();
			// check condition
			boolean conditionSatisfied = this.checkCF2Condition(event, exceptionThreshold);
			if (conditionSatisfied) {
				// perform action
				Component component = event.getProvidedInterface().getComponent();
				if (!alreadyRestartedComponents.contains(component)) {
					new RestartComponent().enact(component);
					alreadyRestartedComponents.add(component);
				}
			}
		}
	}

	/**
	 * Checks the condition for a CF2 issue.
	 * 
	 * @param event
	 *            the event for which the condition will be checked.
	 * @param exceptionThreshold
	 *            threshold for the numbers of exceptions that causes a CF2.
	 * @return <code>true</code> if the condition for a CF2 issue is satisfied,
	 *         otherwise <code>false</code>
	 */
	private boolean checkCF2Condition(ExceptionOccurrenceEvent event, int exceptionThreshold) {
		// checks the model whether there are more exception than acceptable
		return event.getProvidedInterface().getExceptions().size() > exceptionThreshold;
	}
}
