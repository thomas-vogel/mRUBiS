package de.mdelab.simulator.mrubis.examples.selfhealing.strategies;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Adaptation strategy that performs a heavy-weight redeployment of the given
 * {@link Component}. Such a redeployment undeploys and removes the existing
 * component and it newly instantiates a component of the given
 * {@link ComponentType} and configures this newly instantiated component
 * (rather than reusing the already existing component that will be removed).
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class HeavyWeightRedeployComponent {

	/**
	 * Performs the heavy-weight redeployment of a component.
	 * 
	 * @param tenant
	 *            the tenant where the component will be redeployed
	 * @param componentType
	 *            the type of the component that will be newly instantiated,
	 *            configured, and deployed
	 * @param existingInstance
	 *            the existing component that will be undeployed and replaced by the
	 *            newly instantiated component. This parameter can be
	 *            <code>null</code>
	 */
	public void enact(Tenant tenant, ComponentType componentType, Component existingInstance) {
		System.out.println("HeavyWeightRedeployComponent of " + SimulatorUtil.elementToString(componentType) + " in "
				+ SimulatorUtil.elementToString(tenant));

		// remove existing component if it still exists
		if (existingInstance != null) {
			switch (existingInstance.getState()) {
			case UNKNOWN:
				existingInstance.setState(ComponentState.DEPLOYED);
				existingInstance.setState(ComponentState.UNDEPLOYED);
				break;
			case STARTED:
				existingInstance.setState(ComponentState.DEPLOYED);
				existingInstance.setState(ComponentState.UNDEPLOYED);
				break;
			case DEPLOYED:
				existingInstance.setState(ComponentState.UNDEPLOYED);
				break;
			default:
				break;
			}
			EcoreUtil.delete(existingInstance, true);
		}

		// instantiate and deploy the component to the given tenant
		Component newInstance = componentType.instantiate();
		tenant.getComponents().add(newInstance);
		newInstance.setState(ComponentState.DEPLOYED);

		// create connectors for required interfaces
		for (RequiredInterface requiredInterface : newInstance.getRequiredInterfaces()) {
			InterfaceType requiredInterfaceType = requiredInterface.getType();

			Connector connector = ComparchFactory.eINSTANCE.createConnector();
			connector.setSource(requiredInterface);
			ProvidedInterface target = null;
			// find target
			STOPSEARCH: for (Component c : tenant.getComponents()) {
				if (c.getState() == ComponentState.STARTED) {
					for (ProvidedInterface providedInterface : c.getProvidedInterfaces()) {
						if (providedInterface.getType().equals(requiredInterfaceType)) {
							if (requiredInterfaceType.getFqName()
									.equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
								if (providedInterface.getConnectors().size() == 0) {
									target = providedInterface;
									break STOPSEARCH;
								}
							} else {
								target = providedInterface;
								break STOPSEARCH;
							}
						}
					}
				}
			}
			connector.setTarget(target);
		}

		// start component
		newInstance.setState(ComponentState.STARTED);

		// connect other components to provided interfaces of the new instance if the
		// other components have a dangling connector
		for (Component component : tenant.getComponents()) {
			if (!component.equals(newInstance)) {
				for (RequiredInterface requiredInterface : component.getRequiredInterfaces()) {
					Connector existingConnector = requiredInterface.getConnector();
					if (existingConnector != null && existingConnector.getTarget() == null) {
						for (ProvidedInterface providedInterface : newInstance.getProvidedInterfaces()) {
							// required interface of another component has a dangling connector; remove it
							// and connect it to the provided interface if the interface types match
							if (providedInterface.getType().equals(requiredInterface.getType())) {
								EcoreUtil.delete(existingConnector, true);
								Connector newConnector = ComparchFactory.eINSTANCE.createConnector();
								newConnector.setSource(requiredInterface);
								newConnector.setTarget(providedInterface);
								break;
							}
						}
					}
				}
			}

		}

	}
}
