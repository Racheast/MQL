/**
 */
package qmm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmSwitch() {
		if (modelPackage == null) {
			modelPackage = QmmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QmmPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseRootClass(person);
				if (result == null) result = caseNamedElement(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STUDENT: {
				Student student = (Student)theEObject;
				T result = caseStudent(student);
				if (result == null) result = casePerson(student);
				if (result == null) result = caseRootClass(student);
				if (result == null) result = caseNamedElement(student);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PROFESSOR: {
				Professor professor = (Professor)theEObject;
				T result = caseProfessor(professor);
				if (result == null) result = casePerson(professor);
				if (result == null) result = caseRootClass(professor);
				if (result == null) result = caseNamedElement(professor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE: {
				Course course = (Course)theEObject;
				T result = caseCourse(course);
				if (result == null) result = caseRootClass(course);
				if (result == null) result = caseNamedElement(course);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM: {
				UniversityManagementSystem universityManagementSystem = (UniversityManagementSystem)theEObject;
				T result = caseUniversityManagementSystem(universityManagementSystem);
				if (result == null) result = caseRootClass(universityManagementSystem);
				if (result == null) result = caseNamedElement(universityManagementSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXAM: {
				Exam exam = (Exam)theEObject;
				T result = caseExam(exam);
				if (result == null) result = caseRootClass(exam);
				if (result == null) result = caseNamedElement(exam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_OPERATOR: {
				Number_Operator number_Operator = (Number_Operator)theEObject;
				T result = caseNumber_Operator(number_Operator);
				if (result == null) result = caseOperator(number_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_BIT_OPERATOR: {
				Boolean_BitOperator boolean_BitOperator = (Boolean_BitOperator)theEObject;
				T result = caseBoolean_BitOperator(boolean_BitOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_BitOperator);
				if (result == null) result = caseBitOperator(boolean_BitOperator);
				if (result == null) result = caseExpressionOperator(boolean_BitOperator);
				if (result == null) result = caseBoolean_Operator(boolean_BitOperator);
				if (result == null) result = caseNegatableElement(boolean_BitOperator);
				if (result == null) result = caseOperator(boolean_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_EVALUATION_OPERATION_ARGUMENT: {
				Number_EvaluationOperation_Argument number_EvaluationOperation_Argument = (Number_EvaluationOperation_Argument)theEObject;
				T result = caseNumber_EvaluationOperation_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_FunctionalType(number_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(number_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(number_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(number_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(number_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(number_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(number_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(number_EvaluationOperation_Argument);
				if (result == null) result = caseType(number_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER: {
				Double_CalculateableParameter double_CalculateableParameter = (Double_CalculateableParameter)theEObject;
				T result = caseDouble_CalculateableParameter(double_CalculateableParameter);
				if (result == null) result = caseDouble_Type(double_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(double_CalculateableParameter);
				if (result == null) result = caseNumber_Type(double_CalculateableParameter);
				if (result == null) result = caseParameter(double_CalculateableParameter);
				if (result == null) result = caseObject_Type(double_CalculateableParameter);
				if (result == null) result = caseTypedElement(double_CalculateableParameter);
				if (result == null) result = caseType(double_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TO_LOWER_CASE_FUNCTIONAL_OPERATOR: {
				toLowerCase_FunctionalOperator toLowerCase_FunctionalOperator = (toLowerCase_FunctionalOperator)theEObject;
				T result = casetoLowerCase_FunctionalOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(toLowerCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseString_Type(toLowerCase_FunctionalOperator);
				if (result == null) result = caseFunctionalType(toLowerCase_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(toLowerCase_FunctionalOperator);
				if (result == null) result = caseOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseString_Operator(toLowerCase_FunctionalOperator);
				if (result == null) result = caseTypedElement(toLowerCase_FunctionalOperator);
				if (result == null) result = caseObject_Type(toLowerCase_FunctionalOperator);
				if (result == null) result = caseType(toLowerCase_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER: {
				String_CalculateableParameter string_CalculateableParameter = (String_CalculateableParameter)theEObject;
				T result = caseString_CalculateableParameter(string_CalculateableParameter);
				if (result == null) result = caseString_Type(string_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(string_CalculateableParameter);
				if (result == null) result = caseCharSequence_Type(string_CalculateableParameter);
				if (result == null) result = caseParameter(string_CalculateableParameter);
				if (result == null) result = caseObject_Type(string_CalculateableParameter);
				if (result == null) result = caseTypedElement(string_CalculateableParameter);
				if (result == null) result = caseType(string_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Double_Original_FunctionalOperator double_Original_FunctionalOperator = (Double_Original_FunctionalOperator)theEObject;
				T result = caseDouble_Original_FunctionalOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(double_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(double_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_EXPRESSION_OPERATOR: {
				Number_ExpressionOperator number_ExpressionOperator = (Number_ExpressionOperator)theEObject;
				T result = caseNumber_ExpressionOperator(number_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(number_ExpressionOperator);
				if (result == null) result = caseNumber_Operator(number_ExpressionOperator);
				if (result == null) result = caseOperator(number_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_OR_BIT_OPERATOR: {
				Integer_Or_BitOperator integer_Or_BitOperator = (Integer_Or_BitOperator)theEObject;
				T result = caseInteger_Or_BitOperator(integer_Or_BitOperator);
				if (result == null) result = caseInteger_BitOperator(integer_Or_BitOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_Or_BitOperator);
				if (result == null) result = caseBitOperator(integer_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(integer_Or_BitOperator);
				if (result == null) result = caseInteger_Operator(integer_Or_BitOperator);
				if (result == null) result = caseNegatableElement(integer_Or_BitOperator);
				if (result == null) result = caseOperator(integer_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_OPERATOR: {
				Boolean_Operator boolean_Operator = (Boolean_Operator)theEObject;
				T result = caseBoolean_Operator(boolean_Operator);
				if (result == null) result = caseOperator(boolean_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_FUNCTIONAL_OPERATOR: {
				Integer_FunctionalOperator integer_FunctionalOperator = (Integer_FunctionalOperator)theEObject;
				T result = caseInteger_FunctionalOperator(integer_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(integer_FunctionalOperator);
				if (result == null) result = caseOperator(integer_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(integer_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(integer_FunctionalOperator);
				if (result == null) result = caseTypedElement(integer_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_CALCULATEABLE: {
				Boolean_Calculateable boolean_Calculateable = (Boolean_Calculateable)theEObject;
				T result = caseBoolean_Calculateable(boolean_Calculateable);
				if (result == null) result = caseCalculateable(boolean_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR: {
				codePointBefore_FunctionalOperator codePointBefore_FunctionalOperator = (codePointBefore_FunctionalOperator)theEObject;
				T result = casecodePointBefore_FunctionalOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(codePointBefore_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseInteger_Type(codePointBefore_FunctionalOperator);
				if (result == null) result = caseFunctionalType(codePointBefore_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseNumber_Type(codePointBefore_FunctionalOperator);
				if (result == null) result = caseOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseString_Operator(codePointBefore_FunctionalOperator);
				if (result == null) result = caseTypedElement(codePointBefore_FunctionalOperator);
				if (result == null) result = caseObject_Type(codePointBefore_FunctionalOperator);
				if (result == null) result = caseType(codePointBefore_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXAM_EXAM_ID_ATTR_ECLASS: {
				Exam_examID_AttrEClass exam_examID_AttrEClass = (Exam_examID_AttrEClass)theEObject;
				T result = caseExam_examID_AttrEClass(exam_examID_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(exam_examID_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(exam_examID_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(exam_examID_AttrEClass);
				if (result == null) result = caseAttributeEClass(exam_examID_AttrEClass);
				if (result == null) result = caseGeneralizableElement(exam_examID_AttrEClass);
				if (result == null) result = caseString_Calculateable(exam_examID_AttrEClass);
				if (result == null) result = caseCalculateableElement(exam_examID_AttrEClass);
				if (result == null) result = caseNamedElement(exam_examID_AttrEClass);
				if (result == null) result = caseNegatableElement(exam_examID_AttrEClass);
				if (result == null) result = caseCountable(exam_examID_AttrEClass);
				if (result == null) result = caseCalculateable(exam_examID_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MIN_AGGREGATION_OPERATOR_DOUBLE: {
				Min_AggregationOperator_Double min_AggregationOperator_Double = (Min_AggregationOperator_Double)theEObject;
				T result = caseMin_AggregationOperator_Double(min_AggregationOperator_Double);
				if (result == null) result = caseCalculatingAggregationOperator(min_AggregationOperator_Double);
				if (result == null) result = caseDouble_EvaluationOperation_Argument(min_AggregationOperator_Double);
				if (result == null) result = caseAggregationOperator(min_AggregationOperator_Double);
				if (result == null) result = caseEvaluationOperation_Argument(min_AggregationOperator_Double);
				if (result == null) result = caseDouble_Argument(min_AggregationOperator_Double);
				if (result == null) result = caseEvaluationFunctionalOperator(min_AggregationOperator_Double);
				if (result == null) result = caseInteger_Calculateable(min_AggregationOperator_Double);
				if (result == null) result = caseCalculateable_Argument(min_AggregationOperator_Double);
				if (result == null) result = caseDouble_FunctionalType(min_AggregationOperator_Double);
				if (result == null) result = caseEvaluationOperator(min_AggregationOperator_Double);
				if (result == null) result = caseFunctionalOperator(min_AggregationOperator_Double);
				if (result == null) result = caseCalculateable(min_AggregationOperator_Double);
				if (result == null) result = caseReferenceArgument(min_AggregationOperator_Double);
				if (result == null) result = caseFunctionalArgument(min_AggregationOperator_Double);
				if (result == null) result = caseDouble_Type(min_AggregationOperator_Double);
				if (result == null) result = caseFunctionalType(min_AggregationOperator_Double);
				if (result == null) result = caseExpressionOperator(min_AggregationOperator_Double);
				if (result == null) result = caseArgument(min_AggregationOperator_Double);
				if (result == null) result = caseNumber_Type(min_AggregationOperator_Double);
				if (result == null) result = caseOperator(min_AggregationOperator_Double);
				if (result == null) result = caseTypedElement(min_AggregationOperator_Double);
				if (result == null) result = caseObject_Type(min_AggregationOperator_Double);
				if (result == null) result = caseType(min_AggregationOperator_Double);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR: {
				Boolean_Or_BitOperator boolean_Or_BitOperator = (Boolean_Or_BitOperator)theEObject;
				T result = caseBoolean_Or_BitOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBoolean_BitOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBitOperator(boolean_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBoolean_Operator(boolean_Or_BitOperator);
				if (result == null) result = caseNegatableElement(boolean_Or_BitOperator);
				if (result == null) result = caseOperator(boolean_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_TYPE: {
				Double_Type double_Type = (Double_Type)theEObject;
				T result = caseDouble_Type(double_Type);
				if (result == null) result = caseNumber_Type(double_Type);
				if (result == null) result = caseObject_Type(double_Type);
				if (result == null) result = caseType(double_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Integer_Original_FunctionalOperator integer_Original_FunctionalOperator = (Integer_Original_FunctionalOperator)theEObject;
				T result = caseInteger_Original_FunctionalOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(integer_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(integer_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_Boolean_toString_FunctionalOperator object_Boolean_toString_FunctionalOperator = (Object_Boolean_toString_FunctionalOperator)theEObject;
				T result = caseObject_Boolean_toString_FunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseType(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_ORIGINAL_FUNCTIONAL_OPERATOR: {
				String_Original_FunctionalOperator string_Original_FunctionalOperator = (String_Original_FunctionalOperator)theEObject;
				T result = caseString_Original_FunctionalOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseString_Operator(string_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(string_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR: {
				CharSequence_And_BitOperator charSequence_And_BitOperator = (CharSequence_And_BitOperator)theEObject;
				T result = caseCharSequence_And_BitOperator(charSequence_And_BitOperator);
				if (result == null) result = caseCharSequence_BitOperator(charSequence_And_BitOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_And_BitOperator);
				if (result == null) result = caseBitOperator(charSequence_And_BitOperator);
				if (result == null) result = caseExpressionOperator(charSequence_And_BitOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_And_BitOperator);
				if (result == null) result = caseNegatableElement(charSequence_And_BitOperator);
				if (result == null) result = caseOperator(charSequence_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR: {
				Number_Integer_Object_Number_hashCode_FunctionalOperator number_Integer_Object_Number_hashCode_FunctionalOperator = (Number_Integer_Object_Number_hashCode_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_Object_Number_hashCode_FunctionalOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR: {
				compareToString_FunctionalOperator compareToString_FunctionalOperator = (compareToString_FunctionalOperator)theEObject;
				T result = casecompareToString_FunctionalOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(compareToString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseInteger_Type(compareToString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(compareToString_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseNumber_Type(compareToString_FunctionalOperator);
				if (result == null) result = caseOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(compareToString_FunctionalOperator);
				if (result == null) result = caseString_Operator(compareToString_FunctionalOperator);
				if (result == null) result = caseTypedElement(compareToString_FunctionalOperator);
				if (result == null) result = caseObject_Type(compareToString_FunctionalOperator);
				if (result == null) result = caseType(compareToString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR: {
				contains_FunctionalOperator contains_FunctionalOperator = (contains_FunctionalOperator)theEObject;
				T result = casecontains_FunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(contains_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(contains_FunctionalOperator);
				if (result == null) result = caseFunctionalType(contains_FunctionalOperator);
				if (result == null) result = caseNegatableElement(contains_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(contains_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseObject_Type(contains_FunctionalOperator);
				if (result == null) result = caseOperator(contains_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(contains_FunctionalOperator);
				if (result == null) result = caseString_Operator(contains_FunctionalOperator);
				if (result == null) result = caseTypedElement(contains_FunctionalOperator);
				if (result == null) result = caseType(contains_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER: {
				Boolean_FunctionalParameter boolean_FunctionalParameter = (Boolean_FunctionalParameter)theEObject;
				T result = caseBoolean_FunctionalParameter(boolean_FunctionalParameter);
				if (result == null) result = caseBoolean_Type(boolean_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(boolean_FunctionalParameter);
				if (result == null) result = caseObject_Type(boolean_FunctionalParameter);
				if (result == null) result = caseParameter(boolean_FunctionalParameter);
				if (result == null) result = caseType(boolean_FunctionalParameter);
				if (result == null) result = caseTypedElement(boolean_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_ARGUMENT: {
				Calculateable_Argument calculateable_Argument = (Calculateable_Argument)theEObject;
				T result = caseCalculateable_Argument(calculateable_Argument);
				if (result == null) result = caseReferenceArgument(calculateable_Argument);
				if (result == null) result = caseFunctionalArgument(calculateable_Argument);
				if (result == null) result = caseArgument(calculateable_Argument);
				if (result == null) result = caseTypedElement(calculateable_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE: {
				Calculateable calculateable = (Calculateable)theEObject;
				T result = caseCalculateable(calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATING_AGGREGATION_OPERATOR: {
				CalculatingAggregationOperator calculatingAggregationOperator = (CalculatingAggregationOperator)theEObject;
				T result = caseCalculatingAggregationOperator(calculatingAggregationOperator);
				if (result == null) result = caseAggregationOperator(calculatingAggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(calculatingAggregationOperator);
				if (result == null) result = caseInteger_Calculateable(calculatingAggregationOperator);
				if (result == null) result = caseEvaluationOperator(calculatingAggregationOperator);
				if (result == null) result = caseFunctionalOperator(calculatingAggregationOperator);
				if (result == null) result = caseCalculateable(calculatingAggregationOperator);
				if (result == null) result = caseExpressionOperator(calculatingAggregationOperator);
				if (result == null) result = caseTypedElement(calculatingAggregationOperator);
				if (result == null) result = caseOperator(calculatingAggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_EVALUATION_OPERATION_ARGUMENT: {
				Integer_EvaluationOperation_Argument integer_EvaluationOperation_Argument = (Integer_EvaluationOperation_Argument)theEObject;
				T result = caseInteger_EvaluationOperation_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseInteger_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseInteger_FunctionalType(integer_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseInteger_Type(integer_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(integer_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(integer_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(integer_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(integer_EvaluationOperation_Argument);
				if (result == null) result = caseType(integer_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR: {
				Double_And_BitOperator double_And_BitOperator = (Double_And_BitOperator)theEObject;
				T result = caseDouble_And_BitOperator(double_And_BitOperator);
				if (result == null) result = caseDouble_BitOperator(double_And_BitOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_And_BitOperator);
				if (result == null) result = caseBitOperator(double_And_BitOperator);
				if (result == null) result = caseExpressionOperator(double_And_BitOperator);
				if (result == null) result = caseDouble_Operator(double_And_BitOperator);
				if (result == null) result = caseNegatableElement(double_And_BitOperator);
				if (result == null) result = caseOperator(double_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Number_Original_FunctionalOperator number_Original_FunctionalOperator = (Number_Original_FunctionalOperator)theEObject;
				T result = caseNumber_Original_FunctionalOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(number_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Boolean_Original_FunctionalOperator boolean_Original_FunctionalOperator = (Boolean_Original_FunctionalOperator)theEObject;
				T result = caseBoolean_Original_FunctionalOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(boolean_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_FUNCTIONAL_OPERATOR: {
				String_FunctionalOperator string_FunctionalOperator = (String_FunctionalOperator)theEObject;
				T result = caseString_FunctionalOperator(string_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(string_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(string_FunctionalOperator);
				if (result == null) result = caseOperator(string_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(string_FunctionalOperator);
				if (result == null) result = caseString_Operator(string_FunctionalOperator);
				if (result == null) result = caseTypedElement(string_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR: {
				Character_Or_BitOperator character_Or_BitOperator = (Character_Or_BitOperator)theEObject;
				T result = caseCharacter_Or_BitOperator(character_Or_BitOperator);
				if (result == null) result = caseCharacter_BitOperator(character_Or_BitOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_Or_BitOperator);
				if (result == null) result = caseBitOperator(character_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(character_Or_BitOperator);
				if (result == null) result = caseCharacter_Operator(character_Or_BitOperator);
				if (result == null) result = caseNegatableElement(character_Or_BitOperator);
				if (result == null) result = caseOperator(character_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR: {
				equals_FunctionalOperator equals_FunctionalOperator = (equals_FunctionalOperator)theEObject;
				T result = caseequals_FunctionalOperator(equals_FunctionalOperator);
				if (result == null) result = caseObject_FunctionalOperator(equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(equals_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(equals_FunctionalOperator);
				if (result == null) result = caseObject_Operator(equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(equals_FunctionalOperator);
				if (result == null) result = caseOperator(equals_FunctionalOperator);
				if (result == null) result = caseType(equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_Number_equals_FunctionalOperator object_Number_equals_FunctionalOperator = (Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseObject_Number_equals_FunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Number_FunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_CALCULATEABLE_ELEMENT: {
				Double_CalculateableElement double_CalculateableElement = (Double_CalculateableElement)theEObject;
				T result = caseDouble_CalculateableElement(double_CalculateableElement);
				if (result == null) result = caseDouble_Calculateable(double_CalculateableElement);
				if (result == null) result = caseCalculateableElement(double_CalculateableElement);
				if (result == null) result = caseCalculateable(double_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR: {
				Number_Double_Object_Number_hashCode_FunctionalOperator number_Double_Object_Number_hashCode_FunctionalOperator = (Number_Double_Object_Number_hashCode_FunctionalOperator)theEObject;
				T result = caseNumber_Double_Object_Number_hashCode_FunctionalOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseType(number_Double_Object_Number_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_Boolean_FunctionalOperator inheritedFrom_Object_to_Boolean_FunctionalOperator = (InheritedFrom_Object_to_Boolean_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: {
				CharSequence_String_Object_CharSequence_toString_FunctionalOperator charSequence_String_Object_CharSequence_toString_FunctionalOperator = (CharSequence_String_Object_CharSequence_toString_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_Object_CharSequence_toString_FunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.AGGREGATION_OPERATOR: {
				AggregationOperator aggregationOperator = (AggregationOperator)theEObject;
				T result = caseAggregationOperator(aggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(aggregationOperator);
				if (result == null) result = caseInteger_Calculateable(aggregationOperator);
				if (result == null) result = caseEvaluationOperator(aggregationOperator);
				if (result == null) result = caseFunctionalOperator(aggregationOperator);
				if (result == null) result = caseCalculateable(aggregationOperator);
				if (result == null) result = caseExpressionOperator(aggregationOperator);
				if (result == null) result = caseTypedElement(aggregationOperator);
				if (result == null) result = caseOperator(aggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT: {
				Integer_PrimitiveArgument integer_PrimitiveArgument = (Integer_PrimitiveArgument)theEObject;
				T result = caseInteger_PrimitiveArgument(integer_PrimitiveArgument);
				if (result == null) result = caseInteger_Argument(integer_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(integer_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(integer_PrimitiveArgument);
				if (result == null) result = caseInteger_FunctionalType(integer_PrimitiveArgument);
				if (result == null) result = caseArgument(integer_PrimitiveArgument);
				if (result == null) result = caseInteger_Type(integer_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(integer_PrimitiveArgument);
				if (result == null) result = caseTypedElement(integer_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(integer_PrimitiveArgument);
				if (result == null) result = caseObject_Type(integer_PrimitiveArgument);
				if (result == null) result = caseType(integer_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER: {
				CharSequence_FunctionalParameter charSequence_FunctionalParameter = (CharSequence_FunctionalParameter)theEObject;
				T result = caseCharSequence_FunctionalParameter(charSequence_FunctionalParameter);
				if (result == null) result = caseCharSequence_Type(charSequence_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(charSequence_FunctionalParameter);
				if (result == null) result = caseObject_Type(charSequence_FunctionalParameter);
				if (result == null) result = caseParameter(charSequence_FunctionalParameter);
				if (result == null) result = caseType(charSequence_FunctionalParameter);
				if (result == null) result = caseTypedElement(charSequence_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Integer_smallerThan_FunctionalOperator number_Integer_smallerThan_FunctionalOperator = (Number_Integer_smallerThan_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_smallerThan_FunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_Character_toString_FunctionalOperator object_Character_toString_FunctionalOperator = (Object_Character_toString_FunctionalOperator)theEObject;
				T result = caseObject_Character_toString_FunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Character_FunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseType(object_Character_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PERSON_CONTAINMENT_OR_GROUP: {
				Person_Containment_OrGroup person_Containment_OrGroup = (Person_Containment_OrGroup)theEObject;
				T result = casePerson_Containment_OrGroup(person_Containment_OrGroup);
				if (result == null) result = caseContainment_OrGroup(person_Containment_OrGroup);
				if (result == null) result = caseOrGroup(person_Containment_OrGroup);
				if (result == null) result = caseNamedElement(person_Containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(person_Containment_OrGroup);
				if (result == null) result = caseNegatableElement(person_Containment_OrGroup);
				if (result == null) result = caseCountable(person_Containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				smallerEquals_FunctionalOperator smallerEquals_FunctionalOperator = (smallerEquals_FunctionalOperator)theEObject;
				T result = casesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PRIMITIVE_ARGUMENT: {
				PrimitiveArgument primitiveArgument = (PrimitiveArgument)theEObject;
				T result = casePrimitiveArgument(primitiveArgument);
				if (result == null) result = caseFunctionalArgument(primitiveArgument);
				if (result == null) result = caseArgument(primitiveArgument);
				if (result == null) result = caseTypedElement(primitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_FUNCTIONAL_OPERATOR: {
				Boolean_FunctionalOperator boolean_FunctionalOperator = (Boolean_FunctionalOperator)theEObject;
				T result = caseBoolean_FunctionalOperator(boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(boolean_FunctionalOperator);
				if (result == null) result = caseOperator(boolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(boolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(boolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR: {
				Double_Or_BitOperator double_Or_BitOperator = (Double_Or_BitOperator)theEObject;
				T result = caseDouble_Or_BitOperator(double_Or_BitOperator);
				if (result == null) result = caseDouble_BitOperator(double_Or_BitOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_Or_BitOperator);
				if (result == null) result = caseBitOperator(double_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(double_Or_BitOperator);
				if (result == null) result = caseDouble_Operator(double_Or_BitOperator);
				if (result == null) result = caseNegatableElement(double_Or_BitOperator);
				if (result == null) result = caseOperator(double_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR: {
				Object_CharSequence_hashCode_FunctionalOperator object_CharSequence_hashCode_FunctionalOperator = (Object_CharSequence_hashCode_FunctionalOperator)theEObject;
				T result = caseObject_CharSequence_hashCode_FunctionalOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseType(object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT: {
				Object_PrimitiveArgument object_PrimitiveArgument = (Object_PrimitiveArgument)theEObject;
				T result = caseObject_PrimitiveArgument(object_PrimitiveArgument);
				if (result == null) result = caseObject_Argument(object_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(object_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(object_PrimitiveArgument);
				if (result == null) result = caseObject_FunctionalType(object_PrimitiveArgument);
				if (result == null) result = caseArgument(object_PrimitiveArgument);
				if (result == null) result = caseObject_Type(object_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(object_PrimitiveArgument);
				if (result == null) result = caseTypedElement(object_PrimitiveArgument);
				if (result == null) result = caseType(object_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_EXPRESSION_OPERATOR: {
				Boolean_ExpressionOperator boolean_ExpressionOperator = (Boolean_ExpressionOperator)theEObject;
				T result = caseBoolean_ExpressionOperator(boolean_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(boolean_ExpressionOperator);
				if (result == null) result = caseBoolean_Operator(boolean_ExpressionOperator);
				if (result == null) result = caseOperator(boolean_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_ECLASS: {
				AttributeEClass attributeEClass = (AttributeEClass)theEObject;
				T result = caseAttributeEClass(attributeEClass);
				if (result == null) result = caseNamedElement(attributeEClass);
				if (result == null) result = caseNegatableElement(attributeEClass);
				if (result == null) result = caseCountable(attributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_BIT_OPERATOR: {
				EvaluationBitOperator evaluationBitOperator = (EvaluationBitOperator)theEObject;
				T result = caseEvaluationBitOperator(evaluationBitOperator);
				if (result == null) result = caseEvaluationOperator(evaluationBitOperator);
				if (result == null) result = caseBitOperator(evaluationBitOperator);
				if (result == null) result = caseExpressionOperator(evaluationBitOperator);
				if (result == null) result = caseNegatableElement(evaluationBitOperator);
				if (result == null) result = caseOperator(evaluationBitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_FUNCTIONAL_TYPE: {
				String_FunctionalType string_FunctionalType = (String_FunctionalType)theEObject;
				T result = caseString_FunctionalType(string_FunctionalType);
				if (result == null) result = caseString_Type(string_FunctionalType);
				if (result == null) result = caseFunctionalType(string_FunctionalType);
				if (result == null) result = caseCharSequence_Type(string_FunctionalType);
				if (result == null) result = caseObject_Type(string_FunctionalType);
				if (result == null) result = caseType(string_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CALCULATEABLE: {
				Object_Calculateable object_Calculateable = (Object_Calculateable)theEObject;
				T result = caseObject_Calculateable(object_Calculateable);
				if (result == null) result = caseCalculateable(object_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_OPERATOR: {
				String_Operator string_Operator = (String_Operator)theEObject;
				T result = caseString_Operator(string_Operator);
				if (result == null) result = caseOperator(string_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_ARGUMENT: {
				Object_Argument object_Argument = (Object_Argument)theEObject;
				T result = caseObject_Argument(object_Argument);
				if (result == null) result = caseFunctionalArgument(object_Argument);
				if (result == null) result = caseObject_FunctionalType(object_Argument);
				if (result == null) result = caseArgument(object_Argument);
				if (result == null) result = caseObject_Type(object_Argument);
				if (result == null) result = caseFunctionalType(object_Argument);
				if (result == null) result = caseTypedElement(object_Argument);
				if (result == null) result = caseType(object_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_TYPE: {
				String_Type string_Type = (String_Type)theEObject;
				T result = caseString_Type(string_Type);
				if (result == null) result = caseCharSequence_Type(string_Type);
				if (result == null) result = caseObject_Type(string_Type);
				if (result == null) result = caseType(string_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR: {
				compareToBoolean_FunctionalOperator compareToBoolean_FunctionalOperator = (compareToBoolean_FunctionalOperator)theEObject;
				T result = casecompareToBoolean_FunctionalOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Original_FunctionalOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseInteger_Type(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseFunctionalType(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseNumber_Type(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseObject_Type(compareToBoolean_FunctionalOperator);
				if (result == null) result = caseType(compareToBoolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER: {
				CountableReferenceParameter countableReferenceParameter = (CountableReferenceParameter)theEObject;
				T result = caseCountableReferenceParameter(countableReferenceParameter);
				if (result == null) result = caseParameter(countableReferenceParameter);
				if (result == null) result = caseTypedElement(countableReferenceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER: {
				Integer_FunctionalParameter integer_FunctionalParameter = (Integer_FunctionalParameter)theEObject;
				T result = caseInteger_FunctionalParameter(integer_FunctionalParameter);
				if (result == null) result = caseInteger_Type(integer_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(integer_FunctionalParameter);
				if (result == null) result = caseNumber_Type(integer_FunctionalParameter);
				if (result == null) result = caseParameter(integer_FunctionalParameter);
				if (result == null) result = caseObject_Type(integer_FunctionalParameter);
				if (result == null) result = caseTypedElement(integer_FunctionalParameter);
				if (result == null) result = caseType(integer_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER: {
				String_FunctionalParameter string_FunctionalParameter = (String_FunctionalParameter)theEObject;
				T result = caseString_FunctionalParameter(string_FunctionalParameter);
				if (result == null) result = caseString_Type(string_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(string_FunctionalParameter);
				if (result == null) result = caseCharSequence_Type(string_FunctionalParameter);
				if (result == null) result = caseParameter(string_FunctionalParameter);
				if (result == null) result = caseObject_Type(string_FunctionalParameter);
				if (result == null) result = caseTypedElement(string_FunctionalParameter);
				if (result == null) result = caseType(string_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER: {
				Character_FunctionalParameter character_FunctionalParameter = (Character_FunctionalParameter)theEObject;
				T result = caseCharacter_FunctionalParameter(character_FunctionalParameter);
				if (result == null) result = caseCharacter_Type(character_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(character_FunctionalParameter);
				if (result == null) result = caseObject_Type(character_FunctionalParameter);
				if (result == null) result = caseParameter(character_FunctionalParameter);
				if (result == null) result = caseType(character_FunctionalParameter);
				if (result == null) result = caseTypedElement(character_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER: {
				Number_CalculateableParameter number_CalculateableParameter = (Number_CalculateableParameter)theEObject;
				T result = caseNumber_CalculateableParameter(number_CalculateableParameter);
				if (result == null) result = caseNumber_Type(number_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(number_CalculateableParameter);
				if (result == null) result = caseObject_Type(number_CalculateableParameter);
				if (result == null) result = caseParameter(number_CalculateableParameter);
				if (result == null) result = caseType(number_CalculateableParameter);
				if (result == null) result = caseTypedElement(number_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Double_Object_Number_equals_FunctionalOperator number_Double_Object_Number_equals_FunctionalOperator = (Number_Double_Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseNumber_Double_Object_Number_equals_FunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PERSON_NAME_ATTR_ECLASS: {
				Person_name_AttrEClass person_name_AttrEClass = (Person_name_AttrEClass)theEObject;
				T result = casePerson_name_AttrEClass(person_name_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(person_name_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(person_name_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(person_name_AttrEClass);
				if (result == null) result = caseAttributeEClass(person_name_AttrEClass);
				if (result == null) result = caseGeneralizableElement(person_name_AttrEClass);
				if (result == null) result = caseString_Calculateable(person_name_AttrEClass);
				if (result == null) result = caseCalculateableElement(person_name_AttrEClass);
				if (result == null) result = caseNamedElement(person_name_AttrEClass);
				if (result == null) result = caseNegatableElement(person_name_AttrEClass);
				if (result == null) result = caseCountable(person_name_AttrEClass);
				if (result == null) result = caseCalculateable(person_name_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR: {
				length_FunctionalOperator length_FunctionalOperator = (length_FunctionalOperator)theEObject;
				T result = caselength_FunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_Original_FunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseInteger_Type(length_FunctionalOperator);
				if (result == null) result = caseFunctionalType(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(length_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseNumber_Type(length_FunctionalOperator);
				if (result == null) result = caseOperator(length_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(length_FunctionalOperator);
				if (result == null) result = caseTypedElement(length_FunctionalOperator);
				if (result == null) result = caseObject_Type(length_FunctionalOperator);
				if (result == null) result = caseType(length_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR: {
				concat_FunctionalOperator concat_FunctionalOperator = (concat_FunctionalOperator)theEObject;
				T result = caseconcat_FunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(concat_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_Type(concat_FunctionalOperator);
				if (result == null) result = caseFunctionalType(concat_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(concat_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(concat_FunctionalOperator);
				if (result == null) result = caseOperator(concat_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_Operator(concat_FunctionalOperator);
				if (result == null) result = caseTypedElement(concat_FunctionalOperator);
				if (result == null) result = caseObject_Type(concat_FunctionalOperator);
				if (result == null) result = caseType(concat_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS: {
				CourseType_AttributeEClass courseType_AttributeEClass = (CourseType_AttributeEClass)theEObject;
				T result = caseCourseType_AttributeEClass(courseType_AttributeEClass);
				if (result == null) result = caseEnumerationAttributeEClass(courseType_AttributeEClass);
				if (result == null) result = caseAttributeEClass(courseType_AttributeEClass);
				if (result == null) result = caseNamedElement(courseType_AttributeEClass);
				if (result == null) result = caseNegatableElement(courseType_AttributeEClass);
				if (result == null) result = caseCountable(courseType_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_ARGUMENT: {
				Double_Argument double_Argument = (Double_Argument)theEObject;
				T result = caseDouble_Argument(double_Argument);
				if (result == null) result = caseFunctionalArgument(double_Argument);
				if (result == null) result = caseDouble_FunctionalType(double_Argument);
				if (result == null) result = caseArgument(double_Argument);
				if (result == null) result = caseDouble_Type(double_Argument);
				if (result == null) result = caseFunctionalType(double_Argument);
				if (result == null) result = caseTypedElement(double_Argument);
				if (result == null) result = caseNumber_Type(double_Argument);
				if (result == null) result = caseObject_Type(double_Argument);
				if (result == null) result = caseType(double_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_ARGUMENT: {
				Boolean_Argument boolean_Argument = (Boolean_Argument)theEObject;
				T result = caseBoolean_Argument(boolean_Argument);
				if (result == null) result = caseFunctionalArgument(boolean_Argument);
				if (result == null) result = caseBoolean_FunctionalType(boolean_Argument);
				if (result == null) result = caseArgument(boolean_Argument);
				if (result == null) result = caseBoolean_Type(boolean_Argument);
				if (result == null) result = caseFunctionalType(boolean_Argument);
				if (result == null) result = caseNegatableElement(boolean_Argument);
				if (result == null) result = caseTypedElement(boolean_Argument);
				if (result == null) result = caseObject_Type(boolean_Argument);
				if (result == null) result = caseType(boolean_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER: {
				Number_FunctionalParameter number_FunctionalParameter = (Number_FunctionalParameter)theEObject;
				T result = caseNumber_FunctionalParameter(number_FunctionalParameter);
				if (result == null) result = caseNumber_Type(number_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(number_FunctionalParameter);
				if (result == null) result = caseObject_Type(number_FunctionalParameter);
				if (result == null) result = caseParameter(number_FunctionalParameter);
				if (result == null) result = caseType(number_FunctionalParameter);
				if (result == null) result = caseTypedElement(number_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REFERENCE_OR_GROUP: {
				Reference_OrGroup reference_OrGroup = (Reference_OrGroup)theEObject;
				T result = caseReference_OrGroup(reference_OrGroup);
				if (result == null) result = caseOrGroup(reference_OrGroup);
				if (result == null) result = caseNamedElement(reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(reference_OrGroup);
				if (result == null) result = caseNegatableElement(reference_OrGroup);
				if (result == null) result = caseCountable(reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_OPERATOR: {
				Integer_Operator integer_Operator = (Integer_Operator)theEObject;
				T result = caseInteger_Operator(integer_Operator);
				if (result == null) result = caseOperator(integer_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR: {
				CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator charSequence_String_Object_CharSequence_hashCode_FunctionalOperator = (CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_BIT_OPERATOR: {
				Character_BitOperator character_BitOperator = (Character_BitOperator)theEObject;
				T result = caseCharacter_BitOperator(character_BitOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_BitOperator);
				if (result == null) result = caseBitOperator(character_BitOperator);
				if (result == null) result = caseExpressionOperator(character_BitOperator);
				if (result == null) result = caseCharacter_Operator(character_BitOperator);
				if (result == null) result = caseNegatableElement(character_BitOperator);
				if (result == null) result = caseOperator(character_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INDEX_OF_CHAR_FUNCTIONAL_OPERATOR: {
				indexOfChar_FunctionalOperator indexOfChar_FunctionalOperator = (indexOfChar_FunctionalOperator)theEObject;
				T result = caseindexOfChar_FunctionalOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(indexOfChar_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseInteger_Type(indexOfChar_FunctionalOperator);
				if (result == null) result = caseFunctionalType(indexOfChar_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseNumber_Type(indexOfChar_FunctionalOperator);
				if (result == null) result = caseOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseString_Operator(indexOfChar_FunctionalOperator);
				if (result == null) result = caseTypedElement(indexOfChar_FunctionalOperator);
				if (result == null) result = caseObject_Type(indexOfChar_FunctionalOperator);
				if (result == null) result = caseType(indexOfChar_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR: {
				equalsIgnoreCase_FunctionalOperator equalsIgnoreCase_FunctionalOperator = (equalsIgnoreCase_FunctionalOperator)theEObject;
				T result = caseequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseFunctionalType(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseNegatableElement(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseObject_Type(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_Operator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseTypedElement(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseType(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXPRESSION_OPERATOR: {
				ExpressionOperator expressionOperator = (ExpressionOperator)theEObject;
				T result = caseExpressionOperator(expressionOperator);
				if (result == null) result = caseOperator(expressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR: {
				Boolean_And_BitOperator boolean_And_BitOperator = (Boolean_And_BitOperator)theEObject;
				T result = caseBoolean_And_BitOperator(boolean_And_BitOperator);
				if (result == null) result = caseBoolean_BitOperator(boolean_And_BitOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_And_BitOperator);
				if (result == null) result = caseBitOperator(boolean_And_BitOperator);
				if (result == null) result = caseExpressionOperator(boolean_And_BitOperator);
				if (result == null) result = caseBoolean_Operator(boolean_And_BitOperator);
				if (result == null) result = caseNegatableElement(boolean_And_BitOperator);
				if (result == null) result = caseOperator(boolean_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_Number_FunctionalOperator inheritedFrom_Object_to_Number_FunctionalOperator = (InheritedFrom_Object_to_Number_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_Number_FunctionalOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT: {
				CharSequence_PrimitiveArgument charSequence_PrimitiveArgument = (CharSequence_PrimitiveArgument)theEObject;
				T result = caseCharSequence_PrimitiveArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseCharSequence_Argument(charSequence_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseCharSequence_FunctionalType(charSequence_PrimitiveArgument);
				if (result == null) result = caseArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseCharSequence_Type(charSequence_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(charSequence_PrimitiveArgument);
				if (result == null) result = caseTypedElement(charSequence_PrimitiveArgument);
				if (result == null) result = caseObject_Type(charSequence_PrimitiveArgument);
				if (result == null) result = caseType(charSequence_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_FUNCTIONAL_OPERATOR: {
				EvaluationFunctionalOperator evaluationFunctionalOperator = (EvaluationFunctionalOperator)theEObject;
				T result = caseEvaluationFunctionalOperator(evaluationFunctionalOperator);
				if (result == null) result = caseEvaluationOperator(evaluationFunctionalOperator);
				if (result == null) result = caseFunctionalOperator(evaluationFunctionalOperator);
				if (result == null) result = caseExpressionOperator(evaluationFunctionalOperator);
				if (result == null) result = caseTypedElement(evaluationFunctionalOperator);
				if (result == null) result = caseOperator(evaluationFunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Number_Integer_Object_Number_toString_FunctionalOperator number_Integer_Object_Number_toString_FunctionalOperator = (Number_Integer_Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_Object_Number_toString_FunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR: {
				isEmpty_FunctionalOperator isEmpty_FunctionalOperator = (isEmpty_FunctionalOperator)theEObject;
				T result = caseisEmpty_FunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(isEmpty_FunctionalOperator);
				if (result == null) result = caseFunctionalType(isEmpty_FunctionalOperator);
				if (result == null) result = caseNegatableElement(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseObject_Type(isEmpty_FunctionalOperator);
				if (result == null) result = caseOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_Operator(isEmpty_FunctionalOperator);
				if (result == null) result = caseTypedElement(isEmpty_FunctionalOperator);
				if (result == null) result = caseType(isEmpty_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_TYPE: {
				Integer_Type integer_Type = (Integer_Type)theEObject;
				T result = caseInteger_Type(integer_Type);
				if (result == null) result = caseNumber_Type(integer_Type);
				if (result == null) result = caseObject_Type(integer_Type);
				if (result == null) result = caseType(integer_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR: {
				toString_FunctionalOperator toString_FunctionalOperator = (toString_FunctionalOperator)theEObject;
				T result = casetoString_FunctionalOperator(toString_FunctionalOperator);
				if (result == null) result = caseObject_FunctionalOperator(toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(toString_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(toString_FunctionalOperator);
				if (result == null) result = caseString_Type(toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(toString_FunctionalOperator);
				if (result == null) result = caseObject_Operator(toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(toString_FunctionalOperator);
				if (result == null) result = caseOperator(toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(toString_FunctionalOperator);
				if (result == null) result = caseType(toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR: {
				Object_Number_hashCode_FunctionalOperator object_Number_hashCode_FunctionalOperator = (Object_Number_hashCode_FunctionalOperator)theEObject;
				T result = caseObject_Number_hashCode_FunctionalOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Number_FunctionalOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = caseType(object_Number_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_TYPE: {
				Object_Type object_Type = (Object_Type)theEObject;
				T result = caseObject_Type(object_Type);
				if (result == null) result = caseType(object_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT: {
				CharSequence_EvaluationOperation_Argument charSequence_EvaluationOperation_Argument = (CharSequence_EvaluationOperation_Argument)theEObject;
				T result = caseCharSequence_EvaluationOperation_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_FunctionalType(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_Type(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseType(charSequence_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STUDENT_CONTAINMENT_OR_GROUP: {
				Student_Containment_OrGroup student_Containment_OrGroup = (Student_Containment_OrGroup)theEObject;
				T result = caseStudent_Containment_OrGroup(student_Containment_OrGroup);
				if (result == null) result = caseContainment_OrGroup(student_Containment_OrGroup);
				if (result == null) result = caseOrGroup(student_Containment_OrGroup);
				if (result == null) result = caseNamedElement(student_Containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(student_Containment_OrGroup);
				if (result == null) result = caseNegatableElement(student_Containment_OrGroup);
				if (result == null) result = caseCountable(student_Containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_EXPRESSION_OPERATOR: {
				Character_ExpressionOperator character_ExpressionOperator = (Character_ExpressionOperator)theEObject;
				T result = caseCharacter_ExpressionOperator(character_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(character_ExpressionOperator);
				if (result == null) result = caseCharacter_Operator(character_ExpressionOperator);
				if (result == null) result = caseOperator(character_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.HASH_CODE_FUNCTIONAL_OPERATOR: {
				hashCode_FunctionalOperator hashCode_FunctionalOperator = (hashCode_FunctionalOperator)theEObject;
				T result = casehashCode_FunctionalOperator(hashCode_FunctionalOperator);
				if (result == null) result = caseObject_FunctionalOperator(hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(hashCode_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Operator(hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(hashCode_FunctionalOperator);
				if (result == null) result = caseType(hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR: {
				IntegerParseInt_ClassOperator integerParseInt_ClassOperator = (IntegerParseInt_ClassOperator)theEObject;
				T result = caseIntegerParseInt_ClassOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseClassOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseEvaluationOperation_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseEvaluationOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseFunctionalOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseCalculateable_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_FunctionalType(integerParseInt_ClassOperator);
				if (result == null) result = caseExpressionOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseReferenceArgument(integerParseInt_ClassOperator);
				if (result == null) result = caseFunctionalArgument(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_Type(integerParseInt_ClassOperator);
				if (result == null) result = caseFunctionalType(integerParseInt_ClassOperator);
				if (result == null) result = caseOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseArgument(integerParseInt_ClassOperator);
				if (result == null) result = caseNumber_Type(integerParseInt_ClassOperator);
				if (result == null) result = caseTypedElement(integerParseInt_ClassOperator);
				if (result == null) result = caseObject_Type(integerParseInt_ClassOperator);
				if (result == null) result = caseType(integerParseInt_ClassOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_TYPE_CALCULATEABLE_ELEMENT: {
				CourseType_CalculateableElement courseType_CalculateableElement = (CourseType_CalculateableElement)theEObject;
				T result = caseCourseType_CalculateableElement(courseType_CalculateableElement);
				if (result == null) result = caseCourseType_Calculateable(courseType_CalculateableElement);
				if (result == null) result = caseCalculateableElement(courseType_CalculateableElement);
				if (result == null) result = caseCalculateable(courseType_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR: {
				CountingAggregationOperator countingAggregationOperator = (CountingAggregationOperator)theEObject;
				T result = caseCountingAggregationOperator(countingAggregationOperator);
				if (result == null) result = caseAggregationOperator(countingAggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(countingAggregationOperator);
				if (result == null) result = caseInteger_Calculateable(countingAggregationOperator);
				if (result == null) result = caseEvaluationOperator(countingAggregationOperator);
				if (result == null) result = caseFunctionalOperator(countingAggregationOperator);
				if (result == null) result = caseCalculateable(countingAggregationOperator);
				if (result == null) result = caseExpressionOperator(countingAggregationOperator);
				if (result == null) result = caseTypedElement(countingAggregationOperator);
				if (result == null) result = caseOperator(countingAggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXAM_REFERENCE_OR_GROUP: {
				Exam_Reference_OrGroup exam_Reference_OrGroup = (Exam_Reference_OrGroup)theEObject;
				T result = caseExam_Reference_OrGroup(exam_Reference_OrGroup);
				if (result == null) result = caseReference_OrGroup(exam_Reference_OrGroup);
				if (result == null) result = caseOrGroup(exam_Reference_OrGroup);
				if (result == null) result = caseNamedElement(exam_Reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(exam_Reference_OrGroup);
				if (result == null) result = caseNegatableElement(exam_Reference_OrGroup);
				if (result == null) result = caseCountable(exam_Reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OR_GROUP: {
				OrGroup orGroup = (OrGroup)theEObject;
				T result = caseOrGroup(orGroup);
				if (result == null) result = caseNamedElement(orGroup);
				if (result == null) result = caseGeneralizableElement(orGroup);
				if (result == null) result = caseNegatableElement(orGroup);
				if (result == null) result = caseCountable(orGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PROFESSOR_REFERENCE_OR_GROUP: {
				Professor_Reference_OrGroup professor_Reference_OrGroup = (Professor_Reference_OrGroup)theEObject;
				T result = caseProfessor_Reference_OrGroup(professor_Reference_OrGroup);
				if (result == null) result = caseReference_OrGroup(professor_Reference_OrGroup);
				if (result == null) result = caseOrGroup(professor_Reference_OrGroup);
				if (result == null) result = caseNamedElement(professor_Reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(professor_Reference_OrGroup);
				if (result == null) result = caseNegatableElement(professor_Reference_OrGroup);
				if (result == null) result = caseCountable(professor_Reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				smallerThan_FunctionalOperator smallerThan_FunctionalOperator = (smallerThan_FunctionalOperator)theEObject;
				T result = casesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(smallerThan_FunctionalOperator);
				if (result == null) result = caseType(smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_TYPE: {
				CharSequence_Type charSequence_Type = (CharSequence_Type)theEObject;
				T result = caseCharSequence_Type(charSequence_Type);
				if (result == null) result = caseObject_Type(charSequence_Type);
				if (result == null) result = caseType(charSequence_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_EXPRESSION_OPERATOR: {
				String_ExpressionOperator string_ExpressionOperator = (String_ExpressionOperator)theEObject;
				T result = caseString_ExpressionOperator(string_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(string_ExpressionOperator);
				if (result == null) result = caseString_Operator(string_ExpressionOperator);
				if (result == null) result = caseOperator(string_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR: {
				Or_EvaluationBitOperator or_EvaluationBitOperator = (Or_EvaluationBitOperator)theEObject;
				T result = caseOr_EvaluationBitOperator(or_EvaluationBitOperator);
				if (result == null) result = caseEvaluationBitOperator(or_EvaluationBitOperator);
				if (result == null) result = caseEvaluationOperator(or_EvaluationBitOperator);
				if (result == null) result = caseBitOperator(or_EvaluationBitOperator);
				if (result == null) result = caseExpressionOperator(or_EvaluationBitOperator);
				if (result == null) result = caseNegatableElement(or_EvaluationBitOperator);
				if (result == null) result = caseOperator(or_EvaluationBitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_TYPE: {
				Character_Type character_Type = (Character_Type)theEObject;
				T result = caseCharacter_Type(character_Type);
				if (result == null) result = caseObject_Type(character_Type);
				if (result == null) result = caseType(character_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER: {
				CharSequence_CalculateableParameter charSequence_CalculateableParameter = (CharSequence_CalculateableParameter)theEObject;
				T result = caseCharSequence_CalculateableParameter(charSequence_CalculateableParameter);
				if (result == null) result = caseCharSequence_Type(charSequence_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(charSequence_CalculateableParameter);
				if (result == null) result = caseObject_Type(charSequence_CalculateableParameter);
				if (result == null) result = caseParameter(charSequence_CalculateableParameter);
				if (result == null) result = caseType(charSequence_CalculateableParameter);
				if (result == null) result = caseTypedElement(charSequence_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR: {
				Character_And_BitOperator character_And_BitOperator = (Character_And_BitOperator)theEObject;
				T result = caseCharacter_And_BitOperator(character_And_BitOperator);
				if (result == null) result = caseCharacter_BitOperator(character_And_BitOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_And_BitOperator);
				if (result == null) result = caseBitOperator(character_And_BitOperator);
				if (result == null) result = caseExpressionOperator(character_And_BitOperator);
				if (result == null) result = caseCharacter_Operator(character_And_BitOperator);
				if (result == null) result = caseNegatableElement(character_And_BitOperator);
				if (result == null) result = caseOperator(character_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE: {
				String_Calculateable string_Calculateable = (String_Calculateable)theEObject;
				T result = caseString_Calculateable(string_Calculateable);
				if (result == null) result = caseCalculateable(string_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_OPERATOR: {
				Character_Operator character_Operator = (Character_Operator)theEObject;
				T result = caseCharacter_Operator(character_Operator);
				if (result == null) result = caseOperator(character_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_TYPE: {
				Number_Type number_Type = (Number_Type)theEObject;
				T result = caseNumber_Type(number_Type);
				if (result == null) result = caseObject_Type(number_Type);
				if (result == null) result = caseType(number_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CODE_POINT_AT_FUNCTIONAL_OPERATOR: {
				codePointAt_FunctionalOperator codePointAt_FunctionalOperator = (codePointAt_FunctionalOperator)theEObject;
				T result = casecodePointAt_FunctionalOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(codePointAt_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseInteger_Type(codePointAt_FunctionalOperator);
				if (result == null) result = caseFunctionalType(codePointAt_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseNumber_Type(codePointAt_FunctionalOperator);
				if (result == null) result = caseOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(codePointAt_FunctionalOperator);
				if (result == null) result = caseString_Operator(codePointAt_FunctionalOperator);
				if (result == null) result = caseTypedElement(codePointAt_FunctionalOperator);
				if (result == null) result = caseObject_Type(codePointAt_FunctionalOperator);
				if (result == null) result = caseType(codePointAt_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_BIT_OPERATOR: {
				Integer_BitOperator integer_BitOperator = (Integer_BitOperator)theEObject;
				T result = caseInteger_BitOperator(integer_BitOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_BitOperator);
				if (result == null) result = caseBitOperator(integer_BitOperator);
				if (result == null) result = caseExpressionOperator(integer_BitOperator);
				if (result == null) result = caseInteger_Operator(integer_BitOperator);
				if (result == null) result = caseNegatableElement(integer_BitOperator);
				if (result == null) result = caseOperator(integer_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_Number_toString_FunctionalOperator object_Number_toString_FunctionalOperator = (Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseObject_Number_toString_FunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Number_FunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_OR_BIT_OPERATOR: {
				String_Or_BitOperator string_Or_BitOperator = (String_Or_BitOperator)theEObject;
				T result = caseString_Or_BitOperator(string_Or_BitOperator);
				if (result == null) result = caseString_BitOperator(string_Or_BitOperator);
				if (result == null) result = caseString_ExpressionOperator(string_Or_BitOperator);
				if (result == null) result = caseBitOperator(string_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(string_Or_BitOperator);
				if (result == null) result = caseString_Operator(string_Or_BitOperator);
				if (result == null) result = caseNegatableElement(string_Or_BitOperator);
				if (result == null) result = caseOperator(string_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_BIT_OPERATOR: {
				Number_BitOperator number_BitOperator = (Number_BitOperator)theEObject;
				T result = caseNumber_BitOperator(number_BitOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_BitOperator);
				if (result == null) result = caseBitOperator(number_BitOperator);
				if (result == null) result = caseExpressionOperator(number_BitOperator);
				if (result == null) result = caseNumber_Operator(number_BitOperator);
				if (result == null) result = caseNegatableElement(number_BitOperator);
				if (result == null) result = caseOperator(number_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SELECT_CLAUSE: {
				SelectClause selectClause = (SelectClause)theEObject;
				T result = caseSelectClause(selectClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT: {
				Number_PrimitiveArgument number_PrimitiveArgument = (Number_PrimitiveArgument)theEObject;
				T result = caseNumber_PrimitiveArgument(number_PrimitiveArgument);
				if (result == null) result = caseNumber_Argument(number_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(number_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(number_PrimitiveArgument);
				if (result == null) result = caseNumber_FunctionalType(number_PrimitiveArgument);
				if (result == null) result = caseArgument(number_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(number_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(number_PrimitiveArgument);
				if (result == null) result = caseTypedElement(number_PrimitiveArgument);
				if (result == null) result = caseObject_Type(number_PrimitiveArgument);
				if (result == null) result = caseType(number_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE: {
				Max_AggregationOperator_Double max_AggregationOperator_Double = (Max_AggregationOperator_Double)theEObject;
				T result = caseMax_AggregationOperator_Double(max_AggregationOperator_Double);
				if (result == null) result = caseCalculatingAggregationOperator(max_AggregationOperator_Double);
				if (result == null) result = caseDouble_EvaluationOperation_Argument(max_AggregationOperator_Double);
				if (result == null) result = caseAggregationOperator(max_AggregationOperator_Double);
				if (result == null) result = caseEvaluationOperation_Argument(max_AggregationOperator_Double);
				if (result == null) result = caseDouble_Argument(max_AggregationOperator_Double);
				if (result == null) result = caseEvaluationFunctionalOperator(max_AggregationOperator_Double);
				if (result == null) result = caseInteger_Calculateable(max_AggregationOperator_Double);
				if (result == null) result = caseCalculateable_Argument(max_AggregationOperator_Double);
				if (result == null) result = caseDouble_FunctionalType(max_AggregationOperator_Double);
				if (result == null) result = caseEvaluationOperator(max_AggregationOperator_Double);
				if (result == null) result = caseFunctionalOperator(max_AggregationOperator_Double);
				if (result == null) result = caseCalculateable(max_AggregationOperator_Double);
				if (result == null) result = caseReferenceArgument(max_AggregationOperator_Double);
				if (result == null) result = caseFunctionalArgument(max_AggregationOperator_Double);
				if (result == null) result = caseDouble_Type(max_AggregationOperator_Double);
				if (result == null) result = caseFunctionalType(max_AggregationOperator_Double);
				if (result == null) result = caseExpressionOperator(max_AggregationOperator_Double);
				if (result == null) result = caseArgument(max_AggregationOperator_Double);
				if (result == null) result = caseNumber_Type(max_AggregationOperator_Double);
				if (result == null) result = caseOperator(max_AggregationOperator_Double);
				if (result == null) result = caseTypedElement(max_AggregationOperator_Double);
				if (result == null) result = caseObject_Type(max_AggregationOperator_Double);
				if (result == null) result = caseType(max_AggregationOperator_Double);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR: {
				And_EvaluationBitOperator and_EvaluationBitOperator = (And_EvaluationBitOperator)theEObject;
				T result = caseAnd_EvaluationBitOperator(and_EvaluationBitOperator);
				if (result == null) result = caseEvaluationBitOperator(and_EvaluationBitOperator);
				if (result == null) result = caseEvaluationOperator(and_EvaluationBitOperator);
				if (result == null) result = caseBitOperator(and_EvaluationBitOperator);
				if (result == null) result = caseExpressionOperator(and_EvaluationBitOperator);
				if (result == null) result = caseNegatableElement(and_EvaluationBitOperator);
				if (result == null) result = caseOperator(and_EvaluationBitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_Character_FunctionalOperator inheritedFrom_Object_to_Character_FunctionalOperator = (InheritedFrom_Object_to_Character_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_Character_FunctionalOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_CALCULATEABLE: {
				Number_Calculateable number_Calculateable = (Number_Calculateable)theEObject;
				T result = caseNumber_Calculateable(number_Calculateable);
				if (result == null) result = caseCalculateable(number_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument = (String_CalculateableElementReferenceArgument)theEObject;
				T result = caseString_CalculateableElementReferenceArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateableElement_ReferenceArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseString_FunctionalType(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseString_Type(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalType(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseReferenceArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseCharSequence_Type(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseObject_Type(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseTypedElement(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseType(string_CalculateableElementReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR: {
				offsetByCodePoints_FunctionalOperator offsetByCodePoints_FunctionalOperator = (offsetByCodePoints_FunctionalOperator)theEObject;
				T result = caseoffsetByCodePoints_FunctionalOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseInteger_Type(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseFunctionalType(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseNumber_Type(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseString_Operator(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseTypedElement(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseObject_Type(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = caseType(offsetByCodePoints_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_ARGUMENT: {
				Number_Argument number_Argument = (Number_Argument)theEObject;
				T result = caseNumber_Argument(number_Argument);
				if (result == null) result = caseFunctionalArgument(number_Argument);
				if (result == null) result = caseNumber_FunctionalType(number_Argument);
				if (result == null) result = caseArgument(number_Argument);
				if (result == null) result = caseNumber_Type(number_Argument);
				if (result == null) result = caseFunctionalType(number_Argument);
				if (result == null) result = caseTypedElement(number_Argument);
				if (result == null) result = caseObject_Type(number_Argument);
				if (result == null) result = caseType(number_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_FUNCTIONAL_OPERATOR: {
				Object_FunctionalOperator object_FunctionalOperator = (Object_FunctionalOperator)theEObject;
				T result = caseObject_FunctionalOperator(object_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_FunctionalOperator);
				if (result == null) result = caseObject_Operator(object_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_FunctionalOperator);
				if (result == null) result = caseOperator(object_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_ARGUMENT: {
				String_Argument string_Argument = (String_Argument)theEObject;
				T result = caseString_Argument(string_Argument);
				if (result == null) result = caseFunctionalArgument(string_Argument);
				if (result == null) result = caseString_FunctionalType(string_Argument);
				if (result == null) result = caseArgument(string_Argument);
				if (result == null) result = caseString_Type(string_Argument);
				if (result == null) result = caseFunctionalType(string_Argument);
				if (result == null) result = caseTypedElement(string_Argument);
				if (result == null) result = caseCharSequence_Type(string_Argument);
				if (result == null) result = caseObject_Type(string_Argument);
				if (result == null) result = caseType(string_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR: {
				indexOfCharFromIndex_FunctionalOperator indexOfCharFromIndex_FunctionalOperator = (indexOfCharFromIndex_FunctionalOperator)theEObject;
				T result = caseindexOfCharFromIndex_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseInteger_Type(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseFunctionalType(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseNumber_Type(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseString_Operator(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseTypedElement(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseObject_Type(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = caseType(indexOfCharFromIndex_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_EVALUATION_OPERATION_ARGUMENT: {
				Double_EvaluationOperation_Argument double_EvaluationOperation_Argument = (Double_EvaluationOperation_Argument)theEObject;
				T result = caseDouble_EvaluationOperation_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseDouble_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseDouble_FunctionalType(double_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(double_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(double_EvaluationOperation_Argument);
				if (result == null) result = caseDouble_Type(double_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(double_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(double_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(double_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(double_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(double_EvaluationOperation_Argument);
				if (result == null) result = caseType(double_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_AND_BIT_OPERATOR: {
				Number_And_BitOperator number_And_BitOperator = (Number_And_BitOperator)theEObject;
				T result = caseNumber_And_BitOperator(number_And_BitOperator);
				if (result == null) result = caseNumber_BitOperator(number_And_BitOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_And_BitOperator);
				if (result == null) result = caseBitOperator(number_And_BitOperator);
				if (result == null) result = caseExpressionOperator(number_And_BitOperator);
				if (result == null) result = caseNumber_Operator(number_And_BitOperator);
				if (result == null) result = caseNegatableElement(number_And_BitOperator);
				if (result == null) result = caseOperator(number_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTABLE: {
				Countable countable = (Countable)theEObject;
				T result = caseCountable(countable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE: {
				Boolean_FunctionalType boolean_FunctionalType = (Boolean_FunctionalType)theEObject;
				T result = caseBoolean_FunctionalType(boolean_FunctionalType);
				if (result == null) result = caseBoolean_Type(boolean_FunctionalType);
				if (result == null) result = caseFunctionalType(boolean_FunctionalType);
				if (result == null) result = caseNegatableElement(boolean_FunctionalType);
				if (result == null) result = caseObject_Type(boolean_FunctionalType);
				if (result == null) result = caseType(boolean_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				CalculateableElement_ReferenceArgument calculateableElement_ReferenceArgument = (CalculateableElement_ReferenceArgument)theEObject;
				T result = caseCalculateableElement_ReferenceArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseReferenceArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseFunctionalArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseTypedElement(calculateableElement_ReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR: {
				endsWith_FunctionalOperator endsWith_FunctionalOperator = (endsWith_FunctionalOperator)theEObject;
				T result = caseendsWith_FunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(endsWith_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(endsWith_FunctionalOperator);
				if (result == null) result = caseFunctionalType(endsWith_FunctionalOperator);
				if (result == null) result = caseNegatableElement(endsWith_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseObject_Type(endsWith_FunctionalOperator);
				if (result == null) result = caseOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseString_Operator(endsWith_FunctionalOperator);
				if (result == null) result = caseTypedElement(endsWith_FunctionalOperator);
				if (result == null) result = caseType(endsWith_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR: {
				startsWithOffset_FunctionalOperator startsWithOffset_FunctionalOperator = (startsWithOffset_FunctionalOperator)theEObject;
				T result = casestartsWithOffset_FunctionalOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseFunctionalType(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseNegatableElement(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseObject_Type(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseString_Operator(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseTypedElement(startsWithOffset_FunctionalOperator);
				if (result == null) result = caseType(startsWithOffset_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FUNCTIONAL_OPERATOR: {
				Number_FunctionalOperator number_FunctionalOperator = (Number_FunctionalOperator)theEObject;
				T result = caseNumber_FunctionalOperator(number_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_FunctionalOperator);
				if (result == null) result = caseOperator(number_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(number_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FIND_QUERY_COLLECTION: {
				FindQueryCollection findQueryCollection = (FindQueryCollection)theEObject;
				T result = caseFindQueryCollection(findQueryCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PROFESSOR_CONTAINMENT_OR_GROUP: {
				Professor_Containment_OrGroup professor_Containment_OrGroup = (Professor_Containment_OrGroup)theEObject;
				T result = caseProfessor_Containment_OrGroup(professor_Containment_OrGroup);
				if (result == null) result = caseContainment_OrGroup(professor_Containment_OrGroup);
				if (result == null) result = caseOrGroup(professor_Containment_OrGroup);
				if (result == null) result = caseNamedElement(professor_Containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(professor_Containment_OrGroup);
				if (result == null) result = caseNegatableElement(professor_Containment_OrGroup);
				if (result == null) result = caseCountable(professor_Containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_CALCULATEABLE_ELEMENT: {
				Number_CalculateableElement number_CalculateableElement = (Number_CalculateableElement)theEObject;
				T result = caseNumber_CalculateableElement(number_CalculateableElement);
				if (result == null) result = caseNumber_Calculateable(number_CalculateableElement);
				if (result == null) result = caseCalculateableElement(number_CalculateableElement);
				if (result == null) result = caseCalculateable(number_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_BIT_OPERATOR: {
				Double_BitOperator double_BitOperator = (Double_BitOperator)theEObject;
				T result = caseDouble_BitOperator(double_BitOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_BitOperator);
				if (result == null) result = caseBitOperator(double_BitOperator);
				if (result == null) result = caseExpressionOperator(double_BitOperator);
				if (result == null) result = caseDouble_Operator(double_BitOperator);
				if (result == null) result = caseNegatableElement(double_BitOperator);
				if (result == null) result = caseOperator(double_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_COURSE_TYPE_ATTR_ECLASS: {
				Course_courseType_AttrEClass course_courseType_AttrEClass = (Course_courseType_AttrEClass)theEObject;
				T result = caseCourse_courseType_AttrEClass(course_courseType_AttrEClass);
				if (result == null) result = caseCourseType_AttributeEClass(course_courseType_AttrEClass);
				if (result == null) result = caseEnumerationAttributeEClass(course_courseType_AttrEClass);
				if (result == null) result = caseAttributeEClass(course_courseType_AttrEClass);
				if (result == null) result = caseNamedElement(course_courseType_AttrEClass);
				if (result == null) result = caseNegatableElement(course_courseType_AttrEClass);
				if (result == null) result = caseCountable(course_courseType_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_CALCULATEABLE_ELEMENT: {
				Character_CalculateableElement character_CalculateableElement = (Character_CalculateableElement)theEObject;
				T result = caseCharacter_CalculateableElement(character_CalculateableElement);
				if (result == null) result = caseCharacter_Calculateable(character_CalculateableElement);
				if (result == null) result = caseCalculateableElement(character_CalculateableElement);
				if (result == null) result = caseCalculateable(character_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER: {
				Boolean_CalculateableParameter boolean_CalculateableParameter = (Boolean_CalculateableParameter)theEObject;
				T result = caseBoolean_CalculateableParameter(boolean_CalculateableParameter);
				if (result == null) result = caseBoolean_Type(boolean_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(boolean_CalculateableParameter);
				if (result == null) result = caseObject_Type(boolean_CalculateableParameter);
				if (result == null) result = caseParameter(boolean_CalculateableParameter);
				if (result == null) result = caseType(boolean_CalculateableParameter);
				if (result == null) result = caseTypedElement(boolean_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR: {
				Character_FunctionalOperator character_FunctionalOperator = (Character_FunctionalOperator)theEObject;
				T result = caseCharacter_FunctionalOperator(character_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(character_FunctionalOperator);
				if (result == null) result = caseOperator(character_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(character_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(character_FunctionalOperator);
				if (result == null) result = caseTypedElement(character_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER: {
				Character_CalculateableParameter character_CalculateableParameter = (Character_CalculateableParameter)theEObject;
				T result = caseCharacter_CalculateableParameter(character_CalculateableParameter);
				if (result == null) result = caseCharacter_Type(character_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(character_CalculateableParameter);
				if (result == null) result = caseObject_Type(character_CalculateableParameter);
				if (result == null) result = caseParameter(character_CalculateableParameter);
				if (result == null) result = caseType(character_CalculateableParameter);
				if (result == null) result = caseTypedElement(character_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS: {
				RegularAttributeEClass regularAttributeEClass = (RegularAttributeEClass)theEObject;
				T result = caseRegularAttributeEClass(regularAttributeEClass);
				if (result == null) result = caseAttributeEClass(regularAttributeEClass);
				if (result == null) result = caseGeneralizableElement(regularAttributeEClass);
				if (result == null) result = caseNamedElement(regularAttributeEClass);
				if (result == null) result = caseNegatableElement(regularAttributeEClass);
				if (result == null) result = caseCountable(regularAttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_BIT_OPERATOR: {
				String_BitOperator string_BitOperator = (String_BitOperator)theEObject;
				T result = caseString_BitOperator(string_BitOperator);
				if (result == null) result = caseString_ExpressionOperator(string_BitOperator);
				if (result == null) result = caseBitOperator(string_BitOperator);
				if (result == null) result = caseExpressionOperator(string_BitOperator);
				if (result == null) result = caseString_Operator(string_BitOperator);
				if (result == null) result = caseNegatableElement(string_BitOperator);
				if (result == null) result = caseOperator(string_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_ARGUMENT: {
				Character_Argument character_Argument = (Character_Argument)theEObject;
				T result = caseCharacter_Argument(character_Argument);
				if (result == null) result = caseFunctionalArgument(character_Argument);
				if (result == null) result = caseCharacter_FunctionalType(character_Argument);
				if (result == null) result = caseArgument(character_Argument);
				if (result == null) result = caseCharacter_Type(character_Argument);
				if (result == null) result = caseFunctionalType(character_Argument);
				if (result == null) result = caseTypedElement(character_Argument);
				if (result == null) result = caseObject_Type(character_Argument);
				if (result == null) result = caseType(character_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PERSON_REFERENCE_OR_GROUP: {
				Person_Reference_OrGroup person_Reference_OrGroup = (Person_Reference_OrGroup)theEObject;
				T result = casePerson_Reference_OrGroup(person_Reference_OrGroup);
				if (result == null) result = caseReference_OrGroup(person_Reference_OrGroup);
				if (result == null) result = caseOrGroup(person_Reference_OrGroup);
				if (result == null) result = caseNamedElement(person_Reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(person_Reference_OrGroup);
				if (result == null) result = caseNegatableElement(person_Reference_OrGroup);
				if (result == null) result = caseCountable(person_Reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_ELEMENT: {
				CharSequence_CalculateableElement charSequence_CalculateableElement = (CharSequence_CalculateableElement)theEObject;
				T result = caseCharSequence_CalculateableElement(charSequence_CalculateableElement);
				if (result == null) result = caseCharSequence_Calculateable(charSequence_CalculateableElement);
				if (result == null) result = caseCalculateableElement(charSequence_CalculateableElement);
				if (result == null) result = caseCalculateable(charSequence_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR: {
				CharSequence_FunctionalOperator charSequence_FunctionalOperator = (CharSequence_FunctionalOperator)theEObject;
				T result = caseCharSequence_FunctionalOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT: {
				Character_PrimitiveArgument character_PrimitiveArgument = (Character_PrimitiveArgument)theEObject;
				T result = caseCharacter_PrimitiveArgument(character_PrimitiveArgument);
				if (result == null) result = caseCharacter_Argument(character_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(character_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(character_PrimitiveArgument);
				if (result == null) result = caseCharacter_FunctionalType(character_PrimitiveArgument);
				if (result == null) result = caseArgument(character_PrimitiveArgument);
				if (result == null) result = caseCharacter_Type(character_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(character_PrimitiveArgument);
				if (result == null) result = caseTypedElement(character_PrimitiveArgument);
				if (result == null) result = caseObject_Type(character_PrimitiveArgument);
				if (result == null) result = caseType(character_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_EXPRESSION_OPERATOR: {
				Integer_ExpressionOperator integer_ExpressionOperator = (Integer_ExpressionOperator)theEObject;
				T result = caseInteger_ExpressionOperator(integer_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(integer_ExpressionOperator);
				if (result == null) result = caseInteger_Operator(integer_ExpressionOperator);
				if (result == null) result = caseOperator(integer_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_TYPE: {
				Boolean_Type boolean_Type = (Boolean_Type)theEObject;
				T result = caseBoolean_Type(boolean_Type);
				if (result == null) result = caseObject_Type(boolean_Type);
				if (result == null) result = caseType(boolean_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR: {
				parseBoolean_FunctionalOperator parseBoolean_FunctionalOperator = (parseBoolean_FunctionalOperator)theEObject;
				T result = caseparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Original_FunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(parseBoolean_FunctionalOperator);
				if (result == null) result = caseFunctionalType(parseBoolean_FunctionalOperator);
				if (result == null) result = caseNegatableElement(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseObject_Type(parseBoolean_FunctionalOperator);
				if (result == null) result = caseOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(parseBoolean_FunctionalOperator);
				if (result == null) result = caseType(parseBoolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Integer_greaterThan_FunctionalOperator number_Integer_greaterThan_FunctionalOperator = (Number_Integer_greaterThan_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_greaterThan_FunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Number_to_Double_FunctionalOperator inheritedFrom_Number_to_Double_FunctionalOperator = (InheritedFrom_Number_to_Double_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Number_to_Double_FunctionalOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_OPERATOR: {
				EvaluationOperator evaluationOperator = (EvaluationOperator)theEObject;
				T result = caseEvaluationOperator(evaluationOperator);
				if (result == null) result = caseOperator(evaluationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PERSON_EMAIL_ATTR_ECLASS: {
				Person_email_AttrEClass person_email_AttrEClass = (Person_email_AttrEClass)theEObject;
				T result = casePerson_email_AttrEClass(person_email_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(person_email_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(person_email_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(person_email_AttrEClass);
				if (result == null) result = caseAttributeEClass(person_email_AttrEClass);
				if (result == null) result = caseGeneralizableElement(person_email_AttrEClass);
				if (result == null) result = caseString_Calculateable(person_email_AttrEClass);
				if (result == null) result = caseCalculateableElement(person_email_AttrEClass);
				if (result == null) result = caseNamedElement(person_email_AttrEClass);
				if (result == null) result = caseNegatableElement(person_email_AttrEClass);
				if (result == null) result = caseCountable(person_email_AttrEClass);
				if (result == null) result = caseCalculateable(person_email_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_ATTRIBUTE_ECLASS: {
				Integer_AttributeEClass integer_AttributeEClass = (Integer_AttributeEClass)theEObject;
				T result = caseInteger_AttributeEClass(integer_AttributeEClass);
				if (result == null) result = caseRegularAttributeEClass(integer_AttributeEClass);
				if (result == null) result = caseInteger_CalculateableElement(integer_AttributeEClass);
				if (result == null) result = caseAttributeEClass(integer_AttributeEClass);
				if (result == null) result = caseGeneralizableElement(integer_AttributeEClass);
				if (result == null) result = caseInteger_Calculateable(integer_AttributeEClass);
				if (result == null) result = caseCalculateableElement(integer_AttributeEClass);
				if (result == null) result = caseNamedElement(integer_AttributeEClass);
				if (result == null) result = caseNegatableElement(integer_AttributeEClass);
				if (result == null) result = caseCountable(integer_AttributeEClass);
				if (result == null) result = caseCalculateable(integer_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_TYPE_ENUMERATION_OPERATOR: {
				CourseType_EnumerationOperator courseType_EnumerationOperator = (CourseType_EnumerationOperator)theEObject;
				T result = caseCourseType_EnumerationOperator(courseType_EnumerationOperator);
				if (result == null) result = caseEnumerationOperator(courseType_EnumerationOperator);
				if (result == null) result = caseCourseType_Operator(courseType_EnumerationOperator);
				if (result == null) result = caseOperator(courseType_EnumerationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MAX_AGGREGATION_OPERATOR_INTEGER: {
				Max_AggregationOperator_Integer max_AggregationOperator_Integer = (Max_AggregationOperator_Integer)theEObject;
				T result = caseMax_AggregationOperator_Integer(max_AggregationOperator_Integer);
				if (result == null) result = caseCalculatingAggregationOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(max_AggregationOperator_Integer);
				if (result == null) result = caseAggregationOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationOperation_Argument(max_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Argument(max_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationFunctionalOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Calculateable(max_AggregationOperator_Integer);
				if (result == null) result = caseCalculateable_Argument(max_AggregationOperator_Integer);
				if (result == null) result = caseInteger_FunctionalType(max_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseCalculateable(max_AggregationOperator_Integer);
				if (result == null) result = caseReferenceArgument(max_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalArgument(max_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Type(max_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalType(max_AggregationOperator_Integer);
				if (result == null) result = caseExpressionOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseArgument(max_AggregationOperator_Integer);
				if (result == null) result = caseNumber_Type(max_AggregationOperator_Integer);
				if (result == null) result = caseOperator(max_AggregationOperator_Integer);
				if (result == null) result = caseTypedElement(max_AggregationOperator_Integer);
				if (result == null) result = caseObject_Type(max_AggregationOperator_Integer);
				if (result == null) result = caseType(max_AggregationOperator_Integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR: {
				CharSequence_Original_FunctionalOperator charSequence_Original_FunctionalOperator = (CharSequence_Original_FunctionalOperator)theEObject;
				T result = caseCharSequence_Original_FunctionalOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERALIZABLE_ELEMENT: {
				GeneralizableElement generalizableElement = (GeneralizableElement)theEObject;
				T result = caseGeneralizableElement(generalizableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_CONTAINMENT_OR_GROUP: {
				Course_Containment_OrGroup course_Containment_OrGroup = (Course_Containment_OrGroup)theEObject;
				T result = caseCourse_Containment_OrGroup(course_Containment_OrGroup);
				if (result == null) result = caseContainment_OrGroup(course_Containment_OrGroup);
				if (result == null) result = caseOrGroup(course_Containment_OrGroup);
				if (result == null) result = caseNamedElement(course_Containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(course_Containment_OrGroup);
				if (result == null) result = caseNegatableElement(course_Containment_OrGroup);
				if (result == null) result = caseCountable(course_Containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_FUNCTIONAL_TYPE: {
				Double_FunctionalType double_FunctionalType = (Double_FunctionalType)theEObject;
				T result = caseDouble_FunctionalType(double_FunctionalType);
				if (result == null) result = caseDouble_Type(double_FunctionalType);
				if (result == null) result = caseFunctionalType(double_FunctionalType);
				if (result == null) result = caseNumber_Type(double_FunctionalType);
				if (result == null) result = caseObject_Type(double_FunctionalType);
				if (result == null) result = caseType(double_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_FUNCTIONAL_TYPE: {
				Object_FunctionalType object_FunctionalType = (Object_FunctionalType)theEObject;
				T result = caseObject_FunctionalType(object_FunctionalType);
				if (result == null) result = caseObject_Type(object_FunctionalType);
				if (result == null) result = caseFunctionalType(object_FunctionalType);
				if (result == null) result = caseType(object_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CLASS_OPERATOR: {
				ClassOperator classOperator = (ClassOperator)theEObject;
				T result = caseClassOperator(classOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(classOperator);
				if (result == null) result = caseEvaluationOperator(classOperator);
				if (result == null) result = caseFunctionalOperator(classOperator);
				if (result == null) result = caseExpressionOperator(classOperator);
				if (result == null) result = caseTypedElement(classOperator);
				if (result == null) result = caseOperator(classOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_FUNCTIONAL_TYPE: {
				Integer_FunctionalType integer_FunctionalType = (Integer_FunctionalType)theEObject;
				T result = caseInteger_FunctionalType(integer_FunctionalType);
				if (result == null) result = caseInteger_Type(integer_FunctionalType);
				if (result == null) result = caseFunctionalType(integer_FunctionalType);
				if (result == null) result = caseNumber_Type(integer_FunctionalType);
				if (result == null) result = caseObject_Type(integer_FunctionalType);
				if (result == null) result = caseType(integer_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_ATTRIBUTE_ECLASS: {
				String_AttributeEClass string_AttributeEClass = (String_AttributeEClass)theEObject;
				T result = caseString_AttributeEClass(string_AttributeEClass);
				if (result == null) result = caseRegularAttributeEClass(string_AttributeEClass);
				if (result == null) result = caseString_CalculateableElement(string_AttributeEClass);
				if (result == null) result = caseAttributeEClass(string_AttributeEClass);
				if (result == null) result = caseGeneralizableElement(string_AttributeEClass);
				if (result == null) result = caseString_Calculateable(string_AttributeEClass);
				if (result == null) result = caseCalculateableElement(string_AttributeEClass);
				if (result == null) result = caseNamedElement(string_AttributeEClass);
				if (result == null) result = caseNegatableElement(string_AttributeEClass);
				if (result == null) result = caseCountable(string_AttributeEClass);
				if (result == null) result = caseCalculateable(string_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT: {
				Boolean_PrimitiveArgument boolean_PrimitiveArgument = (Boolean_PrimitiveArgument)theEObject;
				T result = caseBoolean_PrimitiveArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseBoolean_Argument(boolean_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseBoolean_FunctionalType(boolean_PrimitiveArgument);
				if (result == null) result = caseArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseBoolean_Type(boolean_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(boolean_PrimitiveArgument);
				if (result == null) result = caseNegatableElement(boolean_PrimitiveArgument);
				if (result == null) result = caseTypedElement(boolean_PrimitiveArgument);
				if (result == null) result = caseObject_Type(boolean_PrimitiveArgument);
				if (result == null) result = caseType(boolean_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_EVALUATION_OPERATION_ARGUMENT: {
				String_EvaluationOperation_Argument string_EvaluationOperation_Argument = (String_EvaluationOperation_Argument)theEObject;
				T result = caseString_EvaluationOperation_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseString_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseString_FunctionalType(string_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(string_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(string_EvaluationOperation_Argument);
				if (result == null) result = caseString_Type(string_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(string_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(string_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_Type(string_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(string_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(string_EvaluationOperation_Argument);
				if (result == null) result = caseType(string_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT: {
				Integer_CalculateableElement integer_CalculateableElement = (Integer_CalculateableElement)theEObject;
				T result = caseInteger_CalculateableElement(integer_CalculateableElement);
				if (result == null) result = caseInteger_Calculateable(integer_CalculateableElement);
				if (result == null) result = caseCalculateableElement(integer_CalculateableElement);
				if (result == null) result = caseCalculateable(integer_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUM_AGGREGATION_OPERATOR_INTEGER: {
				Sum_AggregationOperator_Integer sum_AggregationOperator_Integer = (Sum_AggregationOperator_Integer)theEObject;
				T result = caseSum_AggregationOperator_Integer(sum_AggregationOperator_Integer);
				if (result == null) result = caseCalculatingAggregationOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(sum_AggregationOperator_Integer);
				if (result == null) result = caseAggregationOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationOperation_Argument(sum_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Argument(sum_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationFunctionalOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Calculateable(sum_AggregationOperator_Integer);
				if (result == null) result = caseCalculateable_Argument(sum_AggregationOperator_Integer);
				if (result == null) result = caseInteger_FunctionalType(sum_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseCalculateable(sum_AggregationOperator_Integer);
				if (result == null) result = caseReferenceArgument(sum_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalArgument(sum_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Type(sum_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalType(sum_AggregationOperator_Integer);
				if (result == null) result = caseExpressionOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseArgument(sum_AggregationOperator_Integer);
				if (result == null) result = caseNumber_Type(sum_AggregationOperator_Integer);
				if (result == null) result = caseOperator(sum_AggregationOperator_Integer);
				if (result == null) result = caseTypedElement(sum_AggregationOperator_Integer);
				if (result == null) result = caseObject_Type(sum_AggregationOperator_Integer);
				if (result == null) result = caseType(sum_AggregationOperator_Integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_PARAMETER: {
				FunctionalParameter functionalParameter = (FunctionalParameter)theEObject;
				T result = caseFunctionalParameter(functionalParameter);
				if (result == null) result = caseParameter(functionalParameter);
				if (result == null) result = caseTypedElement(functionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ENUMERATION_OPERATOR: {
				EnumerationOperator enumerationOperator = (EnumerationOperator)theEObject;
				T result = caseEnumerationOperator(enumerationOperator);
				if (result == null) result = caseOperator(enumerationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Double_greaterEquals_FunctionalOperator number_Double_greaterEquals_FunctionalOperator = (Number_Double_greaterEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Double_greaterEquals_FunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER: {
				Integer_CalculateableParameter integer_CalculateableParameter = (Integer_CalculateableParameter)theEObject;
				T result = caseInteger_CalculateableParameter(integer_CalculateableParameter);
				if (result == null) result = caseInteger_Type(integer_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(integer_CalculateableParameter);
				if (result == null) result = caseNumber_Type(integer_CalculateableParameter);
				if (result == null) result = caseParameter(integer_CalculateableParameter);
				if (result == null) result = caseObject_Type(integer_CalculateableParameter);
				if (result == null) result = caseTypedElement(integer_CalculateableParameter);
				if (result == null) result = caseType(integer_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_TYPE: {
				CharSequence_FunctionalType charSequence_FunctionalType = (CharSequence_FunctionalType)theEObject;
				T result = caseCharSequence_FunctionalType(charSequence_FunctionalType);
				if (result == null) result = caseCharSequence_Type(charSequence_FunctionalType);
				if (result == null) result = caseFunctionalType(charSequence_FunctionalType);
				if (result == null) result = caseObject_Type(charSequence_FunctionalType);
				if (result == null) result = caseType(charSequence_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT: {
				String_CalculateableElement string_CalculateableElement = (String_CalculateableElement)theEObject;
				T result = caseString_CalculateableElement(string_CalculateableElement);
				if (result == null) result = caseString_Calculateable(string_CalculateableElement);
				if (result == null) result = caseCalculateableElement(string_CalculateableElement);
				if (result == null) result = caseCalculateable(string_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Number_to_Integer_FunctionalOperator inheritedFrom_Number_to_Integer_FunctionalOperator = (InheritedFrom_Number_to_Integer_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR: {
				CharSequence_String_length_FunctionalOperator charSequence_String_length_FunctionalOperator = (CharSequence_String_length_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_length_FunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseInteger_Type(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseNumber_Type(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_length_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE: {
				CharSequence_Calculateable charSequence_Calculateable = (CharSequence_Calculateable)theEObject;
				T result = caseCharSequence_Calculateable(charSequence_Calculateable);
				if (result == null) result = caseCalculateable(charSequence_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_EXPRESSION_OPERATOR: {
				CharSequence_ExpressionOperator charSequence_ExpressionOperator = (CharSequence_ExpressionOperator)theEObject;
				T result = caseCharSequence_ExpressionOperator(charSequence_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(charSequence_ExpressionOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_ExpressionOperator);
				if (result == null) result = caseOperator(charSequence_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR: {
				indexOfString_FunctionalOperator indexOfString_FunctionalOperator = (indexOfString_FunctionalOperator)theEObject;
				T result = caseindexOfString_FunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseInteger_Type(indexOfString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseNumber_Type(indexOfString_FunctionalOperator);
				if (result == null) result = caseOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_Operator(indexOfString_FunctionalOperator);
				if (result == null) result = caseTypedElement(indexOfString_FunctionalOperator);
				if (result == null) result = caseObject_Type(indexOfString_FunctionalOperator);
				if (result == null) result = caseType(indexOfString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TRIM_FUNCTIONAL_OPERATOR: {
				trim_FunctionalOperator trim_FunctionalOperator = (trim_FunctionalOperator)theEObject;
				T result = casetrim_FunctionalOperator(trim_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(trim_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(trim_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(trim_FunctionalOperator);
				if (result == null) result = caseString_Type(trim_FunctionalOperator);
				if (result == null) result = caseFunctionalType(trim_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(trim_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(trim_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(trim_FunctionalOperator);
				if (result == null) result = caseOperator(trim_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(trim_FunctionalOperator);
				if (result == null) result = caseString_Operator(trim_FunctionalOperator);
				if (result == null) result = caseTypedElement(trim_FunctionalOperator);
				if (result == null) result = caseObject_Type(trim_FunctionalOperator);
				if (result == null) result = caseType(trim_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				greaterEquals_FunctionalOperator greaterEquals_FunctionalOperator = (greaterEquals_FunctionalOperator)theEObject;
				T result = casegreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STUDENT_REFERENCE_OR_GROUP: {
				Student_Reference_OrGroup student_Reference_OrGroup = (Student_Reference_OrGroup)theEObject;
				T result = caseStudent_Reference_OrGroup(student_Reference_OrGroup);
				if (result == null) result = caseReference_OrGroup(student_Reference_OrGroup);
				if (result == null) result = caseOrGroup(student_Reference_OrGroup);
				if (result == null) result = caseNamedElement(student_Reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(student_Reference_OrGroup);
				if (result == null) result = caseNegatableElement(student_Reference_OrGroup);
				if (result == null) result = caseCountable(student_Reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_AND_BIT_OPERATOR: {
				String_And_BitOperator string_And_BitOperator = (String_And_BitOperator)theEObject;
				T result = caseString_And_BitOperator(string_And_BitOperator);
				if (result == null) result = caseString_BitOperator(string_And_BitOperator);
				if (result == null) result = caseString_ExpressionOperator(string_And_BitOperator);
				if (result == null) result = caseBitOperator(string_And_BitOperator);
				if (result == null) result = caseExpressionOperator(string_And_BitOperator);
				if (result == null) result = caseString_Operator(string_And_BitOperator);
				if (result == null) result = caseNegatableElement(string_And_BitOperator);
				if (result == null) result = caseOperator(string_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_ELEMENT: {
				CalculateableElement calculateableElement = (CalculateableElement)theEObject;
				T result = caseCalculateableElement(calculateableElement);
				if (result == null) result = caseCalculateable(calculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_COURSE_NUMBER_ATTR_ECLASS: {
				Course_courseNumber_AttrEClass course_courseNumber_AttrEClass = (Course_courseNumber_AttrEClass)theEObject;
				T result = caseCourse_courseNumber_AttrEClass(course_courseNumber_AttrEClass);
				if (result == null) result = caseInteger_AttributeEClass(course_courseNumber_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(course_courseNumber_AttrEClass);
				if (result == null) result = caseInteger_CalculateableElement(course_courseNumber_AttrEClass);
				if (result == null) result = caseAttributeEClass(course_courseNumber_AttrEClass);
				if (result == null) result = caseGeneralizableElement(course_courseNumber_AttrEClass);
				if (result == null) result = caseInteger_Calculateable(course_courseNumber_AttrEClass);
				if (result == null) result = caseCalculateableElement(course_courseNumber_AttrEClass);
				if (result == null) result = caseNamedElement(course_courseNumber_AttrEClass);
				if (result == null) result = caseNegatableElement(course_courseNumber_AttrEClass);
				if (result == null) result = caseCountable(course_courseNumber_AttrEClass);
				if (result == null) result = caseCalculateable(course_courseNumber_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_EVALUATION_OPERATION_ARGUMENT: {
				Boolean_EvaluationOperation_Argument boolean_EvaluationOperation_Argument = (Boolean_EvaluationOperation_Argument)theEObject;
				T result = caseBoolean_EvaluationOperation_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseBoolean_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseBoolean_FunctionalType(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseBoolean_Type(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseNegatableElement(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseType(boolean_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR: {
				greaterThan_FunctionalOperator greaterThan_FunctionalOperator = (greaterThan_FunctionalOperator)theEObject;
				T result = casegreaterThan_FunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(greaterThan_FunctionalOperator);
				if (result == null) result = caseType(greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNT_AGGREGATION_OPERATOR: {
				Count_AggregationOperator count_AggregationOperator = (Count_AggregationOperator)theEObject;
				T result = caseCount_AggregationOperator(count_AggregationOperator);
				if (result == null) result = caseCountingAggregationOperator(count_AggregationOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(count_AggregationOperator);
				if (result == null) result = caseAggregationOperator(count_AggregationOperator);
				if (result == null) result = caseEvaluationOperation_Argument(count_AggregationOperator);
				if (result == null) result = caseInteger_Argument(count_AggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(count_AggregationOperator);
				if (result == null) result = caseInteger_Calculateable(count_AggregationOperator);
				if (result == null) result = caseCalculateable_Argument(count_AggregationOperator);
				if (result == null) result = caseInteger_FunctionalType(count_AggregationOperator);
				if (result == null) result = caseEvaluationOperator(count_AggregationOperator);
				if (result == null) result = caseFunctionalOperator(count_AggregationOperator);
				if (result == null) result = caseCalculateable(count_AggregationOperator);
				if (result == null) result = caseReferenceArgument(count_AggregationOperator);
				if (result == null) result = caseFunctionalArgument(count_AggregationOperator);
				if (result == null) result = caseInteger_Type(count_AggregationOperator);
				if (result == null) result = caseFunctionalType(count_AggregationOperator);
				if (result == null) result = caseExpressionOperator(count_AggregationOperator);
				if (result == null) result = caseArgument(count_AggregationOperator);
				if (result == null) result = caseNumber_Type(count_AggregationOperator);
				if (result == null) result = caseOperator(count_AggregationOperator);
				if (result == null) result = caseTypedElement(count_AggregationOperator);
				if (result == null) result = caseObject_Type(count_AggregationOperator);
				if (result == null) result = caseType(count_AggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CALCULATEABLE_ELEMENT: {
				Object_CalculateableElement object_CalculateableElement = (Object_CalculateableElement)theEObject;
				T result = caseObject_CalculateableElement(object_CalculateableElement);
				if (result == null) result = caseObject_Calculateable(object_CalculateableElement);
				if (result == null) result = caseCalculateableElement(object_CalculateableElement);
				if (result == null) result = caseCalculateable(object_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MIN_AGGREGATION_OPERATOR_INTEGER: {
				Min_AggregationOperator_Integer min_AggregationOperator_Integer = (Min_AggregationOperator_Integer)theEObject;
				T result = caseMin_AggregationOperator_Integer(min_AggregationOperator_Integer);
				if (result == null) result = caseCalculatingAggregationOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(min_AggregationOperator_Integer);
				if (result == null) result = caseAggregationOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationOperation_Argument(min_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Argument(min_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationFunctionalOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Calculateable(min_AggregationOperator_Integer);
				if (result == null) result = caseCalculateable_Argument(min_AggregationOperator_Integer);
				if (result == null) result = caseInteger_FunctionalType(min_AggregationOperator_Integer);
				if (result == null) result = caseEvaluationOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseCalculateable(min_AggregationOperator_Integer);
				if (result == null) result = caseReferenceArgument(min_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalArgument(min_AggregationOperator_Integer);
				if (result == null) result = caseInteger_Type(min_AggregationOperator_Integer);
				if (result == null) result = caseFunctionalType(min_AggregationOperator_Integer);
				if (result == null) result = caseExpressionOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseArgument(min_AggregationOperator_Integer);
				if (result == null) result = caseNumber_Type(min_AggregationOperator_Integer);
				if (result == null) result = caseOperator(min_AggregationOperator_Integer);
				if (result == null) result = caseTypedElement(min_AggregationOperator_Integer);
				if (result == null) result = caseObject_Type(min_AggregationOperator_Integer);
				if (result == null) result = caseType(min_AggregationOperator_Integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BIT_OPERATOR: {
				BitOperator bitOperator = (BitOperator)theEObject;
				T result = caseBitOperator(bitOperator);
				if (result == null) result = caseExpressionOperator(bitOperator);
				if (result == null) result = caseNegatableElement(bitOperator);
				if (result == null) result = caseOperator(bitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Integer_greaterEquals_FunctionalOperator number_Integer_greaterEquals_FunctionalOperator = (Number_Integer_greaterEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_greaterEquals_FunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_AND_BIT_OPERATOR: {
				Object_And_BitOperator object_And_BitOperator = (Object_And_BitOperator)theEObject;
				T result = caseObject_And_BitOperator(object_And_BitOperator);
				if (result == null) result = caseObject_BitOperator(object_And_BitOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_And_BitOperator);
				if (result == null) result = caseBitOperator(object_And_BitOperator);
				if (result == null) result = caseExpressionOperator(object_And_BitOperator);
				if (result == null) result = caseObject_Operator(object_And_BitOperator);
				if (result == null) result = caseNegatableElement(object_And_BitOperator);
				if (result == null) result = caseOperator(object_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROOT_CLASS: {
				RootClass rootClass = (RootClass)theEObject;
				T result = caseRootClass(rootClass);
				if (result == null) result = caseNamedElement(rootClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CONTAINMENT_OR_GROUP: {
				Containment_OrGroup containment_OrGroup = (Containment_OrGroup)theEObject;
				T result = caseContainment_OrGroup(containment_OrGroup);
				if (result == null) result = caseOrGroup(containment_OrGroup);
				if (result == null) result = caseNamedElement(containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(containment_OrGroup);
				if (result == null) result = caseNegatableElement(containment_OrGroup);
				if (result == null) result = caseCountable(containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_CharSequence_toString_FunctionalOperator object_CharSequence_toString_FunctionalOperator = (Object_CharSequence_toString_FunctionalOperator)theEObject;
				T result = caseObject_CharSequence_toString_FunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseType(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Integer_Object_Number_equals_FunctionalOperator number_Integer_Object_Number_equals_FunctionalOperator = (Number_Integer_Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_Object_Number_equals_FunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NEGATABLE_ELEMENT: {
				NegatableElement negatableElement = (NegatableElement)theEObject;
				T result = caseNegatableElement(negatableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_EVALUATION_OPERATION_ARGUMENT: {
				Character_EvaluationOperation_Argument character_EvaluationOperation_Argument = (Character_EvaluationOperation_Argument)theEObject;
				T result = caseCharacter_EvaluationOperation_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCharacter_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCharacter_FunctionalType(character_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(character_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCharacter_Type(character_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(character_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(character_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(character_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(character_EvaluationOperation_Argument);
				if (result == null) result = caseType(character_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER: {
				Object_FunctionalParameter object_FunctionalParameter = (Object_FunctionalParameter)theEObject;
				T result = caseObject_FunctionalParameter(object_FunctionalParameter);
				if (result == null) result = caseObject_Type(object_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(object_FunctionalParameter);
				if (result == null) result = caseType(object_FunctionalParameter);
				if (result == null) result = caseParameter(object_FunctionalParameter);
				if (result == null) result = caseTypedElement(object_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FUNCTIONAL_TYPE: {
				Number_FunctionalType number_FunctionalType = (Number_FunctionalType)theEObject;
				T result = caseNumber_FunctionalType(number_FunctionalType);
				if (result == null) result = caseNumber_Type(number_FunctionalType);
				if (result == null) result = caseFunctionalType(number_FunctionalType);
				if (result == null) result = caseObject_Type(number_FunctionalType);
				if (result == null) result = caseType(number_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_TYPE_CALCULATEABLE: {
				CourseType_Calculateable courseType_Calculateable = (CourseType_Calculateable)theEObject;
				T result = caseCourseType_Calculateable(courseType_Calculateable);
				if (result == null) result = caseCalculateable(courseType_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR: {
				CharSequence_Or_BitOperator charSequence_Or_BitOperator = (CharSequence_Or_BitOperator)theEObject;
				T result = caseCharSequence_Or_BitOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseCharSequence_BitOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseBitOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_Or_BitOperator);
				if (result == null) result = caseNegatableElement(charSequence_Or_BitOperator);
				if (result == null) result = caseOperator(charSequence_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_OPERATOR: {
				Double_Operator double_Operator = (Double_Operator)theEObject;
				T result = caseDouble_Operator(double_Operator);
				if (result == null) result = caseOperator(double_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_Character_equals_FunctionalOperator object_Character_equals_FunctionalOperator = (Object_Character_equals_FunctionalOperator)theEObject;
				T result = caseObject_Character_equals_FunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Character_FunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseType(object_Character_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_OR_BIT_OPERATOR: {
				Object_Or_BitOperator object_Or_BitOperator = (Object_Or_BitOperator)theEObject;
				T result = caseObject_Or_BitOperator(object_Or_BitOperator);
				if (result == null) result = caseObject_BitOperator(object_Or_BitOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_Or_BitOperator);
				if (result == null) result = caseBitOperator(object_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(object_Or_BitOperator);
				if (result == null) result = caseObject_Operator(object_Or_BitOperator);
				if (result == null) result = caseNegatableElement(object_Or_BitOperator);
				if (result == null) result = caseOperator(object_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_BIT_OPERATOR: {
				CharSequence_BitOperator charSequence_BitOperator = (CharSequence_BitOperator)theEObject;
				T result = caseCharSequence_BitOperator(charSequence_BitOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_BitOperator);
				if (result == null) result = caseBitOperator(charSequence_BitOperator);
				if (result == null) result = caseExpressionOperator(charSequence_BitOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_BitOperator);
				if (result == null) result = caseNegatableElement(charSequence_BitOperator);
				if (result == null) result = caseOperator(charSequence_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STARTS_WITH_FUNCTIONAL_OPERATOR: {
				startsWith_FunctionalOperator startsWith_FunctionalOperator = (startsWith_FunctionalOperator)theEObject;
				T result = casestartsWith_FunctionalOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(startsWith_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(startsWith_FunctionalOperator);
				if (result == null) result = caseFunctionalType(startsWith_FunctionalOperator);
				if (result == null) result = caseNegatableElement(startsWith_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseObject_Type(startsWith_FunctionalOperator);
				if (result == null) result = caseOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(startsWith_FunctionalOperator);
				if (result == null) result = caseString_Operator(startsWith_FunctionalOperator);
				if (result == null) result = caseTypedElement(startsWith_FunctionalOperator);
				if (result == null) result = caseType(startsWith_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				Integer_CalculateableElementReferenceArgument integer_CalculateableElementReferenceArgument = (Integer_CalculateableElementReferenceArgument)theEObject;
				T result = caseInteger_CalculateableElementReferenceArgument(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateableElement_ReferenceArgument(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseInteger_FunctionalType(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseInteger_Type(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalType(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseReferenceArgument(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalArgument(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseNumber_Type(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseArgument(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseObject_Type(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseTypedElement(integer_CalculateableElementReferenceArgument);
				if (result == null) result = caseType(integer_CalculateableElementReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_FUNCTIONAL_TYPE: {
				Character_FunctionalType character_FunctionalType = (Character_FunctionalType)theEObject;
				T result = caseCharacter_FunctionalType(character_FunctionalType);
				if (result == null) result = caseCharacter_Type(character_FunctionalType);
				if (result == null) result = caseFunctionalType(character_FunctionalType);
				if (result == null) result = caseObject_Type(character_FunctionalType);
				if (result == null) result = caseType(character_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS: {
				Student_matriculationNumber_AttrEClass student_matriculationNumber_AttrEClass = (Student_matriculationNumber_AttrEClass)theEObject;
				T result = caseStudent_matriculationNumber_AttrEClass(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseInteger_AttributeEClass(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseInteger_CalculateableElement(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseAttributeEClass(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseGeneralizableElement(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseInteger_Calculateable(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseCalculateableElement(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseNamedElement(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseNegatableElement(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseCountable(student_matriculationNumber_AttrEClass);
				if (result == null) result = caseCalculateable(student_matriculationNumber_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseTypedElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_EXPRESSION_OPERATOR: {
				Double_ExpressionOperator double_ExpressionOperator = (Double_ExpressionOperator)theEObject;
				T result = caseDouble_ExpressionOperator(double_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(double_ExpressionOperator);
				if (result == null) result = caseDouble_Operator(double_ExpressionOperator);
				if (result == null) result = caseOperator(double_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_TYPE: {
				FunctionalType functionalType = (FunctionalType)theEObject;
				T result = caseFunctionalType(functionalType);
				if (result == null) result = caseType(functionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER: {
				Double_FunctionalParameter double_FunctionalParameter = (Double_FunctionalParameter)theEObject;
				T result = caseDouble_FunctionalParameter(double_FunctionalParameter);
				if (result == null) result = caseDouble_Type(double_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(double_FunctionalParameter);
				if (result == null) result = caseNumber_Type(double_FunctionalParameter);
				if (result == null) result = caseParameter(double_FunctionalParameter);
				if (result == null) result = caseObject_Type(double_FunctionalParameter);
				if (result == null) result = caseTypedElement(double_FunctionalParameter);
				if (result == null) result = caseType(double_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Character_Original_FunctionalOperator character_Original_FunctionalOperator = (Character_Original_FunctionalOperator)theEObject;
				T result = caseCharacter_Original_FunctionalOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(character_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(character_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_FUNCTIONAL_OPERATOR: {
				Double_FunctionalOperator double_FunctionalOperator = (Double_FunctionalOperator)theEObject;
				T result = caseDouble_FunctionalOperator(double_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(double_FunctionalOperator);
				if (result == null) result = caseOperator(double_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(double_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(double_FunctionalOperator);
				if (result == null) result = caseTypedElement(double_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUM_AGGREGATION_OPERATOR_DOUBLE: {
				Sum_AggregationOperator_Double sum_AggregationOperator_Double = (Sum_AggregationOperator_Double)theEObject;
				T result = caseSum_AggregationOperator_Double(sum_AggregationOperator_Double);
				if (result == null) result = caseCalculatingAggregationOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseDouble_EvaluationOperation_Argument(sum_AggregationOperator_Double);
				if (result == null) result = caseAggregationOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseEvaluationOperation_Argument(sum_AggregationOperator_Double);
				if (result == null) result = caseDouble_Argument(sum_AggregationOperator_Double);
				if (result == null) result = caseEvaluationFunctionalOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseInteger_Calculateable(sum_AggregationOperator_Double);
				if (result == null) result = caseCalculateable_Argument(sum_AggregationOperator_Double);
				if (result == null) result = caseDouble_FunctionalType(sum_AggregationOperator_Double);
				if (result == null) result = caseEvaluationOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseFunctionalOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseCalculateable(sum_AggregationOperator_Double);
				if (result == null) result = caseReferenceArgument(sum_AggregationOperator_Double);
				if (result == null) result = caseFunctionalArgument(sum_AggregationOperator_Double);
				if (result == null) result = caseDouble_Type(sum_AggregationOperator_Double);
				if (result == null) result = caseFunctionalType(sum_AggregationOperator_Double);
				if (result == null) result = caseExpressionOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseArgument(sum_AggregationOperator_Double);
				if (result == null) result = caseNumber_Type(sum_AggregationOperator_Double);
				if (result == null) result = caseOperator(sum_AggregationOperator_Double);
				if (result == null) result = caseTypedElement(sum_AggregationOperator_Double);
				if (result == null) result = caseObject_Type(sum_AggregationOperator_Double);
				if (result == null) result = caseType(sum_AggregationOperator_Double);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_PARAMETER: {
				CalculateableParameter calculateableParameter = (CalculateableParameter)theEObject;
				T result = caseCalculateableParameter(calculateableParameter);
				if (result == null) result = caseParameter(calculateableParameter);
				if (result == null) result = caseTypedElement(calculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Number_Double_Object_Number_toString_FunctionalOperator number_Double_Object_Number_toString_FunctionalOperator = (Number_Double_Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseNumber_Double_Object_Number_toString_FunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_Boolean_equals_FunctionalOperator object_Boolean_equals_FunctionalOperator = (Object_Boolean_equals_FunctionalOperator)theEObject;
				T result = caseObject_Boolean_equals_FunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseType(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_TYPE_OPERATOR: {
				CourseType_Operator courseType_Operator = (CourseType_Operator)theEObject;
				T result = caseCourseType_Operator(courseType_Operator);
				if (result == null) result = caseOperator(courseType_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_AND_BIT_OPERATOR: {
				Integer_And_BitOperator integer_And_BitOperator = (Integer_And_BitOperator)theEObject;
				T result = caseInteger_And_BitOperator(integer_And_BitOperator);
				if (result == null) result = caseInteger_BitOperator(integer_And_BitOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_And_BitOperator);
				if (result == null) result = caseBitOperator(integer_And_BitOperator);
				if (result == null) result = caseExpressionOperator(integer_And_BitOperator);
				if (result == null) result = caseInteger_Operator(integer_And_BitOperator);
				if (result == null) result = caseNegatableElement(integer_And_BitOperator);
				if (result == null) result = caseOperator(integer_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_CharSequence_FunctionalOperator inheritedFrom_Object_to_CharSequence_FunctionalOperator = (InheritedFrom_Object_to_CharSequence_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT: {
				Countable_ReferenceArgument countable_ReferenceArgument = (Countable_ReferenceArgument)theEObject;
				T result = caseCountable_ReferenceArgument(countable_ReferenceArgument);
				if (result == null) result = caseReferenceArgument(countable_ReferenceArgument);
				if (result == null) result = caseArgument(countable_ReferenceArgument);
				if (result == null) result = caseTypedElement(countable_ReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_CALCULATEABLE_ELEMENT: {
				Boolean_CalculateableElement boolean_CalculateableElement = (Boolean_CalculateableElement)theEObject;
				T result = caseBoolean_CalculateableElement(boolean_CalculateableElement);
				if (result == null) result = caseBoolean_Calculateable(boolean_CalculateableElement);
				if (result == null) result = caseCalculateableElement(boolean_CalculateableElement);
				if (result == null) result = caseCalculateable(boolean_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Integer_smallerEquals_FunctionalOperator number_Integer_smallerEquals_FunctionalOperator = (Number_Integer_smallerEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_smallerEquals_FunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR: {
				Object_Character_hashCode_FunctionalOperator object_Character_hashCode_FunctionalOperator = (Object_Character_hashCode_FunctionalOperator)theEObject;
				T result = caseObject_Character_hashCode_FunctionalOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Character_FunctionalOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = caseType(object_Character_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP: {
				UniversityManagementSystem_Containment_OrGroup universityManagementSystem_Containment_OrGroup = (UniversityManagementSystem_Containment_OrGroup)theEObject;
				T result = caseUniversityManagementSystem_Containment_OrGroup(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = caseContainment_OrGroup(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = caseOrGroup(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = caseNamedElement(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = caseNegatableElement(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = caseCountable(universityManagementSystem_Containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_EXPRESSION_OPERATOR: {
				Object_ExpressionOperator object_ExpressionOperator = (Object_ExpressionOperator)theEObject;
				T result = caseObject_ExpressionOperator(object_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(object_ExpressionOperator);
				if (result == null) result = caseObject_Operator(object_ExpressionOperator);
				if (result == null) result = caseOperator(object_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXAM_CONTAINMENT_OR_GROUP: {
				Exam_Containment_OrGroup exam_Containment_OrGroup = (Exam_Containment_OrGroup)theEObject;
				T result = caseExam_Containment_OrGroup(exam_Containment_OrGroup);
				if (result == null) result = caseContainment_OrGroup(exam_Containment_OrGroup);
				if (result == null) result = caseOrGroup(exam_Containment_OrGroup);
				if (result == null) result = caseNamedElement(exam_Containment_OrGroup);
				if (result == null) result = caseGeneralizableElement(exam_Containment_OrGroup);
				if (result == null) result = caseNegatableElement(exam_Containment_OrGroup);
				if (result == null) result = caseCountable(exam_Containment_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_OPERATOR: {
				CharSequence_Operator charSequence_Operator = (CharSequence_Operator)theEObject;
				T result = caseCharSequence_Operator(charSequence_Operator);
				if (result == null) result = caseOperator(charSequence_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Double_smallerThan_FunctionalOperator number_Double_smallerThan_FunctionalOperator = (Number_Double_smallerThan_FunctionalOperator)theEObject;
				T result = caseNumber_Double_smallerThan_FunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseType(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REFERENCE_ARGUMENT: {
				ReferenceArgument referenceArgument = (ReferenceArgument)theEObject;
				T result = caseReferenceArgument(referenceArgument);
				if (result == null) result = caseArgument(referenceArgument);
				if (result == null) result = caseTypedElement(referenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS: {
				Professor_employeeNumber_AttrEClass professor_employeeNumber_AttrEClass = (Professor_employeeNumber_AttrEClass)theEObject;
				T result = caseProfessor_employeeNumber_AttrEClass(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseInteger_AttributeEClass(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseInteger_CalculateableElement(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseAttributeEClass(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseGeneralizableElement(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseInteger_Calculateable(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseCalculateableElement(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseNamedElement(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseNegatableElement(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseCountable(professor_employeeNumber_AttrEClass);
				if (result == null) result = caseCalculateable(professor_employeeNumber_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_VALUE_FUNCTIONAL_OPERATOR: {
				doubleValue_FunctionalOperator doubleValue_FunctionalOperator = (doubleValue_FunctionalOperator)theEObject;
				T result = casedoubleValue_FunctionalOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseInteger_Original_FunctionalOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalType(doubleValue_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseDouble_Type(doubleValue_FunctionalOperator);
				if (result == null) result = caseFunctionalType(doubleValue_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseNumber_Type(doubleValue_FunctionalOperator);
				if (result == null) result = caseOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(doubleValue_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(doubleValue_FunctionalOperator);
				if (result == null) result = caseTypedElement(doubleValue_FunctionalOperator);
				if (result == null) result = caseObject_Type(doubleValue_FunctionalOperator);
				if (result == null) result = caseType(doubleValue_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_ARGUMENT: {
				FunctionalArgument functionalArgument = (FunctionalArgument)theEObject;
				T result = caseFunctionalArgument(functionalArgument);
				if (result == null) result = caseArgument(functionalArgument);
				if (result == null) result = caseTypedElement(functionalArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_ARGUMENT: {
				CharSequence_Argument charSequence_Argument = (CharSequence_Argument)theEObject;
				T result = caseCharSequence_Argument(charSequence_Argument);
				if (result == null) result = caseFunctionalArgument(charSequence_Argument);
				if (result == null) result = caseCharSequence_FunctionalType(charSequence_Argument);
				if (result == null) result = caseArgument(charSequence_Argument);
				if (result == null) result = caseCharSequence_Type(charSequence_Argument);
				if (result == null) result = caseFunctionalType(charSequence_Argument);
				if (result == null) result = caseTypedElement(charSequence_Argument);
				if (result == null) result = caseObject_Type(charSequence_Argument);
				if (result == null) result = caseType(charSequence_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT: {
				String_PrimitiveArgument string_PrimitiveArgument = (String_PrimitiveArgument)theEObject;
				T result = caseString_PrimitiveArgument(string_PrimitiveArgument);
				if (result == null) result = caseString_Argument(string_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(string_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(string_PrimitiveArgument);
				if (result == null) result = caseString_FunctionalType(string_PrimitiveArgument);
				if (result == null) result = caseArgument(string_PrimitiveArgument);
				if (result == null) result = caseString_Type(string_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(string_PrimitiveArgument);
				if (result == null) result = caseTypedElement(string_PrimitiveArgument);
				if (result == null) result = caseCharSequence_Type(string_PrimitiveArgument);
				if (result == null) result = caseObject_Type(string_PrimitiveArgument);
				if (result == null) result = caseType(string_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER: {
				Object_CalculateableParameter object_CalculateableParameter = (Object_CalculateableParameter)theEObject;
				T result = caseObject_CalculateableParameter(object_CalculateableParameter);
				if (result == null) result = caseObject_Type(object_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(object_CalculateableParameter);
				if (result == null) result = caseType(object_CalculateableParameter);
				if (result == null) result = caseParameter(object_CalculateableParameter);
				if (result == null) result = caseTypedElement(object_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FIND_QUERY: {
				FindQuery findQuery = (FindQuery)theEObject;
				T result = caseFindQuery(findQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR: {
				charAt_FunctionalOperator charAt_FunctionalOperator = (charAt_FunctionalOperator)theEObject;
				T result = casecharAt_FunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalType(charAt_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_Type(charAt_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charAt_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charAt_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseObject_Type(charAt_FunctionalOperator);
				if (result == null) result = caseOperator(charAt_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charAt_FunctionalOperator);
				if (result == null) result = caseString_Operator(charAt_FunctionalOperator);
				if (result == null) result = caseTypedElement(charAt_FunctionalOperator);
				if (result == null) result = caseType(charAt_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE: {
				Integer_Calculateable integer_Calculateable = (Integer_Calculateable)theEObject;
				T result = caseInteger_Calculateable(integer_Calculateable);
				if (result == null) result = caseCalculateable(integer_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR: {
				compareToStringIgnoreCase_FunctionalOperator compareToStringIgnoreCase_FunctionalOperator = (compareToStringIgnoreCase_FunctionalOperator)theEObject;
				T result = casecompareToStringIgnoreCase_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseInteger_Type(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseFunctionalType(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseNumber_Type(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_Operator(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseTypedElement(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseObject_Type(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = caseType(compareToStringIgnoreCase_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_OR_BIT_OPERATOR: {
				Number_Or_BitOperator number_Or_BitOperator = (Number_Or_BitOperator)theEObject;
				T result = caseNumber_Or_BitOperator(number_Or_BitOperator);
				if (result == null) result = caseNumber_BitOperator(number_Or_BitOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_Or_BitOperator);
				if (result == null) result = caseBitOperator(number_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(number_Or_BitOperator);
				if (result == null) result = caseNumber_Operator(number_Or_BitOperator);
				if (result == null) result = caseNegatableElement(number_Or_BitOperator);
				if (result == null) result = caseOperator(number_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_OPERATOR: {
				Object_Operator object_Operator = (Object_Operator)theEObject;
				T result = caseObject_Operator(object_Operator);
				if (result == null) result = caseOperator(object_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: {
				CharSequence_String_Object_CharSequence_equals_FunctionalOperator charSequence_String_Object_CharSequence_equals_FunctionalOperator = (CharSequence_String_Object_CharSequence_equals_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_Object_CharSequence_equals_FunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TO_UPPER_CASE_FUNCTIONAL_OPERATOR: {
				toUpperCase_FunctionalOperator toUpperCase_FunctionalOperator = (toUpperCase_FunctionalOperator)theEObject;
				T result = casetoUpperCase_FunctionalOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(toUpperCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseString_Type(toUpperCase_FunctionalOperator);
				if (result == null) result = caseFunctionalType(toUpperCase_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(toUpperCase_FunctionalOperator);
				if (result == null) result = caseOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseString_Operator(toUpperCase_FunctionalOperator);
				if (result == null) result = caseTypedElement(toUpperCase_FunctionalOperator);
				if (result == null) result = caseObject_Type(toUpperCase_FunctionalOperator);
				if (result == null) result = caseType(toUpperCase_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR: {
				Object_Boolean_hashCode_FunctionalOperator object_Boolean_hashCode_FunctionalOperator = (Object_Boolean_hashCode_FunctionalOperator)theEObject;
				T result = caseObject_Boolean_hashCode_FunctionalOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseInteger_Type(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseNumber_Type(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = caseType(object_Boolean_hashCode_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_OPERATOR: {
				FunctionalOperator functionalOperator = (FunctionalOperator)theEObject;
				T result = caseFunctionalOperator(functionalOperator);
				if (result == null) result = caseExpressionOperator(functionalOperator);
				if (result == null) result = caseTypedElement(functionalOperator);
				if (result == null) result = caseOperator(functionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Double_smallerEquals_FunctionalOperator number_Double_smallerEquals_FunctionalOperator = (Number_Double_smallerEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Double_smallerEquals_FunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_CALCULATEABLE: {
				Double_Calculateable double_Calculateable = (Double_Calculateable)theEObject;
				T result = caseDouble_Calculateable(double_Calculateable);
				if (result == null) result = caseCalculateable(double_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ENUMERATION_ATTRIBUTE_ECLASS: {
				EnumerationAttributeEClass enumerationAttributeEClass = (EnumerationAttributeEClass)theEObject;
				T result = caseEnumerationAttributeEClass(enumerationAttributeEClass);
				if (result == null) result = caseAttributeEClass(enumerationAttributeEClass);
				if (result == null) result = caseNamedElement(enumerationAttributeEClass);
				if (result == null) result = caseNegatableElement(enumerationAttributeEClass);
				if (result == null) result = caseCountable(enumerationAttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT: {
				Double_PrimitiveArgument double_PrimitiveArgument = (Double_PrimitiveArgument)theEObject;
				T result = caseDouble_PrimitiveArgument(double_PrimitiveArgument);
				if (result == null) result = caseDouble_Argument(double_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(double_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(double_PrimitiveArgument);
				if (result == null) result = caseDouble_FunctionalType(double_PrimitiveArgument);
				if (result == null) result = caseArgument(double_PrimitiveArgument);
				if (result == null) result = caseDouble_Type(double_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(double_PrimitiveArgument);
				if (result == null) result = caseTypedElement(double_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(double_PrimitiveArgument);
				if (result == null) result = caseObject_Type(double_PrimitiveArgument);
				if (result == null) result = caseType(double_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR: {
				substring_FunctionalOperator substring_FunctionalOperator = (substring_FunctionalOperator)theEObject;
				T result = casesubstring_FunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(substring_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_Type(substring_FunctionalOperator);
				if (result == null) result = caseFunctionalType(substring_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(substring_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(substring_FunctionalOperator);
				if (result == null) result = caseOperator(substring_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_Operator(substring_FunctionalOperator);
				if (result == null) result = caseTypedElement(substring_FunctionalOperator);
				if (result == null) result = caseObject_Type(substring_FunctionalOperator);
				if (result == null) result = caseType(substring_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_OPERATION_ARGUMENT: {
				EvaluationOperation_Argument evaluationOperation_Argument = (EvaluationOperation_Argument)theEObject;
				T result = caseEvaluationOperation_Argument(evaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(evaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(evaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(evaluationOperation_Argument);
				if (result == null) result = caseArgument(evaluationOperation_Argument);
				if (result == null) result = caseTypedElement(evaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_REFERENCE_OR_GROUP: {
				Course_Reference_OrGroup course_Reference_OrGroup = (Course_Reference_OrGroup)theEObject;
				T result = caseCourse_Reference_OrGroup(course_Reference_OrGroup);
				if (result == null) result = caseReference_OrGroup(course_Reference_OrGroup);
				if (result == null) result = caseOrGroup(course_Reference_OrGroup);
				if (result == null) result = caseNamedElement(course_Reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(course_Reference_OrGroup);
				if (result == null) result = caseNegatableElement(course_Reference_OrGroup);
				if (result == null) result = caseCountable(course_Reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COURSE_NAME_ATTR_ECLASS: {
				Course_name_AttrEClass course_name_AttrEClass = (Course_name_AttrEClass)theEObject;
				T result = caseCourse_name_AttrEClass(course_name_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(course_name_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(course_name_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(course_name_AttrEClass);
				if (result == null) result = caseAttributeEClass(course_name_AttrEClass);
				if (result == null) result = caseGeneralizableElement(course_name_AttrEClass);
				if (result == null) result = caseString_Calculateable(course_name_AttrEClass);
				if (result == null) result = caseCalculateableElement(course_name_AttrEClass);
				if (result == null) result = caseNamedElement(course_name_AttrEClass);
				if (result == null) result = caseNegatableElement(course_name_AttrEClass);
				if (result == null) result = caseCountable(course_name_AttrEClass);
				if (result == null) result = caseCalculateable(course_name_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_ARGUMENT: {
				Integer_Argument integer_Argument = (Integer_Argument)theEObject;
				T result = caseInteger_Argument(integer_Argument);
				if (result == null) result = caseFunctionalArgument(integer_Argument);
				if (result == null) result = caseInteger_FunctionalType(integer_Argument);
				if (result == null) result = caseArgument(integer_Argument);
				if (result == null) result = caseInteger_Type(integer_Argument);
				if (result == null) result = caseFunctionalType(integer_Argument);
				if (result == null) result = caseTypedElement(integer_Argument);
				if (result == null) result = caseNumber_Type(integer_Argument);
				if (result == null) result = caseObject_Type(integer_Argument);
				if (result == null) result = caseType(integer_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_CALCULATEABLE: {
				Character_Calculateable character_Calculateable = (Character_Calculateable)theEObject;
				T result = caseCharacter_Calculateable(character_Calculateable);
				if (result == null) result = caseCalculateable(character_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BIT_OPERATOR: {
				Object_BitOperator object_BitOperator = (Object_BitOperator)theEObject;
				T result = caseObject_BitOperator(object_BitOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_BitOperator);
				if (result == null) result = caseBitOperator(object_BitOperator);
				if (result == null) result = caseExpressionOperator(object_BitOperator);
				if (result == null) result = caseObject_Operator(object_BitOperator);
				if (result == null) result = caseNegatableElement(object_BitOperator);
				if (result == null) result = caseOperator(object_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: {
				InheritedFrom_CharSequence_to_String_FunctionalOperator inheritedFrom_CharSequence_to_String_FunctionalOperator = (InheritedFrom_CharSequence_to_String_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseString_Operator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP: {
				UniversityManagementSystem_Reference_OrGroup universityManagementSystem_Reference_OrGroup = (UniversityManagementSystem_Reference_OrGroup)theEObject;
				T result = caseUniversityManagementSystem_Reference_OrGroup(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = caseReference_OrGroup(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = caseOrGroup(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = caseNamedElement(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = caseGeneralizableElement(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = caseNegatableElement(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = caseCountable(universityManagementSystem_Reference_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_EVALUATION_OPERATION_ARGUMENT: {
				Object_EvaluationOperation_Argument object_EvaluationOperation_Argument = (Object_EvaluationOperation_Argument)theEObject;
				T result = caseObject_EvaluationOperation_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseObject_FunctionalType(object_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(object_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(object_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(object_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(object_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(object_EvaluationOperation_Argument);
				if (result == null) result = caseType(object_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(object_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Double_greaterThan_FunctionalOperator number_Double_greaterThan_FunctionalOperator = (Number_Double_greaterThan_FunctionalOperator)theEObject;
				T result = caseNumber_Double_greaterThan_FunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseType(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_CharSequence_equals_FunctionalOperator object_CharSequence_equals_FunctionalOperator = (Object_CharSequence_equals_FunctionalOperator)theEObject;
				T result = caseObject_CharSequence_equals_FunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseType(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor(Professor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University Management System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University Management System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversityManagementSystem(UniversityManagementSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam(Exam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Operator(Number_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_BitOperator(Boolean_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_CalculateableParameter(Double_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>to Lower Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>to Lower Case Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetoLowerCase_FunctionalOperator(toLowerCase_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_CalculateableParameter(String_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_ExpressionOperator(Number_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Or_BitOperator(Integer_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Operator(Boolean_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_FunctionalOperator(Integer_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Calculateable(Boolean_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>code Point Before Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>code Point Before Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecodePointBefore_FunctionalOperator(codePointBefore_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam exam ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam exam ID Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam_examID_AttrEClass(Exam_examID_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Aggregation Operator Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin_AggregationOperator_Double(Min_AggregationOperator_Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Or_BitOperator(Boolean_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Type(Double_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Boolean to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Boolean to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Original_FunctionalOperator(String_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_And_BitOperator(CharSequence_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_Object_Number_hashCode_FunctionalOperator(Number_Integer_Object_Number_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>compare To String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>compare To String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompareToString_FunctionalOperator(compareToString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>contains Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>contains Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecontains_FunctionalOperator(contains_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_FunctionalParameter(Boolean_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateable_Argument(Calculateable_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateable(Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculating Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculating Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatingAggregationOperator(CalculatingAggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_And_BitOperator(Double_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_FunctionalOperator(String_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Or_BitOperator(Character_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequals_FunctionalOperator(equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_CalculateableElement(Double_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_Object_Number_hashCode_FunctionalOperator(Number_Double_Object_Number_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationOperator(AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_PrimitiveArgument(Integer_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_FunctionalParameter(CharSequence_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Character to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Character to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson_Containment_OrGroup(Person_Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveArgument(PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_FunctionalOperator(Boolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Or_BitOperator(Double_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CharSequence_hashCode_FunctionalOperator(Object_CharSequence_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_PrimitiveArgument(Object_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_ExpressionOperator(Boolean_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeEClass(AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationBitOperator(EvaluationBitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_FunctionalType(String_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Calculateable(Object_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Operator(String_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Argument(Object_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Type(String_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>compare To Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>compare To Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompareToBoolean_FunctionalOperator(compareToBoolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countable Reference Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countable Reference Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountableReferenceParameter(CountableReferenceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_FunctionalParameter(Integer_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_FunctionalParameter(String_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_FunctionalParameter(Character_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_CalculateableParameter(Number_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson_name_AttrEClass(Person_name_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>length Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselength_FunctionalOperator(length_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>concat Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>concat Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconcat_FunctionalOperator(concat_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Type Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Type Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseType_AttributeEClass(CourseType_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Argument(Double_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Argument(Boolean_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_FunctionalParameter(Number_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference_OrGroup(Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Operator(Integer_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator(CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_BitOperator(Character_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>index Of Char Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>index Of Char Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseindexOfChar_FunctionalOperator(indexOfChar_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equals Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equals Ignore Case Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionOperator(ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_And_BitOperator(Boolean_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Number Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Number Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationFunctionalOperator(EvaluationFunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Empty Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Empty Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisEmpty_FunctionalOperator(isEmpty_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Type(Integer_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetoString_FunctionalOperator(toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Number hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Number_hashCode_FunctionalOperator(Object_Number_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Type(Object_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent_Containment_OrGroup(Student_Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_ExpressionOperator(Character_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehashCode_FunctionalOperator(hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Parse Int Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Parse Int Class Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Type Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Type Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseType_CalculateableElement(CourseType_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counting Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counting Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountingAggregationOperator(CountingAggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam_Reference_OrGroup(Exam_Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrGroup(OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor_Reference_OrGroup(Professor_Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Type(CharSequence_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_ExpressionOperator(String_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Evaluation Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr_EvaluationBitOperator(Or_EvaluationBitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Type(Character_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_CalculateableParameter(CharSequence_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_And_BitOperator(Character_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Calculateable(String_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Operator(Character_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Type(Number_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>code Point At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>code Point At Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecodePointAt_FunctionalOperator(codePointAt_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_BitOperator(Integer_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Or_BitOperator(String_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_BitOperator(Number_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectClause(SelectClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_PrimitiveArgument(Number_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Aggregation Operator Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax_AggregationOperator_Double(Max_AggregationOperator_Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Evaluation Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd_EvaluationBitOperator(And_EvaluationBitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Character Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Character Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Calculateable(Number_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>offset By Code Points Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>offset By Code Points Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoffsetByCodePoints_FunctionalOperator(offsetByCodePoints_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Argument(Number_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_FunctionalOperator(Object_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Argument(String_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>index Of Char From Index Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>index Of Char From Index Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseindexOfCharFromIndex_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_And_BitOperator(Number_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountable(Countable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_FunctionalType(Boolean_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ends With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ends With Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseendsWith_FunctionalOperator(endsWith_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>starts With Offset Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>starts With Offset Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestartsWithOffset_FunctionalOperator(startsWithOffset_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_FunctionalOperator(Number_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Query Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Query Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindQueryCollection(FindQueryCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor_Containment_OrGroup(Professor_Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_CalculateableElement(Number_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_BitOperator(Double_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course course Type Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course course Type Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse_courseType_AttrEClass(Course_courseType_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_CalculateableElement(Character_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_CalculateableParameter(Boolean_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_FunctionalOperator(Character_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_CalculateableParameter(Character_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularAttributeEClass(RegularAttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_BitOperator(String_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Argument(Character_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson_Reference_OrGroup(Person_Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_CalculateableElement(CharSequence_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_FunctionalOperator(CharSequence_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_PrimitiveArgument(Character_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_ExpressionOperator(Integer_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Type(Boolean_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>parse Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>parse Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Number to Double Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Number to Double Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationOperator(EvaluationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person email Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person email Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson_email_AttrEClass(Person_email_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_AttributeEClass(Integer_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Type Enumeration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Type Enumeration Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseType_EnumerationOperator(CourseType_EnumerationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Aggregation Operator Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax_AggregationOperator_Integer(Max_AggregationOperator_Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizableElement(GeneralizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse_Containment_OrGroup(Course_Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_FunctionalType(Double_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_FunctionalType(Object_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOperator(ClassOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_FunctionalType(Integer_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_AttributeEClass(String_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_PrimitiveArgument(Boolean_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_EvaluationOperation_Argument(String_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_CalculateableElement(Integer_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Aggregation Operator Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSum_AggregationOperator_Integer(Sum_AggregationOperator_Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalParameter(FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationOperator(EnumerationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_CalculateableParameter(Integer_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_FunctionalType(CharSequence_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_CalculateableElement(String_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Number to Integer Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Number to Integer Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String length Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Calculateable(CharSequence_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_ExpressionOperator(CharSequence_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>index Of String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>index Of String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseindexOfString_FunctionalOperator(indexOfString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>trim Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>trim Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetrim_FunctionalOperator(trim_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent_Reference_OrGroup(Student_Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_And_BitOperator(String_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateableElement(CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course course Number Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course course Number Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse_courseNumber_AttrEClass(Course_courseNumber_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegreaterThan_FunctionalOperator(greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount_AggregationOperator(Count_AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CalculateableElement(Object_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Aggregation Operator Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin_AggregationOperator_Integer(Min_AggregationOperator_Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitOperator(BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_And_BitOperator(Object_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootClass(RootClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainment_OrGroup(Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Char Sequence to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatableElement(NegatableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_FunctionalParameter(Object_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_FunctionalType(Number_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Type Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Type Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseType_Calculateable(CourseType_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Or_BitOperator(CharSequence_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Operator(Double_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Character equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Character equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Or_BitOperator(Object_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_BitOperator(CharSequence_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>starts With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>starts With Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestartsWith_FunctionalOperator(startsWith_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_CalculateableElementReferenceArgument(Integer_CalculateableElementReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_FunctionalType(Character_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student matriculation Number Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student matriculation Number Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent_matriculationNumber_AttrEClass(Student_matriculationNumber_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_ExpressionOperator(Double_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalType(FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_FunctionalParameter(Double_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_FunctionalOperator(Double_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Aggregation Operator Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSum_AggregationOperator_Double(Sum_AggregationOperator_Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateableParameter(CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Boolean equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Boolean equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Type Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Type Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseType_Operator(CourseType_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_And_BitOperator(Integer_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Char Sequence Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Char Sequence Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countable Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountable_ReferenceArgument(Countable_ReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_CalculateableElement(Boolean_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Character hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Character hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Character_hashCode_FunctionalOperator(Object_Character_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University Management System Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University Management System Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversityManagementSystem_Containment_OrGroup(UniversityManagementSystem_Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_ExpressionOperator(Object_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam Containment Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam_Containment_OrGroup(Exam_Containment_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Operator(CharSequence_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceArgument(ReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor employee Number Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor employee Number Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor_employeeNumber_AttrEClass(Professor_employeeNumber_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>double Value Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>double Value Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedoubleValue_FunctionalOperator(doubleValue_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalArgument(FunctionalArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Argument(CharSequence_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_PrimitiveArgument(String_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CalculateableParameter(Object_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindQuery(FindQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>char At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>char At Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecharAt_FunctionalOperator(charAt_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Calculateable(Integer_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>compare To String Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>compare To String Ignore Case Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompareToStringIgnoreCase_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Or_BitOperator(Number_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Operator(Object_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>to Upper Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>to Upper Case Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetoUpperCase_FunctionalOperator(toUpperCase_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Boolean hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Boolean hash Code Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Boolean_hashCode_FunctionalOperator(Object_Boolean_hashCode_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalOperator(FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Calculateable(Double_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationAttributeEClass(EnumerationAttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_PrimitiveArgument(Double_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>substring Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>substring Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubstring_FunctionalOperator(substring_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationOperation_Argument(EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse_Reference_OrGroup(Course_Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse_name_AttrEClass(Course_name_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Argument(Integer_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Calculateable(Character_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_BitOperator(Object_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Char Sequence to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University Management System Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University Management System Reference Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversityManagementSystem_Reference_OrGroup(UniversityManagementSystem_Reference_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Char Sequence equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QmmSwitch
