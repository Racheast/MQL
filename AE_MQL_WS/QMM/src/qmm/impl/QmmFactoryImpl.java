/**
 */
package qmm.impl;

import java.lang.CharSequence;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmmFactoryImpl extends EFactoryImpl implements QmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QmmFactory init() {
		try {
			QmmFactory theQmmFactory = (QmmFactory)EPackage.Registry.INSTANCE.getEFactory(QmmPackage.eNS_URI);
			if (theQmmFactory != null) {
				return theQmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QmmPackage.PERSON: return createPerson();
			case QmmPackage.STUDENT: return createStudent();
			case QmmPackage.PROFESSOR: return createProfessor();
			case QmmPackage.COURSE: return createCourse();
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM: return createUniversityManagementSystem();
			case QmmPackage.EXAM: return createExam();
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER: return createDouble_CalculateableParameter();
			case QmmPackage.TO_LOWER_CASE_FUNCTIONAL_OPERATOR: return createtoLowerCase_FunctionalOperator();
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER: return createString_CalculateableParameter();
			case QmmPackage.INTEGER_OR_BIT_OPERATOR: return createInteger_Or_BitOperator();
			case QmmPackage.CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR: return createcodePointBefore_FunctionalOperator();
			case QmmPackage.EXAM_EXAM_ID_ATTR_ECLASS: return createExam_examID_AttrEClass();
			case QmmPackage.MIN_AGGREGATION_OPERATOR_DOUBLE: return createMin_AggregationOperator_Double();
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR: return createBoolean_Or_BitOperator();
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_Boolean_toString_FunctionalOperator();
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR: return createCharSequence_And_BitOperator();
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR: return createNumber_Integer_Object_Number_hashCode_FunctionalOperator();
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR: return createcompareToString_FunctionalOperator();
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR: return createcontains_FunctionalOperator();
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER: return createBoolean_FunctionalParameter();
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR: return createDouble_And_BitOperator();
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR: return createCharacter_Or_BitOperator();
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR: return createequals_FunctionalOperator();
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createObject_Number_equals_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR: return createNumber_Double_Object_Number_hashCode_FunctionalOperator();
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: return createCharSequence_String_Object_CharSequence_toString_FunctionalOperator();
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT: return createInteger_PrimitiveArgument();
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER: return createCharSequence_FunctionalParameter();
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Integer_smallerThan_FunctionalOperator();
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_Character_toString_FunctionalOperator();
			case QmmPackage.PERSON_CONTAINMENT_OR_GROUP: return createPerson_Containment_OrGroup();
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createsmallerEquals_FunctionalOperator();
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR: return createDouble_Or_BitOperator();
			case QmmPackage.OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR: return createObject_CharSequence_hashCode_FunctionalOperator();
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT: return createObject_PrimitiveArgument();
			case QmmPackage.COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR: return createcompareToBoolean_FunctionalOperator();
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER: return createCountableReferenceParameter();
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER: return createInteger_FunctionalParameter();
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER: return createString_FunctionalParameter();
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER: return createCharacter_FunctionalParameter();
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER: return createNumber_CalculateableParameter();
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Double_Object_Number_equals_FunctionalOperator();
			case QmmPackage.PERSON_NAME_ATTR_ECLASS: return createPerson_name_AttrEClass();
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR: return createlength_FunctionalOperator();
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR: return createconcat_FunctionalOperator();
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER: return createNumber_FunctionalParameter();
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR: return createCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator();
			case QmmPackage.INDEX_OF_CHAR_FUNCTIONAL_OPERATOR: return createindexOfChar_FunctionalOperator();
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR: return createequalsIgnoreCase_FunctionalOperator();
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR: return createBoolean_And_BitOperator();
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT: return createCharSequence_PrimitiveArgument();
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createNumber_Integer_Object_Number_toString_FunctionalOperator();
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR: return createisEmpty_FunctionalOperator();
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR: return createtoString_FunctionalOperator();
			case QmmPackage.OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR: return createObject_Number_hashCode_FunctionalOperator();
			case QmmPackage.STUDENT_CONTAINMENT_OR_GROUP: return createStudent_Containment_OrGroup();
			case QmmPackage.HASH_CODE_FUNCTIONAL_OPERATOR: return createhashCode_FunctionalOperator();
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR: return createIntegerParseInt_ClassOperator();
			case QmmPackage.EXAM_REFERENCE_OR_GROUP: return createExam_Reference_OrGroup();
			case QmmPackage.PROFESSOR_REFERENCE_OR_GROUP: return createProfessor_Reference_OrGroup();
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR: return createsmallerThan_FunctionalOperator();
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR: return createOr_EvaluationBitOperator();
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER: return createCharSequence_CalculateableParameter();
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR: return createCharacter_And_BitOperator();
			case QmmPackage.CODE_POINT_AT_FUNCTIONAL_OPERATOR: return createcodePointAt_FunctionalOperator();
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_Number_toString_FunctionalOperator();
			case QmmPackage.STRING_OR_BIT_OPERATOR: return createString_Or_BitOperator();
			case QmmPackage.SELECT_CLAUSE: return createSelectClause();
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT: return createNumber_PrimitiveArgument();
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE: return createMax_AggregationOperator_Double();
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR: return createAnd_EvaluationBitOperator();
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: return createString_CalculateableElementReferenceArgument();
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR: return createoffsetByCodePoints_FunctionalOperator();
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR: return createindexOfCharFromIndex_FunctionalOperator();
			case QmmPackage.NUMBER_AND_BIT_OPERATOR: return createNumber_And_BitOperator();
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR: return createendsWith_FunctionalOperator();
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR: return createstartsWithOffset_FunctionalOperator();
			case QmmPackage.FIND_QUERY_COLLECTION: return createFindQueryCollection();
			case QmmPackage.PROFESSOR_CONTAINMENT_OR_GROUP: return createProfessor_Containment_OrGroup();
			case QmmPackage.COURSE_COURSE_TYPE_ATTR_ECLASS: return createCourse_courseType_AttrEClass();
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER: return createBoolean_CalculateableParameter();
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER: return createCharacter_CalculateableParameter();
			case QmmPackage.PERSON_REFERENCE_OR_GROUP: return createPerson_Reference_OrGroup();
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT: return createCharacter_PrimitiveArgument();
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR: return createparseBoolean_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Integer_greaterThan_FunctionalOperator();
			case QmmPackage.PERSON_EMAIL_ATTR_ECLASS: return createPerson_email_AttrEClass();
			case QmmPackage.COURSE_TYPE_ENUMERATION_OPERATOR: return createCourseType_EnumerationOperator();
			case QmmPackage.MAX_AGGREGATION_OPERATOR_INTEGER: return createMax_AggregationOperator_Integer();
			case QmmPackage.COURSE_CONTAINMENT_OR_GROUP: return createCourse_Containment_OrGroup();
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT: return createBoolean_PrimitiveArgument();
			case QmmPackage.SUM_AGGREGATION_OPERATOR_INTEGER: return createSum_AggregationOperator_Integer();
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Double_greaterEquals_FunctionalOperator();
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER: return createInteger_CalculateableParameter();
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR: return createCharSequence_String_length_FunctionalOperator();
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR: return createindexOfString_FunctionalOperator();
			case QmmPackage.TRIM_FUNCTIONAL_OPERATOR: return createtrim_FunctionalOperator();
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR: return creategreaterEquals_FunctionalOperator();
			case QmmPackage.STUDENT_REFERENCE_OR_GROUP: return createStudent_Reference_OrGroup();
			case QmmPackage.STRING_AND_BIT_OPERATOR: return createString_And_BitOperator();
			case QmmPackage.COURSE_COURSE_NUMBER_ATTR_ECLASS: return createCourse_courseNumber_AttrEClass();
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR: return creategreaterThan_FunctionalOperator();
			case QmmPackage.COUNT_AGGREGATION_OPERATOR: return createCount_AggregationOperator();
			case QmmPackage.MIN_AGGREGATION_OPERATOR_INTEGER: return createMin_AggregationOperator_Integer();
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Integer_greaterEquals_FunctionalOperator();
			case QmmPackage.OBJECT_AND_BIT_OPERATOR: return createObject_And_BitOperator();
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_CharSequence_toString_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Integer_Object_Number_equals_FunctionalOperator();
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER: return createObject_FunctionalParameter();
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR: return createCharSequence_Or_BitOperator();
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR: return createObject_Character_equals_FunctionalOperator();
			case QmmPackage.OBJECT_OR_BIT_OPERATOR: return createObject_Or_BitOperator();
			case QmmPackage.STARTS_WITH_FUNCTIONAL_OPERATOR: return createstartsWith_FunctionalOperator();
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: return createInteger_CalculateableElementReferenceArgument();
			case QmmPackage.STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS: return createStudent_matriculationNumber_AttrEClass();
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER: return createDouble_FunctionalParameter();
			case QmmPackage.SUM_AGGREGATION_OPERATOR_DOUBLE: return createSum_AggregationOperator_Double();
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createNumber_Double_Object_Number_toString_FunctionalOperator();
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR: return createObject_Boolean_equals_FunctionalOperator();
			case QmmPackage.INTEGER_AND_BIT_OPERATOR: return createInteger_And_BitOperator();
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT: return createCountable_ReferenceArgument();
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Integer_smallerEquals_FunctionalOperator();
			case QmmPackage.OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR: return createObject_Character_hashCode_FunctionalOperator();
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP: return createUniversityManagementSystem_Containment_OrGroup();
			case QmmPackage.EXAM_CONTAINMENT_OR_GROUP: return createExam_Containment_OrGroup();
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Double_smallerThan_FunctionalOperator();
			case QmmPackage.PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS: return createProfessor_employeeNumber_AttrEClass();
			case QmmPackage.DOUBLE_VALUE_FUNCTIONAL_OPERATOR: return createdoubleValue_FunctionalOperator();
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT: return createString_PrimitiveArgument();
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER: return createObject_CalculateableParameter();
			case QmmPackage.FIND_QUERY: return createFindQuery();
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR: return createcharAt_FunctionalOperator();
			case QmmPackage.COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR: return createcompareToStringIgnoreCase_FunctionalOperator();
			case QmmPackage.NUMBER_OR_BIT_OPERATOR: return createNumber_Or_BitOperator();
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: return createCharSequence_String_Object_CharSequence_equals_FunctionalOperator();
			case QmmPackage.TO_UPPER_CASE_FUNCTIONAL_OPERATOR: return createtoUpperCase_FunctionalOperator();
			case QmmPackage.OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR: return createObject_Boolean_hashCode_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Double_smallerEquals_FunctionalOperator();
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT: return createDouble_PrimitiveArgument();
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR: return createsubstring_FunctionalOperator();
			case QmmPackage.COURSE_REFERENCE_OR_GROUP: return createCourse_Reference_OrGroup();
			case QmmPackage.COURSE_NAME_ATTR_ECLASS: return createCourse_name_AttrEClass();
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP: return createUniversityManagementSystem_Reference_OrGroup();
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Double_greaterThan_FunctionalOperator();
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: return createObject_CharSequence_equals_FunctionalOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QmmPackage.COURSE_TYPE:
				return createCourseTypeFromString(eDataType, initialValue);
			case QmmPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case QmmPackage.CHAR_SEQUENCE:
				return createCharSequenceFromString(eDataType, initialValue);
			case QmmPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case QmmPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case QmmPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case QmmPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case QmmPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case QmmPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QmmPackage.COURSE_TYPE:
				return convertCourseTypeToString(eDataType, instanceValue);
			case QmmPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case QmmPackage.CHAR_SEQUENCE:
				return convertCharSequenceToString(eDataType, instanceValue);
			case QmmPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case QmmPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case QmmPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case QmmPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case QmmPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case QmmPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityManagementSystem createUniversityManagementSystem() {
		UniversityManagementSystemImpl universityManagementSystem = new UniversityManagementSystemImpl();
		return universityManagementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam createExam() {
		ExamImpl exam = new ExamImpl();
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_CalculateableParameter createDouble_CalculateableParameter() {
		Double_CalculateableParameterImpl double_CalculateableParameter = new Double_CalculateableParameterImpl();
		return double_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toLowerCase_FunctionalOperator createtoLowerCase_FunctionalOperator() {
		toLowerCase_FunctionalOperatorImpl toLowerCase_FunctionalOperator = new toLowerCase_FunctionalOperatorImpl();
		return toLowerCase_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_CalculateableParameter createString_CalculateableParameter() {
		String_CalculateableParameterImpl string_CalculateableParameter = new String_CalculateableParameterImpl();
		return string_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_Or_BitOperator createInteger_Or_BitOperator() {
		Integer_Or_BitOperatorImpl integer_Or_BitOperator = new Integer_Or_BitOperatorImpl();
		return integer_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public codePointBefore_FunctionalOperator createcodePointBefore_FunctionalOperator() {
		codePointBefore_FunctionalOperatorImpl codePointBefore_FunctionalOperator = new codePointBefore_FunctionalOperatorImpl();
		return codePointBefore_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_examID_AttrEClass createExam_examID_AttrEClass() {
		Exam_examID_AttrEClassImpl exam_examID_AttrEClass = new Exam_examID_AttrEClassImpl();
		return exam_examID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Min_AggregationOperator_Double createMin_AggregationOperator_Double() {
		Min_AggregationOperator_DoubleImpl min_AggregationOperator_Double = new Min_AggregationOperator_DoubleImpl();
		return min_AggregationOperator_Double;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_Or_BitOperator createBoolean_Or_BitOperator() {
		Boolean_Or_BitOperatorImpl boolean_Or_BitOperator = new Boolean_Or_BitOperatorImpl();
		return boolean_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Boolean_toString_FunctionalOperator createObject_Boolean_toString_FunctionalOperator() {
		Object_Boolean_toString_FunctionalOperatorImpl object_Boolean_toString_FunctionalOperator = new Object_Boolean_toString_FunctionalOperatorImpl();
		return object_Boolean_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_And_BitOperator createCharSequence_And_BitOperator() {
		CharSequence_And_BitOperatorImpl charSequence_And_BitOperator = new CharSequence_And_BitOperatorImpl();
		return charSequence_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_Object_Number_hashCode_FunctionalOperator createNumber_Integer_Object_Number_hashCode_FunctionalOperator() {
		Number_Integer_Object_Number_hashCode_FunctionalOperatorImpl number_Integer_Object_Number_hashCode_FunctionalOperator = new Number_Integer_Object_Number_hashCode_FunctionalOperatorImpl();
		return number_Integer_Object_Number_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compareToString_FunctionalOperator createcompareToString_FunctionalOperator() {
		compareToString_FunctionalOperatorImpl compareToString_FunctionalOperator = new compareToString_FunctionalOperatorImpl();
		return compareToString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public contains_FunctionalOperator createcontains_FunctionalOperator() {
		contains_FunctionalOperatorImpl contains_FunctionalOperator = new contains_FunctionalOperatorImpl();
		return contains_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_FunctionalParameter createBoolean_FunctionalParameter() {
		Boolean_FunctionalParameterImpl boolean_FunctionalParameter = new Boolean_FunctionalParameterImpl();
		return boolean_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_And_BitOperator createDouble_And_BitOperator() {
		Double_And_BitOperatorImpl double_And_BitOperator = new Double_And_BitOperatorImpl();
		return double_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_Or_BitOperator createCharacter_Or_BitOperator() {
		Character_Or_BitOperatorImpl character_Or_BitOperator = new Character_Or_BitOperatorImpl();
		return character_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equals_FunctionalOperator createequals_FunctionalOperator() {
		equals_FunctionalOperatorImpl equals_FunctionalOperator = new equals_FunctionalOperatorImpl();
		return equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Number_equals_FunctionalOperator createObject_Number_equals_FunctionalOperator() {
		Object_Number_equals_FunctionalOperatorImpl object_Number_equals_FunctionalOperator = new Object_Number_equals_FunctionalOperatorImpl();
		return object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_Object_Number_hashCode_FunctionalOperator createNumber_Double_Object_Number_hashCode_FunctionalOperator() {
		Number_Double_Object_Number_hashCode_FunctionalOperatorImpl number_Double_Object_Number_hashCode_FunctionalOperator = new Number_Double_Object_Number_hashCode_FunctionalOperatorImpl();
		return number_Double_Object_Number_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_Object_CharSequence_toString_FunctionalOperator createCharSequence_String_Object_CharSequence_toString_FunctionalOperator() {
		CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl charSequence_String_Object_CharSequence_toString_FunctionalOperator = new CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl();
		return charSequence_String_Object_CharSequence_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_PrimitiveArgument createInteger_PrimitiveArgument() {
		Integer_PrimitiveArgumentImpl integer_PrimitiveArgument = new Integer_PrimitiveArgumentImpl();
		return integer_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_FunctionalParameter createCharSequence_FunctionalParameter() {
		CharSequence_FunctionalParameterImpl charSequence_FunctionalParameter = new CharSequence_FunctionalParameterImpl();
		return charSequence_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_smallerThan_FunctionalOperator createNumber_Integer_smallerThan_FunctionalOperator() {
		Number_Integer_smallerThan_FunctionalOperatorImpl number_Integer_smallerThan_FunctionalOperator = new Number_Integer_smallerThan_FunctionalOperatorImpl();
		return number_Integer_smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Character_toString_FunctionalOperator createObject_Character_toString_FunctionalOperator() {
		Object_Character_toString_FunctionalOperatorImpl object_Character_toString_FunctionalOperator = new Object_Character_toString_FunctionalOperatorImpl();
		return object_Character_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person_Containment_OrGroup createPerson_Containment_OrGroup() {
		Person_Containment_OrGroupImpl person_Containment_OrGroup = new Person_Containment_OrGroupImpl();
		return person_Containment_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smallerEquals_FunctionalOperator createsmallerEquals_FunctionalOperator() {
		smallerEquals_FunctionalOperatorImpl smallerEquals_FunctionalOperator = new smallerEquals_FunctionalOperatorImpl();
		return smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_Or_BitOperator createDouble_Or_BitOperator() {
		Double_Or_BitOperatorImpl double_Or_BitOperator = new Double_Or_BitOperatorImpl();
		return double_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CharSequence_hashCode_FunctionalOperator createObject_CharSequence_hashCode_FunctionalOperator() {
		Object_CharSequence_hashCode_FunctionalOperatorImpl object_CharSequence_hashCode_FunctionalOperator = new Object_CharSequence_hashCode_FunctionalOperatorImpl();
		return object_CharSequence_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_PrimitiveArgument createObject_PrimitiveArgument() {
		Object_PrimitiveArgumentImpl object_PrimitiveArgument = new Object_PrimitiveArgumentImpl();
		return object_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compareToBoolean_FunctionalOperator createcompareToBoolean_FunctionalOperator() {
		compareToBoolean_FunctionalOperatorImpl compareToBoolean_FunctionalOperator = new compareToBoolean_FunctionalOperatorImpl();
		return compareToBoolean_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountableReferenceParameter createCountableReferenceParameter() {
		CountableReferenceParameterImpl countableReferenceParameter = new CountableReferenceParameterImpl();
		return countableReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter createInteger_FunctionalParameter() {
		Integer_FunctionalParameterImpl integer_FunctionalParameter = new Integer_FunctionalParameterImpl();
		return integer_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_FunctionalParameter createString_FunctionalParameter() {
		String_FunctionalParameterImpl string_FunctionalParameter = new String_FunctionalParameterImpl();
		return string_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_FunctionalParameter createCharacter_FunctionalParameter() {
		Character_FunctionalParameterImpl character_FunctionalParameter = new Character_FunctionalParameterImpl();
		return character_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_CalculateableParameter createNumber_CalculateableParameter() {
		Number_CalculateableParameterImpl number_CalculateableParameter = new Number_CalculateableParameterImpl();
		return number_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_Object_Number_equals_FunctionalOperator createNumber_Double_Object_Number_equals_FunctionalOperator() {
		Number_Double_Object_Number_equals_FunctionalOperatorImpl number_Double_Object_Number_equals_FunctionalOperator = new Number_Double_Object_Number_equals_FunctionalOperatorImpl();
		return number_Double_Object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person_name_AttrEClass createPerson_name_AttrEClass() {
		Person_name_AttrEClassImpl person_name_AttrEClass = new Person_name_AttrEClassImpl();
		return person_name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public length_FunctionalOperator createlength_FunctionalOperator() {
		length_FunctionalOperatorImpl length_FunctionalOperator = new length_FunctionalOperatorImpl();
		return length_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public concat_FunctionalOperator createconcat_FunctionalOperator() {
		concat_FunctionalOperatorImpl concat_FunctionalOperator = new concat_FunctionalOperatorImpl();
		return concat_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_FunctionalParameter createNumber_FunctionalParameter() {
		Number_FunctionalParameterImpl number_FunctionalParameter = new Number_FunctionalParameterImpl();
		return number_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator createCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator() {
		CharSequence_String_Object_CharSequence_hashCode_FunctionalOperatorImpl charSequence_String_Object_CharSequence_hashCode_FunctionalOperator = new CharSequence_String_Object_CharSequence_hashCode_FunctionalOperatorImpl();
		return charSequence_String_Object_CharSequence_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public indexOfChar_FunctionalOperator createindexOfChar_FunctionalOperator() {
		indexOfChar_FunctionalOperatorImpl indexOfChar_FunctionalOperator = new indexOfChar_FunctionalOperatorImpl();
		return indexOfChar_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equalsIgnoreCase_FunctionalOperator createequalsIgnoreCase_FunctionalOperator() {
		equalsIgnoreCase_FunctionalOperatorImpl equalsIgnoreCase_FunctionalOperator = new equalsIgnoreCase_FunctionalOperatorImpl();
		return equalsIgnoreCase_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_And_BitOperator createBoolean_And_BitOperator() {
		Boolean_And_BitOperatorImpl boolean_And_BitOperator = new Boolean_And_BitOperatorImpl();
		return boolean_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_PrimitiveArgument createCharSequence_PrimitiveArgument() {
		CharSequence_PrimitiveArgumentImpl charSequence_PrimitiveArgument = new CharSequence_PrimitiveArgumentImpl();
		return charSequence_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_Object_Number_toString_FunctionalOperator createNumber_Integer_Object_Number_toString_FunctionalOperator() {
		Number_Integer_Object_Number_toString_FunctionalOperatorImpl number_Integer_Object_Number_toString_FunctionalOperator = new Number_Integer_Object_Number_toString_FunctionalOperatorImpl();
		return number_Integer_Object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isEmpty_FunctionalOperator createisEmpty_FunctionalOperator() {
		isEmpty_FunctionalOperatorImpl isEmpty_FunctionalOperator = new isEmpty_FunctionalOperatorImpl();
		return isEmpty_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toString_FunctionalOperator createtoString_FunctionalOperator() {
		toString_FunctionalOperatorImpl toString_FunctionalOperator = new toString_FunctionalOperatorImpl();
		return toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Number_hashCode_FunctionalOperator createObject_Number_hashCode_FunctionalOperator() {
		Object_Number_hashCode_FunctionalOperatorImpl object_Number_hashCode_FunctionalOperator = new Object_Number_hashCode_FunctionalOperatorImpl();
		return object_Number_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student_Containment_OrGroup createStudent_Containment_OrGroup() {
		Student_Containment_OrGroupImpl student_Containment_OrGroup = new Student_Containment_OrGroupImpl();
		return student_Containment_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hashCode_FunctionalOperator createhashCode_FunctionalOperator() {
		hashCode_FunctionalOperatorImpl hashCode_FunctionalOperator = new hashCode_FunctionalOperatorImpl();
		return hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerParseInt_ClassOperator createIntegerParseInt_ClassOperator() {
		IntegerParseInt_ClassOperatorImpl integerParseInt_ClassOperator = new IntegerParseInt_ClassOperatorImpl();
		return integerParseInt_ClassOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_Reference_OrGroup createExam_Reference_OrGroup() {
		Exam_Reference_OrGroupImpl exam_Reference_OrGroup = new Exam_Reference_OrGroupImpl();
		return exam_Reference_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor_Reference_OrGroup createProfessor_Reference_OrGroup() {
		Professor_Reference_OrGroupImpl professor_Reference_OrGroup = new Professor_Reference_OrGroupImpl();
		return professor_Reference_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smallerThan_FunctionalOperator createsmallerThan_FunctionalOperator() {
		smallerThan_FunctionalOperatorImpl smallerThan_FunctionalOperator = new smallerThan_FunctionalOperatorImpl();
		return smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or_EvaluationBitOperator createOr_EvaluationBitOperator() {
		Or_EvaluationBitOperatorImpl or_EvaluationBitOperator = new Or_EvaluationBitOperatorImpl();
		return or_EvaluationBitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_CalculateableParameter createCharSequence_CalculateableParameter() {
		CharSequence_CalculateableParameterImpl charSequence_CalculateableParameter = new CharSequence_CalculateableParameterImpl();
		return charSequence_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_And_BitOperator createCharacter_And_BitOperator() {
		Character_And_BitOperatorImpl character_And_BitOperator = new Character_And_BitOperatorImpl();
		return character_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public codePointAt_FunctionalOperator createcodePointAt_FunctionalOperator() {
		codePointAt_FunctionalOperatorImpl codePointAt_FunctionalOperator = new codePointAt_FunctionalOperatorImpl();
		return codePointAt_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Number_toString_FunctionalOperator createObject_Number_toString_FunctionalOperator() {
		Object_Number_toString_FunctionalOperatorImpl object_Number_toString_FunctionalOperator = new Object_Number_toString_FunctionalOperatorImpl();
		return object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_Or_BitOperator createString_Or_BitOperator() {
		String_Or_BitOperatorImpl string_Or_BitOperator = new String_Or_BitOperatorImpl();
		return string_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectClause createSelectClause() {
		SelectClauseImpl selectClause = new SelectClauseImpl();
		return selectClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_PrimitiveArgument createNumber_PrimitiveArgument() {
		Number_PrimitiveArgumentImpl number_PrimitiveArgument = new Number_PrimitiveArgumentImpl();
		return number_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max_AggregationOperator_Double createMax_AggregationOperator_Double() {
		Max_AggregationOperator_DoubleImpl max_AggregationOperator_Double = new Max_AggregationOperator_DoubleImpl();
		return max_AggregationOperator_Double;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And_EvaluationBitOperator createAnd_EvaluationBitOperator() {
		And_EvaluationBitOperatorImpl and_EvaluationBitOperator = new And_EvaluationBitOperatorImpl();
		return and_EvaluationBitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_CalculateableElementReferenceArgument createString_CalculateableElementReferenceArgument() {
		String_CalculateableElementReferenceArgumentImpl string_CalculateableElementReferenceArgument = new String_CalculateableElementReferenceArgumentImpl();
		return string_CalculateableElementReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public offsetByCodePoints_FunctionalOperator createoffsetByCodePoints_FunctionalOperator() {
		offsetByCodePoints_FunctionalOperatorImpl offsetByCodePoints_FunctionalOperator = new offsetByCodePoints_FunctionalOperatorImpl();
		return offsetByCodePoints_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public indexOfCharFromIndex_FunctionalOperator createindexOfCharFromIndex_FunctionalOperator() {
		indexOfCharFromIndex_FunctionalOperatorImpl indexOfCharFromIndex_FunctionalOperator = new indexOfCharFromIndex_FunctionalOperatorImpl();
		return indexOfCharFromIndex_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_And_BitOperator createNumber_And_BitOperator() {
		Number_And_BitOperatorImpl number_And_BitOperator = new Number_And_BitOperatorImpl();
		return number_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public endsWith_FunctionalOperator createendsWith_FunctionalOperator() {
		endsWith_FunctionalOperatorImpl endsWith_FunctionalOperator = new endsWith_FunctionalOperatorImpl();
		return endsWith_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public startsWithOffset_FunctionalOperator createstartsWithOffset_FunctionalOperator() {
		startsWithOffset_FunctionalOperatorImpl startsWithOffset_FunctionalOperator = new startsWithOffset_FunctionalOperatorImpl();
		return startsWithOffset_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindQueryCollection createFindQueryCollection() {
		FindQueryCollectionImpl findQueryCollection = new FindQueryCollectionImpl();
		return findQueryCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor_Containment_OrGroup createProfessor_Containment_OrGroup() {
		Professor_Containment_OrGroupImpl professor_Containment_OrGroup = new Professor_Containment_OrGroupImpl();
		return professor_Containment_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_courseType_AttrEClass createCourse_courseType_AttrEClass() {
		Course_courseType_AttrEClassImpl course_courseType_AttrEClass = new Course_courseType_AttrEClassImpl();
		return course_courseType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_CalculateableParameter createBoolean_CalculateableParameter() {
		Boolean_CalculateableParameterImpl boolean_CalculateableParameter = new Boolean_CalculateableParameterImpl();
		return boolean_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_CalculateableParameter createCharacter_CalculateableParameter() {
		Character_CalculateableParameterImpl character_CalculateableParameter = new Character_CalculateableParameterImpl();
		return character_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person_Reference_OrGroup createPerson_Reference_OrGroup() {
		Person_Reference_OrGroupImpl person_Reference_OrGroup = new Person_Reference_OrGroupImpl();
		return person_Reference_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_PrimitiveArgument createCharacter_PrimitiveArgument() {
		Character_PrimitiveArgumentImpl character_PrimitiveArgument = new Character_PrimitiveArgumentImpl();
		return character_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parseBoolean_FunctionalOperator createparseBoolean_FunctionalOperator() {
		parseBoolean_FunctionalOperatorImpl parseBoolean_FunctionalOperator = new parseBoolean_FunctionalOperatorImpl();
		return parseBoolean_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_greaterThan_FunctionalOperator createNumber_Integer_greaterThan_FunctionalOperator() {
		Number_Integer_greaterThan_FunctionalOperatorImpl number_Integer_greaterThan_FunctionalOperator = new Number_Integer_greaterThan_FunctionalOperatorImpl();
		return number_Integer_greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person_email_AttrEClass createPerson_email_AttrEClass() {
		Person_email_AttrEClassImpl person_email_AttrEClass = new Person_email_AttrEClassImpl();
		return person_email_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType_EnumerationOperator createCourseType_EnumerationOperator() {
		CourseType_EnumerationOperatorImpl courseType_EnumerationOperator = new CourseType_EnumerationOperatorImpl();
		return courseType_EnumerationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max_AggregationOperator_Integer createMax_AggregationOperator_Integer() {
		Max_AggregationOperator_IntegerImpl max_AggregationOperator_Integer = new Max_AggregationOperator_IntegerImpl();
		return max_AggregationOperator_Integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_Containment_OrGroup createCourse_Containment_OrGroup() {
		Course_Containment_OrGroupImpl course_Containment_OrGroup = new Course_Containment_OrGroupImpl();
		return course_Containment_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_PrimitiveArgument createBoolean_PrimitiveArgument() {
		Boolean_PrimitiveArgumentImpl boolean_PrimitiveArgument = new Boolean_PrimitiveArgumentImpl();
		return boolean_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sum_AggregationOperator_Integer createSum_AggregationOperator_Integer() {
		Sum_AggregationOperator_IntegerImpl sum_AggregationOperator_Integer = new Sum_AggregationOperator_IntegerImpl();
		return sum_AggregationOperator_Integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_greaterEquals_FunctionalOperator createNumber_Double_greaterEquals_FunctionalOperator() {
		Number_Double_greaterEquals_FunctionalOperatorImpl number_Double_greaterEquals_FunctionalOperator = new Number_Double_greaterEquals_FunctionalOperatorImpl();
		return number_Double_greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_CalculateableParameter createInteger_CalculateableParameter() {
		Integer_CalculateableParameterImpl integer_CalculateableParameter = new Integer_CalculateableParameterImpl();
		return integer_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_length_FunctionalOperator createCharSequence_String_length_FunctionalOperator() {
		CharSequence_String_length_FunctionalOperatorImpl charSequence_String_length_FunctionalOperator = new CharSequence_String_length_FunctionalOperatorImpl();
		return charSequence_String_length_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public indexOfString_FunctionalOperator createindexOfString_FunctionalOperator() {
		indexOfString_FunctionalOperatorImpl indexOfString_FunctionalOperator = new indexOfString_FunctionalOperatorImpl();
		return indexOfString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trim_FunctionalOperator createtrim_FunctionalOperator() {
		trim_FunctionalOperatorImpl trim_FunctionalOperator = new trim_FunctionalOperatorImpl();
		return trim_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public greaterEquals_FunctionalOperator creategreaterEquals_FunctionalOperator() {
		greaterEquals_FunctionalOperatorImpl greaterEquals_FunctionalOperator = new greaterEquals_FunctionalOperatorImpl();
		return greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student_Reference_OrGroup createStudent_Reference_OrGroup() {
		Student_Reference_OrGroupImpl student_Reference_OrGroup = new Student_Reference_OrGroupImpl();
		return student_Reference_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_And_BitOperator createString_And_BitOperator() {
		String_And_BitOperatorImpl string_And_BitOperator = new String_And_BitOperatorImpl();
		return string_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_courseNumber_AttrEClass createCourse_courseNumber_AttrEClass() {
		Course_courseNumber_AttrEClassImpl course_courseNumber_AttrEClass = new Course_courseNumber_AttrEClassImpl();
		return course_courseNumber_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public greaterThan_FunctionalOperator creategreaterThan_FunctionalOperator() {
		greaterThan_FunctionalOperatorImpl greaterThan_FunctionalOperator = new greaterThan_FunctionalOperatorImpl();
		return greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count_AggregationOperator createCount_AggregationOperator() {
		Count_AggregationOperatorImpl count_AggregationOperator = new Count_AggregationOperatorImpl();
		return count_AggregationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Min_AggregationOperator_Integer createMin_AggregationOperator_Integer() {
		Min_AggregationOperator_IntegerImpl min_AggregationOperator_Integer = new Min_AggregationOperator_IntegerImpl();
		return min_AggregationOperator_Integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_greaterEquals_FunctionalOperator createNumber_Integer_greaterEquals_FunctionalOperator() {
		Number_Integer_greaterEquals_FunctionalOperatorImpl number_Integer_greaterEquals_FunctionalOperator = new Number_Integer_greaterEquals_FunctionalOperatorImpl();
		return number_Integer_greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_And_BitOperator createObject_And_BitOperator() {
		Object_And_BitOperatorImpl object_And_BitOperator = new Object_And_BitOperatorImpl();
		return object_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CharSequence_toString_FunctionalOperator createObject_CharSequence_toString_FunctionalOperator() {
		Object_CharSequence_toString_FunctionalOperatorImpl object_CharSequence_toString_FunctionalOperator = new Object_CharSequence_toString_FunctionalOperatorImpl();
		return object_CharSequence_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_Object_Number_equals_FunctionalOperator createNumber_Integer_Object_Number_equals_FunctionalOperator() {
		Number_Integer_Object_Number_equals_FunctionalOperatorImpl number_Integer_Object_Number_equals_FunctionalOperator = new Number_Integer_Object_Number_equals_FunctionalOperatorImpl();
		return number_Integer_Object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_FunctionalParameter createObject_FunctionalParameter() {
		Object_FunctionalParameterImpl object_FunctionalParameter = new Object_FunctionalParameterImpl();
		return object_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_Or_BitOperator createCharSequence_Or_BitOperator() {
		CharSequence_Or_BitOperatorImpl charSequence_Or_BitOperator = new CharSequence_Or_BitOperatorImpl();
		return charSequence_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Character_equals_FunctionalOperator createObject_Character_equals_FunctionalOperator() {
		Object_Character_equals_FunctionalOperatorImpl object_Character_equals_FunctionalOperator = new Object_Character_equals_FunctionalOperatorImpl();
		return object_Character_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Or_BitOperator createObject_Or_BitOperator() {
		Object_Or_BitOperatorImpl object_Or_BitOperator = new Object_Or_BitOperatorImpl();
		return object_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public startsWith_FunctionalOperator createstartsWith_FunctionalOperator() {
		startsWith_FunctionalOperatorImpl startsWith_FunctionalOperator = new startsWith_FunctionalOperatorImpl();
		return startsWith_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_CalculateableElementReferenceArgument createInteger_CalculateableElementReferenceArgument() {
		Integer_CalculateableElementReferenceArgumentImpl integer_CalculateableElementReferenceArgument = new Integer_CalculateableElementReferenceArgumentImpl();
		return integer_CalculateableElementReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student_matriculationNumber_AttrEClass createStudent_matriculationNumber_AttrEClass() {
		Student_matriculationNumber_AttrEClassImpl student_matriculationNumber_AttrEClass = new Student_matriculationNumber_AttrEClassImpl();
		return student_matriculationNumber_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_FunctionalParameter createDouble_FunctionalParameter() {
		Double_FunctionalParameterImpl double_FunctionalParameter = new Double_FunctionalParameterImpl();
		return double_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sum_AggregationOperator_Double createSum_AggregationOperator_Double() {
		Sum_AggregationOperator_DoubleImpl sum_AggregationOperator_Double = new Sum_AggregationOperator_DoubleImpl();
		return sum_AggregationOperator_Double;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_Object_Number_toString_FunctionalOperator createNumber_Double_Object_Number_toString_FunctionalOperator() {
		Number_Double_Object_Number_toString_FunctionalOperatorImpl number_Double_Object_Number_toString_FunctionalOperator = new Number_Double_Object_Number_toString_FunctionalOperatorImpl();
		return number_Double_Object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Boolean_equals_FunctionalOperator createObject_Boolean_equals_FunctionalOperator() {
		Object_Boolean_equals_FunctionalOperatorImpl object_Boolean_equals_FunctionalOperator = new Object_Boolean_equals_FunctionalOperatorImpl();
		return object_Boolean_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_And_BitOperator createInteger_And_BitOperator() {
		Integer_And_BitOperatorImpl integer_And_BitOperator = new Integer_And_BitOperatorImpl();
		return integer_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countable_ReferenceArgument createCountable_ReferenceArgument() {
		Countable_ReferenceArgumentImpl countable_ReferenceArgument = new Countable_ReferenceArgumentImpl();
		return countable_ReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_smallerEquals_FunctionalOperator createNumber_Integer_smallerEquals_FunctionalOperator() {
		Number_Integer_smallerEquals_FunctionalOperatorImpl number_Integer_smallerEquals_FunctionalOperator = new Number_Integer_smallerEquals_FunctionalOperatorImpl();
		return number_Integer_smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Character_hashCode_FunctionalOperator createObject_Character_hashCode_FunctionalOperator() {
		Object_Character_hashCode_FunctionalOperatorImpl object_Character_hashCode_FunctionalOperator = new Object_Character_hashCode_FunctionalOperatorImpl();
		return object_Character_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityManagementSystem_Containment_OrGroup createUniversityManagementSystem_Containment_OrGroup() {
		UniversityManagementSystem_Containment_OrGroupImpl universityManagementSystem_Containment_OrGroup = new UniversityManagementSystem_Containment_OrGroupImpl();
		return universityManagementSystem_Containment_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_Containment_OrGroup createExam_Containment_OrGroup() {
		Exam_Containment_OrGroupImpl exam_Containment_OrGroup = new Exam_Containment_OrGroupImpl();
		return exam_Containment_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_smallerThan_FunctionalOperator createNumber_Double_smallerThan_FunctionalOperator() {
		Number_Double_smallerThan_FunctionalOperatorImpl number_Double_smallerThan_FunctionalOperator = new Number_Double_smallerThan_FunctionalOperatorImpl();
		return number_Double_smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor_employeeNumber_AttrEClass createProfessor_employeeNumber_AttrEClass() {
		Professor_employeeNumber_AttrEClassImpl professor_employeeNumber_AttrEClass = new Professor_employeeNumber_AttrEClassImpl();
		return professor_employeeNumber_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleValue_FunctionalOperator createdoubleValue_FunctionalOperator() {
		doubleValue_FunctionalOperatorImpl doubleValue_FunctionalOperator = new doubleValue_FunctionalOperatorImpl();
		return doubleValue_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_PrimitiveArgument createString_PrimitiveArgument() {
		String_PrimitiveArgumentImpl string_PrimitiveArgument = new String_PrimitiveArgumentImpl();
		return string_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CalculateableParameter createObject_CalculateableParameter() {
		Object_CalculateableParameterImpl object_CalculateableParameter = new Object_CalculateableParameterImpl();
		return object_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindQuery createFindQuery() {
		FindQueryImpl findQuery = new FindQueryImpl();
		return findQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public charAt_FunctionalOperator createcharAt_FunctionalOperator() {
		charAt_FunctionalOperatorImpl charAt_FunctionalOperator = new charAt_FunctionalOperatorImpl();
		return charAt_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compareToStringIgnoreCase_FunctionalOperator createcompareToStringIgnoreCase_FunctionalOperator() {
		compareToStringIgnoreCase_FunctionalOperatorImpl compareToStringIgnoreCase_FunctionalOperator = new compareToStringIgnoreCase_FunctionalOperatorImpl();
		return compareToStringIgnoreCase_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Or_BitOperator createNumber_Or_BitOperator() {
		Number_Or_BitOperatorImpl number_Or_BitOperator = new Number_Or_BitOperatorImpl();
		return number_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_Object_CharSequence_equals_FunctionalOperator createCharSequence_String_Object_CharSequence_equals_FunctionalOperator() {
		CharSequence_String_Object_CharSequence_equals_FunctionalOperatorImpl charSequence_String_Object_CharSequence_equals_FunctionalOperator = new CharSequence_String_Object_CharSequence_equals_FunctionalOperatorImpl();
		return charSequence_String_Object_CharSequence_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toUpperCase_FunctionalOperator createtoUpperCase_FunctionalOperator() {
		toUpperCase_FunctionalOperatorImpl toUpperCase_FunctionalOperator = new toUpperCase_FunctionalOperatorImpl();
		return toUpperCase_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Boolean_hashCode_FunctionalOperator createObject_Boolean_hashCode_FunctionalOperator() {
		Object_Boolean_hashCode_FunctionalOperatorImpl object_Boolean_hashCode_FunctionalOperator = new Object_Boolean_hashCode_FunctionalOperatorImpl();
		return object_Boolean_hashCode_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_smallerEquals_FunctionalOperator createNumber_Double_smallerEquals_FunctionalOperator() {
		Number_Double_smallerEquals_FunctionalOperatorImpl number_Double_smallerEquals_FunctionalOperator = new Number_Double_smallerEquals_FunctionalOperatorImpl();
		return number_Double_smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_PrimitiveArgument createDouble_PrimitiveArgument() {
		Double_PrimitiveArgumentImpl double_PrimitiveArgument = new Double_PrimitiveArgumentImpl();
		return double_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public substring_FunctionalOperator createsubstring_FunctionalOperator() {
		substring_FunctionalOperatorImpl substring_FunctionalOperator = new substring_FunctionalOperatorImpl();
		return substring_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_Reference_OrGroup createCourse_Reference_OrGroup() {
		Course_Reference_OrGroupImpl course_Reference_OrGroup = new Course_Reference_OrGroupImpl();
		return course_Reference_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_name_AttrEClass createCourse_name_AttrEClass() {
		Course_name_AttrEClassImpl course_name_AttrEClass = new Course_name_AttrEClassImpl();
		return course_name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityManagementSystem_Reference_OrGroup createUniversityManagementSystem_Reference_OrGroup() {
		UniversityManagementSystem_Reference_OrGroupImpl universityManagementSystem_Reference_OrGroup = new UniversityManagementSystem_Reference_OrGroupImpl();
		return universityManagementSystem_Reference_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_greaterThan_FunctionalOperator createNumber_Double_greaterThan_FunctionalOperator() {
		Number_Double_greaterThan_FunctionalOperatorImpl number_Double_greaterThan_FunctionalOperator = new Number_Double_greaterThan_FunctionalOperatorImpl();
		return number_Double_greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CharSequence_equals_FunctionalOperator createObject_CharSequence_equals_FunctionalOperator() {
		Object_CharSequence_equals_FunctionalOperatorImpl object_CharSequence_equals_FunctionalOperator = new Object_CharSequence_equals_FunctionalOperatorImpl();
		return object_CharSequence_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType createCourseTypeFromString(EDataType eDataType, String initialValue) {
		CourseType result = CourseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence createCharSequenceFromString(EDataType eDataType, String initialValue) {
		return (CharSequence)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharSequenceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createCharacterFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createNumberFromString(EDataType eDataType, String initialValue) {
		return (Number)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmPackage getQmmPackage() {
		return (QmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QmmPackage getPackage() {
		return QmmPackage.eINSTANCE;
	}

} //QmmFactoryImpl
