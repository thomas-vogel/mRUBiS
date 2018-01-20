package de.mdelab.simulator.impl;

import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.simulator.Injection;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.Injector;
import de.mdelab.simulator.SimulatorUtil;

/**
 * Controls the injection of issues into the model using the {@link Scenario}
 * provided by the user.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class InjectionController {

	private final static Logger LOGGER = Logger.getLogger(InjectionController.class.getName());

	private Scenario scenario;

	/**
	 * Creates the controller.
	 * 
	 * @param scenario
	 *            the scenario defining the simulation.
	 */
	public InjectionController(Scenario scenario) {
		this.scenario = scenario;
	}

	/**
	 * Injects the issues into the model for one simulation round.
	 * 
	 * @param currentRound
	 *            the number of the current round of the simulation.
	 */
	@SuppressWarnings("unchecked")
	public void injectIssues(int currentRound) {

		List<Injection<? extends ArchitecturalElement>> injections = this.scenario.getInjections(currentRound);

		StringBuffer msg = new StringBuffer();

		if (injections == null) {
			msg.append("Injecting no issue in this run.");
		} else {
			if (injections.size() > 0) {
				msg.append("Trying to inject " + injections.size() + " issue(s) in this round:");
			} else {
				msg.append("Injecting no issue in this run.");
			}

			for (int i = 0; i < injections.size(); i++) {
				Injection<? extends ArchitecturalElement> injection = injections.get(i);

				ArchitecturalElement target = injection.getTarget();
				Injector<ArchitecturalElement> injector = (Injector<ArchitecturalElement>) injection.getInjector();
				boolean success = injector.inject(target);
				injection.setSuccess(success);

				// log info about injection
				msg.append("\n\t(" + (i + 1) + ") ");
				if (success) {
					msg.append("Successfullly applied ");
				} else {
					msg.append("Cannot apply ");
				}
				msg.append(injector.getClass().getSimpleName());
				msg.append(" on " + SimulatorUtil.elementToString(target));

			}
		}

		LOGGER.info(msg.toString());
		// done with the run. Notify the strategy about the success.
		this.scenario.notifyAboutSuccess(injections);
	}
}
