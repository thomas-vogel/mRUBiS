/**
 */
package de.mdelab.comparch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.InputParameter#getAdaptationStrategy <em>Adaptation Strategy</em>}</li>
 *   <li>{@link de.mdelab.comparch.InputParameter#getArchitecturalElement <em>Architectural Element</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getInputParameter()
 * @model
 * @generated
 */
public interface InputParameter extends Annotation {
	/**
	 * Returns the value of the '<em><b>Adaptation Strategy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.AdaptationStrategy#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Strategy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Strategy</em>' container reference.
	 * @see #setAdaptationStrategy(AdaptationStrategy)
	 * @see de.mdelab.comparch.ComparchPackage#getInputParameter_AdaptationStrategy()
	 * @see de.mdelab.comparch.AdaptationStrategy#getInputParameters
	 * @model opposite="inputParameters" required="true" transient="false"
	 * @generated
	 */
	AdaptationStrategy getAdaptationStrategy();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.InputParameter#getAdaptationStrategy <em>Adaptation Strategy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Strategy</em>' container reference.
	 * @see #getAdaptationStrategy()
	 * @generated
	 */
	void setAdaptationStrategy(AdaptationStrategy value);

	/**
	 * Returns the value of the '<em><b>Architectural Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ArchitecturalElement#getStrategyInputs <em>Strategy Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Element</em>' reference.
	 * @see #setArchitecturalElement(ArchitecturalElement)
	 * @see de.mdelab.comparch.ComparchPackage#getInputParameter_ArchitecturalElement()
	 * @see de.mdelab.comparch.ArchitecturalElement#getStrategyInputs
	 * @model opposite="strategyInputs" required="true"
	 * @generated
	 */
	ArchitecturalElement getArchitecturalElement();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.InputParameter#getArchitecturalElement <em>Architectural Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Element</em>' reference.
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	void setArchitecturalElement(ArchitecturalElement value);

} // InputParameter
