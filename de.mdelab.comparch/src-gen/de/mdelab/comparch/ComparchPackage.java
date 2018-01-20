/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.mdelab.comparch.ComparchFactory
 * @model kind="package"
 * @generated
 */
public interface ComparchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comparch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/comparch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comparch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparchPackage eINSTANCE = de.mdelab.comparch.impl.ComparchPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ArchitecturalElementImpl <em>Architectural Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ArchitecturalElementImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getArchitecturalElement()
	 * @generated
	 */
	int ARCHITECTURAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__UID = 0;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__CRITICALITY = 1;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS = 3;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS = 4;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Architectural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Architectural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ArchitectureImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__COMPONENT_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__INTERFACE_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tenants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__TENANTS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ANNOTATIONS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ComponentTypeImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ARCHITECTURE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Interface Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REQUIRED_INTERFACE_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Interface Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROVIDED_INTERFACE_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PARAMETER_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INSTANCES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__RELIABILITY = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Instantiate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE___INSTANTIATE = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ComponentImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TENANT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETERS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_INTERFACES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_INTERFACES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.InterfaceTypeImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Fq Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__FQ_NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ARCHITECTURE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requiring Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Providing Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__METHOD_SPECIFICATIONS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__INSTANCES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.MethodSpecificationImpl <em>Method Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.MethodSpecificationImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getMethodSpecification()
	 * @generated
	 */
	int METHOD_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__SIGNATURE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__INTERFACE_TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__EXCEPTIONS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Performance Stats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__PERFORMANCE_STATS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Method Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ParameterTypeImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DEFAULT_VALUE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__COMPONENT_TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__INSTANCES = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.TenantImpl <em>Tenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.TenantImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getTenant()
	 * @generated
	 */
	int TENANT = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__ARCHITECTURE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__COMPONENTS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ParameterImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMPONENT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.InterfaceImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.RequiredInterfaceImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__UID = INTERFACE__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__CRITICALITY = INTERFACE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__MONITORED_PROPERTIES = INTERFACE__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__ISSUE_IMPACTS = INTERFACE__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__STRATEGY_INPUTS = INTERFACE__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__WORKING_DATA_ELEMENTS = INTERFACE__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__TYPE = INTERFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__COMPONENT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__CONNECTOR = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ProvidedInterfaceImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__UID = INTERFACE__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__CRITICALITY = INTERFACE__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__MONITORED_PROPERTIES = INTERFACE__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__ISSUE_IMPACTS = INTERFACE__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__STRATEGY_INPUTS = INTERFACE__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__WORKING_DATA_ELEMENTS = INTERFACE__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__TYPE = INTERFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__COMPONENT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__CONNECTORS = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__EXCEPTIONS = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Performance Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__PERFORMANCE_STATS = INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ConnectorImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ExceptionImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 13;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__MESSAGE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__STACK_TRACE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__INTERFACE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__METHOD = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.MonitoredPropertyImpl <em>Monitored Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.MonitoredPropertyImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getMonitoredProperty()
	 * @generated
	 */
	int MONITORED_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Architectural Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__NAME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__TYPE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__UNIT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__DESCRIPTION = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__VALUE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Related Architectural Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Monitored Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Monitored Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_PROPERTY_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.AnnotationsImpl <em>Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.AnnotationsImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getAnnotations()
	 * @generated
	 */
	int ANNOTATIONS = 15;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__ISSUES = 1;

	/**
	 * The feature id for the '<em><b>Adaptation Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__ADAPTATION_STRATEGIES = 2;

	/**
	 * The feature id for the '<em><b>Workingdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__WORKINGDATA = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS__UID = 4;

	/**
	 * The number of structural features of the '<em>Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.AnnotationImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__UID = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.IssueImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TYPE = ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UID = ANNOTATION__UID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ANNOTATIONS = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IMPACTS = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Utility Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UTILITY_DROP = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Adaptation Strategies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNED_ADAPTATION_STRATEGIES = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.AdaptationStrategyImpl <em>Adaptation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.AdaptationStrategyImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getAdaptationStrategy()
	 * @generated
	 */
	int ADAPTATION_STRATEGY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__TYPE = ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__UID = ANNOTATION__UID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Utility Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__UTILITY_INCREASE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__COSTS = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__ANNOTATIONS = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__ASSIGNED_ISSUES = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY__INPUT_PARAMETERS = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Adaptation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Adaptation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_STRATEGY_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ImpactImpl <em>Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ImpactImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getImpact()
	 * @generated
	 */
	int IMPACT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__TYPE = ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__UID = ANNOTATION__UID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__ISSUE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architectural Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__ARCHITECTURAL_ELEMENT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.InputParameterImpl <em>Input Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.InputParameterImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getInputParameter()
	 * @generated
	 */
	int INPUT_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__TYPE = ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__UID = ANNOTATION__UID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Adaptation Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__ADAPTATION_STRATEGY = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architectural Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__ARCHITECTURAL_ELEMENT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.WorkingDataImpl <em>Working Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.WorkingDataImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getWorkingData()
	 * @generated
	 */
	int WORKING_DATA = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__TYPE = ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__UID = ANNOTATION__UID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__UNIT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__VALUE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__ANNOTATIONS = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concerned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA__CONCERNED_ELEMENTS = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Working Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Working Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DATA_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.ConcernedElementImpl <em>Concerned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.ConcernedElementImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getConcernedElement()
	 * @generated
	 */
	int CONCERNED_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT__TYPE = ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT__UID = ANNOTATION__UID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Workingdata</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT__WORKINGDATA = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architectural Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concerned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concerned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERNED_ELEMENT_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.impl.PerformanceStatsImpl <em>Performance Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.impl.PerformanceStatsImpl
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getPerformanceStats()
	 * @generated
	 */
	int PERFORMANCE_STATS = 23;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__UID = ARCHITECTURAL_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__CRITICALITY = ARCHITECTURAL_ELEMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__MONITORED_PROPERTIES = ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Issue Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__ISSUE_IMPACTS = ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS;

	/**
	 * The feature id for the '<em><b>Strategy Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__STRATEGY_INPUTS = ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS;

	/**
	 * The feature id for the '<em><b>Working Data Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__WORKING_DATA_ELEMENTS = ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__MIN_TIME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__MAX_TIME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__TOTAL_TIME = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__INVOCATION_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__INTERFACE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS__METHOD = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Performance Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Performance Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_STATS_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.comparch.ComponentState <em>Component State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.comparch.ComponentState
	 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getComponentState()
	 * @generated
	 */
	int COMPONENT_STATE = 24;

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see de.mdelab.comparch.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.Architecture#getName()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Architecture#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see de.mdelab.comparch.Architecture#getComponentTypes()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Architecture#getInterfaceTypes <em>Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Types</em>'.
	 * @see de.mdelab.comparch.Architecture#getInterfaceTypes()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_InterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Architecture#getTenants <em>Tenants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tenants</em>'.
	 * @see de.mdelab.comparch.Architecture#getTenants()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Tenants();

	/**
	 * Returns the meta object for the containment reference '{@link de.mdelab.comparch.Architecture#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see de.mdelab.comparch.Architecture#getAnnotations()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Annotations();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.ArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Element</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement
	 * @generated
	 */
	EClass getArchitecturalElement();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ArchitecturalElement#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement#getUid()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EAttribute getArchitecturalElement_Uid();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ArchitecturalElement#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement#getCriticality()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EAttribute getArchitecturalElement_Criticality();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.ArchitecturalElement#getMonitoredProperties <em>Monitored Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitored Properties</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement#getMonitoredProperties()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_MonitoredProperties();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ArchitecturalElement#getIssueImpacts <em>Issue Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issue Impacts</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement#getIssueImpacts()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_IssueImpacts();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ArchitecturalElement#getStrategyInputs <em>Strategy Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Inputs</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement#getStrategyInputs()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_StrategyInputs();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ArchitecturalElement#getWorkingDataElements <em>Working Data Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Working Data Elements</em>'.
	 * @see de.mdelab.comparch.ArchitecturalElement#getWorkingDataElements()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_WorkingDataElements();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see de.mdelab.comparch.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.ComponentType#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Architecture</em>'.
	 * @see de.mdelab.comparch.ComponentType#getArchitecture()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Architecture();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ComponentType#getRequiredInterfaceTypes <em>Required Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interface Types</em>'.
	 * @see de.mdelab.comparch.ComponentType#getRequiredInterfaceTypes()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_RequiredInterfaceTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ComponentType#getProvidedInterfaceTypes <em>Provided Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interface Types</em>'.
	 * @see de.mdelab.comparch.ComponentType#getProvidedInterfaceTypes()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ProvidedInterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.ComponentType#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Types</em>'.
	 * @see de.mdelab.comparch.ComponentType#getParameterTypes()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ParameterTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see de.mdelab.comparch.ComponentType#getInstances()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Instances();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ComponentType#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see de.mdelab.comparch.ComponentType#getReliability()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Reliability();

	/**
	 * Returns the meta object for the '{@link de.mdelab.comparch.ComponentType#instantiate() <em>Instantiate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instantiate</em>' operation.
	 * @see de.mdelab.comparch.ComponentType#instantiate()
	 * @generated
	 */
	EOperation getComponentType__Instantiate();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.mdelab.comparch.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Component#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tenant</em>'.
	 * @see de.mdelab.comparch.Component#getTenant()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Tenant();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.mdelab.comparch.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Component#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.mdelab.comparch.Component#getParameters()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Component#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.mdelab.comparch.Component#getState()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_State();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Component#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Interfaces</em>'.
	 * @see de.mdelab.comparch.Component#getRequiredInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Component#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see de.mdelab.comparch.Component#getProvidedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see de.mdelab.comparch.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.InterfaceType#getFqName <em>Fq Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fq Name</em>'.
	 * @see de.mdelab.comparch.InterfaceType#getFqName()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EAttribute getInterfaceType_FqName();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.InterfaceType#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Architecture</em>'.
	 * @see de.mdelab.comparch.InterfaceType#getArchitecture()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Architecture();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.InterfaceType#getRequiringComponentTypes <em>Requiring Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiring Component Types</em>'.
	 * @see de.mdelab.comparch.InterfaceType#getRequiringComponentTypes()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_RequiringComponentTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.InterfaceType#getProvidingComponentTypes <em>Providing Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providing Component Types</em>'.
	 * @see de.mdelab.comparch.InterfaceType#getProvidingComponentTypes()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_ProvidingComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.InterfaceType#getMethodSpecifications <em>Method Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Specifications</em>'.
	 * @see de.mdelab.comparch.InterfaceType#getMethodSpecifications()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_MethodSpecifications();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.InterfaceType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see de.mdelab.comparch.InterfaceType#getInstances()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Instances();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.MethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Specification</em>'.
	 * @see de.mdelab.comparch.MethodSpecification
	 * @generated
	 */
	EClass getMethodSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.MethodSpecification#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see de.mdelab.comparch.MethodSpecification#getSignature()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EAttribute getMethodSpecification_Signature();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.MethodSpecification#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface Type</em>'.
	 * @see de.mdelab.comparch.MethodSpecification#getInterfaceType()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EReference getMethodSpecification_InterfaceType();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.MethodSpecification#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exceptions</em>'.
	 * @see de.mdelab.comparch.MethodSpecification#getExceptions()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EReference getMethodSpecification_Exceptions();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.MethodSpecification#getPerformanceStats <em>Performance Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performance Stats</em>'.
	 * @see de.mdelab.comparch.MethodSpecification#getPerformanceStats()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EReference getMethodSpecification_PerformanceStats();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see de.mdelab.comparch.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ParameterType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.mdelab.comparch.ParameterType#getType()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.ParameterType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.mdelab.comparch.ParameterType#getDefaultValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_DefaultValue();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.ParameterType#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Type</em>'.
	 * @see de.mdelab.comparch.ParameterType#getComponentType()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_ComponentType();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ParameterType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see de.mdelab.comparch.ParameterType#getInstances()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_Instances();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Tenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tenant</em>'.
	 * @see de.mdelab.comparch.Tenant
	 * @generated
	 */
	EClass getTenant();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Tenant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.Tenant#getName()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Tenant#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Architecture</em>'.
	 * @see de.mdelab.comparch.Tenant#getArchitecture()
	 * @see #getTenant()
	 * @generated
	 */
	EReference getTenant_Architecture();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Tenant#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see de.mdelab.comparch.Tenant#getComponents()
	 * @see #getTenant()
	 * @generated
	 */
	EReference getTenant_Components();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.mdelab.comparch.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.mdelab.comparch.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.mdelab.comparch.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Parameter#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see de.mdelab.comparch.Parameter#getComponent()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Component();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see de.mdelab.comparch.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.Interface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.mdelab.comparch.Interface#getType()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Type();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see de.mdelab.comparch.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.RequiredInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see de.mdelab.comparch.RequiredInterface#getComponent()
	 * @see #getRequiredInterface()
	 * @generated
	 */
	EReference getRequiredInterface_Component();

	/**
	 * Returns the meta object for the containment reference '{@link de.mdelab.comparch.RequiredInterface#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see de.mdelab.comparch.RequiredInterface#getConnector()
	 * @see #getRequiredInterface()
	 * @generated
	 */
	EReference getRequiredInterface_Connector();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see de.mdelab.comparch.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.ProvidedInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see de.mdelab.comparch.ProvidedInterface#getComponent()
	 * @see #getProvidedInterface()
	 * @generated
	 */
	EReference getProvidedInterface_Component();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.ProvidedInterface#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see de.mdelab.comparch.ProvidedInterface#getConnectors()
	 * @see #getProvidedInterface()
	 * @generated
	 */
	EReference getProvidedInterface_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.ProvidedInterface#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see de.mdelab.comparch.ProvidedInterface#getExceptions()
	 * @see #getProvidedInterface()
	 * @generated
	 */
	EReference getProvidedInterface_Exceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.ProvidedInterface#getPerformanceStats <em>Performance Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Stats</em>'.
	 * @see de.mdelab.comparch.ProvidedInterface#getPerformanceStats()
	 * @see #getProvidedInterface()
	 * @generated
	 */
	EReference getProvidedInterface_PerformanceStats();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.mdelab.comparch.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see de.mdelab.comparch.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.mdelab.comparch.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see de.mdelab.comparch.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Exception#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.mdelab.comparch.Exception#getType()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Exception#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.mdelab.comparch.Exception#getMessage()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Exception#getStackTrace <em>Stack Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Trace</em>'.
	 * @see de.mdelab.comparch.Exception#getStackTrace()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_StackTrace();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Exception#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see de.mdelab.comparch.Exception#getInterface()
	 * @see #getException()
	 * @generated
	 */
	EReference getException_Interface();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.Exception#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see de.mdelab.comparch.Exception#getMethod()
	 * @see #getException()
	 * @generated
	 */
	EReference getException_Method();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.MonitoredProperty <em>Monitored Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitored Property</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty
	 * @generated
	 */
	EClass getMonitoredProperty();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.MonitoredProperty#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Architectural Element</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getArchitecturalElement()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EReference getMonitoredProperty_ArchitecturalElement();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.MonitoredProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getName()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EAttribute getMonitoredProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.MonitoredProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getType()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EAttribute getMonitoredProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.MonitoredProperty#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getUnit()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EAttribute getMonitoredProperty_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.MonitoredProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getDescription()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EAttribute getMonitoredProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.MonitoredProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getValue()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EAttribute getMonitoredProperty_Value();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.MonitoredProperty#getRelatedArchitecturalElements <em>Related Architectural Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Architectural Elements</em>'.
	 * @see de.mdelab.comparch.MonitoredProperty#getRelatedArchitecturalElements()
	 * @see #getMonitoredProperty()
	 * @generated
	 */
	EReference getMonitoredProperty_RelatedArchitecturalElements();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Annotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations</em>'.
	 * @see de.mdelab.comparch.Annotations
	 * @generated
	 */
	EClass getAnnotations();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Annotations#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Architecture</em>'.
	 * @see de.mdelab.comparch.Annotations#getArchitecture()
	 * @see #getAnnotations()
	 * @generated
	 */
	EReference getAnnotations_Architecture();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Annotations#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see de.mdelab.comparch.Annotations#getIssues()
	 * @see #getAnnotations()
	 * @generated
	 */
	EReference getAnnotations_Issues();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Annotations#getAdaptationStrategies <em>Adaptation Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptation Strategies</em>'.
	 * @see de.mdelab.comparch.Annotations#getAdaptationStrategies()
	 * @see #getAnnotations()
	 * @generated
	 */
	EReference getAnnotations_AdaptationStrategies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Annotations#getWorkingdata <em>Workingdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workingdata</em>'.
	 * @see de.mdelab.comparch.Annotations#getWorkingdata()
	 * @see #getAnnotations()
	 * @generated
	 */
	EReference getAnnotations_Workingdata();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Annotations#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see de.mdelab.comparch.Annotations#getUid()
	 * @see #getAnnotations()
	 * @generated
	 */
	EAttribute getAnnotations_Uid();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see de.mdelab.comparch.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Issue#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotations</em>'.
	 * @see de.mdelab.comparch.Issue#getAnnotations()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.Issue#getImpacts <em>Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impacts</em>'.
	 * @see de.mdelab.comparch.Issue#getImpacts()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Impacts();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Issue#getUtilityDrop <em>Utility Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utility Drop</em>'.
	 * @see de.mdelab.comparch.Issue#getUtilityDrop()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_UtilityDrop();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.Issue#getAssignedAdaptationStrategies <em>Assigned Adaptation Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Adaptation Strategies</em>'.
	 * @see de.mdelab.comparch.Issue#getAssignedAdaptationStrategies()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_AssignedAdaptationStrategies();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.AdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Strategy</em>'.
	 * @see de.mdelab.comparch.AdaptationStrategy
	 * @generated
	 */
	EClass getAdaptationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.AdaptationStrategy#getUtilityIncrease <em>Utility Increase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utility Increase</em>'.
	 * @see de.mdelab.comparch.AdaptationStrategy#getUtilityIncrease()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EAttribute getAdaptationStrategy_UtilityIncrease();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.AdaptationStrategy#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs</em>'.
	 * @see de.mdelab.comparch.AdaptationStrategy#getCosts()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EAttribute getAdaptationStrategy_Costs();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.AdaptationStrategy#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotations</em>'.
	 * @see de.mdelab.comparch.AdaptationStrategy#getAnnotations()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_Annotations();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.comparch.AdaptationStrategy#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Issues</em>'.
	 * @see de.mdelab.comparch.AdaptationStrategy#getAssignedIssues()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_AssignedIssues();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.AdaptationStrategy#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see de.mdelab.comparch.AdaptationStrategy#getInputParameters()
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	EReference getAdaptationStrategy_InputParameters();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see de.mdelab.comparch.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.comparch.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Annotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.mdelab.comparch.Annotation#getType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Annotation#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see de.mdelab.comparch.Annotation#getUid()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Uid();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.Annotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.mdelab.comparch.Annotation#getDescription()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Description();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact</em>'.
	 * @see de.mdelab.comparch.Impact
	 * @generated
	 */
	EClass getImpact();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.Impact#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Issue</em>'.
	 * @see de.mdelab.comparch.Impact#getIssue()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_Issue();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.Impact#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architectural Element</em>'.
	 * @see de.mdelab.comparch.Impact#getArchitecturalElement()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_ArchitecturalElement();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter</em>'.
	 * @see de.mdelab.comparch.InputParameter
	 * @generated
	 */
	EClass getInputParameter();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.InputParameter#getAdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Adaptation Strategy</em>'.
	 * @see de.mdelab.comparch.InputParameter#getAdaptationStrategy()
	 * @see #getInputParameter()
	 * @generated
	 */
	EReference getInputParameter_AdaptationStrategy();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.InputParameter#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architectural Element</em>'.
	 * @see de.mdelab.comparch.InputParameter#getArchitecturalElement()
	 * @see #getInputParameter()
	 * @generated
	 */
	EReference getInputParameter_ArchitecturalElement();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.WorkingData <em>Working Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Data</em>'.
	 * @see de.mdelab.comparch.WorkingData
	 * @generated
	 */
	EClass getWorkingData();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.WorkingData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.mdelab.comparch.WorkingData#getUnit()
	 * @see #getWorkingData()
	 * @generated
	 */
	EAttribute getWorkingData_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.WorkingData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.mdelab.comparch.WorkingData#getValue()
	 * @see #getWorkingData()
	 * @generated
	 */
	EAttribute getWorkingData_Value();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.WorkingData#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotations</em>'.
	 * @see de.mdelab.comparch.WorkingData#getAnnotations()
	 * @see #getWorkingData()
	 * @generated
	 */
	EReference getWorkingData_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.comparch.WorkingData#getConcernedElements <em>Concerned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerned Elements</em>'.
	 * @see de.mdelab.comparch.WorkingData#getConcernedElements()
	 * @see #getWorkingData()
	 * @generated
	 */
	EReference getWorkingData_ConcernedElements();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.ConcernedElement <em>Concerned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concerned Element</em>'.
	 * @see de.mdelab.comparch.ConcernedElement
	 * @generated
	 */
	EClass getConcernedElement();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.ConcernedElement#getWorkingdata <em>Workingdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Workingdata</em>'.
	 * @see de.mdelab.comparch.ConcernedElement#getWorkingdata()
	 * @see #getConcernedElement()
	 * @generated
	 */
	EReference getConcernedElement_Workingdata();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.ConcernedElement#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architectural Element</em>'.
	 * @see de.mdelab.comparch.ConcernedElement#getArchitecturalElement()
	 * @see #getConcernedElement()
	 * @generated
	 */
	EReference getConcernedElement_ArchitecturalElement();

	/**
	 * Returns the meta object for class '{@link de.mdelab.comparch.PerformanceStats <em>Performance Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Stats</em>'.
	 * @see de.mdelab.comparch.PerformanceStats
	 * @generated
	 */
	EClass getPerformanceStats();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.PerformanceStats#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see de.mdelab.comparch.PerformanceStats#getMinTime()
	 * @see #getPerformanceStats()
	 * @generated
	 */
	EAttribute getPerformanceStats_MinTime();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.PerformanceStats#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see de.mdelab.comparch.PerformanceStats#getMaxTime()
	 * @see #getPerformanceStats()
	 * @generated
	 */
	EAttribute getPerformanceStats_MaxTime();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.PerformanceStats#getTotalTime <em>Total Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time</em>'.
	 * @see de.mdelab.comparch.PerformanceStats#getTotalTime()
	 * @see #getPerformanceStats()
	 * @generated
	 */
	EAttribute getPerformanceStats_TotalTime();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.comparch.PerformanceStats#getInvocationCount <em>Invocation Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invocation Count</em>'.
	 * @see de.mdelab.comparch.PerformanceStats#getInvocationCount()
	 * @see #getPerformanceStats()
	 * @generated
	 */
	EAttribute getPerformanceStats_InvocationCount();

	/**
	 * Returns the meta object for the container reference '{@link de.mdelab.comparch.PerformanceStats#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see de.mdelab.comparch.PerformanceStats#getInterface()
	 * @see #getPerformanceStats()
	 * @generated
	 */
	EReference getPerformanceStats_Interface();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.comparch.PerformanceStats#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see de.mdelab.comparch.PerformanceStats#getMethod()
	 * @see #getPerformanceStats()
	 * @generated
	 */
	EReference getPerformanceStats_Method();

	/**
	 * Returns the meta object for enum '{@link de.mdelab.comparch.ComponentState <em>Component State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component State</em>'.
	 * @see de.mdelab.comparch.ComponentState
	 * @generated
	 */
	EEnum getComponentState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComparchFactory getComparchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ArchitectureImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__COMPONENT_TYPES = eINSTANCE.getArchitecture_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__INTERFACE_TYPES = eINSTANCE.getArchitecture_InterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Tenants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__TENANTS = eINSTANCE.getArchitecture_Tenants();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__ANNOTATIONS = eINSTANCE.getArchitecture_Annotations();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ArchitecturalElementImpl <em>Architectural Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ArchitecturalElementImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getArchitecturalElement()
		 * @generated
		 */
		EClass ARCHITECTURAL_ELEMENT = eINSTANCE.getArchitecturalElement();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_ELEMENT__UID = eINSTANCE.getArchitecturalElement_Uid();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_ELEMENT__CRITICALITY = eINSTANCE.getArchitecturalElement_Criticality();

		/**
		 * The meta object literal for the '<em><b>Monitored Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES = eINSTANCE
				.getArchitecturalElement_MonitoredProperties();

		/**
		 * The meta object literal for the '<em><b>Issue Impacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS = eINSTANCE.getArchitecturalElement_IssueImpacts();

		/**
		 * The meta object literal for the '<em><b>Strategy Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS = eINSTANCE.getArchitecturalElement_StrategyInputs();

		/**
		 * The meta object literal for the '<em><b>Working Data Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS = eINSTANCE
				.getArchitecturalElement_WorkingDataElements();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ComponentTypeImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__NAME = eINSTANCE.getComponentType_Name();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__ARCHITECTURE = eINSTANCE.getComponentType_Architecture();

		/**
		 * The meta object literal for the '<em><b>Required Interface Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__REQUIRED_INTERFACE_TYPES = eINSTANCE.getComponentType_RequiredInterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Provided Interface Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PROVIDED_INTERFACE_TYPES = eINSTANCE.getComponentType_ProvidedInterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PARAMETER_TYPES = eINSTANCE.getComponentType_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INSTANCES = eINSTANCE.getComponentType_Instances();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__RELIABILITY = eINSTANCE.getComponentType_Reliability();

		/**
		 * The meta object literal for the '<em><b>Instantiate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_TYPE___INSTANTIATE = eINSTANCE.getComponentType__Instantiate();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ComponentImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TENANT = eINSTANCE.getComponent_Tenant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARAMETERS = eINSTANCE.getComponent_Parameters();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STATE = eINSTANCE.getComponent_State();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRED_INTERFACES = eINSTANCE.getComponent_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_INTERFACES = eINSTANCE.getComponent_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.InterfaceTypeImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getInterfaceType()
		 * @generated
		 */
		EClass INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Fq Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TYPE__FQ_NAME = eINSTANCE.getInterfaceType_FqName();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__ARCHITECTURE = eINSTANCE.getInterfaceType_Architecture();

		/**
		 * The meta object literal for the '<em><b>Requiring Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES = eINSTANCE.getInterfaceType_RequiringComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Providing Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES = eINSTANCE.getInterfaceType_ProvidingComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Method Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__METHOD_SPECIFICATIONS = eINSTANCE.getInterfaceType_MethodSpecifications();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__INSTANCES = eINSTANCE.getInterfaceType_Instances();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.MethodSpecificationImpl <em>Method Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.MethodSpecificationImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getMethodSpecification()
		 * @generated
		 */
		EClass METHOD_SPECIFICATION = eINSTANCE.getMethodSpecification();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SPECIFICATION__SIGNATURE = eINSTANCE.getMethodSpecification_Signature();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SPECIFICATION__INTERFACE_TYPE = eINSTANCE.getMethodSpecification_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SPECIFICATION__EXCEPTIONS = eINSTANCE.getMethodSpecification_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Performance Stats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SPECIFICATION__PERFORMANCE_STATS = eINSTANCE.getMethodSpecification_PerformanceStats();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ParameterTypeImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__TYPE = eINSTANCE.getParameterType_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__DEFAULT_VALUE = eINSTANCE.getParameterType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE__COMPONENT_TYPE = eINSTANCE.getParameterType_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE__INSTANCES = eINSTANCE.getParameterType_Instances();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.TenantImpl <em>Tenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.TenantImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getTenant()
		 * @generated
		 */
		EClass TENANT = eINSTANCE.getTenant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__NAME = eINSTANCE.getTenant_Name();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT__ARCHITECTURE = eINSTANCE.getTenant_Architecture();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT__COMPONENTS = eINSTANCE.getTenant_Components();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ParameterImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__COMPONENT = eINSTANCE.getParameter_Component();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.InterfaceImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__TYPE = eINSTANCE.getInterface_Type();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.RequiredInterfaceImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INTERFACE__COMPONENT = eINSTANCE.getRequiredInterface_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INTERFACE__CONNECTOR = eINSTANCE.getRequiredInterface_Connector();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ProvidedInterfaceImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACE__COMPONENT = eINSTANCE.getProvidedInterface_Component();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACE__CONNECTORS = eINSTANCE.getProvidedInterface_Connectors();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACE__EXCEPTIONS = eINSTANCE.getProvidedInterface_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Performance Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACE__PERFORMANCE_STATS = eINSTANCE.getProvidedInterface_PerformanceStats();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ConnectorImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ExceptionImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__TYPE = eINSTANCE.getException_Type();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__MESSAGE = eINSTANCE.getException_Message();

		/**
		 * The meta object literal for the '<em><b>Stack Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__STACK_TRACE = eINSTANCE.getException_StackTrace();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION__INTERFACE = eINSTANCE.getException_Interface();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION__METHOD = eINSTANCE.getException_Method();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.MonitoredPropertyImpl <em>Monitored Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.MonitoredPropertyImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getMonitoredProperty()
		 * @generated
		 */
		EClass MONITORED_PROPERTY = eINSTANCE.getMonitoredProperty();

		/**
		 * The meta object literal for the '<em><b>Architectural Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT = eINSTANCE.getMonitoredProperty_ArchitecturalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_PROPERTY__NAME = eINSTANCE.getMonitoredProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_PROPERTY__TYPE = eINSTANCE.getMonitoredProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_PROPERTY__UNIT = eINSTANCE.getMonitoredProperty_Unit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_PROPERTY__DESCRIPTION = eINSTANCE.getMonitoredProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_PROPERTY__VALUE = eINSTANCE.getMonitoredProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Related Architectural Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS = eINSTANCE
				.getMonitoredProperty_RelatedArchitecturalElements();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.AnnotationsImpl <em>Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.AnnotationsImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getAnnotations()
		 * @generated
		 */
		EClass ANNOTATIONS = eINSTANCE.getAnnotations();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS__ARCHITECTURE = eINSTANCE.getAnnotations_Architecture();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS__ISSUES = eINSTANCE.getAnnotations_Issues();

		/**
		 * The meta object literal for the '<em><b>Adaptation Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS__ADAPTATION_STRATEGIES = eINSTANCE.getAnnotations_AdaptationStrategies();

		/**
		 * The meta object literal for the '<em><b>Workingdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS__WORKINGDATA = eINSTANCE.getAnnotations_Workingdata();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATIONS__UID = eINSTANCE.getAnnotations_Uid();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.IssueImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ANNOTATIONS = eINSTANCE.getIssue_Annotations();

		/**
		 * The meta object literal for the '<em><b>Impacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__IMPACTS = eINSTANCE.getIssue_Impacts();

		/**
		 * The meta object literal for the '<em><b>Utility Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__UTILITY_DROP = eINSTANCE.getIssue_UtilityDrop();

		/**
		 * The meta object literal for the '<em><b>Assigned Adaptation Strategies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNED_ADAPTATION_STRATEGIES = eINSTANCE.getIssue_AssignedAdaptationStrategies();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.AdaptationStrategyImpl <em>Adaptation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.AdaptationStrategyImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getAdaptationStrategy()
		 * @generated
		 */
		EClass ADAPTATION_STRATEGY = eINSTANCE.getAdaptationStrategy();

		/**
		 * The meta object literal for the '<em><b>Utility Increase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_STRATEGY__UTILITY_INCREASE = eINSTANCE.getAdaptationStrategy_UtilityIncrease();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_STRATEGY__COSTS = eINSTANCE.getAdaptationStrategy_Costs();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__ANNOTATIONS = eINSTANCE.getAdaptationStrategy_Annotations();

		/**
		 * The meta object literal for the '<em><b>Assigned Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__ASSIGNED_ISSUES = eINSTANCE.getAdaptationStrategy_AssignedIssues();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_STRATEGY__INPUT_PARAMETERS = eINSTANCE.getAdaptationStrategy_InputParameters();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.AnnotationImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__UID = eINSTANCE.getAnnotation_Uid();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__DESCRIPTION = eINSTANCE.getAnnotation_Description();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ImpactImpl <em>Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ImpactImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getImpact()
		 * @generated
		 */
		EClass IMPACT = eINSTANCE.getImpact();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT__ISSUE = eINSTANCE.getImpact_Issue();

		/**
		 * The meta object literal for the '<em><b>Architectural Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT__ARCHITECTURAL_ELEMENT = eINSTANCE.getImpact_ArchitecturalElement();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.InputParameterImpl <em>Input Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.InputParameterImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getInputParameter()
		 * @generated
		 */
		EClass INPUT_PARAMETER = eINSTANCE.getInputParameter();

		/**
		 * The meta object literal for the '<em><b>Adaptation Strategy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER__ADAPTATION_STRATEGY = eINSTANCE.getInputParameter_AdaptationStrategy();

		/**
		 * The meta object literal for the '<em><b>Architectural Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER__ARCHITECTURAL_ELEMENT = eINSTANCE.getInputParameter_ArchitecturalElement();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.WorkingDataImpl <em>Working Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.WorkingDataImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getWorkingData()
		 * @generated
		 */
		EClass WORKING_DATA = eINSTANCE.getWorkingData();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_DATA__UNIT = eINSTANCE.getWorkingData_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_DATA__VALUE = eINSTANCE.getWorkingData_Value();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKING_DATA__ANNOTATIONS = eINSTANCE.getWorkingData_Annotations();

		/**
		 * The meta object literal for the '<em><b>Concerned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKING_DATA__CONCERNED_ELEMENTS = eINSTANCE.getWorkingData_ConcernedElements();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.ConcernedElementImpl <em>Concerned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.ConcernedElementImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getConcernedElement()
		 * @generated
		 */
		EClass CONCERNED_ELEMENT = eINSTANCE.getConcernedElement();

		/**
		 * The meta object literal for the '<em><b>Workingdata</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERNED_ELEMENT__WORKINGDATA = eINSTANCE.getConcernedElement_Workingdata();

		/**
		 * The meta object literal for the '<em><b>Architectural Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT = eINSTANCE.getConcernedElement_ArchitecturalElement();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.impl.PerformanceStatsImpl <em>Performance Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.impl.PerformanceStatsImpl
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getPerformanceStats()
		 * @generated
		 */
		EClass PERFORMANCE_STATS = eINSTANCE.getPerformanceStats();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_STATS__MIN_TIME = eINSTANCE.getPerformanceStats_MinTime();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_STATS__MAX_TIME = eINSTANCE.getPerformanceStats_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Total Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_STATS__TOTAL_TIME = eINSTANCE.getPerformanceStats_TotalTime();

		/**
		 * The meta object literal for the '<em><b>Invocation Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_STATS__INVOCATION_COUNT = eINSTANCE.getPerformanceStats_InvocationCount();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_STATS__INTERFACE = eINSTANCE.getPerformanceStats_Interface();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_STATS__METHOD = eINSTANCE.getPerformanceStats_Method();

		/**
		 * The meta object literal for the '{@link de.mdelab.comparch.ComponentState <em>Component State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.comparch.ComponentState
		 * @see de.mdelab.comparch.impl.ComparchPackageImpl#getComponentState()
		 * @generated
		 */
		EEnum COMPONENT_STATE = eINSTANCE.getComponentState();

	}

} //ComparchPackage
