/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qmm.Integer_Or_BitOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Or Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Integer_Or_BitOperatorImpl extends Integer_BitOperatorImpl implements Integer_Or_BitOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Integer_Or_BitOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInteger_Or_BitOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return "||";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.INTEGER_OR_BIT_OPERATOR___GET_LITERAL:
				return getLiteral();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Integer_Or_BitOperatorImpl
