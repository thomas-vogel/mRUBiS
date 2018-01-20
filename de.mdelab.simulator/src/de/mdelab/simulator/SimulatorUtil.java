package de.mdelab.simulator;

import java.util.Random;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.ParameterType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;

/**
 * Utility class of the simulator. Used by the simulator and can also be used by
 * feedback loops.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class SimulatorUtil {

	// for generating random numbers
	private static Random rand = new Random();

	/**
	 * Returns a pseudo-random number between min and max, inclusive. The difference
	 * between min and max can be at most <code>Integer.MAX_VALUE - 1</code>.
	 * 
	 * @param min
	 *            Minimum value
	 * @param max
	 *            Maximum value. Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {
		// nextInt is exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	/**
	 * Returns a String representation of the given model element.
	 * 
	 * @param element
	 *            the model element
	 * @return the String representation of the <code>element</code>.
	 */
	public static String elementToString(ArchitecturalElement element) {
		if (element != null) {
			StringBuffer info = new StringBuffer(element.eClass().getName() + " ");
			String uid = "uid: " + element.getUid();
			String criticality = "criticality: " + element.getCriticality();
			switch (element.eClass().getClassifierID()) {
			case ComparchPackage.ARCHITECTURE:
				Architecture architecture = (Architecture) element;
				info.append("(name: " + architecture.getName());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			case ComparchPackage.TENANT:
				Tenant tenant = (Tenant) element;
				info.append("(name: " + tenant.getName());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			case ComparchPackage.COMPONENT:
				Component component = (Component) element;
				info.append("(name: " + component.getName());
				info.append(", " + criticality);
				info.append(", state: " + component.getState());
				info.append(", " + uid);
				info.append(", type: " + elementToString(component.getType()));
				info.append(")");
				break;
			case ComparchPackage.PARAMETER:
				Parameter parameter = (Parameter) element;
				info.append("(value: " + parameter.getValue());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(", type: " + elementToString(parameter.getType()));
				info.append(")");
				break;
			case ComparchPackage.CONNECTOR:
				Connector connector = (Connector) element;
				info.append("(name: " + connector.getName());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(", source: " + elementToString(connector.getSource()));
				info.append(", target: " + elementToString(connector.getTarget()));
				info.append(")");
				break;
			case ComparchPackage.REQUIRED_INTERFACE:
				RequiredInterface requiredInterface = (RequiredInterface) element;
				info.append("(" + criticality);
				info.append(", " + uid);
				info.append(", type: " + elementToString(requiredInterface.getType()));
				info.append(")");
				break;
			case ComparchPackage.PROVIDED_INTERFACE:
				ProvidedInterface providedInterface = (ProvidedInterface) element;
				info.append("(" + criticality);
				info.append(", " + uid);
				info.append(", type: " + elementToString(providedInterface.getType()));
				info.append(")");
				break;
			case ComparchPackage.EXCEPTION:
				Exception exception = (Exception) element;
				info.append("(type: " + exception.getType());
				info.append(", message: " + exception.getMessage());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(", method: " + exception.getMethod());
				info.append(")");
				break;
			case ComparchPackage.MONITORED_PROPERTY:
				MonitoredProperty monitoredProperty = (MonitoredProperty) element;
				info.append("(name: " + monitoredProperty.getName());
				info.append(", type: " + monitoredProperty.getType());
				info.append(", unit: " + monitoredProperty.getUnit());
				info.append(", description: " + monitoredProperty.getDescription());
				info.append(", value: " + monitoredProperty.getValue());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			case ComparchPackage.COMPONENT_TYPE:
				ComponentType componentType = (ComponentType) element;
				info.append("(name: " + componentType.getName());
				info.append(", reliability: " + componentType.getReliability());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			case ComparchPackage.PARAMETER_TYPE:
				ParameterType parameterType = (ParameterType) element;
				info.append("(name: " + parameterType.getName());
				info.append(", type: " + parameterType.getType());
				info.append(", defaultValue: " + parameterType.getDefaultValue());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			case ComparchPackage.INTERFACE_TYPE:
				InterfaceType interfaceType = (InterfaceType) element;
				info.append("(name: " + interfaceType.getFqName());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			case ComparchPackage.METHOD_SPECIFICATION:
				MethodSpecification methodSpecification = (MethodSpecification) element;
				info.append("(signature: " + methodSpecification.getSignature());
				info.append(", " + criticality);
				info.append(", " + uid);
				info.append(")");
				break;
			default:
				// ArchitecturalElement
				break;
			}
			return info.toString();
		} else {
			return "null";
		}
	}

}
