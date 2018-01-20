package de.mdelab.simulator.mrubis.examples.selfhealing.statemape;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.HeavyWeightRedeployComponent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.LightWeightRedeployComponent;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.RecreateConnector;
import de.mdelab.simulator.mrubis.examples.selfhealing.strategies.RestartComponent;

/**
 * Execute activity of the state-based feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Execute {

	/**
	 * Executes the planned adaptations to the model, that is, it processes the
	 * {@link AdaptationStrategy} elements annotated in the model by the previous
	 * planning activity and performs a corresponding adaptation to the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	public void execute(Architecture architecture) {
		Annotations annotations = architecture.getAnnotations();
		Iterator<AdaptationStrategy> strategies = annotations.getAdaptationStrategies().iterator();
		while (strategies.hasNext()) {
			AdaptationStrategy strategy = strategies.next();
			List<InputParameter> params = strategy.getInputParameters();
			switch (strategy.getType()) {
			case "LwRedeployComponent":
				InputParameter redeployComponent = this.getInputParameterByType(params, "redeployComponent");
				new LightWeightRedeployComponent().enact((Component) redeployComponent.getArchitecturalElement());
				break;
			case "RestartComponent":
				InputParameter restartComponent = this.getInputParameterByType(params, "restartComponent");
				new RestartComponent().enact((Component) restartComponent.getArchitecturalElement());
				break;
			case "HwRedeployComponent":
				InputParameter tenant = this.getInputParameterByType(params, "tenant");
				InputParameter componentType = this.getInputParameterByType(params, "componentType");
				new HeavyWeightRedeployComponent().enact((Tenant) tenant.getArchitecturalElement(),
						(ComponentType) componentType.getArchitecturalElement(), null);
				break;
			case "RecreateConnector":
				InputParameter requiredInterface = this.getInputParameterByType(params, "requiredInterface");
				new RecreateConnector().enact((RequiredInterface) requiredInterface.getArchitecturalElement());
				break;
			default:
				break;
			}

		}
		// remove annotations assuming all annotated strategies have been executed and
		// handled the annotated issues.
		this.clearAnnotations(architecture);
	}

	/**
	 * Returns the first input parameter with the given type from the given list of
	 * input parameters.
	 * 
	 * @param params
	 *            the list of input parameters.
	 * @param type
	 *            the given type of the input parameter
	 * @return the first element of the given list of input parameters that has the
	 *         given type.
	 */
	private InputParameter getInputParameterByType(List<InputParameter> params, String type) {
		Optional<InputParameter> inputParam = params.stream().filter(i -> i.getType().equals(type)).findFirst();
		return inputParam.get();
	}

	/**
	 * Removes all annotations from the model that have been created by the feedback
	 * loop.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void clearAnnotations(Architecture architecture) {
		// remove adaptation strategies and issues
		Annotations annotations = architecture.getAnnotations();
		List<AdaptationStrategy> strategies = new LinkedList<AdaptationStrategy>(annotations.getAdaptationStrategies());
		for (AdaptationStrategy s : strategies) {
			EcoreUtil.delete(s, true);
		}
		List<Issue> issues = new LinkedList<Issue>(annotations.getIssues());
		for (Issue i : issues) {
			EcoreUtil.delete(i, true);
		}
	}
}
