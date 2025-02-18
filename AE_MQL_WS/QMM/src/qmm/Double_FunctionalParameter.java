/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Functional Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getDouble_FunctionalParameter()
 * @model
 * @generated
 */
public interface Double_FunctionalParameter extends Double_Type, FunctionalParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (diagnostic != null) {\n\tString errorMessage = \"\";\n\tEClass thisType = (EClass) this.getType();\n\tif(this.argument!=null){\n\t\tif (this.argument.eGet(this.argument.eClass().getEStructuralFeature(\"operator\")) != null) {\n\t\t\tqmm.FunctionalOperator lastFunctionalOperator = (qmm.FunctionalOperator) ((qmm.FunctionalOperator) this.argument.eGet(this.argument.eClass().getEStructuralFeature(\"operator\"))).getLastOperator();\n\t\t\tEClass lastFunctionalOperatorType = (EClass)lastFunctionalOperator.getType();\n\t\t\tif (!thisType.isSuperTypeOf(lastFunctionalOperatorType)) {\n\t\t\t\terrorMessage = \"Parameter \" + this.toString() + \": Argument of type \" + lastFunctionalOperatorType.getName() + \" is not compatible with parametertype \" + thisType.getName() + \".\";\n\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage, new Object[] { this }));\n\t\t\t}\n\t\t} else {\n\t\t\tEClass argumentType = (EClass) this.argument.getType();\n\t\t\tif (!thisType.isSuperTypeOf(argumentType)) {\n\t\t\t\terrorMessage = \"Parameter \" + this.toString() + \": Argument of type \" + argumentType.getName() + \" is not compatible with parametertype \" + thisType.getName() + \".\";\n\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage, new Object[] { this }));\n\t\t\t}\n\t\t}\n \t}\n}\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Double_FunctionalParameter
