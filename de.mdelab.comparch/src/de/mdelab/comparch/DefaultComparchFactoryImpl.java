package de.mdelab.comparch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.impl.ComparchFactoryImpl;

/**
 * Factory for Comparch elements that automatically sets the unique identifier
 * of an element when the element is created.
 * 
 * @author thomas vogel
 * @version 0.1
 * 
 */
public class DefaultComparchFactoryImpl extends ComparchFactoryImpl {

	public static final DefaultComparchFactoryImpl eINSTANCE = new DefaultComparchFactoryImpl();

	public DefaultComparchFactoryImpl() {
		super();
	}

	private String genUUID(EObject object) {
		return EcoreUtil.generateUUID();
	}

	@Override
	public Architecture createArchitecture() {
		Architecture architecture = super.createArchitecture();
		architecture.setUid(this.genUUID(architecture));
		return architecture;
	}

	@Override
	public ComponentType createComponentType() {
		ComponentType componentType = super.createComponentType();
		componentType.setUid(this.genUUID(componentType));
		return componentType;
	}

	@Override
	public InterfaceType createInterfaceType() {
		InterfaceType interfaceType = super.createInterfaceType();
		interfaceType.setUid(this.genUUID(interfaceType));
		return interfaceType;
	}

	@Override
	public ParameterType createParameterType() {
		ParameterType parameterType = super.createParameterType();
		parameterType.setUid(this.genUUID(parameterType));
		return parameterType;
	}

	@Override
	public MethodSpecification createMethodSpecification() {
		MethodSpecification methodSpecification = super.createMethodSpecification();
		methodSpecification.setUid(this.genUUID(methodSpecification));
		return methodSpecification;
	}

	@Override
	public Tenant createTenant() {
		Tenant tenant = super.createTenant();
		tenant.setUid(this.genUUID(tenant));
		return tenant;
	}

	@Override
	public Component createComponent() {
		Component component = super.createComponent();
		component.setUid(this.genUUID(component));
		return component;
	}

	@Override
	public Parameter createParameter() {
		Parameter parameter = super.createParameter();
		parameter.setUid(this.genUUID(parameter));
		return parameter;
	}

	@Override
	public RequiredInterface createRequiredInterface() {
		RequiredInterface requiredInterface = super.createRequiredInterface();
		requiredInterface.setUid(this.genUUID(requiredInterface));
		return requiredInterface;
	}

	@Override
	public ProvidedInterface createProvidedInterface() {
		ProvidedInterface providedInterface = super.createProvidedInterface();
		providedInterface.setUid(this.genUUID(providedInterface));
		return providedInterface;
	}

	@Override
	public Connector createConnector() {
		Connector connector = super.createConnector();
		connector.setUid(this.genUUID(connector));
		return connector;
	}

	@Override
	public Exception createException() {
		Exception exception = super.createException();
		exception.setUid(this.genUUID(exception));
		return exception;
	}

	public PerformanceStats createPerformanceStats() {
		PerformanceStats performanceStats = super.createPerformanceStats();
		performanceStats.setUid(this.genUUID(performanceStats));
		return performanceStats;
	}

	@Override
	public MonitoredProperty createMonitoredProperty() {
		MonitoredProperty monitoredProperty = super.createMonitoredProperty();
		monitoredProperty.setUid(this.genUUID(monitoredProperty));
		return monitoredProperty;
	}

	@Override
	public Annotations createAnnotations() {
		Annotations annotations = super.createAnnotations();
		annotations.setUid(this.genUUID(annotations));
		return annotations;
	}

	@Override
	public WorkingData createWorkingData() {
		WorkingData workingData = super.createWorkingData();
		workingData.setUid(this.genUUID(workingData));
		return workingData;
	}

	@Override
	public ConcernedElement createConcernedElement() {
		ConcernedElement concernedElement = super.createConcernedElement();
		concernedElement.setUid(this.genUUID(concernedElement));
		return concernedElement;
	}

	@Override
	public Issue createIssue() {
		Issue issue = super.createIssue();
		issue.setUid(this.genUUID(issue));
		return issue;
	}

	@Override
	public Impact createImpact() {
		Impact impact = super.createImpact();
		impact.setUid(this.genUUID(impact));
		return impact;
	}

	@Override
	public AdaptationStrategy createAdaptationStrategy() {
		AdaptationStrategy adaptationStrategy = super.createAdaptationStrategy();
		adaptationStrategy.setUid(this.genUUID(adaptationStrategy));
		return adaptationStrategy;
	}

	@Override
	public InputParameter createInputParameter() {
		InputParameter inputParameter = super.createInputParameter();
		inputParameter.setUid(this.genUUID(inputParameter));
		return inputParameter;
	}

}
