/**
 */
package qmm.util;

import java.lang.CharSequence;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QmmValidator INSTANCE = new QmmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qmm";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Person'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON__VALIDATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Student'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STUDENT__VALIDATE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Professor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFESSOR__VALIDATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Course'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSE__VALIDATE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'University Management System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNIVERSITY_MANAGEMENT_SYSTEM__VALIDATE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Exam'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXAM__VALIDATE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Double Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOUBLE_CALCULATEABLE_PARAMETER__VALIDATE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_CALCULATEABLE_PARAMETER__VALIDATE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Boolean Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_FUNCTIONAL_PARAMETER__VALIDATE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Char Sequence Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER__VALIDATE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VALIDATE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_FUNCTIONAL_PARAMETER__VALIDATE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_FUNCTIONAL_PARAMETER__VALIDATE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Character Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTER_FUNCTIONAL_PARAMETER__VALIDATE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Number Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBER_CALCULATEABLE_PARAMETER__VALIDATE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Number Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBER_FUNCTIONAL_PARAMETER__VALIDATE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Exam Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXAM_REFERENCE_OR_GROUP__VALIDATE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OR_GROUP__VALIDATE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Professor Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFESSOR_REFERENCE_OR_GROUP__VALIDATE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Char Sequence Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER__VALIDATE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Select Clause'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SELECT_CLAUSE__VALIDATE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Boolean Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_CALCULATEABLE_PARAMETER__VALIDATE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Character Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTER_CALCULATEABLE_PARAMETER__VALIDATE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Person Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON_REFERENCE_OR_GROUP__VALIDATE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_ATTRIBUTE_ECLASS__VALIDATE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_ATTRIBUTE_ECLASS__VALIDATE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_CALCULATEABLE_PARAMETER__VALIDATE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Student Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STUDENT_REFERENCE_OR_GROUP__VALIDATE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Object Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FUNCTIONAL_PARAMETER__VALIDATE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Double Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOUBLE_FUNCTIONAL_PARAMETER__VALIDATE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Countable Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTABLE_REFERENCE_ARGUMENT__VALIDATE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Object Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CALCULATEABLE_PARAMETER__VALIDATE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Course Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSE_REFERENCE_OR_GROUP__VALIDATE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'University Management System Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP__VALIDATE = 36;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 36;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QmmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QmmPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case QmmPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case QmmPackage.PROFESSOR:
				return validateProfessor((Professor)value, diagnostics, context);
			case QmmPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM:
				return validateUniversityManagementSystem((UniversityManagementSystem)value, diagnostics, context);
			case QmmPackage.EXAM:
				return validateExam((Exam)value, diagnostics, context);
			case QmmPackage.NUMBER_OPERATOR:
				return validateNumber_Operator((Number_Operator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_BIT_OPERATOR:
				return validateBoolean_BitOperator((Boolean_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_EVALUATION_OPERATION_ARGUMENT:
				return validateNumber_EvaluationOperation_Argument((Number_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER:
				return validateDouble_CalculateableParameter((Double_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.TO_LOWER_CASE_FUNCTIONAL_OPERATOR:
				return validatetoLowerCase_FunctionalOperator((toLowerCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER:
				return validateString_CalculateableParameter((String_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateDouble_Original_FunctionalOperator((Double_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_EXPRESSION_OPERATOR:
				return validateNumber_ExpressionOperator((Number_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_OR_BIT_OPERATOR:
				return validateInteger_Or_BitOperator((Integer_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_OPERATOR:
				return validateBoolean_Operator((Boolean_Operator)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_OPERATOR:
				return validateInteger_FunctionalOperator((Integer_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE:
				return validateBoolean_Calculateable((Boolean_Calculateable)value, diagnostics, context);
			case QmmPackage.CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR:
				return validatecodePointBefore_FunctionalOperator((codePointBefore_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EXAM_EXAM_ID_ATTR_ECLASS:
				return validateExam_examID_AttrEClass((Exam_examID_AttrEClass)value, diagnostics, context);
			case QmmPackage.MIN_AGGREGATION_OPERATOR_DOUBLE:
				return validateMin_AggregationOperator_Double((Min_AggregationOperator_Double)value, diagnostics, context);
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR:
				return validateBoolean_Or_BitOperator((Boolean_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_TYPE:
				return validateDouble_Type((Double_Type)value, diagnostics, context);
			case QmmPackage.INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateInteger_Original_FunctionalOperator((Integer_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_toString_FunctionalOperator((Object_Boolean_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateString_Original_FunctionalOperator((String_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR:
				return validateCharSequence_And_BitOperator((CharSequence_And_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_hashCode_FunctionalOperator((Number_Integer_Object_Number_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validatecompareToString_FunctionalOperator((compareToString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR:
				return validatecontains_FunctionalOperator((contains_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER:
				return validateBoolean_FunctionalParameter((Boolean_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ARGUMENT:
				return validateCalculateable_Argument((Calculateable_Argument)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE:
				return validateCalculateable((Calculateable)value, diagnostics, context);
			case QmmPackage.CALCULATING_AGGREGATION_OPERATOR:
				return validateCalculatingAggregationOperator((CalculatingAggregationOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_EVALUATION_OPERATION_ARGUMENT:
				return validateInteger_EvaluationOperation_Argument((Integer_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR:
				return validateDouble_And_BitOperator((Double_And_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateNumber_Original_FunctionalOperator((Number_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateBoolean_Original_FunctionalOperator((Boolean_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_OPERATOR:
				return validateString_FunctionalOperator((String_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR:
				return validateCharacter_Or_BitOperator((Character_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR:
				return validateequals_FunctionalOperator((equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Number_equals_FunctionalOperator((Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE_ELEMENT:
				return validateDouble_CalculateableElement((Double_CalculateableElement)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_hashCode_FunctionalOperator((Number_Double_Object_Number_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Boolean_FunctionalOperator((InheritedFrom_Object_to_Boolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_toString_FunctionalOperator((CharSequence_String_Object_CharSequence_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.AGGREGATION_OPERATOR:
				return validateAggregationOperator((AggregationOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT:
				return validateInteger_PrimitiveArgument((Integer_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER:
				return validateCharSequence_FunctionalParameter((CharSequence_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_smallerThan_FunctionalOperator((Number_Integer_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Character_toString_FunctionalOperator((Object_Character_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PERSON_CONTAINMENT_OR_GROUP:
				return validatePerson_Containment_OrGroup((Person_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validatesmallerEquals_FunctionalOperator((smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PRIMITIVE_ARGUMENT:
				return validatePrimitiveArgument((PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateBoolean_FunctionalOperator((Boolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR:
				return validateDouble_Or_BitOperator((Double_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_hashCode_FunctionalOperator((Object_CharSequence_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT:
				return validateObject_PrimitiveArgument((Object_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_EXPRESSION_OPERATOR:
				return validateBoolean_ExpressionOperator((Boolean_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_ECLASS:
				return validateAttributeEClass((AttributeEClass)value, diagnostics, context);
			case QmmPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case QmmPackage.EVALUATION_BIT_OPERATOR:
				return validateEvaluationBitOperator((EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_TYPE:
				return validateString_FunctionalType((String_FunctionalType)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE:
				return validateObject_Calculateable((Object_Calculateable)value, diagnostics, context);
			case QmmPackage.STRING_OPERATOR:
				return validateString_Operator((String_Operator)value, diagnostics, context);
			case QmmPackage.OBJECT_ARGUMENT:
				return validateObject_Argument((Object_Argument)value, diagnostics, context);
			case QmmPackage.STRING_TYPE:
				return validateString_Type((String_Type)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validatecompareToBoolean_FunctionalOperator((compareToBoolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER:
				return validateCountableReferenceParameter((CountableReferenceParameter)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER:
				return validateInteger_FunctionalParameter((Integer_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER:
				return validateString_FunctionalParameter((String_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER:
				return validateCharacter_FunctionalParameter((Character_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER:
				return validateNumber_CalculateableParameter((Number_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_equals_FunctionalOperator((Number_Double_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PERSON_NAME_ATTR_ECLASS:
				return validatePerson_name_AttrEClass((Person_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR:
				return validatelength_FunctionalOperator((length_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR:
				return validateconcat_FunctionalOperator((concat_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS:
				return validateCourseType_AttributeEClass((CourseType_AttributeEClass)value, diagnostics, context);
			case QmmPackage.DOUBLE_ARGUMENT:
				return validateDouble_Argument((Double_Argument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_ARGUMENT:
				return validateBoolean_Argument((Boolean_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER:
				return validateNumber_FunctionalParameter((Number_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.REFERENCE_OR_GROUP:
				return validateReference_OrGroup((Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.INTEGER_OPERATOR:
				return validateInteger_Operator((Integer_Operator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator((CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_BIT_OPERATOR:
				return validateCharacter_BitOperator((Character_BitOperator)value, diagnostics, context);
			case QmmPackage.INDEX_OF_CHAR_FUNCTIONAL_OPERATOR:
				return validateindexOfChar_FunctionalOperator((indexOfChar_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR:
				return validateequalsIgnoreCase_FunctionalOperator((equalsIgnoreCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EXPRESSION_OPERATOR:
				return validateExpressionOperator((ExpressionOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR:
				return validateBoolean_And_BitOperator((Boolean_And_BitOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Number_FunctionalOperator((InheritedFrom_Object_to_Number_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT:
				return validateCharSequence_PrimitiveArgument((CharSequence_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.EVALUATION_FUNCTIONAL_OPERATOR:
				return validateEvaluationFunctionalOperator((EvaluationFunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_toString_FunctionalOperator((Number_Integer_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR:
				return validateisEmpty_FunctionalOperator((isEmpty_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_TYPE:
				return validateInteger_Type((Integer_Type)value, diagnostics, context);
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR:
				return validatetoString_FunctionalOperator((toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_Number_hashCode_FunctionalOperator((Object_Number_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_TYPE:
				return validateObject_Type((Object_Type)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT:
				return validateCharSequence_EvaluationOperation_Argument((CharSequence_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.STUDENT_CONTAINMENT_OR_GROUP:
				return validateStudent_Containment_OrGroup((Student_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHARACTER_EXPRESSION_OPERATOR:
				return validateCharacter_ExpressionOperator((Character_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.HASH_CODE_FUNCTIONAL_OPERATOR:
				return validatehashCode_FunctionalOperator((hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR:
				return validateIntegerParseInt_ClassOperator((IntegerParseInt_ClassOperator)value, diagnostics, context);
			case QmmPackage.COURSE_TYPE_CALCULATEABLE_ELEMENT:
				return validateCourseType_CalculateableElement((CourseType_CalculateableElement)value, diagnostics, context);
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR:
				return validateCountingAggregationOperator((CountingAggregationOperator)value, diagnostics, context);
			case QmmPackage.EXAM_REFERENCE_OR_GROUP:
				return validateExam_Reference_OrGroup((Exam_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.OR_GROUP:
				return validateOrGroup((OrGroup)value, diagnostics, context);
			case QmmPackage.PROFESSOR_REFERENCE_OR_GROUP:
				return validateProfessor_Reference_OrGroup((Professor_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validatesmallerThan_FunctionalOperator((smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_TYPE:
				return validateCharSequence_Type((CharSequence_Type)value, diagnostics, context);
			case QmmPackage.STRING_EXPRESSION_OPERATOR:
				return validateString_ExpressionOperator((String_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR:
				return validateOr_EvaluationBitOperator((Or_EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_TYPE:
				return validateCharacter_Type((Character_Type)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER:
				return validateCharSequence_CalculateableParameter((CharSequence_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR:
				return validateCharacter_And_BitOperator((Character_And_BitOperator)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE:
				return validateString_Calculateable((String_Calculateable)value, diagnostics, context);
			case QmmPackage.CHARACTER_OPERATOR:
				return validateCharacter_Operator((Character_Operator)value, diagnostics, context);
			case QmmPackage.NUMBER_TYPE:
				return validateNumber_Type((Number_Type)value, diagnostics, context);
			case QmmPackage.CODE_POINT_AT_FUNCTIONAL_OPERATOR:
				return validatecodePointAt_FunctionalOperator((codePointAt_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_BIT_OPERATOR:
				return validateInteger_BitOperator((Integer_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Number_toString_FunctionalOperator((Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_OR_BIT_OPERATOR:
				return validateString_Or_BitOperator((String_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_BIT_OPERATOR:
				return validateNumber_BitOperator((Number_BitOperator)value, diagnostics, context);
			case QmmPackage.SELECT_CLAUSE:
				return validateSelectClause((SelectClause)value, diagnostics, context);
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT:
				return validateNumber_PrimitiveArgument((Number_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE:
				return validateMax_AggregationOperator_Double((Max_AggregationOperator_Double)value, diagnostics, context);
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR:
				return validateAnd_EvaluationBitOperator((And_EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Character_FunctionalOperator((InheritedFrom_Object_to_Character_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE:
				return validateNumber_Calculateable((Number_Calculateable)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateString_CalculateableElementReferenceArgument((String_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR:
				return validateoffsetByCodePoints_FunctionalOperator((offsetByCodePoints_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_ARGUMENT:
				return validateNumber_Argument((Number_Argument)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_OPERATOR:
				return validateObject_FunctionalOperator((Object_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_ARGUMENT:
				return validateString_Argument((String_Argument)value, diagnostics, context);
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR:
				return validateindexOfCharFromIndex_FunctionalOperator((indexOfCharFromIndex_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_EVALUATION_OPERATION_ARGUMENT:
				return validateDouble_EvaluationOperation_Argument((Double_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_AND_BIT_OPERATOR:
				return validateNumber_And_BitOperator((Number_And_BitOperator)value, diagnostics, context);
			case QmmPackage.COUNTABLE:
				return validateCountable((Countable)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE:
				return validateBoolean_FunctionalType((Boolean_FunctionalType)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateCalculateableElement_ReferenceArgument((CalculateableElement_ReferenceArgument)value, diagnostics, context);
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR:
				return validateendsWith_FunctionalOperator((endsWith_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR:
				return validatestartsWithOffset_FunctionalOperator((startsWithOffset_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_OPERATOR:
				return validateNumber_FunctionalOperator((Number_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.FIND_QUERY_COLLECTION:
				return validateFindQueryCollection((FindQueryCollection)value, diagnostics, context);
			case QmmPackage.PROFESSOR_CONTAINMENT_OR_GROUP:
				return validateProfessor_Containment_OrGroup((Professor_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE_ELEMENT:
				return validateNumber_CalculateableElement((Number_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DOUBLE_BIT_OPERATOR:
				return validateDouble_BitOperator((Double_BitOperator)value, diagnostics, context);
			case QmmPackage.COURSE_COURSE_TYPE_ATTR_ECLASS:
				return validateCourse_courseType_AttrEClass((Course_courseType_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE_ELEMENT:
				return validateCharacter_CalculateableElement((Character_CalculateableElement)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER:
				return validateBoolean_CalculateableParameter((Boolean_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR:
				return validateCharacter_FunctionalOperator((Character_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER:
				return validateCharacter_CalculateableParameter((Character_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS:
				return validateRegularAttributeEClass((RegularAttributeEClass)value, diagnostics, context);
			case QmmPackage.STRING_BIT_OPERATOR:
				return validateString_BitOperator((String_BitOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_ARGUMENT:
				return validateCharacter_Argument((Character_Argument)value, diagnostics, context);
			case QmmPackage.PERSON_REFERENCE_OR_GROUP:
				return validatePerson_Reference_OrGroup((Person_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_ELEMENT:
				return validateCharSequence_CalculateableElement((CharSequence_CalculateableElement)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR:
				return validateCharSequence_FunctionalOperator((CharSequence_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT:
				return validateCharacter_PrimitiveArgument((Character_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.INTEGER_EXPRESSION_OPERATOR:
				return validateInteger_ExpressionOperator((Integer_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_TYPE:
				return validateBoolean_Type((Boolean_Type)value, diagnostics, context);
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateparseBoolean_FunctionalOperator((parseBoolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_greaterThan_FunctionalOperator((Number_Integer_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Double_FunctionalOperator((InheritedFrom_Number_to_Double_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_OPERATOR:
				return validateEvaluationOperator((EvaluationOperator)value, diagnostics, context);
			case QmmPackage.PERSON_EMAIL_ATTR_ECLASS:
				return validatePerson_email_AttrEClass((Person_email_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTEGER_ATTRIBUTE_ECLASS:
				return validateInteger_AttributeEClass((Integer_AttributeEClass)value, diagnostics, context);
			case QmmPackage.COURSE_TYPE_ENUMERATION_OPERATOR:
				return validateCourseType_EnumerationOperator((CourseType_EnumerationOperator)value, diagnostics, context);
			case QmmPackage.MAX_AGGREGATION_OPERATOR_INTEGER:
				return validateMax_AggregationOperator_Integer((Max_AggregationOperator_Integer)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateCharSequence_Original_FunctionalOperator((CharSequence_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.GENERALIZABLE_ELEMENT:
				return validateGeneralizableElement((GeneralizableElement)value, diagnostics, context);
			case QmmPackage.COURSE_CONTAINMENT_OR_GROUP:
				return validateCourse_Containment_OrGroup((Course_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_TYPE:
				return validateDouble_FunctionalType((Double_FunctionalType)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_TYPE:
				return validateObject_FunctionalType((Object_FunctionalType)value, diagnostics, context);
			case QmmPackage.CLASS_OPERATOR:
				return validateClassOperator((ClassOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_TYPE:
				return validateInteger_FunctionalType((Integer_FunctionalType)value, diagnostics, context);
			case QmmPackage.STRING_ATTRIBUTE_ECLASS:
				return validateString_AttributeEClass((String_AttributeEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT:
				return validateBoolean_PrimitiveArgument((Boolean_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.STRING_EVALUATION_OPERATION_ARGUMENT:
				return validateString_EvaluationOperation_Argument((String_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT:
				return validateInteger_CalculateableElement((Integer_CalculateableElement)value, diagnostics, context);
			case QmmPackage.SUM_AGGREGATION_OPERATOR_INTEGER:
				return validateSum_AggregationOperator_Integer((Sum_AggregationOperator_Integer)value, diagnostics, context);
			case QmmPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_PARAMETER:
				return validateFunctionalParameter((FunctionalParameter)value, diagnostics, context);
			case QmmPackage.ENUMERATION_OPERATOR:
				return validateEnumerationOperator((EnumerationOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_greaterEquals_FunctionalOperator((Number_Double_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER:
				return validateInteger_CalculateableParameter((Integer_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_TYPE:
				return validateCharSequence_FunctionalType((CharSequence_FunctionalType)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT:
				return validateString_CalculateableElement((String_CalculateableElement)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Integer_FunctionalOperator((InheritedFrom_Number_to_Integer_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_length_FunctionalOperator((CharSequence_String_length_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE:
				return validateCharSequence_Calculateable((CharSequence_Calculateable)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_EXPRESSION_OPERATOR:
				return validateCharSequence_ExpressionOperator((CharSequence_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR:
				return validateindexOfString_FunctionalOperator((indexOfString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TRIM_FUNCTIONAL_OPERATOR:
				return validatetrim_FunctionalOperator((trim_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validategreaterEquals_FunctionalOperator((greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STUDENT_REFERENCE_OR_GROUP:
				return validateStudent_Reference_OrGroup((Student_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.STRING_AND_BIT_OPERATOR:
				return validateString_And_BitOperator((String_And_BitOperator)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ELEMENT:
				return validateCalculateableElement((CalculateableElement)value, diagnostics, context);
			case QmmPackage.COURSE_COURSE_NUMBER_ATTR_ECLASS:
				return validateCourse_courseNumber_AttrEClass((Course_courseNumber_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_EVALUATION_OPERATION_ARGUMENT:
				return validateBoolean_EvaluationOperation_Argument((Boolean_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validategreaterThan_FunctionalOperator((greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COUNT_AGGREGATION_OPERATOR:
				return validateCount_AggregationOperator((Count_AggregationOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE_ELEMENT:
				return validateObject_CalculateableElement((Object_CalculateableElement)value, diagnostics, context);
			case QmmPackage.MIN_AGGREGATION_OPERATOR_INTEGER:
				return validateMin_AggregationOperator_Integer((Min_AggregationOperator_Integer)value, diagnostics, context);
			case QmmPackage.BIT_OPERATOR:
				return validateBitOperator((BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_greaterEquals_FunctionalOperator((Number_Integer_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_AND_BIT_OPERATOR:
				return validateObject_And_BitOperator((Object_And_BitOperator)value, diagnostics, context);
			case QmmPackage.ROOT_CLASS:
				return validateRootClass((RootClass)value, diagnostics, context);
			case QmmPackage.CONTAINMENT_OR_GROUP:
				return validateContainment_OrGroup((Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_toString_FunctionalOperator((Object_CharSequence_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_equals_FunctionalOperator((Number_Integer_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NEGATABLE_ELEMENT:
				return validateNegatableElement((NegatableElement)value, diagnostics, context);
			case QmmPackage.CHARACTER_EVALUATION_OPERATION_ARGUMENT:
				return validateCharacter_EvaluationOperation_Argument((Character_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER:
				return validateObject_FunctionalParameter((Object_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_TYPE:
				return validateNumber_FunctionalType((Number_FunctionalType)value, diagnostics, context);
			case QmmPackage.COURSE_TYPE_CALCULATEABLE:
				return validateCourseType_Calculateable((CourseType_Calculateable)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR:
				return validateCharSequence_Or_BitOperator((CharSequence_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_OPERATOR:
				return validateDouble_Operator((Double_Operator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Character_equals_FunctionalOperator((Object_Character_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case QmmPackage.OBJECT_OR_BIT_OPERATOR:
				return validateObject_Or_BitOperator((Object_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_BIT_OPERATOR:
				return validateCharSequence_BitOperator((CharSequence_BitOperator)value, diagnostics, context);
			case QmmPackage.STARTS_WITH_FUNCTIONAL_OPERATOR:
				return validatestartsWith_FunctionalOperator((startsWith_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateInteger_CalculateableElementReferenceArgument((Integer_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_TYPE:
				return validateCharacter_FunctionalType((Character_FunctionalType)value, diagnostics, context);
			case QmmPackage.STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS:
				return validateStudent_matriculationNumber_AttrEClass((Student_matriculationNumber_AttrEClass)value, diagnostics, context);
			case QmmPackage.ARGUMENT:
				return validateArgument((Argument)value, diagnostics, context);
			case QmmPackage.DOUBLE_EXPRESSION_OPERATOR:
				return validateDouble_ExpressionOperator((Double_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_TYPE:
				return validateFunctionalType((FunctionalType)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER:
				return validateDouble_FunctionalParameter((Double_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateCharacter_Original_FunctionalOperator((Character_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_OPERATOR:
				return validateDouble_FunctionalOperator((Double_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SUM_AGGREGATION_OPERATOR_DOUBLE:
				return validateSum_AggregationOperator_Double((Sum_AggregationOperator_Double)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_PARAMETER:
				return validateCalculateableParameter((CalculateableParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_toString_FunctionalOperator((Number_Double_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_equals_FunctionalOperator((Object_Boolean_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COURSE_TYPE_OPERATOR:
				return validateCourseType_Operator((CourseType_Operator)value, diagnostics, context);
			case QmmPackage.INTEGER_AND_BIT_OPERATOR:
				return validateInteger_And_BitOperator((Integer_And_BitOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_CharSequence_FunctionalOperator((InheritedFrom_Object_to_CharSequence_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT:
				return validateCountable_ReferenceArgument((Countable_ReferenceArgument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE_ELEMENT:
				return validateBoolean_CalculateableElement((Boolean_CalculateableElement)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_smallerEquals_FunctionalOperator((Number_Integer_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_Character_hashCode_FunctionalOperator((Object_Character_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP:
				return validateUniversityManagementSystem_Containment_OrGroup((UniversityManagementSystem_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_EXPRESSION_OPERATOR:
				return validateObject_ExpressionOperator((Object_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.EXAM_CONTAINMENT_OR_GROUP:
				return validateExam_Containment_OrGroup((Exam_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_OPERATOR:
				return validateCharSequence_Operator((CharSequence_Operator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_smallerThan_FunctionalOperator((Number_Double_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.REFERENCE_ARGUMENT:
				return validateReferenceArgument((ReferenceArgument)value, diagnostics, context);
			case QmmPackage.PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS:
				return validateProfessor_employeeNumber_AttrEClass((Professor_employeeNumber_AttrEClass)value, diagnostics, context);
			case QmmPackage.DOUBLE_VALUE_FUNCTIONAL_OPERATOR:
				return validatedoubleValue_FunctionalOperator((doubleValue_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_ARGUMENT:
				return validateFunctionalArgument((FunctionalArgument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_ARGUMENT:
				return validateCharSequence_Argument((CharSequence_Argument)value, diagnostics, context);
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT:
				return validateString_PrimitiveArgument((String_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER:
				return validateObject_CalculateableParameter((Object_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.FIND_QUERY:
				return validateFindQuery((FindQuery)value, diagnostics, context);
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR:
				return validatecharAt_FunctionalOperator((charAt_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE:
				return validateInteger_Calculateable((Integer_Calculateable)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR:
				return validatecompareToStringIgnoreCase_FunctionalOperator((compareToStringIgnoreCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_OR_BIT_OPERATOR:
				return validateNumber_Or_BitOperator((Number_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_OPERATOR:
				return validateObject_Operator((Object_Operator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_equals_FunctionalOperator((CharSequence_String_Object_CharSequence_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TO_UPPER_CASE_FUNCTIONAL_OPERATOR:
				return validatetoUpperCase_FunctionalOperator((toUpperCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_hashCode_FunctionalOperator((Object_Boolean_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_OPERATOR:
				return validateFunctionalOperator((FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_smallerEquals_FunctionalOperator((Number_Double_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE:
				return validateDouble_Calculateable((Double_Calculateable)value, diagnostics, context);
			case QmmPackage.ENUMERATION_ATTRIBUTE_ECLASS:
				return validateEnumerationAttributeEClass((EnumerationAttributeEClass)value, diagnostics, context);
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT:
				return validateDouble_PrimitiveArgument((Double_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR:
				return validatesubstring_FunctionalOperator((substring_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_OPERATION_ARGUMENT:
				return validateEvaluationOperation_Argument((EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.COURSE_REFERENCE_OR_GROUP:
				return validateCourse_Reference_OrGroup((Course_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.COURSE_NAME_ATTR_ECLASS:
				return validateCourse_name_AttrEClass((Course_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTEGER_ARGUMENT:
				return validateInteger_Argument((Integer_Argument)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE:
				return validateCharacter_Calculateable((Character_Calculateable)value, diagnostics, context);
			case QmmPackage.OBJECT_BIT_OPERATOR:
				return validateObject_BitOperator((Object_BitOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_CharSequence_to_String_FunctionalOperator((InheritedFrom_CharSequence_to_String_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP:
				return validateUniversityManagementSystem_Reference_OrGroup((UniversityManagementSystem_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_EVALUATION_OPERATION_ARGUMENT:
				return validateObject_EvaluationOperation_Argument((Object_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_greaterThan_FunctionalOperator((Number_Double_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_equals_FunctionalOperator((Object_CharSequence_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COURSE_TYPE:
				return validateCourseType((CourseType)value, diagnostics, context);
			case QmmPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE:
				return validateCharSequence((CharSequence)value, diagnostics, context);
			case QmmPackage.INTEGER:
				return validateInteger((Integer)value, diagnostics, context);
			case QmmPackage.OBJECT:
				return validateObject(value, diagnostics, context);
			case QmmPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case QmmPackage.DOUBLE:
				return validateDouble((Double)value, diagnostics, context);
			case QmmPackage.CHARACTER:
				return validateCharacter((Character)value, diagnostics, context);
			case QmmPackage.NUMBER:
				return validateNumber((Number)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_validate(person, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_validate(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return person.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudent_validate(student, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_validate(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return student.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor(Professor professor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(professor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfessor_validate(professor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor_validate(Professor professor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return professor.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_validate(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_validate(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return course.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversityManagementSystem(UniversityManagementSystem universityManagementSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(universityManagementSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(universityManagementSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniversityManagementSystem_validate(universityManagementSystem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>University Management System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversityManagementSystem_validate(UniversityManagementSystem universityManagementSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return universityManagementSystem.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam(Exam exam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exam, diagnostics, context);
		if (result || diagnostics != null) result &= validateExam_validate(exam, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam_validate(Exam exam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exam.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Operator(Number_Operator number_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_BitOperator(Boolean_BitOperator boolean_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument number_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableParameter(Double_CalculateableParameter double_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDouble_CalculateableParameter_validate(double_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableParameter_validate(Double_CalculateableParameter double_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return double_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoLowerCase_FunctionalOperator(toLowerCase_FunctionalOperator toLowerCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toLowerCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableParameter(String_CalculateableParameter string_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_CalculateableParameter_validate(string_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableParameter_validate(String_CalculateableParameter string_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator double_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_ExpressionOperator(Number_ExpressionOperator number_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Or_BitOperator(Integer_Or_BitOperator integer_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Operator(Boolean_Operator boolean_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalOperator(Integer_FunctionalOperator integer_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Calculateable(Boolean_Calculateable boolean_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecodePointBefore_FunctionalOperator(codePointBefore_FunctionalOperator codePointBefore_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codePointBefore_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam_examID_AttrEClass(Exam_examID_AttrEClass exam_examID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exam_examID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exam_examID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(exam_examID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin_AggregationOperator_Double(Min_AggregationOperator_Double min_AggregationOperator_Double, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(min_AggregationOperator_Double, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Or_BitOperator(Boolean_Or_BitOperator boolean_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Type(Double_Type double_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator integer_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object_Boolean_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Original_FunctionalOperator(String_Original_FunctionalOperator string_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_And_BitOperator(CharSequence_And_BitOperator charSequence_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_hashCode_FunctionalOperator(Number_Integer_Object_Number_hashCode_FunctionalOperator number_Integer_Object_Number_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareToString_FunctionalOperator(compareToString_FunctionalOperator compareToString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareToString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecontains_FunctionalOperator(contains_FunctionalOperator contains_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contains_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalParameter(Boolean_FunctionalParameter boolean_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoolean_FunctionalParameter_validate(boolean_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalParameter_validate(Boolean_FunctionalParameter boolean_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boolean_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateable_Argument(Calculateable_Argument calculateable_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateable_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateable(Calculateable calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatingAggregationOperator(CalculatingAggregationOperator calculatingAggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatingAggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument integer_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_And_BitOperator(Double_And_BitOperator double_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator number_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator boolean_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalOperator(String_FunctionalOperator string_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Or_BitOperator(Character_Or_BitOperator character_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateequals_FunctionalOperator(equals_FunctionalOperator equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableElement(Double_CalculateableElement double_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_hashCode_FunctionalOperator(Number_Double_Object_Number_hashCode_FunctionalOperator number_Double_Object_Number_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator inheritedFrom_Object_to_Boolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Boolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator charSequence_String_Object_CharSequence_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationOperator(AggregationOperator aggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_PrimitiveArgument(Integer_PrimitiveArgument integer_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalParameter(CharSequence_FunctionalParameter charSequence_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(charSequence_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharSequence_FunctionalParameter_validate(charSequence_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalParameter_validate(CharSequence_FunctionalParameter charSequence_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return charSequence_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator number_Integer_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object_Character_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_Containment_OrGroup(Person_Containment_OrGroup person_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(person_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveArgument(PrimitiveArgument primitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalOperator(Boolean_FunctionalOperator boolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Or_BitOperator(Double_Or_BitOperator double_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_hashCode_FunctionalOperator(Object_CharSequence_hashCode_FunctionalOperator object_CharSequence_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_PrimitiveArgument(Object_PrimitiveArgument object_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_ExpressionOperator(Boolean_ExpressionOperator boolean_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeEClass(AttributeEClass attributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(attributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validate(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationBitOperator(EvaluationBitOperator evaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalType(String_FunctionalType string_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Calculateable(Object_Calculateable object_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Operator(String_Operator string_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Argument(Object_Argument object_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Type(String_Type string_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareToBoolean_FunctionalOperator(compareToBoolean_FunctionalOperator compareToBoolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareToBoolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountableReferenceParameter(CountableReferenceParameter countableReferenceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countableReferenceParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalParameter(Integer_FunctionalParameter integer_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_FunctionalParameter_validate(integer_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalParameter_validate(Integer_FunctionalParameter integer_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalParameter(String_FunctionalParameter string_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_FunctionalParameter_validate(string_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalParameter_validate(String_FunctionalParameter string_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalParameter(Character_FunctionalParameter character_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(character_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_FunctionalParameter_validate(character_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalParameter_validate(Character_FunctionalParameter character_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return character_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableParameter(Number_CalculateableParameter number_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_CalculateableParameter_validate(number_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableParameter_validate(Number_CalculateableParameter number_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return number_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator number_Double_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_name_AttrEClass(Person_name_AttrEClass person_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(person_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelength_FunctionalOperator(length_FunctionalOperator length_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(length_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateconcat_FunctionalOperator(concat_FunctionalOperator concat_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concat_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType_AttributeEClass(CourseType_AttributeEClass courseType_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseType_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(courseType_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Argument(Double_Argument double_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Argument(Boolean_Argument boolean_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalParameter(Number_FunctionalParameter number_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_FunctionalParameter_validate(number_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalParameter_validate(Number_FunctionalParameter number_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return number_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_OrGroup(Reference_OrGroup reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Operator(Integer_Operator integer_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator(CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator charSequence_String_Object_CharSequence_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_BitOperator(Character_BitOperator character_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfChar_FunctionalOperator(indexOfChar_FunctionalOperator indexOfChar_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfChar_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator equalsIgnoreCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equalsIgnoreCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionOperator(ExpressionOperator expressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_And_BitOperator(Boolean_And_BitOperator boolean_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator inheritedFrom_Object_to_Number_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Number_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument charSequence_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationFunctionalOperator(EvaluationFunctionalOperator evaluationFunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationFunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator number_Integer_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateisEmpty_FunctionalOperator(isEmpty_FunctionalOperator isEmpty_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isEmpty_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Type(Integer_Type integer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoString_FunctionalOperator(toString_FunctionalOperator toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_hashCode_FunctionalOperator(Object_Number_hashCode_FunctionalOperator object_Number_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Type(Object_Type object_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument charSequence_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_Containment_OrGroup(Student_Containment_OrGroup student_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(student_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_ExpressionOperator(Character_ExpressionOperator character_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatehashCode_FunctionalOperator(hashCode_FunctionalOperator hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator integerParseInt_ClassOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerParseInt_ClassOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType_CalculateableElement(CourseType_CalculateableElement courseType_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseType_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountingAggregationOperator(CountingAggregationOperator countingAggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countingAggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam_Reference_OrGroup(Exam_Reference_OrGroup exam_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exam_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exam_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateExam_Reference_OrGroup_validate(exam_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Exam Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam_Reference_OrGroup_validate(Exam_Reference_OrGroup exam_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exam_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrGroup(OrGroup orGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(orGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrGroup_validate(OrGroup orGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return orGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor_Reference_OrGroup(Professor_Reference_OrGroup professor_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(professor_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(professor_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfessor_Reference_OrGroup_validate(professor_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Professor Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor_Reference_OrGroup_validate(Professor_Reference_OrGroup professor_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return professor_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Type(CharSequence_Type charSequence_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_ExpressionOperator(String_ExpressionOperator string_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr_EvaluationBitOperator(Or_EvaluationBitOperator or_EvaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or_EvaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Type(Character_Type character_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableParameter(CharSequence_CalculateableParameter charSequence_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(charSequence_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharSequence_CalculateableParameter_validate(charSequence_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableParameter_validate(CharSequence_CalculateableParameter charSequence_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return charSequence_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_And_BitOperator(Character_And_BitOperator character_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Calculateable(String_Calculateable string_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Operator(Character_Operator character_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Type(Number_Type number_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecodePointAt_FunctionalOperator(codePointAt_FunctionalOperator codePointAt_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codePointAt_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_BitOperator(Integer_BitOperator integer_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Or_BitOperator(String_Or_BitOperator string_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_BitOperator(Number_BitOperator number_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectClause(SelectClause selectClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectClause_validate(selectClause, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectClause_validate(SelectClause selectClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return selectClause.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_PrimitiveArgument(Number_PrimitiveArgument number_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_AggregationOperator_Double(Max_AggregationOperator_Double max_AggregationOperator_Double, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_AggregationOperator_Double, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd_EvaluationBitOperator(And_EvaluationBitOperator and_EvaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and_EvaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator inheritedFrom_Object_to_Character_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Character_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Calculateable(Number_Calculateable number_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_CalculateableElementReferenceArgument_validate(string_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElementReferenceArgument_validate(String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateoffsetByCodePoints_FunctionalOperator(offsetByCodePoints_FunctionalOperator offsetByCodePoints_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offsetByCodePoints_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Argument(Number_Argument number_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalOperator(Object_FunctionalOperator object_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Argument(String_Argument string_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfCharFromIndex_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator indexOfCharFromIndex_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfCharFromIndex_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument double_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_And_BitOperator(Number_And_BitOperator number_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable(Countable countable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalType(Boolean_FunctionalType boolean_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument calculateableElement_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableElement_ReferenceArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateendsWith_FunctionalOperator(endsWith_FunctionalOperator endsWith_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endsWith_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestartsWithOffset_FunctionalOperator(startsWithOffset_FunctionalOperator startsWithOffset_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startsWithOffset_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalOperator(Number_FunctionalOperator number_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindQueryCollection(FindQueryCollection findQueryCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findQueryCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor_Containment_OrGroup(Professor_Containment_OrGroup professor_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(professor_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(professor_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(professor_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableElement(Number_CalculateableElement number_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_BitOperator(Double_BitOperator double_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_courseType_AttrEClass(Course_courseType_AttrEClass course_courseType_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course_courseType_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course_courseType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(course_courseType_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableElement(Character_CalculateableElement character_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableParameter(Boolean_CalculateableParameter boolean_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoolean_CalculateableParameter_validate(boolean_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableParameter_validate(Boolean_CalculateableParameter boolean_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boolean_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalOperator(Character_FunctionalOperator character_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableParameter(Character_CalculateableParameter character_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(character_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_CalculateableParameter_validate(character_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableParameter_validate(Character_CalculateableParameter character_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return character_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularAttributeEClass(RegularAttributeEClass regularAttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regularAttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(regularAttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_BitOperator(String_BitOperator string_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Argument(Character_Argument character_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_Reference_OrGroup(Person_Reference_OrGroup person_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_Reference_OrGroup_validate(person_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Person Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_Reference_OrGroup_validate(Person_Reference_OrGroup person_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return person_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableElement(CharSequence_CalculateableElement charSequence_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalOperator(CharSequence_FunctionalOperator charSequence_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_PrimitiveArgument(Character_PrimitiveArgument character_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_ExpressionOperator(Integer_ExpressionOperator integer_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Type(Boolean_Type boolean_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator parseBoolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parseBoolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator number_Integer_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator inheritedFrom_Number_to_Double_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Double_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationOperator(EvaluationOperator evaluationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_email_AttrEClass(Person_email_AttrEClass person_email_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person_email_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person_email_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(person_email_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_AttributeEClass(Integer_AttributeEClass integer_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_AttributeEClass_validate(integer_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_AttributeEClass_validate(Integer_AttributeEClass integer_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType_EnumerationOperator(CourseType_EnumerationOperator courseType_EnumerationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseType_EnumerationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_AggregationOperator_Integer(Max_AggregationOperator_Integer max_AggregationOperator_Integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_AggregationOperator_Integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator charSequence_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizableElement(GeneralizableElement generalizableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_Containment_OrGroup(Course_Containment_OrGroup course_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(course_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalType(Double_FunctionalType double_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalType(Object_FunctionalType object_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperator(ClassOperator classOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalType(Integer_FunctionalType integer_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_AttributeEClass(String_AttributeEClass string_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(string_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_AttributeEClass_validate(String_AttributeEClass string_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_PrimitiveArgument(Boolean_PrimitiveArgument boolean_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_EvaluationOperation_Argument(String_EvaluationOperation_Argument string_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableElement(Integer_CalculateableElement integer_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSum_AggregationOperator_Integer(Sum_AggregationOperator_Integer sum_AggregationOperator_Integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sum_AggregationOperator_Integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalParameter(FunctionalParameter functionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationOperator(EnumerationOperator enumerationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator number_Double_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableParameter(Integer_CalculateableParameter integer_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_CalculateableParameter_validate(integer_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableParameter_validate(Integer_CalculateableParameter integer_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalType(CharSequence_FunctionalType charSequence_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElement(String_CalculateableElement string_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator inheritedFrom_Number_to_Integer_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Integer_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator charSequence_String_length_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_length_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Calculateable(CharSequence_Calculateable charSequence_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_ExpressionOperator(CharSequence_ExpressionOperator charSequence_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfString_FunctionalOperator(indexOfString_FunctionalOperator indexOfString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetrim_FunctionalOperator(trim_FunctionalOperator trim_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trim_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_Reference_OrGroup(Student_Reference_OrGroup student_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudent_Reference_OrGroup_validate(student_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Student Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_Reference_OrGroup_validate(Student_Reference_OrGroup student_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return student_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_And_BitOperator(String_And_BitOperator string_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableElement(CalculateableElement calculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_courseNumber_AttrEClass(Course_courseNumber_AttrEClass course_courseNumber_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course_courseNumber_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course_courseNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_AttributeEClass_validate(course_courseNumber_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument boolean_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategreaterThan_FunctionalOperator(greaterThan_FunctionalOperator greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount_AggregationOperator(Count_AggregationOperator count_AggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count_AggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableElement(Object_CalculateableElement object_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin_AggregationOperator_Integer(Min_AggregationOperator_Integer min_AggregationOperator_Integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(min_AggregationOperator_Integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitOperator(BitOperator bitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator number_Integer_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_And_BitOperator(Object_And_BitOperator object_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootClass(RootClass rootClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rootClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(rootClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainment_OrGroup(Containment_OrGroup containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object_CharSequence_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator number_Integer_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegatableElement(NegatableElement negatableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negatableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument character_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalParameter(Object_FunctionalParameter object_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateObject_FunctionalParameter_validate(object_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalParameter_validate(Object_FunctionalParameter object_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return object_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalType(Number_FunctionalType number_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType_Calculateable(CourseType_Calculateable courseType_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseType_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Or_BitOperator(CharSequence_Or_BitOperator charSequence_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Operator(Double_Operator double_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object_Character_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Or_BitOperator(Object_Or_BitOperator object_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_BitOperator(CharSequence_BitOperator charSequence_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestartsWith_FunctionalOperator(startsWith_FunctionalOperator startsWith_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startsWith_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableElementReferenceArgument(Integer_CalculateableElementReferenceArgument integer_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_CalculateableElementReferenceArgument_validate(integer_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableElementReferenceArgument_validate(Integer_CalculateableElementReferenceArgument integer_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalType(Character_FunctionalType character_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_matriculationNumber_AttrEClass(Student_matriculationNumber_AttrEClass student_matriculationNumber_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student_matriculationNumber_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student_matriculationNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_AttributeEClass_validate(student_matriculationNumber_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_ExpressionOperator(Double_ExpressionOperator double_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalType(FunctionalType functionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalParameter(Double_FunctionalParameter double_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDouble_FunctionalParameter_validate(double_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalParameter_validate(Double_FunctionalParameter double_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return double_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator character_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalOperator(Double_FunctionalOperator double_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSum_AggregationOperator_Double(Sum_AggregationOperator_Double sum_AggregationOperator_Double, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sum_AggregationOperator_Double, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableParameter(CalculateableParameter calculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator number_Double_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object_Boolean_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType_Operator(CourseType_Operator courseType_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseType_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_And_BitOperator(Integer_And_BitOperator integer_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator inheritedFrom_Object_to_CharSequence_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_CharSequence_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable_ReferenceArgument(Countable_ReferenceArgument countable_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countable_ReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountable_ReferenceArgument_validate(countable_ReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable_ReferenceArgument_validate(Countable_ReferenceArgument countable_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return countable_ReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableElement(Boolean_CalculateableElement boolean_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator number_Integer_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_hashCode_FunctionalOperator(Object_Character_hashCode_FunctionalOperator object_Character_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversityManagementSystem_Containment_OrGroup(UniversityManagementSystem_Containment_OrGroup universityManagementSystem_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(universityManagementSystem_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(universityManagementSystem_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_ExpressionOperator(Object_ExpressionOperator object_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam_Containment_OrGroup(Exam_Containment_OrGroup exam_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exam_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exam_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(exam_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Operator(CharSequence_Operator charSequence_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator number_Double_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceArgument(ReferenceArgument referenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor_employeeNumber_AttrEClass(Professor_employeeNumber_AttrEClass professor_employeeNumber_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(professor_employeeNumber_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(professor_employeeNumber_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_AttributeEClass_validate(professor_employeeNumber_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedoubleValue_FunctionalOperator(doubleValue_FunctionalOperator doubleValue_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleValue_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalArgument(FunctionalArgument functionalArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Argument(CharSequence_Argument charSequence_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_PrimitiveArgument(String_PrimitiveArgument string_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableParameter(Object_CalculateableParameter object_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateObject_CalculateableParameter_validate(object_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableParameter_validate(Object_CalculateableParameter object_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return object_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindQuery(FindQuery findQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecharAt_FunctionalOperator(charAt_FunctionalOperator charAt_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charAt_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Calculateable(Integer_Calculateable integer_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareToStringIgnoreCase_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator compareToStringIgnoreCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareToStringIgnoreCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Or_BitOperator(Number_Or_BitOperator number_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Operator(Object_Operator object_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator charSequence_String_Object_CharSequence_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoUpperCase_FunctionalOperator(toUpperCase_FunctionalOperator toUpperCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toUpperCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_hashCode_FunctionalOperator(Object_Boolean_hashCode_FunctionalOperator object_Boolean_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalOperator(FunctionalOperator functionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator number_Double_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Calculateable(Double_Calculateable double_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationAttributeEClass(EnumerationAttributeEClass enumerationAttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationAttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(enumerationAttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_PrimitiveArgument(Double_PrimitiveArgument double_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubstring_FunctionalOperator(substring_FunctionalOperator substring_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substring_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationOperation_Argument(EvaluationOperation_Argument evaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_Reference_OrGroup(Course_Reference_OrGroup course_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_Reference_OrGroup_validate(course_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Course Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_Reference_OrGroup_validate(Course_Reference_OrGroup course_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return course_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_name_AttrEClass(Course_name_AttrEClass course_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(course_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Argument(Integer_Argument integer_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Calculateable(Character_Calculateable character_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_BitOperator(Object_BitOperator object_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator inheritedFrom_CharSequence_to_String_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_CharSequence_to_String_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversityManagementSystem_Reference_OrGroup(UniversityManagementSystem_Reference_OrGroup universityManagementSystem_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(universityManagementSystem_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniversityManagementSystem_Reference_OrGroup_validate(universityManagementSystem_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>University Management System Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversityManagementSystem_Reference_OrGroup_validate(UniversityManagementSystem_Reference_OrGroup universityManagementSystem_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return universityManagementSystem_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator number_Double_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object_CharSequence_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType(CourseType courseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence(CharSequence charSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(Character character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QmmValidator
