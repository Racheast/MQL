/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Parse Int Class Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.IntegerParseInt_ClassOperator#getCalculateable <em>Calculateable</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getIntegerParseInt_ClassOperator()
 * @model annotation="information functonalType='Integer' literal='Integer.parseInt' operatorXTextLiteral='Integer.parseInt'"
 * @generated
 */
public interface IntegerParseInt_ClassOperator extends ClassOperator, Integer_EvaluationOperation_Argument {
	/**
	 * Returns the value of the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculateable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculateable</em>' containment reference.
	 * @see #setCalculateable(String_FunctionalParameter)
	 * @see qmm.QmmPackage#getIntegerParseInt_ClassOperator_Calculateable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getCalculateable();

	/**
	 * Sets the value of the '{@link qmm.IntegerParseInt_ClassOperator#getCalculateable <em>Calculateable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculateable</em>' containment reference.
	 * @see #getCalculateable()
	 * @generated
	 */
	void setCalculateable(String_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Integer.parseInt\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(calculateable);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // IntegerParseInt_ClassOperator
