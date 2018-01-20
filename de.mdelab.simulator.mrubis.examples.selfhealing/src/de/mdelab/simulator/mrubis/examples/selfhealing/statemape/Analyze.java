package de.mdelab.simulator.mrubis.examples.selfhealing.statemape;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Analyze activity of the state-based feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Analyze {

	/**
	 * Analyzes the model to identify the issue CF1, CF2, CF3 and CF5. For each
	 * identified issue, it enriches the model with a corresponding {@link Issue}
	 * annotation.
	 * 
	 * @param architecture
	 *            the root element of the model
	 * @param exceptionThreshold
	 *            the threshold for the numbers of exceptions that causes a CF2
	 */
	public void analyze(Architecture architecture, int exceptionThreshold) {
		this.checkForCF1(architecture);
		this.checkForCF2(architecture, exceptionThreshold);
		this.checkForCF3(architecture);
		this.checkForCF5(architecture);
	}

	/**
	 * Checks the model for a CF1. If it identified a CF1, it adds an {@link Issue}
	 * annotation to the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void checkForCF1(Architecture architecture) {
		for (Tenant tenant : architecture.getTenants()) {
			for (Component component : tenant.getComponents()) {
				if (component.getState() == ComponentState.UNKNOWN) {
					// create an issue
					Issue cf1 = ComparchFactory.eINSTANCE.createIssue();
					cf1.setType("CF1");
					architecture.getAnnotations().getIssues().add(cf1);
					// specify the impact of the issue, that is, the affected component
					Impact impactedComponent = ComparchFactory.eINSTANCE.createImpact();
					impactedComponent.setType("unknownComponent");
					impactedComponent.setArchitecturalElement(component);
					cf1.getImpacts().add(impactedComponent);

				}
			}
		}
	}

	/**
	 * Checks the model for a CF2. If it identified a CF2, it adds an {@link Issue}
	 * annotation to the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 * @param exceptionThreshold
	 *            the threshold for the numbers of exceptions that causes a CF2
	 */
	private void checkForCF2(Architecture architecture, int exceptionThreshold) {
		for (Tenant tenant : architecture.getTenants()) {
			for (Component component : tenant.getComponents()) {
				for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
					if (providedInterface.getExceptions().size() > exceptionThreshold) {
						// create an issue
						Issue cf2 = ComparchFactory.eINSTANCE.createIssue();
						cf2.setType("CF2");
						architecture.getAnnotations().getIssues().add(cf2);
						// specify the impact of the issue, that is, the affected component
						Impact impactedComponent = ComparchFactory.eINSTANCE.createImpact();
						impactedComponent.setType("affectedComponent");
						impactedComponent.setArchitecturalElement(component);
						cf2.getImpacts().add(impactedComponent);
					}
				}
			}
		}
	}

	/**
	 * Checks the model for a CF3. If it identified a CF3, it adds an {@link Issue}
	 * annotation to the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void checkForCF3(Architecture architecture) {
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
				// create issue
				Issue cf3 = ComparchFactory.eINSTANCE.createIssue();
				cf3.setType("CF3");
				architecture.getAnnotations().getIssues().add(cf3);
				// set impacted elements
				Impact impactedComponentType = ComparchFactory.eINSTANCE.createImpact();
				impactedComponentType.setType("affectedComponentType");
				impactedComponentType.setArchitecturalElement(componentType);
				cf3.getImpacts().add(impactedComponentType);

				Impact impactedTenant = ComparchFactory.eINSTANCE.createImpact();
				impactedTenant.setType("affectedTenant");
				impactedTenant.setArchitecturalElement(tenant);
				cf3.getImpacts().add(impactedTenant);
			}

		}
	}

	/**
	 * Checks the model for a CF5. If it identified a CF5, it adds an {@link Issue}
	 * annotation to the model.
	 * 
	 * @param architecture
	 *            the root element of the model.
	 */
	private void checkForCF5(Architecture architecture) {
		List<RequiredInterface> disconnectedRequiredInterfaces = new LinkedList<RequiredInterface>();
		for (Tenant tenant : architecture.getTenants()) {
			for (Component component : tenant.getComponents()) {
				// last filter is the future sales item filter that is always disconnected
				if (!component.getType().getName()
						.contentEquals(MRubisNames.futureSalesItemFilter_ComponentType_Name)) {
					for (RequiredInterface requiredInterface : component.getRequiredInterfaces()) {
						if (requiredInterface.getConnector() == null) {
							disconnectedRequiredInterfaces.add(requiredInterface);
							// create issue
							Issue cf5 = ComparchFactory.eINSTANCE.createIssue();
							cf5.setType("CF5");
							architecture.getAnnotations().getIssues().add(cf5);
							// set impacted element
							Impact impactedReqInterface = ComparchFactory.eINSTANCE.createImpact();
							impactedReqInterface.setType("affectedRequiredInterface");
							impactedReqInterface.setArchitecturalElement(requiredInterface);
							cf5.getImpacts().add(impactedReqInterface);
						}
					}
				}
			}
		}
	}
}
