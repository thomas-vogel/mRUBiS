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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.comparch.ComparchPackage
 * @generated
 */
public class ComparchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComparchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComparchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparchSwitch<Adapter> modelSwitch = new ComparchSwitch<Adapter>() {
		@Override
		public Adapter caseArchitecture(Architecture object) {
			return createArchitectureAdapter();
		}

		@Override
		public Adapter caseArchitecturalElement(ArchitecturalElement object) {
			return createArchitecturalElementAdapter();
		}

		@Override
		public Adapter caseComponentType(ComponentType object) {
			return createComponentTypeAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseInterfaceType(InterfaceType object) {
			return createInterfaceTypeAdapter();
		}

		@Override
		public Adapter caseMethodSpecification(MethodSpecification object) {
			return createMethodSpecificationAdapter();
		}

		@Override
		public Adapter caseParameterType(ParameterType object) {
			return createParameterTypeAdapter();
		}

		@Override
		public Adapter caseTenant(Tenant object) {
			return createTenantAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseRequiredInterface(RequiredInterface object) {
			return createRequiredInterfaceAdapter();
		}

		@Override
		public Adapter caseProvidedInterface(ProvidedInterface object) {
			return createProvidedInterfaceAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseException(de.mdelab.comparch.Exception object) {
			return createExceptionAdapter();
		}

		@Override
		public Adapter caseMonitoredProperty(MonitoredProperty object) {
			return createMonitoredPropertyAdapter();
		}

		@Override
		public Adapter caseAnnotations(Annotations object) {
			return createAnnotationsAdapter();
		}

		@Override
		public Adapter caseIssue(Issue object) {
			return createIssueAdapter();
		}

		@Override
		public Adapter caseAdaptationStrategy(AdaptationStrategy object) {
			return createAdaptationStrategyAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseImpact(Impact object) {
			return createImpactAdapter();
		}

		@Override
		public Adapter caseInputParameter(InputParameter object) {
			return createInputParameterAdapter();
		}

		@Override
		public Adapter caseWorkingData(WorkingData object) {
			return createWorkingDataAdapter();
		}

		@Override
		public Adapter caseConcernedElement(ConcernedElement object) {
			return createConcernedElementAdapter();
		}

		@Override
		public Adapter casePerformanceStats(PerformanceStats object) {
			return createPerformanceStatsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Architecture
	 * @generated
	 */
	public Adapter createArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.ArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.ArchitecturalElement
	 * @generated
	 */
	public Adapter createArchitecturalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.MethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.MethodSpecification
	 * @generated
	 */
	public Adapter createMethodSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Tenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Tenant
	 * @generated
	 */
	public Adapter createTenantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.RequiredInterface
	 * @generated
	 */
	public Adapter createRequiredInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.ProvidedInterface
	 * @generated
	 */
	public Adapter createProvidedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.MonitoredProperty <em>Monitored Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.MonitoredProperty
	 * @generated
	 */
	public Adapter createMonitoredPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Annotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Annotations
	 * @generated
	 */
	public Adapter createAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Issue
	 * @generated
	 */
	public Adapter createIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.AdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.AdaptationStrategy
	 * @generated
	 */
	public Adapter createAdaptationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.Impact
	 * @generated
	 */
	public Adapter createImpactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.InputParameter
	 * @generated
	 */
	public Adapter createInputParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.WorkingData <em>Working Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.WorkingData
	 * @generated
	 */
	public Adapter createWorkingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.ConcernedElement <em>Concerned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.ConcernedElement
	 * @generated
	 */
	public Adapter createConcernedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.comparch.PerformanceStats <em>Performance Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.comparch.PerformanceStats
	 * @generated
	 */
	public Adapter createPerformanceStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComparchAdapterFactory
