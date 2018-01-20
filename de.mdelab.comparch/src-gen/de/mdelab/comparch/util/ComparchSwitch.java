/**
 */
package de.mdelab.comparch.util;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotation;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.ConcernedElement;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.Interface;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.ParameterType;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.comparch.WorkingData;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.comparch.ComparchPackage
 * @generated
 */
public class ComparchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComparchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparchSwitch() {
		if (modelPackage == null) {
			modelPackage = ComparchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ComparchPackage.ARCHITECTURE: {
			Architecture architecture = (Architecture) theEObject;
			T result = caseArchitecture(architecture);
			if (result == null)
				result = caseArchitecturalElement(architecture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.ARCHITECTURAL_ELEMENT: {
			ArchitecturalElement architecturalElement = (ArchitecturalElement) theEObject;
			T result = caseArchitecturalElement(architecturalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.COMPONENT_TYPE: {
			ComponentType componentType = (ComponentType) theEObject;
			T result = caseComponentType(componentType);
			if (result == null)
				result = caseArchitecturalElement(componentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseArchitecturalElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.INTERFACE_TYPE: {
			InterfaceType interfaceType = (InterfaceType) theEObject;
			T result = caseInterfaceType(interfaceType);
			if (result == null)
				result = caseArchitecturalElement(interfaceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.METHOD_SPECIFICATION: {
			MethodSpecification methodSpecification = (MethodSpecification) theEObject;
			T result = caseMethodSpecification(methodSpecification);
			if (result == null)
				result = caseArchitecturalElement(methodSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.PARAMETER_TYPE: {
			ParameterType parameterType = (ParameterType) theEObject;
			T result = caseParameterType(parameterType);
			if (result == null)
				result = caseArchitecturalElement(parameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.TENANT: {
			Tenant tenant = (Tenant) theEObject;
			T result = caseTenant(tenant);
			if (result == null)
				result = caseArchitecturalElement(tenant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseArchitecturalElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseArchitecturalElement(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.REQUIRED_INTERFACE: {
			RequiredInterface requiredInterface = (RequiredInterface) theEObject;
			T result = caseRequiredInterface(requiredInterface);
			if (result == null)
				result = caseInterface(requiredInterface);
			if (result == null)
				result = caseArchitecturalElement(requiredInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.PROVIDED_INTERFACE: {
			ProvidedInterface providedInterface = (ProvidedInterface) theEObject;
			T result = caseProvidedInterface(providedInterface);
			if (result == null)
				result = caseInterface(providedInterface);
			if (result == null)
				result = caseArchitecturalElement(providedInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseArchitecturalElement(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.EXCEPTION: {
			de.mdelab.comparch.Exception exception = (de.mdelab.comparch.Exception) theEObject;
			T result = caseException(exception);
			if (result == null)
				result = caseArchitecturalElement(exception);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.MONITORED_PROPERTY: {
			MonitoredProperty monitoredProperty = (MonitoredProperty) theEObject;
			T result = caseMonitoredProperty(monitoredProperty);
			if (result == null)
				result = caseArchitecturalElement(monitoredProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.ANNOTATIONS: {
			Annotations annotations = (Annotations) theEObject;
			T result = caseAnnotations(annotations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.ISSUE: {
			Issue issue = (Issue) theEObject;
			T result = caseIssue(issue);
			if (result == null)
				result = caseAnnotation(issue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.ADAPTATION_STRATEGY: {
			AdaptationStrategy adaptationStrategy = (AdaptationStrategy) theEObject;
			T result = caseAdaptationStrategy(adaptationStrategy);
			if (result == null)
				result = caseAnnotation(adaptationStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.IMPACT: {
			Impact impact = (Impact) theEObject;
			T result = caseImpact(impact);
			if (result == null)
				result = caseAnnotation(impact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.INPUT_PARAMETER: {
			InputParameter inputParameter = (InputParameter) theEObject;
			T result = caseInputParameter(inputParameter);
			if (result == null)
				result = caseAnnotation(inputParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.WORKING_DATA: {
			WorkingData workingData = (WorkingData) theEObject;
			T result = caseWorkingData(workingData);
			if (result == null)
				result = caseAnnotation(workingData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.CONCERNED_ELEMENT: {
			ConcernedElement concernedElement = (ConcernedElement) theEObject;
			T result = caseConcernedElement(concernedElement);
			if (result == null)
				result = caseAnnotation(concernedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComparchPackage.PERFORMANCE_STATS: {
			PerformanceStats performanceStats = (PerformanceStats) theEObject;
			T result = casePerformanceStats(performanceStats);
			if (result == null)
				result = caseArchitecturalElement(performanceStats);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architectural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architectural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecturalElement(ArchitecturalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceType(InterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSpecification(MethodSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tenant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tenant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTenant(Tenant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredInterface(RequiredInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedInterface(ProvidedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(de.mdelab.comparch.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredProperty(MonitoredProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotations(Annotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationStrategy(AdaptationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpact(Impact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParameter(InputParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingData(WorkingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concerned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concerned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernedElement(ConcernedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceStats(PerformanceStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComparchSwitch
