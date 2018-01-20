/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotation;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparchPackageImpl extends EPackageImpl implements ComparchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tenantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.comparch.ComparchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComparchPackageImpl() {
		super(eNS_URI, ComparchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComparchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComparchPackage init() {
		if (isInited)
			return (ComparchPackage) EPackage.Registry.INSTANCE.getEPackage(ComparchPackage.eNS_URI);

		// Obtain or create and register package
		ComparchPackageImpl theComparchPackage = (ComparchPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComparchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComparchPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComparchPackage.createPackageContents();

		// Initialize created meta-data
		theComparchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComparchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComparchPackage.eNS_URI, theComparchPackage);
		return theComparchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecture_Name() {
		return (EAttribute) architectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_ComponentTypes() {
		return (EReference) architectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_InterfaceTypes() {
		return (EReference) architectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Tenants() {
		return (EReference) architectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Annotations() {
		return (EReference) architectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalElement() {
		return architecturalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalElement_Uid() {
		return (EAttribute) architecturalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecturalElement_Criticality() {
		return (EAttribute) architecturalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalElement_MonitoredProperties() {
		return (EReference) architecturalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalElement_IssueImpacts() {
		return (EReference) architecturalElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalElement_StrategyInputs() {
		return (EReference) architecturalElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalElement_WorkingDataElements() {
		return (EReference) architecturalElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Name() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Architecture() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_RequiredInterfaceTypes() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_ProvidedInterfaceTypes() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_ParameterTypes() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Instances() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Reliability() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentType__Instantiate() {
		return componentTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Tenant() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Type() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Parameters() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_State() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RequiredInterfaces() {
		return (EReference) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedInterfaces() {
		return (EReference) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceType() {
		return interfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceType_FqName() {
		return (EAttribute) interfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Architecture() {
		return (EReference) interfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_RequiringComponentTypes() {
		return (EReference) interfaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_ProvidingComponentTypes() {
		return (EReference) interfaceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_MethodSpecifications() {
		return (EReference) interfaceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_Instances() {
		return (EReference) interfaceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSpecification() {
		return methodSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodSpecification_Signature() {
		return (EAttribute) methodSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSpecification_InterfaceType() {
		return (EReference) methodSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSpecification_Exceptions() {
		return (EReference) methodSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSpecification_PerformanceStats() {
		return (EReference) methodSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Name() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Type() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_DefaultValue() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_ComponentType() {
		return (EReference) parameterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_Instances() {
		return (EReference) parameterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTenant() {
		return tenantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTenant_Name() {
		return (EAttribute) tenantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTenant_Architecture() {
		return (EReference) tenantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTenant_Components() {
		return (EReference) tenantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Component() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Type() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterface() {
		return requiredInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredInterface_Component() {
		return (EReference) requiredInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredInterface_Connector() {
		return (EReference) requiredInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterface() {
		return providedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterface_Component() {
		return (EReference) providedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterface_Connectors() {
		return (EReference) providedInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterface_Exceptions() {
		return (EReference) providedInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterface_PerformanceStats() {
		return (EReference) providedInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Name() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Source() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Target() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getException_Type() {
		return (EAttribute) exceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getException_Message() {
		return (EAttribute) exceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getException_StackTrace() {
		return (EAttribute) exceptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getException_Interface() {
		return (EReference) exceptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getException_Method() {
		return (EReference) exceptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredProperty() {
		return monitoredPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredProperty_ArchitecturalElement() {
		return (EReference) monitoredPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredProperty_Name() {
		return (EAttribute) monitoredPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredProperty_Type() {
		return (EAttribute) monitoredPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredProperty_Unit() {
		return (EAttribute) monitoredPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredProperty_Description() {
		return (EAttribute) monitoredPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredProperty_Value() {
		return (EAttribute) monitoredPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredProperty_RelatedArchitecturalElements() {
		return (EReference) monitoredPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotations() {
		return annotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_Architecture() {
		return (EReference) annotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_Issues() {
		return (EReference) annotationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_AdaptationStrategies() {
		return (EReference) annotationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_Workingdata() {
		return (EReference) annotationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotations_Uid() {
		return (EAttribute) annotationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Annotations() {
		return (EReference) issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Impacts() {
		return (EReference) issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_UtilityDrop() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_AssignedAdaptationStrategies() {
		return (EReference) issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationStrategy() {
		return adaptationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptationStrategy_UtilityIncrease() {
		return (EAttribute) adaptationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptationStrategy_Costs() {
		return (EAttribute) adaptationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_Annotations() {
		return (EReference) adaptationStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_AssignedIssues() {
		return (EReference) adaptationStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationStrategy_InputParameters() {
		return (EReference) adaptationStrategyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Name() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Type() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Uid() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Description() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpact() {
		return impactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpact_Issue() {
		return (EReference) impactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpact_ArchitecturalElement() {
		return (EReference) impactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameter() {
		return inputParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameter_AdaptationStrategy() {
		return (EReference) inputParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameter_ArchitecturalElement() {
		return (EReference) inputParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingData() {
		return workingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingData_Unit() {
		return (EAttribute) workingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingData_Value() {
		return (EAttribute) workingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkingData_Annotations() {
		return (EReference) workingDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkingData_ConcernedElements() {
		return (EReference) workingDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcernedElement() {
		return concernedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcernedElement_Workingdata() {
		return (EReference) concernedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcernedElement_ArchitecturalElement() {
		return (EReference) concernedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceStats() {
		return performanceStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceStats_MinTime() {
		return (EAttribute) performanceStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceStats_MaxTime() {
		return (EAttribute) performanceStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceStats_TotalTime() {
		return (EAttribute) performanceStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceStats_InvocationCount() {
		return (EAttribute) performanceStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceStats_Interface() {
		return (EReference) performanceStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceStats_Method() {
		return (EReference) performanceStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentState() {
		return componentStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparchFactory getComparchFactory() {
		return (ComparchFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		architectureEClass = createEClass(ARCHITECTURE);
		createEAttribute(architectureEClass, ARCHITECTURE__NAME);
		createEReference(architectureEClass, ARCHITECTURE__COMPONENT_TYPES);
		createEReference(architectureEClass, ARCHITECTURE__INTERFACE_TYPES);
		createEReference(architectureEClass, ARCHITECTURE__TENANTS);
		createEReference(architectureEClass, ARCHITECTURE__ANNOTATIONS);

		architecturalElementEClass = createEClass(ARCHITECTURAL_ELEMENT);
		createEAttribute(architecturalElementEClass, ARCHITECTURAL_ELEMENT__UID);
		createEAttribute(architecturalElementEClass, ARCHITECTURAL_ELEMENT__CRITICALITY);
		createEReference(architecturalElementEClass, ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES);
		createEReference(architecturalElementEClass, ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS);
		createEReference(architecturalElementEClass, ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS);
		createEReference(architecturalElementEClass, ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NAME);
		createEReference(componentTypeEClass, COMPONENT_TYPE__ARCHITECTURE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__REQUIRED_INTERFACE_TYPES);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PROVIDED_INTERFACE_TYPES);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PARAMETER_TYPES);
		createEReference(componentTypeEClass, COMPONENT_TYPE__INSTANCES);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__RELIABILITY);
		createEOperation(componentTypeEClass, COMPONENT_TYPE___INSTANTIATE);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__TENANT);
		createEReference(componentEClass, COMPONENT__TYPE);
		createEReference(componentEClass, COMPONENT__PARAMETERS);
		createEAttribute(componentEClass, COMPONENT__STATE);
		createEReference(componentEClass, COMPONENT__REQUIRED_INTERFACES);
		createEReference(componentEClass, COMPONENT__PROVIDED_INTERFACES);
		createEAttribute(componentEClass, COMPONENT__NAME);

		interfaceTypeEClass = createEClass(INTERFACE_TYPE);
		createEAttribute(interfaceTypeEClass, INTERFACE_TYPE__FQ_NAME);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__ARCHITECTURE);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__METHOD_SPECIFICATIONS);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__INSTANCES);

		methodSpecificationEClass = createEClass(METHOD_SPECIFICATION);
		createEAttribute(methodSpecificationEClass, METHOD_SPECIFICATION__SIGNATURE);
		createEReference(methodSpecificationEClass, METHOD_SPECIFICATION__INTERFACE_TYPE);
		createEReference(methodSpecificationEClass, METHOD_SPECIFICATION__EXCEPTIONS);
		createEReference(methodSpecificationEClass, METHOD_SPECIFICATION__PERFORMANCE_STATS);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__DEFAULT_VALUE);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__COMPONENT_TYPE);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__INSTANCES);

		tenantEClass = createEClass(TENANT);
		createEAttribute(tenantEClass, TENANT__NAME);
		createEReference(tenantEClass, TENANT__ARCHITECTURE);
		createEReference(tenantEClass, TENANT__COMPONENTS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__COMPONENT);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__TYPE);

		requiredInterfaceEClass = createEClass(REQUIRED_INTERFACE);
		createEReference(requiredInterfaceEClass, REQUIRED_INTERFACE__COMPONENT);
		createEReference(requiredInterfaceEClass, REQUIRED_INTERFACE__CONNECTOR);

		providedInterfaceEClass = createEClass(PROVIDED_INTERFACE);
		createEReference(providedInterfaceEClass, PROVIDED_INTERFACE__COMPONENT);
		createEReference(providedInterfaceEClass, PROVIDED_INTERFACE__CONNECTORS);
		createEReference(providedInterfaceEClass, PROVIDED_INTERFACE__EXCEPTIONS);
		createEReference(providedInterfaceEClass, PROVIDED_INTERFACE__PERFORMANCE_STATS);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEReference(connectorEClass, CONNECTOR__SOURCE);
		createEReference(connectorEClass, CONNECTOR__TARGET);

		exceptionEClass = createEClass(EXCEPTION);
		createEAttribute(exceptionEClass, EXCEPTION__TYPE);
		createEAttribute(exceptionEClass, EXCEPTION__MESSAGE);
		createEAttribute(exceptionEClass, EXCEPTION__STACK_TRACE);
		createEReference(exceptionEClass, EXCEPTION__INTERFACE);
		createEReference(exceptionEClass, EXCEPTION__METHOD);

		monitoredPropertyEClass = createEClass(MONITORED_PROPERTY);
		createEReference(monitoredPropertyEClass, MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT);
		createEAttribute(monitoredPropertyEClass, MONITORED_PROPERTY__NAME);
		createEAttribute(monitoredPropertyEClass, MONITORED_PROPERTY__TYPE);
		createEAttribute(monitoredPropertyEClass, MONITORED_PROPERTY__UNIT);
		createEAttribute(monitoredPropertyEClass, MONITORED_PROPERTY__DESCRIPTION);
		createEAttribute(monitoredPropertyEClass, MONITORED_PROPERTY__VALUE);
		createEReference(monitoredPropertyEClass, MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS);

		annotationsEClass = createEClass(ANNOTATIONS);
		createEReference(annotationsEClass, ANNOTATIONS__ARCHITECTURE);
		createEReference(annotationsEClass, ANNOTATIONS__ISSUES);
		createEReference(annotationsEClass, ANNOTATIONS__ADAPTATION_STRATEGIES);
		createEReference(annotationsEClass, ANNOTATIONS__WORKINGDATA);
		createEAttribute(annotationsEClass, ANNOTATIONS__UID);

		issueEClass = createEClass(ISSUE);
		createEReference(issueEClass, ISSUE__ANNOTATIONS);
		createEReference(issueEClass, ISSUE__IMPACTS);
		createEAttribute(issueEClass, ISSUE__UTILITY_DROP);
		createEReference(issueEClass, ISSUE__ASSIGNED_ADAPTATION_STRATEGIES);

		adaptationStrategyEClass = createEClass(ADAPTATION_STRATEGY);
		createEAttribute(adaptationStrategyEClass, ADAPTATION_STRATEGY__UTILITY_INCREASE);
		createEAttribute(adaptationStrategyEClass, ADAPTATION_STRATEGY__COSTS);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__ANNOTATIONS);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__ASSIGNED_ISSUES);
		createEReference(adaptationStrategyEClass, ADAPTATION_STRATEGY__INPUT_PARAMETERS);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__NAME);
		createEAttribute(annotationEClass, ANNOTATION__TYPE);
		createEAttribute(annotationEClass, ANNOTATION__UID);
		createEAttribute(annotationEClass, ANNOTATION__DESCRIPTION);

		impactEClass = createEClass(IMPACT);
		createEReference(impactEClass, IMPACT__ISSUE);
		createEReference(impactEClass, IMPACT__ARCHITECTURAL_ELEMENT);

		inputParameterEClass = createEClass(INPUT_PARAMETER);
		createEReference(inputParameterEClass, INPUT_PARAMETER__ADAPTATION_STRATEGY);
		createEReference(inputParameterEClass, INPUT_PARAMETER__ARCHITECTURAL_ELEMENT);

		workingDataEClass = createEClass(WORKING_DATA);
		createEAttribute(workingDataEClass, WORKING_DATA__UNIT);
		createEAttribute(workingDataEClass, WORKING_DATA__VALUE);
		createEReference(workingDataEClass, WORKING_DATA__ANNOTATIONS);
		createEReference(workingDataEClass, WORKING_DATA__CONCERNED_ELEMENTS);

		concernedElementEClass = createEClass(CONCERNED_ELEMENT);
		createEReference(concernedElementEClass, CONCERNED_ELEMENT__WORKINGDATA);
		createEReference(concernedElementEClass, CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT);

		performanceStatsEClass = createEClass(PERFORMANCE_STATS);
		createEAttribute(performanceStatsEClass, PERFORMANCE_STATS__MIN_TIME);
		createEAttribute(performanceStatsEClass, PERFORMANCE_STATS__MAX_TIME);
		createEAttribute(performanceStatsEClass, PERFORMANCE_STATS__TOTAL_TIME);
		createEAttribute(performanceStatsEClass, PERFORMANCE_STATS__INVOCATION_COUNT);
		createEReference(performanceStatsEClass, PERFORMANCE_STATS__INTERFACE);
		createEReference(performanceStatsEClass, PERFORMANCE_STATS__METHOD);

		// Create enums
		componentStateEEnum = createEEnum(COMPONENT_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureEClass.getESuperTypes().add(this.getArchitecturalElement());
		componentTypeEClass.getESuperTypes().add(this.getArchitecturalElement());
		componentEClass.getESuperTypes().add(this.getArchitecturalElement());
		interfaceTypeEClass.getESuperTypes().add(this.getArchitecturalElement());
		methodSpecificationEClass.getESuperTypes().add(this.getArchitecturalElement());
		parameterTypeEClass.getESuperTypes().add(this.getArchitecturalElement());
		tenantEClass.getESuperTypes().add(this.getArchitecturalElement());
		parameterEClass.getESuperTypes().add(this.getArchitecturalElement());
		interfaceEClass.getESuperTypes().add(this.getArchitecturalElement());
		requiredInterfaceEClass.getESuperTypes().add(this.getInterface());
		providedInterfaceEClass.getESuperTypes().add(this.getInterface());
		connectorEClass.getESuperTypes().add(this.getArchitecturalElement());
		exceptionEClass.getESuperTypes().add(this.getArchitecturalElement());
		monitoredPropertyEClass.getESuperTypes().add(this.getArchitecturalElement());
		issueEClass.getESuperTypes().add(this.getAnnotation());
		adaptationStrategyEClass.getESuperTypes().add(this.getAnnotation());
		impactEClass.getESuperTypes().add(this.getAnnotation());
		inputParameterEClass.getESuperTypes().add(this.getAnnotation());
		workingDataEClass.getESuperTypes().add(this.getAnnotation());
		concernedElementEClass.getESuperTypes().add(this.getAnnotation());
		performanceStatsEClass.getESuperTypes().add(this.getArchitecturalElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecture_Name(), ecorePackage.getEString(), "name", null, 0, 1, Architecture.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_ComponentTypes(), this.getComponentType(), this.getComponentType_Architecture(),
				"componentTypes", null, 0, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_InterfaceTypes(), this.getInterfaceType(), this.getInterfaceType_Architecture(),
				"interfaceTypes", null, 0, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Tenants(), this.getTenant(), this.getTenant_Architecture(), "tenants", null, 0,
				-1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecture_Annotations(), this.getAnnotations(), this.getAnnotations_Architecture(),
				"annotations", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architecturalElementEClass, ArchitecturalElement.class, "ArchitecturalElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitecturalElement_Uid(), ecorePackage.getEString(), "uid", null, 1, 1,
				ArchitecturalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitecturalElement_Criticality(), ecorePackage.getEDouble(), "criticality", null, 0, 1,
				ArchitecturalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalElement_MonitoredProperties(), this.getMonitoredProperty(),
				this.getMonitoredProperty_ArchitecturalElement(), "monitoredProperties", null, 0, -1,
				ArchitecturalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalElement_IssueImpacts(), this.getImpact(), this.getImpact_ArchitecturalElement(),
				"issueImpacts", null, 0, -1, ArchitecturalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalElement_StrategyInputs(), this.getInputParameter(),
				this.getInputParameter_ArchitecturalElement(), "strategyInputs", null, 0, -1,
				ArchitecturalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalElement_WorkingDataElements(), this.getConcernedElement(),
				this.getConcernedElement_ArchitecturalElement(), "workingDataElements", null, 0, -1,
				ArchitecturalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Architecture(), this.getArchitecture(), this.getArchitecture_ComponentTypes(),
				"architecture", null, 1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_RequiredInterfaceTypes(), this.getInterfaceType(),
				this.getInterfaceType_RequiringComponentTypes(), "requiredInterfaceTypes", null, 0, -1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_ProvidedInterfaceTypes(), this.getInterfaceType(),
				this.getInterfaceType_ProvidingComponentTypes(), "providedInterfaceTypes", null, 1, -1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_ParameterTypes(), this.getParameterType(),
				this.getParameterType_ComponentType(), "parameterTypes", null, 0, -1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Instances(), this.getComponent(), this.getComponent_Type(), "instances", null,
				0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_Reliability(), ecorePackage.getEDouble(), "reliability", null, 0, 1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getComponentType__Instantiate(), this.getComponent(), "instantiate", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Tenant(), this.getTenant(), this.getTenant_Components(), "tenant", null, 1, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Type(), this.getComponentType(), this.getComponentType_Instances(), "type", null, 1,
				1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Parameters(), this.getParameter(), this.getParameter_Component(), "parameters",
				null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_State(), this.getComponentState(), "state", null, 1, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_RequiredInterfaces(), this.getRequiredInterface(),
				this.getRequiredInterface_Component(), "requiredInterfaces", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvidedInterfaces(), this.getProvidedInterface(),
				this.getProvidedInterface_Component(), "providedInterfaces", null, 1, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceTypeEClass, InterfaceType.class, "InterfaceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceType_FqName(), ecorePackage.getEString(), "fqName", null, 1, 1, InterfaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceType_Architecture(), this.getArchitecture(), this.getArchitecture_InterfaceTypes(),
				"architecture", null, 1, 1, InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceType_RequiringComponentTypes(), this.getComponentType(),
				this.getComponentType_RequiredInterfaceTypes(), "requiringComponentTypes", null, 0, -1,
				InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceType_ProvidingComponentTypes(), this.getComponentType(),
				this.getComponentType_ProvidedInterfaceTypes(), "providingComponentTypes", null, 0, -1,
				InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceType_MethodSpecifications(), this.getMethodSpecification(),
				this.getMethodSpecification_InterfaceType(), "methodSpecifications", null, 0, -1, InterfaceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceType_Instances(), this.getInterface(), this.getInterface_Type(), "instances", null,
				0, -1, InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodSpecificationEClass, MethodSpecification.class, "MethodSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodSpecification_Signature(), ecorePackage.getEString(), "signature", null, 1, 1,
				MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodSpecification_InterfaceType(), this.getInterfaceType(),
				this.getInterfaceType_MethodSpecifications(), "interfaceType", null, 1, 1, MethodSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodSpecification_Exceptions(), this.getException(), this.getException_Method(),
				"exceptions", null, 0, -1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodSpecification_PerformanceStats(), this.getPerformanceStats(),
				this.getPerformanceStats_Method(), "performanceStats", null, 0, -1, MethodSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParameterType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Type(), ecorePackage.getEString(), "type", null, 1, 1, ParameterType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1,
				ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getParameterType_ComponentType(), this.getComponentType(),
				this.getComponentType_ParameterTypes(), "componentType", null, 1, 1, ParameterType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getParameterType_Instances(), this.getParameter(), this.getParameter_Type(), "instances", null,
				0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tenantEClass, Tenant.class, "Tenant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTenant_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tenant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTenant_Architecture(), this.getArchitecture(), this.getArchitecture_Tenants(), "architecture",
				null, 1, 1, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTenant_Components(), this.getComponent(), this.getComponent_Tenant(), "components", null, 0,
				-1, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getParameterType(), this.getParameterType_Instances(), "type", null, 1,
				1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Component(), this.getComponent(), this.getComponent_Parameters(), "component", null,
				1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Type(), this.getInterfaceType(), this.getInterfaceType_Instances(), "type", null, 1,
				1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfaceEClass, RequiredInterface.class, "RequiredInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredInterface_Component(), this.getComponent(), this.getComponent_RequiredInterfaces(),
				"component", null, 1, 1, RequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredInterface_Connector(), this.getConnector(), this.getConnector_Source(), "connector",
				null, 0, 1, RequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceEClass, ProvidedInterface.class, "ProvidedInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedInterface_Component(), this.getComponent(), this.getComponent_ProvidedInterfaces(),
				"component", null, 1, 1, ProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedInterface_Connectors(), this.getConnector(), this.getConnector_Target(), "connectors",
				null, 0, -1, ProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedInterface_Exceptions(), this.getException(), this.getException_Interface(),
				"exceptions", null, 0, -1, ProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedInterface_PerformanceStats(), this.getPerformanceStats(),
				this.getPerformanceStats_Interface(), "performanceStats", null, 0, -1, ProvidedInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Source(), this.getRequiredInterface(), this.getRequiredInterface_Connector(),
				"source", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Target(), this.getProvidedInterface(), this.getProvidedInterface_Connectors(),
				"target", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, de.mdelab.comparch.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getException_Type(), ecorePackage.getEString(), "type", null, 1, 1,
				de.mdelab.comparch.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getException_Message(), ecorePackage.getEString(), "message", null, 0, 1,
				de.mdelab.comparch.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getException_StackTrace(), ecorePackage.getEString(), "stackTrace", null, 0, 1,
				de.mdelab.comparch.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getException_Interface(), this.getProvidedInterface(), this.getProvidedInterface_Exceptions(),
				"interface", null, 1, 1, de.mdelab.comparch.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getException_Method(), this.getMethodSpecification(), this.getMethodSpecification_Exceptions(),
				"method", null, 0, 1, de.mdelab.comparch.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitoredPropertyEClass, MonitoredProperty.class, "MonitoredProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitoredProperty_ArchitecturalElement(), this.getArchitecturalElement(),
				this.getArchitecturalElement_MonitoredProperties(), "architecturalElement", null, 1, 1,
				MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1,
				MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredProperty_Unit(), ecorePackage.getEString(), "unit", null, 1, 1,
				MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoredProperty_RelatedArchitecturalElements(), this.getArchitecturalElement(), null,
				"relatedArchitecturalElements", null, 0, -1, MonitoredProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationsEClass, Annotations.class, "Annotations", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotations_Architecture(), this.getArchitecture(), this.getArchitecture_Annotations(),
				"architecture", null, 1, 1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotations_Issues(), this.getIssue(), this.getIssue_Annotations(), "issues", null, 0, -1,
				Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotations_AdaptationStrategies(), this.getAdaptationStrategy(),
				this.getAdaptationStrategy_Annotations(), "adaptationStrategies", null, 0, -1, Annotations.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotations_Workingdata(), this.getWorkingData(), this.getWorkingData_Annotations(),
				"workingdata", null, 0, -1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotations_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Annotations.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssue_Annotations(), this.getAnnotations(), this.getAnnotations_Issues(), "annotations", null,
				1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Impacts(), this.getImpact(), this.getImpact_Issue(), "impacts", null, 1, -1,
				Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_UtilityDrop(), ecorePackage.getEDouble(), "utilityDrop", null, 0, 1, Issue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_AssignedAdaptationStrategies(), this.getAdaptationStrategy(),
				this.getAdaptationStrategy_AssignedIssues(), "assignedAdaptationStrategies", null, 0, -1, Issue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationStrategyEClass, AdaptationStrategy.class, "AdaptationStrategy", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdaptationStrategy_UtilityIncrease(), ecorePackage.getEDouble(), "utilityIncrease", null, 0,
				1, AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptationStrategy_Costs(), ecorePackage.getEDouble(), "costs", null, 0, 1,
				AdaptationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationStrategy_Annotations(), this.getAnnotations(),
				this.getAnnotations_AdaptationStrategies(), "annotations", null, 1, 1, AdaptationStrategy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationStrategy_AssignedIssues(), this.getIssue(),
				this.getIssue_AssignedAdaptationStrategies(), "assignedIssues", null, 1, -1, AdaptationStrategy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationStrategy_InputParameters(), this.getInputParameter(),
				this.getInputParameter_AdaptationStrategy(), "inputParameters", null, 0, -1, AdaptationStrategy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Annotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Type(), ecorePackage.getEString(), "type", null, 1, 1, Annotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Uid(), ecorePackage.getEString(), "uid", null, 1, 1, Annotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(impactEClass, Impact.class, "Impact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpact_Issue(), this.getIssue(), this.getIssue_Impacts(), "issue", null, 1, 1, Impact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpact_ArchitecturalElement(), this.getArchitecturalElement(),
				this.getArchitecturalElement_IssueImpacts(), "architecturalElement", null, 1, 1, Impact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParameterEClass, InputParameter.class, "InputParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParameter_AdaptationStrategy(), this.getAdaptationStrategy(),
				this.getAdaptationStrategy_InputParameters(), "adaptationStrategy", null, 1, 1, InputParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputParameter_ArchitecturalElement(), this.getArchitecturalElement(),
				this.getArchitecturalElement_StrategyInputs(), "architecturalElement", null, 1, 1, InputParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workingDataEClass, WorkingData.class, "WorkingData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkingData_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, WorkingData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkingData_Value(), ecorePackage.getEString(), "value", null, 0, 1, WorkingData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkingData_Annotations(), this.getAnnotations(), this.getAnnotations_Workingdata(),
				"annotations", null, 1, 1, WorkingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkingData_ConcernedElements(), this.getConcernedElement(),
				this.getConcernedElement_Workingdata(), "concernedElements", null, 0, -1, WorkingData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernedElementEClass, ConcernedElement.class, "ConcernedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernedElement_Workingdata(), this.getWorkingData(),
				this.getWorkingData_ConcernedElements(), "workingdata", null, 1, 1, ConcernedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcernedElement_ArchitecturalElement(), this.getArchitecturalElement(),
				this.getArchitecturalElement_WorkingDataElements(), "architecturalElement", null, 1, 1,
				ConcernedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceStatsEClass, PerformanceStats.class, "PerformanceStats", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceStats_MinTime(), ecorePackage.getELong(), "minTime", null, 0, 1,
				PerformanceStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceStats_MaxTime(), ecorePackage.getELong(), "maxTime", null, 0, 1,
				PerformanceStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceStats_TotalTime(), ecorePackage.getELong(), "totalTime", null, 0, 1,
				PerformanceStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformanceStats_InvocationCount(), ecorePackage.getELong(), "invocationCount", null, 0, 1,
				PerformanceStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceStats_Interface(), this.getProvidedInterface(),
				this.getProvidedInterface_PerformanceStats(), "interface", null, 1, 1, PerformanceStats.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceStats_Method(), this.getMethodSpecification(),
				this.getMethodSpecification_PerformanceStats(), "method", null, 1, 1, PerformanceStats.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentStateEEnum, ComponentState.class, "ComponentState");
		addEEnumLiteral(componentStateEEnum, ComponentState.UNDEPLOYED);
		addEEnumLiteral(componentStateEEnum, ComponentState.DEPLOYED);
		addEEnumLiteral(componentStateEEnum, ComponentState.STARTED);
		addEEnumLiteral(componentStateEEnum, ComponentState.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //ComparchPackageImpl
