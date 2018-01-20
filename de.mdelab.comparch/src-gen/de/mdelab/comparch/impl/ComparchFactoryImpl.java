/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.ConcernedElement;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.DefaultComparchFactoryImpl;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InputParameter;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparchFactoryImpl extends EFactoryImpl implements ComparchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ComparchFactory init() {
		try {
			ComparchFactory theComparchFactory = (ComparchFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComparchPackage.eNS_URI);
			if (theComparchFactory != null) {
				return theComparchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DefaultComparchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComparchPackage.ARCHITECTURE:
			return createArchitecture();
		case ComparchPackage.COMPONENT_TYPE:
			return createComponentType();
		case ComparchPackage.COMPONENT:
			return createComponent();
		case ComparchPackage.INTERFACE_TYPE:
			return createInterfaceType();
		case ComparchPackage.METHOD_SPECIFICATION:
			return createMethodSpecification();
		case ComparchPackage.PARAMETER_TYPE:
			return createParameterType();
		case ComparchPackage.TENANT:
			return createTenant();
		case ComparchPackage.PARAMETER:
			return createParameter();
		case ComparchPackage.REQUIRED_INTERFACE:
			return createRequiredInterface();
		case ComparchPackage.PROVIDED_INTERFACE:
			return createProvidedInterface();
		case ComparchPackage.CONNECTOR:
			return createConnector();
		case ComparchPackage.EXCEPTION:
			return createException();
		case ComparchPackage.MONITORED_PROPERTY:
			return createMonitoredProperty();
		case ComparchPackage.ANNOTATIONS:
			return createAnnotations();
		case ComparchPackage.ISSUE:
			return createIssue();
		case ComparchPackage.ADAPTATION_STRATEGY:
			return createAdaptationStrategy();
		case ComparchPackage.IMPACT:
			return createImpact();
		case ComparchPackage.INPUT_PARAMETER:
			return createInputParameter();
		case ComparchPackage.WORKING_DATA:
			return createWorkingData();
		case ComparchPackage.CONCERNED_ELEMENT:
			return createConcernedElement();
		case ComparchPackage.PERFORMANCE_STATS:
			return createPerformanceStats();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ComparchPackage.COMPONENT_STATE:
			return createComponentStateFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ComparchPackage.COMPONENT_STATE:
			return convertComponentStateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceType() {
		InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSpecification createMethodSpecification() {
		MethodSpecificationImpl methodSpecification = new MethodSpecificationImpl();
		return methodSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tenant createTenant() {
		TenantImpl tenant = new TenantImpl();
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterface createRequiredInterface() {
		RequiredInterfaceImpl requiredInterface = new RequiredInterfaceImpl();
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface createProvidedInterface() {
		ProvidedInterfaceImpl providedInterface = new ProvidedInterfaceImpl();
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.mdelab.comparch.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredProperty createMonitoredProperty() {
		MonitoredPropertyImpl monitoredProperty = new MonitoredPropertyImpl();
		return monitoredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations createAnnotations() {
		AnnotationsImpl annotations = new AnnotationsImpl();
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationStrategy createAdaptationStrategy() {
		AdaptationStrategyImpl adaptationStrategy = new AdaptationStrategyImpl();
		return adaptationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact createImpact() {
		ImpactImpl impact = new ImpactImpl();
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameter createInputParameter() {
		InputParameterImpl inputParameter = new InputParameterImpl();
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingData createWorkingData() {
		WorkingDataImpl workingData = new WorkingDataImpl();
		return workingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernedElement createConcernedElement() {
		ConcernedElementImpl concernedElement = new ConcernedElementImpl();
		return concernedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceStats createPerformanceStats() {
		PerformanceStatsImpl performanceStats = new PerformanceStatsImpl();
		return performanceStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentState createComponentStateFromString(EDataType eDataType, String initialValue) {
		ComponentState result = ComponentState.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparchPackage getComparchPackage() {
		return (ComparchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComparchPackage getPackage() {
		return ComparchPackage.eINSTANCE;
	}

} //ComparchFactoryImpl
