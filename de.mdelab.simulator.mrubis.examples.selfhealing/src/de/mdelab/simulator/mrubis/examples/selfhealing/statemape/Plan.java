package de.mdelab.simulator.mrubis.examples.selfhealing.statemape;

import java.util.List;
import java.util.Optional;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;

/**
 * Planning activity of the state-based feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Plan {

	/**
	 * Processes the {@link Issue} annotations made by the previous analyze activity
	 * by planning an adaptation. The planned adaptation is annotated to the model
	 * using {@link AdaptationStrategy} annotations.
	 * 
	 * @param architecture
	 *            the root element of the model
	 */
	public void plan(Architecture architecture) {
		Annotations annotations = architecture.getAnnotations();
		// assigns an adaptation strategy to each issue based on a static mapping
		for (Issue issue : annotations.getIssues()) {
			List<Impact> impacts = issue.getImpacts();
			AdaptationStrategy strategy = null;
			switch (issue.getType()) {
			case "CF1":
				Impact unknownComponent = this.getImpactByType(impacts, "unknownComponent");
				strategy = this.createLwRedeployComponent((Component) unknownComponent.getArchitecturalElement());
				break;
			case "CF2":
				Impact affectedComponent = this.getImpactByType(impacts, "affectedComponent");
				strategy = this.createRestartComponent((Component) affectedComponent.getArchitecturalElement());
				break;
			case "CF3":
				Impact affectedComponentType = this.getImpactByType(impacts, "affectedComponentType");
				Impact affectedTenant = this.getImpactByType(impacts, "affectedTenant");
				strategy = this.createHwRedeployComponent((Tenant) affectedTenant.getArchitecturalElement(),
						(ComponentType) affectedComponentType.getArchitecturalElement());
				break;
			case "CF5":
				Impact affectedRequiredInterface = this.getImpactByType(impacts, "affectedRequiredInterface");
				strategy = this.createRecreateConnector(
						(RequiredInterface) affectedRequiredInterface.getArchitecturalElement());
				break;
			default:
				break;
			}

			issue.getAssignedAdaptationStrategies().add(strategy);
			annotations.getAdaptationStrategies().add(strategy);
		}
	}

	/**
	 * Returns the first impact element from the given list based on the impact
	 * type.
	 * 
	 * @param impacts
	 *            list of impact elements
	 * @param type
	 *            the searched impact type
	 * @return the impact element with the given type from the list of impact
	 *         elements
	 */
	private Impact getImpactByType(List<Impact> impacts, String type) {
		Optional<Impact> impact = impacts.stream().filter(i -> i.getType().equals(type)).findFirst();
		return impact.get();
	}

	/**
	 * Creates a light-weight redeployment adaptation strategy that targets the
	 * given component.
	 * 
	 * @param component
	 *            the component that should be redeployed.
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy createLwRedeployComponent(Component component) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("LwRedeployComponent");

		InputParameter componentToRedeploy = ComparchFactory.eINSTANCE.createInputParameter();
		componentToRedeploy.setType("redeployComponent");
		componentToRedeploy.setArchitecturalElement(component);
		strategy.getInputParameters().add(componentToRedeploy);

		return strategy;
	}

	/**
	 * Creates a restart component adaptation strategy that targets the given
	 * component.
	 * 
	 * @param component
	 *            the component that should be restarted.
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy createRestartComponent(Component component) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("RestartComponent");

		InputParameter componentToRestart = ComparchFactory.eINSTANCE.createInputParameter();
		componentToRestart.setType("restartComponent");
		componentToRestart.setArchitecturalElement(component);
		strategy.getInputParameters().add(componentToRestart);

		return strategy;
	}

	/**
	 * Creates a heavy-weight redeployment adaptation strategy that targets the
	 * given component.
	 * 
	 * @param component
	 *            the component that should be redeployed.
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy createHwRedeployComponent(Tenant tenant, ComponentType componentType) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("HwRedeployComponent");

		InputParameter tenantParam = ComparchFactory.eINSTANCE.createInputParameter();
		tenantParam.setType("tenant");
		tenantParam.setArchitecturalElement(tenant);
		strategy.getInputParameters().add(tenantParam);

		InputParameter componentTypeParam = ComparchFactory.eINSTANCE.createInputParameter();
		componentTypeParam.setType("componentType");
		componentTypeParam.setArchitecturalElement(componentType);
		strategy.getInputParameters().add(componentTypeParam);

		return strategy;
	}

	/**
	 * Creates a recreate connector adaptation strategy that will wire the given
	 * provided interface to a provided interface.
	 * 
	 * @param requiredInterface
	 *            the required interfaces that should be wired.
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy createRecreateConnector(RequiredInterface requiredInterface) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("RecreateConnector");

		InputParameter requiredInterfaceParam = ComparchFactory.eINSTANCE.createInputParameter();
		requiredInterfaceParam.setType("requiredInterface");
		requiredInterfaceParam.setArchitecturalElement(requiredInterface);
		strategy.getInputParameters().add(requiredInterfaceParam);

		return strategy;
	}

}
