package de.mdelab.simulator.mrubis.examples.selfhealing.state;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.Simulator;
import de.mdelab.simulator.UtilityFunction;
import de.mdelab.simulator.mrubis.MRubisNames;
import de.mdelab.simulator.mrubis.examples.selfhealing.SelfHealingConfig;
import de.mdelab.simulator.mrubis.examples.selfhealing.SelfHealingScenario;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.HeavyWeightRedeployComponent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.LightWeightRedeployComponent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.RecreateConnector;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.RestartComponent;
import de.mdelab.simulator.mrubis.utility.MRubisSelfHealingUtilityFunction;

/**
 * A feedback loop for self-healing mRUBiS and especially the issues CF1, CF2,
 * CF3, and CF5.
 * 
 * The feedback loop is state-based, that is, it does not use any change events
 * to drive the self-adaptation process but it queries and searches the whole
 * model for issues.
 * 
 * The feedback loop is not structured in several activities. In contrast, as
 * soon as it identifies an issue, it immediately resolves the issue.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class StateBasedFeedbackLoop {

	private int exceptionThreshold;

	/**
	 * Creates the self-healing feedback loop.
	 * 
	 * @param exceptionThreshold
	 *            threshold for the numbers of exceptions that causes a CF2.
	 */
	public StateBasedFeedbackLoop(int exceptionThreshold) {
		this.exceptionThreshold = exceptionThreshold;
	}

	/**
	 * Main to run the simulator and feedback loop.
	 * 
	 * @param args
	 *            <code>null</code>
	 */
	public static void main(String[] args) {
		// load the model
		String modelURI = "./model/mRUBiS.comparch";
		Architecture architecture = SelfHealingConfig.loadModel(modelURI);

		// parameters for the self-healing case:
		// - threshold for the number of exceptions that causes a CF2.
		// - minimum number of filter components that should be part of a pipe.
		int exceptionThreshold = 5;
		int minPipeSize = 4;

		// Instantiate the utility function and scenario
		UtilityFunction utilityFunction = new MRubisSelfHealingUtilityFunction(exceptionThreshold);
		Scenario scenario = new SelfHealingScenario(architecture, exceptionThreshold);

		// parameters for the simulator
		int runs = 4;
		long injectionDelayMS = 100;
		boolean eventTrackingEnabled = false;
		boolean logToConsole = true;
		// get an instance of the simulator
		Simulator simulator = Simulator.FACTORY.createSimulator(architecture, utilityFunction, scenario, runs,
				injectionDelayMS, eventTrackingEnabled, Level.CONFIG, logToConsole);
		// add the validators for self-healing to the simulator
		SelfHealingConfig.addValidators(simulator, exceptionThreshold, minPipeSize);

		// instantiate the feedback loop
		StateBasedFeedbackLoop loop = new StateBasedFeedbackLoop(exceptionThreshold);

		// run the simulation
		do {

			// trigger the simulator to inject issues
			simulator.injectIssues();

			// run feedback loop and repair the issues
			loop.run(architecture);

			// trigger the simulator to validate the model
			simulator.validateModel();

			// snapshot the model
			// simulator.snapshotModel();

			// repeat until the simulation is completed
		} while (!simulator.isSimulationCompleted());

		// create and show final results (see folder "results" of the project)
		simulator.showResults();

	}

	/**
	 * Runs the feedback loop.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	public void run(Architecture architecture) {
		this.handleCF1(architecture);
		this.handleCF2(architecture);
		this.handleCF3(architecture);
		this.handleCF5(architecture);
	}

	/**
	 * Searches for CF1 issues and immediately handles the issues by light-weight
	 * redeploying the affected component (see
	 * {@link LightWeightRedeployComponent}).
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void handleCF1(Architecture architecture) {
		for (Tenant tenant : architecture.getTenants()) {
			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.UNKNOWN) {
					// component is affected by CF1;
					// perform a light-weight redeployment
					new LightWeightRedeployComponent().enact(component);
				}
			}
		}
	}

	/**
	 * Searches for CF2 issues and immediately handles the issues by restarting the
	 * affected component (see {@link RestartComponent}).
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void handleCF2(Architecture architecture) {
		for (Tenant tenant : architecture.getTenants()) {
			for (Component component : tenant.getComponents()) {
				for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
					if (providedInterface.getExceptions().size() > this.exceptionThreshold) {
						// component is affected by CF2;
						// restart the component
						new RestartComponent().enact(component);
					}
				}
			}
		}
	}

	/**
	 * Searches for CF3 issues and immediately handles the issues by newly
	 * instantiating, configuring, and redeploying the removed components (see
	 * {@link HeavyWeightRedeployComponent}).
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void handleCF3(Architecture architecture) {
		for (Tenant tenant : architecture.getTenants()) {
			boolean authenticationComponentFound = false;
			List<ComponentType> allTypes = new LinkedList<ComponentType>(architecture.getComponentTypes());
			// check whether a component of each available component type is instantiated in
			// a tenant. A special case is the authentication component for which there
			// exists alternative types and only one of these types must be instantiated.
			for (Component component : tenant.getComponents()) {
				ComponentType componentType = component.getType();
				if (componentType.getName().contains("Authentication")) {
					authenticationComponentFound = true;
				}
				allTypes.remove(componentType);
			}

			// allTypes now contains component types that are not instantiated in the tenant
			// First remove the alternative authentication component types if one
			// authentication component has been found.
			if (authenticationComponentFound) {
				Iterator<ComponentType> it = allTypes.iterator();
				while (it.hasNext()) {
					ComponentType componentType = it.next();
					if (componentType.getName().contains("Authentication")) {
						it.remove();
					}
				}
			} else {
				// no authentication component exists; the local authentication should be used;
				// remove the external authentication types (Facebook, Google, and Twitter
				// authentication).
				Iterator<ComponentType> it = allTypes.iterator();
				while (it.hasNext()) {
					ComponentType componentType = it.next();
					if (componentType.getName().contains("Facebook") || componentType.getName().contains("Google")
							|| componentType.getName().contains("Twitter")) {
						it.remove();
					}
				}
			}

			// allTypes now contains all component types that are not but must be
			// instantiated in the tenant
			for (ComponentType componentType : allTypes) {
				// tenants is affected by CF3 since an instance of the componentType is missing.
				// Redeploy the component.
				new HeavyWeightRedeployComponent().enact(tenant, componentType, null);
			}

		}
	}

	/**
	 * Searches for CF5 issues and immediately handles the issues by recreating the
	 * removed connectors (see {@link RecreateConnector}).
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void handleCF5(Architecture architecture) {
		List<RequiredInterface> disconnectedRequiredInterfaces = new LinkedList<RequiredInterface>();
		for (Tenant tenant : architecture.getTenants()) {
			for (Component component : tenant.getComponents()) {
				// last filter is the future sales item filter that is always disconnected
				if (!component.getType().getName()
						.contentEquals(MRubisNames.futureSalesItemFilter_ComponentType_Name)) {
					for (RequiredInterface requiredInterface : component.getRequiredInterfaces()) {
						if (requiredInterface.getConnector() == null) {
							disconnectedRequiredInterfaces.add(requiredInterface);
							// requiredInterface is affected by CF5;
							// recreate a connector
							new RecreateConnector().enact(requiredInterface);
						}
					}
				}
			}
		}
	}

}
