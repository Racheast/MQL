/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Calculateable Element Reference Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Integer_CalculateableElementReferenceArgument#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInteger_CalculateableElementReferenceArgument()
 * @model annotation="information functionalType='Integer'"
 * @generated
 */
public interface Integer_CalculateableElementReferenceArgument extends CalculateableElement_ReferenceArgument, Integer_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Integer_CalculateableElement)
	 * @see qmm.QmmPackage#getInteger_CalculateableElementReferenceArgument_Reference()
	 * @model required="true"
	 * @generated
	 */
	Integer_CalculateableElement getReference();

	/**
	 * Sets the value of the '{@link qmm.Integer_CalculateableElementReferenceArgument#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Integer_CalculateableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='qmm.RootClass containingRootClass = null;\nqmm.RootClass referencesRootClass = null;\nqmm.AttributeEClass containingAttributeEClass = null;\nqmm.AttributeEClass referencesAttributeEClass = null;\nif(this.eContainer() != null && this.reference != null){\n\t\torg.eclipse.emf.ecore.EObject eContainer = this.eContainer();\n\n\t\twhile(eContainer != null && !(eContainer instanceof qmm.RootClass)){\n\t\t\tif(eContainer instanceof qmm.AttributeEClass){\n\t\t\t\tcontainingAttributeEClass = (qmm.AttributeEClass)eContainer;\n\t\t\t}\n\t\t\teContainer = eContainer.eContainer();\n\t\t}\n\t\tcontainingRootClass = (qmm.RootClass)eContainer;\n\n\t\teContainer = this.reference.eContainer();\n\t\twhile(eContainer != null && !(eContainer instanceof qmm.RootClass)){\n\t\t\teContainer = eContainer.eContainer();\n\t\t}\n\n\t\treferencesRootClass = (qmm.RootClass)eContainer;\n\t\tif(this.reference instanceof qmm.AttributeEClass) referencesAttributeEClass = (qmm.AttributeEClass)this.reference;\n\n\t\tif(containingAttributeEClass != null && referencesAttributeEClass != null && containingAttributeEClass == referencesAttributeEClass){  //self-reference in expression !\n\t\t\tString errorMessage = \"Self-reference in expression of attribute \" + containingAttributeEClass.getName() + \" detected. Self-references are not allowed!\";\n\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));\n\t\t}\n\n\t\tif(containingRootClass != referencesRootClass){\n\t\t\tString errorMessage = \"The referenced element \" + this.reference + \" is contained by a different parent-element than the expression\'s parent-element. Cross-references are not supported.\";\n\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));\n\t\t}\n\n\t\tif(this.reference instanceof qmm.NegatableElement && ((qmm.NegatableElement)this.reference).isNegated())diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Reference to a negated element in \" + this + \" has been detected. References to negated elements are not allowed.\",new Object[] { this }));\n\n}\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Integer_CalculateableElementReferenceArgument
