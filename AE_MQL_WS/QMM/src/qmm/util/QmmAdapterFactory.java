/**
 */
package qmm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QmmPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QmmSwitch<Adapter> modelSwitch =
		new QmmSwitch<Adapter>() {
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseStudent(Student object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseProfessor(Professor object) {
				return createProfessorAdapter();
			}
			@Override
			public Adapter caseCourse(Course object) {
				return createCourseAdapter();
			}
			@Override
			public Adapter caseUniversityManagementSystem(UniversityManagementSystem object) {
				return createUniversityManagementSystemAdapter();
			}
			@Override
			public Adapter caseExam(Exam object) {
				return createExamAdapter();
			}
			@Override
			public Adapter caseNumber_Operator(Number_Operator object) {
				return createNumber_OperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_BitOperator(Boolean_BitOperator object) {
				return createBoolean_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument object) {
				return createNumber_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseDouble_CalculateableParameter(Double_CalculateableParameter object) {
				return createDouble_CalculateableParameterAdapter();
			}
			@Override
			public Adapter casetoLowerCase_FunctionalOperator(toLowerCase_FunctionalOperator object) {
				return createtoLowerCase_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseString_CalculateableParameter(String_CalculateableParameter object) {
				return createString_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator object) {
				return createDouble_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_ExpressionOperator(Number_ExpressionOperator object) {
				return createNumber_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Or_BitOperator(Integer_Or_BitOperator object) {
				return createInteger_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Operator(Boolean_Operator object) {
				return createBoolean_OperatorAdapter();
			}
			@Override
			public Adapter caseInteger_FunctionalOperator(Integer_FunctionalOperator object) {
				return createInteger_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Calculateable(Boolean_Calculateable object) {
				return createBoolean_CalculateableAdapter();
			}
			@Override
			public Adapter casecodePointBefore_FunctionalOperator(codePointBefore_FunctionalOperator object) {
				return createcodePointBefore_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseExam_examID_AttrEClass(Exam_examID_AttrEClass object) {
				return createExam_examID_AttrEClassAdapter();
			}
			@Override
			public Adapter caseMin_AggregationOperator_Double(Min_AggregationOperator_Double object) {
				return createMin_AggregationOperator_DoubleAdapter();
			}
			@Override
			public Adapter caseBoolean_Or_BitOperator(Boolean_Or_BitOperator object) {
				return createBoolean_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Type(Double_Type object) {
				return createDouble_TypeAdapter();
			}
			@Override
			public Adapter caseInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator object) {
				return createInteger_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object) {
				return createObject_Boolean_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseString_Original_FunctionalOperator(String_Original_FunctionalOperator object) {
				return createString_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseCharSequence_And_BitOperator(CharSequence_And_BitOperator object) {
				return createCharSequence_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_Object_Number_hashCode_FunctionalOperator(Number_Integer_Object_Number_hashCode_FunctionalOperator object) {
				return createNumber_Integer_Object_Number_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casecompareToString_FunctionalOperator(compareToString_FunctionalOperator object) {
				return createcompareToString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casecontains_FunctionalOperator(contains_FunctionalOperator object) {
				return createcontains_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_FunctionalParameter(Boolean_FunctionalParameter object) {
				return createBoolean_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseCalculateable_Argument(Calculateable_Argument object) {
				return createCalculateable_ArgumentAdapter();
			}
			@Override
			public Adapter caseCalculateable(Calculateable object) {
				return createCalculateableAdapter();
			}
			@Override
			public Adapter caseCalculatingAggregationOperator(CalculatingAggregationOperator object) {
				return createCalculatingAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument object) {
				return createInteger_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseDouble_And_BitOperator(Double_And_BitOperator object) {
				return createDouble_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator object) {
				return createNumber_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator object) {
				return createBoolean_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseString_FunctionalOperator(String_FunctionalOperator object) {
				return createString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Or_BitOperator(Character_Or_BitOperator object) {
				return createCharacter_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseequals_FunctionalOperator(equals_FunctionalOperator object) {
				return createequals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object) {
				return createObject_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_CalculateableElement(Double_CalculateableElement object) {
				return createDouble_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseNumber_Double_Object_Number_hashCode_FunctionalOperator(Number_Double_Object_Number_hashCode_FunctionalOperator object) {
				return createNumber_Double_Object_Number_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator object) {
				return createInheritedFrom_Object_to_Boolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator object) {
				return createCharSequence_String_Object_CharSequence_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseAggregationOperator(AggregationOperator object) {
				return createAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_PrimitiveArgument(Integer_PrimitiveArgument object) {
				return createInteger_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseCharSequence_FunctionalParameter(CharSequence_FunctionalParameter object) {
				return createCharSequence_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator object) {
				return createNumber_Integer_smallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object) {
				return createObject_Character_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casePerson_Containment_OrGroup(Person_Containment_OrGroup object) {
				return createPerson_Containment_OrGroupAdapter();
			}
			@Override
			public Adapter casesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator object) {
				return createsmallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casePrimitiveArgument(PrimitiveArgument object) {
				return createPrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_FunctionalOperator(Boolean_FunctionalOperator object) {
				return createBoolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Or_BitOperator(Double_Or_BitOperator object) {
				return createDouble_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseObject_CharSequence_hashCode_FunctionalOperator(Object_CharSequence_hashCode_FunctionalOperator object) {
				return createObject_CharSequence_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_PrimitiveArgument(Object_PrimitiveArgument object) {
				return createObject_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_ExpressionOperator(Boolean_ExpressionOperator object) {
				return createBoolean_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseAttributeEClass(AttributeEClass object) {
				return createAttributeEClassAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEvaluationBitOperator(EvaluationBitOperator object) {
				return createEvaluationBitOperatorAdapter();
			}
			@Override
			public Adapter caseString_FunctionalType(String_FunctionalType object) {
				return createString_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseObject_Calculateable(Object_Calculateable object) {
				return createObject_CalculateableAdapter();
			}
			@Override
			public Adapter caseString_Operator(String_Operator object) {
				return createString_OperatorAdapter();
			}
			@Override
			public Adapter caseObject_Argument(Object_Argument object) {
				return createObject_ArgumentAdapter();
			}
			@Override
			public Adapter caseString_Type(String_Type object) {
				return createString_TypeAdapter();
			}
			@Override
			public Adapter casecompareToBoolean_FunctionalOperator(compareToBoolean_FunctionalOperator object) {
				return createcompareToBoolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCountableReferenceParameter(CountableReferenceParameter object) {
				return createCountableReferenceParameterAdapter();
			}
			@Override
			public Adapter caseInteger_FunctionalParameter(Integer_FunctionalParameter object) {
				return createInteger_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseString_FunctionalParameter(String_FunctionalParameter object) {
				return createString_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseCharacter_FunctionalParameter(Character_FunctionalParameter object) {
				return createCharacter_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseNumber_CalculateableParameter(Number_CalculateableParameter object) {
				return createNumber_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator object) {
				return createNumber_Double_Object_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casePerson_name_AttrEClass(Person_name_AttrEClass object) {
				return createPerson_name_AttrEClassAdapter();
			}
			@Override
			public Adapter caselength_FunctionalOperator(length_FunctionalOperator object) {
				return createlength_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseconcat_FunctionalOperator(concat_FunctionalOperator object) {
				return createconcat_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCourseType_AttributeEClass(CourseType_AttributeEClass object) {
				return createCourseType_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseDouble_Argument(Double_Argument object) {
				return createDouble_ArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_Argument(Boolean_Argument object) {
				return createBoolean_ArgumentAdapter();
			}
			@Override
			public Adapter caseNumber_FunctionalParameter(Number_FunctionalParameter object) {
				return createNumber_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseReference_OrGroup(Reference_OrGroup object) {
				return createReference_OrGroupAdapter();
			}
			@Override
			public Adapter caseInteger_Operator(Integer_Operator object) {
				return createInteger_OperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator(CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator object) {
				return createCharSequence_String_Object_CharSequence_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_BitOperator(Character_BitOperator object) {
				return createCharacter_BitOperatorAdapter();
			}
			@Override
			public Adapter caseindexOfChar_FunctionalOperator(indexOfChar_FunctionalOperator object) {
				return createindexOfChar_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator object) {
				return createequalsIgnoreCase_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseExpressionOperator(ExpressionOperator object) {
				return createExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_And_BitOperator(Boolean_And_BitOperator object) {
				return createBoolean_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator object) {
				return createInheritedFrom_Object_to_Number_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument object) {
				return createCharSequence_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseEvaluationFunctionalOperator(EvaluationFunctionalOperator object) {
				return createEvaluationFunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator object) {
				return createNumber_Integer_Object_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseisEmpty_FunctionalOperator(isEmpty_FunctionalOperator object) {
				return createisEmpty_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Type(Integer_Type object) {
				return createInteger_TypeAdapter();
			}
			@Override
			public Adapter casetoString_FunctionalOperator(toString_FunctionalOperator object) {
				return createtoString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Number_hashCode_FunctionalOperator(Object_Number_hashCode_FunctionalOperator object) {
				return createObject_Number_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Type(Object_Type object) {
				return createObject_TypeAdapter();
			}
			@Override
			public Adapter caseCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument object) {
				return createCharSequence_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseStudent_Containment_OrGroup(Student_Containment_OrGroup object) {
				return createStudent_Containment_OrGroupAdapter();
			}
			@Override
			public Adapter caseCharacter_ExpressionOperator(Character_ExpressionOperator object) {
				return createCharacter_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter casehashCode_FunctionalOperator(hashCode_FunctionalOperator object) {
				return createhashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator object) {
				return createIntegerParseInt_ClassOperatorAdapter();
			}
			@Override
			public Adapter caseCourseType_CalculateableElement(CourseType_CalculateableElement object) {
				return createCourseType_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseCountingAggregationOperator(CountingAggregationOperator object) {
				return createCountingAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseExam_Reference_OrGroup(Exam_Reference_OrGroup object) {
				return createExam_Reference_OrGroupAdapter();
			}
			@Override
			public Adapter caseOrGroup(OrGroup object) {
				return createOrGroupAdapter();
			}
			@Override
			public Adapter caseProfessor_Reference_OrGroup(Professor_Reference_OrGroup object) {
				return createProfessor_Reference_OrGroupAdapter();
			}
			@Override
			public Adapter casesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator object) {
				return createsmallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_Type(CharSequence_Type object) {
				return createCharSequence_TypeAdapter();
			}
			@Override
			public Adapter caseString_ExpressionOperator(String_ExpressionOperator object) {
				return createString_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseOr_EvaluationBitOperator(Or_EvaluationBitOperator object) {
				return createOr_EvaluationBitOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Type(Character_Type object) {
				return createCharacter_TypeAdapter();
			}
			@Override
			public Adapter caseCharSequence_CalculateableParameter(CharSequence_CalculateableParameter object) {
				return createCharSequence_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseCharacter_And_BitOperator(Character_And_BitOperator object) {
				return createCharacter_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseString_Calculateable(String_Calculateable object) {
				return createString_CalculateableAdapter();
			}
			@Override
			public Adapter caseCharacter_Operator(Character_Operator object) {
				return createCharacter_OperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Type(Number_Type object) {
				return createNumber_TypeAdapter();
			}
			@Override
			public Adapter casecodePointAt_FunctionalOperator(codePointAt_FunctionalOperator object) {
				return createcodePointAt_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_BitOperator(Integer_BitOperator object) {
				return createInteger_BitOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object) {
				return createObject_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseString_Or_BitOperator(String_Or_BitOperator object) {
				return createString_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_BitOperator(Number_BitOperator object) {
				return createNumber_BitOperatorAdapter();
			}
			@Override
			public Adapter caseSelectClause(SelectClause object) {
				return createSelectClauseAdapter();
			}
			@Override
			public Adapter caseNumber_PrimitiveArgument(Number_PrimitiveArgument object) {
				return createNumber_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseMax_AggregationOperator_Double(Max_AggregationOperator_Double object) {
				return createMax_AggregationOperator_DoubleAdapter();
			}
			@Override
			public Adapter caseAnd_EvaluationBitOperator(And_EvaluationBitOperator object) {
				return createAnd_EvaluationBitOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator object) {
				return createInheritedFrom_Object_to_Character_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Calculateable(Number_Calculateable object) {
				return createNumber_CalculateableAdapter();
			}
			@Override
			public Adapter caseString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument object) {
				return createString_CalculateableElementReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseoffsetByCodePoints_FunctionalOperator(offsetByCodePoints_FunctionalOperator object) {
				return createoffsetByCodePoints_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Argument(Number_Argument object) {
				return createNumber_ArgumentAdapter();
			}
			@Override
			public Adapter caseObject_FunctionalOperator(Object_FunctionalOperator object) {
				return createObject_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseString_Argument(String_Argument object) {
				return createString_ArgumentAdapter();
			}
			@Override
			public Adapter caseindexOfCharFromIndex_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator object) {
				return createindexOfCharFromIndex_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument object) {
				return createDouble_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseNumber_And_BitOperator(Number_And_BitOperator object) {
				return createNumber_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCountable(Countable object) {
				return createCountableAdapter();
			}
			@Override
			public Adapter caseBoolean_FunctionalType(Boolean_FunctionalType object) {
				return createBoolean_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument object) {
				return createCalculateableElement_ReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseendsWith_FunctionalOperator(endsWith_FunctionalOperator object) {
				return createendsWith_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casestartsWithOffset_FunctionalOperator(startsWithOffset_FunctionalOperator object) {
				return createstartsWithOffset_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_FunctionalOperator(Number_FunctionalOperator object) {
				return createNumber_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseFindQueryCollection(FindQueryCollection object) {
				return createFindQueryCollectionAdapter();
			}
			@Override
			public Adapter caseProfessor_Containment_OrGroup(Professor_Containment_OrGroup object) {
				return createProfessor_Containment_OrGroupAdapter();
			}
			@Override
			public Adapter caseNumber_CalculateableElement(Number_CalculateableElement object) {
				return createNumber_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseDouble_BitOperator(Double_BitOperator object) {
				return createDouble_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCourse_courseType_AttrEClass(Course_courseType_AttrEClass object) {
				return createCourse_courseType_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCharacter_CalculateableElement(Character_CalculateableElement object) {
				return createCharacter_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseBoolean_CalculateableParameter(Boolean_CalculateableParameter object) {
				return createBoolean_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseCharacter_FunctionalOperator(Character_FunctionalOperator object) {
				return createCharacter_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_CalculateableParameter(Character_CalculateableParameter object) {
				return createCharacter_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseRegularAttributeEClass(RegularAttributeEClass object) {
				return createRegularAttributeEClassAdapter();
			}
			@Override
			public Adapter caseString_BitOperator(String_BitOperator object) {
				return createString_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Argument(Character_Argument object) {
				return createCharacter_ArgumentAdapter();
			}
			@Override
			public Adapter casePerson_Reference_OrGroup(Person_Reference_OrGroup object) {
				return createPerson_Reference_OrGroupAdapter();
			}
			@Override
			public Adapter caseCharSequence_CalculateableElement(CharSequence_CalculateableElement object) {
				return createCharSequence_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseCharSequence_FunctionalOperator(CharSequence_FunctionalOperator object) {
				return createCharSequence_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_PrimitiveArgument(Character_PrimitiveArgument object) {
				return createCharacter_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseInteger_ExpressionOperator(Integer_ExpressionOperator object) {
				return createInteger_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Type(Boolean_Type object) {
				return createBoolean_TypeAdapter();
			}
			@Override
			public Adapter caseparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator object) {
				return createparseBoolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator object) {
				return createNumber_Integer_greaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator object) {
				return createInheritedFrom_Number_to_Double_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseEvaluationOperator(EvaluationOperator object) {
				return createEvaluationOperatorAdapter();
			}
			@Override
			public Adapter casePerson_email_AttrEClass(Person_email_AttrEClass object) {
				return createPerson_email_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInteger_AttributeEClass(Integer_AttributeEClass object) {
				return createInteger_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseCourseType_EnumerationOperator(CourseType_EnumerationOperator object) {
				return createCourseType_EnumerationOperatorAdapter();
			}
			@Override
			public Adapter caseMax_AggregationOperator_Integer(Max_AggregationOperator_Integer object) {
				return createMax_AggregationOperator_IntegerAdapter();
			}
			@Override
			public Adapter caseCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator object) {
				return createCharSequence_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseGeneralizableElement(GeneralizableElement object) {
				return createGeneralizableElementAdapter();
			}
			@Override
			public Adapter caseCourse_Containment_OrGroup(Course_Containment_OrGroup object) {
				return createCourse_Containment_OrGroupAdapter();
			}
			@Override
			public Adapter caseDouble_FunctionalType(Double_FunctionalType object) {
				return createDouble_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseObject_FunctionalType(Object_FunctionalType object) {
				return createObject_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseClassOperator(ClassOperator object) {
				return createClassOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_FunctionalType(Integer_FunctionalType object) {
				return createInteger_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseString_AttributeEClass(String_AttributeEClass object) {
				return createString_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseBoolean_PrimitiveArgument(Boolean_PrimitiveArgument object) {
				return createBoolean_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseString_EvaluationOperation_Argument(String_EvaluationOperation_Argument object) {
				return createString_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseInteger_CalculateableElement(Integer_CalculateableElement object) {
				return createInteger_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseSum_AggregationOperator_Integer(Sum_AggregationOperator_Integer object) {
				return createSum_AggregationOperator_IntegerAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseFunctionalParameter(FunctionalParameter object) {
				return createFunctionalParameterAdapter();
			}
			@Override
			public Adapter caseEnumerationOperator(EnumerationOperator object) {
				return createEnumerationOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator object) {
				return createNumber_Double_greaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_CalculateableParameter(Integer_CalculateableParameter object) {
				return createInteger_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseCharSequence_FunctionalType(CharSequence_FunctionalType object) {
				return createCharSequence_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseString_CalculateableElement(String_CalculateableElement object) {
				return createString_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator object) {
				return createInheritedFrom_Number_to_Integer_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator object) {
				return createCharSequence_String_length_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_Calculateable(CharSequence_Calculateable object) {
				return createCharSequence_CalculateableAdapter();
			}
			@Override
			public Adapter caseCharSequence_ExpressionOperator(CharSequence_ExpressionOperator object) {
				return createCharSequence_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseindexOfString_FunctionalOperator(indexOfString_FunctionalOperator object) {
				return createindexOfString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casetrim_FunctionalOperator(trim_FunctionalOperator object) {
				return createtrim_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casegreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator object) {
				return creategreaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseStudent_Reference_OrGroup(Student_Reference_OrGroup object) {
				return createStudent_Reference_OrGroupAdapter();
			}
			@Override
			public Adapter caseString_And_BitOperator(String_And_BitOperator object) {
				return createString_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCalculateableElement(CalculateableElement object) {
				return createCalculateableElementAdapter();
			}
			@Override
			public Adapter caseCourse_courseNumber_AttrEClass(Course_courseNumber_AttrEClass object) {
				return createCourse_courseNumber_AttrEClassAdapter();
			}
			@Override
			public Adapter caseBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument object) {
				return createBoolean_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter casegreaterThan_FunctionalOperator(greaterThan_FunctionalOperator object) {
				return creategreaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCount_AggregationOperator(Count_AggregationOperator object) {
				return createCount_AggregationOperatorAdapter();
			}
			@Override
			public Adapter caseObject_CalculateableElement(Object_CalculateableElement object) {
				return createObject_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseMin_AggregationOperator_Integer(Min_AggregationOperator_Integer object) {
				return createMin_AggregationOperator_IntegerAdapter();
			}
			@Override
			public Adapter caseBitOperator(BitOperator object) {
				return createBitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator object) {
				return createNumber_Integer_greaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_And_BitOperator(Object_And_BitOperator object) {
				return createObject_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseRootClass(RootClass object) {
				return createRootClassAdapter();
			}
			@Override
			public Adapter caseContainment_OrGroup(Containment_OrGroup object) {
				return createContainment_OrGroupAdapter();
			}
			@Override
			public Adapter caseObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object) {
				return createObject_CharSequence_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator object) {
				return createNumber_Integer_Object_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNegatableElement(NegatableElement object) {
				return createNegatableElementAdapter();
			}
			@Override
			public Adapter caseCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument object) {
				return createCharacter_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseObject_FunctionalParameter(Object_FunctionalParameter object) {
				return createObject_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseNumber_FunctionalType(Number_FunctionalType object) {
				return createNumber_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseCourseType_Calculateable(CourseType_Calculateable object) {
				return createCourseType_CalculateableAdapter();
			}
			@Override
			public Adapter caseCharSequence_Or_BitOperator(CharSequence_Or_BitOperator object) {
				return createCharSequence_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Operator(Double_Operator object) {
				return createDouble_OperatorAdapter();
			}
			@Override
			public Adapter caseObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object) {
				return createObject_Character_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseObject_Or_BitOperator(Object_Or_BitOperator object) {
				return createObject_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_BitOperator(CharSequence_BitOperator object) {
				return createCharSequence_BitOperatorAdapter();
			}
			@Override
			public Adapter casestartsWith_FunctionalOperator(startsWith_FunctionalOperator object) {
				return createstartsWith_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_CalculateableElementReferenceArgument(Integer_CalculateableElementReferenceArgument object) {
				return createInteger_CalculateableElementReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseCharacter_FunctionalType(Character_FunctionalType object) {
				return createCharacter_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseStudent_matriculationNumber_AttrEClass(Student_matriculationNumber_AttrEClass object) {
				return createStudent_matriculationNumber_AttrEClassAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseDouble_ExpressionOperator(Double_ExpressionOperator object) {
				return createDouble_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseFunctionalType(FunctionalType object) {
				return createFunctionalTypeAdapter();
			}
			@Override
			public Adapter caseDouble_FunctionalParameter(Double_FunctionalParameter object) {
				return createDouble_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator object) {
				return createCharacter_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_FunctionalOperator(Double_FunctionalOperator object) {
				return createDouble_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseSum_AggregationOperator_Double(Sum_AggregationOperator_Double object) {
				return createSum_AggregationOperator_DoubleAdapter();
			}
			@Override
			public Adapter caseCalculateableParameter(CalculateableParameter object) {
				return createCalculateableParameterAdapter();
			}
			@Override
			public Adapter caseNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator object) {
				return createNumber_Double_Object_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object) {
				return createObject_Boolean_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCourseType_Operator(CourseType_Operator object) {
				return createCourseType_OperatorAdapter();
			}
			@Override
			public Adapter caseInteger_And_BitOperator(Integer_And_BitOperator object) {
				return createInteger_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator object) {
				return createInheritedFrom_Object_to_CharSequence_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCountable_ReferenceArgument(Countable_ReferenceArgument object) {
				return createCountable_ReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_CalculateableElement(Boolean_CalculateableElement object) {
				return createBoolean_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator object) {
				return createNumber_Integer_smallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Character_hashCode_FunctionalOperator(Object_Character_hashCode_FunctionalOperator object) {
				return createObject_Character_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseUniversityManagementSystem_Containment_OrGroup(UniversityManagementSystem_Containment_OrGroup object) {
				return createUniversityManagementSystem_Containment_OrGroupAdapter();
			}
			@Override
			public Adapter caseObject_ExpressionOperator(Object_ExpressionOperator object) {
				return createObject_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseExam_Containment_OrGroup(Exam_Containment_OrGroup object) {
				return createExam_Containment_OrGroupAdapter();
			}
			@Override
			public Adapter caseCharSequence_Operator(CharSequence_Operator object) {
				return createCharSequence_OperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator object) {
				return createNumber_Double_smallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseReferenceArgument(ReferenceArgument object) {
				return createReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseProfessor_employeeNumber_AttrEClass(Professor_employeeNumber_AttrEClass object) {
				return createProfessor_employeeNumber_AttrEClassAdapter();
			}
			@Override
			public Adapter casedoubleValue_FunctionalOperator(doubleValue_FunctionalOperator object) {
				return createdoubleValue_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseFunctionalArgument(FunctionalArgument object) {
				return createFunctionalArgumentAdapter();
			}
			@Override
			public Adapter caseCharSequence_Argument(CharSequence_Argument object) {
				return createCharSequence_ArgumentAdapter();
			}
			@Override
			public Adapter caseString_PrimitiveArgument(String_PrimitiveArgument object) {
				return createString_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseObject_CalculateableParameter(Object_CalculateableParameter object) {
				return createObject_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseFindQuery(FindQuery object) {
				return createFindQueryAdapter();
			}
			@Override
			public Adapter casecharAt_FunctionalOperator(charAt_FunctionalOperator object) {
				return createcharAt_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Calculateable(Integer_Calculateable object) {
				return createInteger_CalculateableAdapter();
			}
			@Override
			public Adapter casecompareToStringIgnoreCase_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator object) {
				return createcompareToStringIgnoreCase_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Or_BitOperator(Number_Or_BitOperator object) {
				return createNumber_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Operator(Object_Operator object) {
				return createObject_OperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator object) {
				return createCharSequence_String_Object_CharSequence_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casetoUpperCase_FunctionalOperator(toUpperCase_FunctionalOperator object) {
				return createtoUpperCase_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Boolean_hashCode_FunctionalOperator(Object_Boolean_hashCode_FunctionalOperator object) {
				return createObject_Boolean_hashCode_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseFunctionalOperator(FunctionalOperator object) {
				return createFunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator object) {
				return createNumber_Double_smallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Calculateable(Double_Calculateable object) {
				return createDouble_CalculateableAdapter();
			}
			@Override
			public Adapter caseEnumerationAttributeEClass(EnumerationAttributeEClass object) {
				return createEnumerationAttributeEClassAdapter();
			}
			@Override
			public Adapter caseDouble_PrimitiveArgument(Double_PrimitiveArgument object) {
				return createDouble_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter casesubstring_FunctionalOperator(substring_FunctionalOperator object) {
				return createsubstring_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseEvaluationOperation_Argument(EvaluationOperation_Argument object) {
				return createEvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseCourse_Reference_OrGroup(Course_Reference_OrGroup object) {
				return createCourse_Reference_OrGroupAdapter();
			}
			@Override
			public Adapter caseCourse_name_AttrEClass(Course_name_AttrEClass object) {
				return createCourse_name_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInteger_Argument(Integer_Argument object) {
				return createInteger_ArgumentAdapter();
			}
			@Override
			public Adapter caseCharacter_Calculateable(Character_Calculateable object) {
				return createCharacter_CalculateableAdapter();
			}
			@Override
			public Adapter caseObject_BitOperator(Object_BitOperator object) {
				return createObject_BitOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator object) {
				return createInheritedFrom_CharSequence_to_String_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseUniversityManagementSystem_Reference_OrGroup(UniversityManagementSystem_Reference_OrGroup object) {
				return createUniversityManagementSystem_Reference_OrGroupAdapter();
			}
			@Override
			public Adapter caseObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object) {
				return createObject_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator object) {
				return createNumber_Double_greaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object) {
				return createObject_CharSequence_equals_FunctionalOperatorAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qmm.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Professor
	 * @generated
	 */
	public Adapter createProfessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.UniversityManagementSystem <em>University Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.UniversityManagementSystem
	 * @generated
	 */
	public Adapter createUniversityManagementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Exam
	 * @generated
	 */
	public Adapter createExamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Operator <em>Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Operator
	 * @generated
	 */
	public Adapter createNumber_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_BitOperator <em>Boolean Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_BitOperator
	 * @generated
	 */
	public Adapter createBoolean_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_EvaluationOperation_Argument <em>Number Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createNumber_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_CalculateableParameter <em>Double Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_CalculateableParameter
	 * @generated
	 */
	public Adapter createDouble_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.toLowerCase_FunctionalOperator <em>to Lower Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.toLowerCase_FunctionalOperator
	 * @generated
	 */
	public Adapter createtoLowerCase_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_CalculateableParameter <em>String Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_CalculateableParameter
	 * @generated
	 */
	public Adapter createString_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Original_FunctionalOperator <em>Double Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createDouble_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_ExpressionOperator <em>Number Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_ExpressionOperator
	 * @generated
	 */
	public Adapter createNumber_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Or_BitOperator <em>Integer Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Or_BitOperator
	 * @generated
	 */
	public Adapter createInteger_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Operator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Operator
	 * @generated
	 */
	public Adapter createBoolean_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_FunctionalOperator <em>Integer Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_FunctionalOperator
	 * @generated
	 */
	public Adapter createInteger_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Calculateable <em>Boolean Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Calculateable
	 * @generated
	 */
	public Adapter createBoolean_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.codePointBefore_FunctionalOperator <em>code Point Before Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.codePointBefore_FunctionalOperator
	 * @generated
	 */
	public Adapter createcodePointBefore_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Exam_examID_AttrEClass <em>Exam exam ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Exam_examID_AttrEClass
	 * @generated
	 */
	public Adapter createExam_examID_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Min_AggregationOperator_Double <em>Min Aggregation Operator Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Min_AggregationOperator_Double
	 * @generated
	 */
	public Adapter createMin_AggregationOperator_DoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Or_BitOperator <em>Boolean Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Or_BitOperator
	 * @generated
	 */
	public Adapter createBoolean_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Type <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Type
	 * @generated
	 */
	public Adapter createDouble_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Original_FunctionalOperator <em>Integer Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createInteger_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Boolean_toString_FunctionalOperator <em>Object Boolean to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Boolean_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Boolean_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Original_FunctionalOperator <em>String Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createString_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_And_BitOperator <em>Char Sequence And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_And_BitOperator
	 * @generated
	 */
	public Adapter createCharSequence_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator <em>Number Integer Object Number hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_Object_Number_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.compareToString_FunctionalOperator <em>compare To String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.compareToString_FunctionalOperator
	 * @generated
	 */
	public Adapter createcompareToString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.contains_FunctionalOperator <em>contains Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.contains_FunctionalOperator
	 * @generated
	 */
	public Adapter createcontains_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_FunctionalParameter <em>Boolean Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_FunctionalParameter
	 * @generated
	 */
	public Adapter createBoolean_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Calculateable_Argument <em>Calculateable Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Calculateable_Argument
	 * @generated
	 */
	public Adapter createCalculateable_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Calculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Calculateable
	 * @generated
	 */
	public Adapter createCalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculatingAggregationOperator <em>Calculating Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculatingAggregationOperator
	 * @generated
	 */
	public Adapter createCalculatingAggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_EvaluationOperation_Argument <em>Integer Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createInteger_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_And_BitOperator <em>Double And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_And_BitOperator
	 * @generated
	 */
	public Adapter createDouble_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Original_FunctionalOperator <em>Number Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Original_FunctionalOperator <em>Boolean Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createBoolean_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_FunctionalOperator <em>String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_FunctionalOperator
	 * @generated
	 */
	public Adapter createString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Or_BitOperator <em>Character Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Or_BitOperator
	 * @generated
	 */
	public Adapter createCharacter_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.equals_FunctionalOperator <em>equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createequals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Number_equals_FunctionalOperator <em>Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_CalculateableElement <em>Double Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_CalculateableElement
	 * @generated
	 */
	public Adapter createDouble_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_Object_Number_hashCode_FunctionalOperator <em>Number Double Object Number hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_Object_Number_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_Object_Number_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_Boolean_FunctionalOperator <em>Inherited From Object to Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_Boolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_Boolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator <em>Char Sequence String Object Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_Object_CharSequence_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AggregationOperator <em>Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AggregationOperator
	 * @generated
	 */
	public Adapter createAggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_PrimitiveArgument <em>Integer Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_PrimitiveArgument
	 * @generated
	 */
	public Adapter createInteger_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_FunctionalParameter <em>Char Sequence Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_FunctionalParameter
	 * @generated
	 */
	public Adapter createCharSequence_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_smallerThan_FunctionalOperator <em>Number Integer smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_smallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Character_toString_FunctionalOperator <em>Object Character to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Character_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Character_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Person_Containment_OrGroup <em>Person Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Person_Containment_OrGroup
	 * @generated
	 */
	public Adapter createPerson_Containment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.smallerEquals_FunctionalOperator <em>smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createsmallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.PrimitiveArgument <em>Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.PrimitiveArgument
	 * @generated
	 */
	public Adapter createPrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_FunctionalOperator <em>Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createBoolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Or_BitOperator <em>Double Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Or_BitOperator
	 * @generated
	 */
	public Adapter createDouble_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CharSequence_hashCode_FunctionalOperator <em>Object Char Sequence hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CharSequence_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_CharSequence_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_PrimitiveArgument <em>Object Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_PrimitiveArgument
	 * @generated
	 */
	public Adapter createObject_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_ExpressionOperator <em>Boolean Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_ExpressionOperator
	 * @generated
	 */
	public Adapter createBoolean_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeEClass <em>Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeEClass
	 * @generated
	 */
	public Adapter createAttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationBitOperator <em>Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationBitOperator
	 * @generated
	 */
	public Adapter createEvaluationBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_FunctionalType <em>String Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_FunctionalType
	 * @generated
	 */
	public Adapter createString_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Calculateable <em>Object Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Calculateable
	 * @generated
	 */
	public Adapter createObject_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Operator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Operator
	 * @generated
	 */
	public Adapter createString_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Argument <em>Object Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Argument
	 * @generated
	 */
	public Adapter createObject_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Type <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Type
	 * @generated
	 */
	public Adapter createString_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.compareToBoolean_FunctionalOperator <em>compare To Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.compareToBoolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createcompareToBoolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CountableReferenceParameter <em>Countable Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CountableReferenceParameter
	 * @generated
	 */
	public Adapter createCountableReferenceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_FunctionalParameter <em>Integer Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_FunctionalParameter
	 * @generated
	 */
	public Adapter createInteger_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_FunctionalParameter <em>String Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_FunctionalParameter
	 * @generated
	 */
	public Adapter createString_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_FunctionalParameter <em>Character Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_FunctionalParameter
	 * @generated
	 */
	public Adapter createCharacter_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_CalculateableParameter <em>Number Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_CalculateableParameter
	 * @generated
	 */
	public Adapter createNumber_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_Object_Number_equals_FunctionalOperator <em>Number Double Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_Object_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Person_name_AttrEClass <em>Person name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Person_name_AttrEClass
	 * @generated
	 */
	public Adapter createPerson_name_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.length_FunctionalOperator <em>length Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.length_FunctionalOperator
	 * @generated
	 */
	public Adapter createlength_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.concat_FunctionalOperator <em>concat Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.concat_FunctionalOperator
	 * @generated
	 */
	public Adapter createconcat_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CourseType_AttributeEClass <em>Course Type Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CourseType_AttributeEClass
	 * @generated
	 */
	public Adapter createCourseType_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Argument <em>Double Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Argument
	 * @generated
	 */
	public Adapter createDouble_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Argument <em>Boolean Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Argument
	 * @generated
	 */
	public Adapter createBoolean_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_FunctionalParameter <em>Number Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_FunctionalParameter
	 * @generated
	 */
	public Adapter createNumber_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Reference_OrGroup <em>Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Reference_OrGroup
	 * @generated
	 */
	public Adapter createReference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Operator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Operator
	 * @generated
	 */
	public Adapter createInteger_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator <em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_Object_CharSequence_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_BitOperator <em>Character Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_BitOperator
	 * @generated
	 */
	public Adapter createCharacter_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.indexOfChar_FunctionalOperator <em>index Of Char Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.indexOfChar_FunctionalOperator
	 * @generated
	 */
	public Adapter createindexOfChar_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.equalsIgnoreCase_FunctionalOperator <em>equals Ignore Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.equalsIgnoreCase_FunctionalOperator
	 * @generated
	 */
	public Adapter createequalsIgnoreCase_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExpressionOperator <em>Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExpressionOperator
	 * @generated
	 */
	public Adapter createExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_And_BitOperator <em>Boolean And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_And_BitOperator
	 * @generated
	 */
	public Adapter createBoolean_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_Number_FunctionalOperator <em>Inherited From Object to Number Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_Number_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_Number_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_PrimitiveArgument <em>Char Sequence Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_PrimitiveArgument
	 * @generated
	 */
	public Adapter createCharSequence_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationFunctionalOperator <em>Evaluation Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationFunctionalOperator
	 * @generated
	 */
	public Adapter createEvaluationFunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_Object_Number_toString_FunctionalOperator <em>Number Integer Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_Object_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.isEmpty_FunctionalOperator <em>is Empty Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.isEmpty_FunctionalOperator
	 * @generated
	 */
	public Adapter createisEmpty_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Type <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Type
	 * @generated
	 */
	public Adapter createInteger_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.toString_FunctionalOperator <em>to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createtoString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Number_hashCode_FunctionalOperator <em>Object Number hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Number_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Number_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Type <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Type
	 * @generated
	 */
	public Adapter createObject_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_EvaluationOperation_Argument <em>Char Sequence Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createCharSequence_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Student_Containment_OrGroup <em>Student Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Student_Containment_OrGroup
	 * @generated
	 */
	public Adapter createStudent_Containment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_ExpressionOperator <em>Character Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_ExpressionOperator
	 * @generated
	 */
	public Adapter createCharacter_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.hashCode_FunctionalOperator <em>hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createhashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.IntegerParseInt_ClassOperator <em>Integer Parse Int Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.IntegerParseInt_ClassOperator
	 * @generated
	 */
	public Adapter createIntegerParseInt_ClassOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CourseType_CalculateableElement <em>Course Type Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CourseType_CalculateableElement
	 * @generated
	 */
	public Adapter createCourseType_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CountingAggregationOperator <em>Counting Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CountingAggregationOperator
	 * @generated
	 */
	public Adapter createCountingAggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Exam_Reference_OrGroup <em>Exam Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Exam_Reference_OrGroup
	 * @generated
	 */
	public Adapter createExam_Reference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrGroup <em>Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrGroup
	 * @generated
	 */
	public Adapter createOrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Professor_Reference_OrGroup <em>Professor Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Professor_Reference_OrGroup
	 * @generated
	 */
	public Adapter createProfessor_Reference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.smallerThan_FunctionalOperator <em>smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createsmallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Type <em>Char Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Type
	 * @generated
	 */
	public Adapter createCharSequence_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_ExpressionOperator <em>String Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_ExpressionOperator
	 * @generated
	 */
	public Adapter createString_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Or_EvaluationBitOperator <em>Or Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Or_EvaluationBitOperator
	 * @generated
	 */
	public Adapter createOr_EvaluationBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Type <em>Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Type
	 * @generated
	 */
	public Adapter createCharacter_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_CalculateableParameter <em>Char Sequence Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_CalculateableParameter
	 * @generated
	 */
	public Adapter createCharSequence_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_And_BitOperator <em>Character And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_And_BitOperator
	 * @generated
	 */
	public Adapter createCharacter_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Calculateable <em>String Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Calculateable
	 * @generated
	 */
	public Adapter createString_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Operator <em>Character Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Operator
	 * @generated
	 */
	public Adapter createCharacter_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Type <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Type
	 * @generated
	 */
	public Adapter createNumber_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.codePointAt_FunctionalOperator <em>code Point At Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.codePointAt_FunctionalOperator
	 * @generated
	 */
	public Adapter createcodePointAt_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_BitOperator <em>Integer Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_BitOperator
	 * @generated
	 */
	public Adapter createInteger_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Number_toString_FunctionalOperator <em>Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Or_BitOperator <em>String Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Or_BitOperator
	 * @generated
	 */
	public Adapter createString_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_BitOperator <em>Number Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_BitOperator
	 * @generated
	 */
	public Adapter createNumber_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SelectClause
	 * @generated
	 */
	public Adapter createSelectClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_PrimitiveArgument <em>Number Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_PrimitiveArgument
	 * @generated
	 */
	public Adapter createNumber_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Max_AggregationOperator_Double <em>Max Aggregation Operator Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Max_AggregationOperator_Double
	 * @generated
	 */
	public Adapter createMax_AggregationOperator_DoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.And_EvaluationBitOperator <em>And Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.And_EvaluationBitOperator
	 * @generated
	 */
	public Adapter createAnd_EvaluationBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_Character_FunctionalOperator <em>Inherited From Object to Character Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_Character_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_Character_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Calculateable <em>Number Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Calculateable
	 * @generated
	 */
	public Adapter createNumber_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_CalculateableElementReferenceArgument <em>String Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_CalculateableElementReferenceArgument
	 * @generated
	 */
	public Adapter createString_CalculateableElementReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.offsetByCodePoints_FunctionalOperator <em>offset By Code Points Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.offsetByCodePoints_FunctionalOperator
	 * @generated
	 */
	public Adapter createoffsetByCodePoints_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Argument <em>Number Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Argument
	 * @generated
	 */
	public Adapter createNumber_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_FunctionalOperator <em>Object Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Argument <em>String Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Argument
	 * @generated
	 */
	public Adapter createString_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.indexOfCharFromIndex_FunctionalOperator <em>index Of Char From Index Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.indexOfCharFromIndex_FunctionalOperator
	 * @generated
	 */
	public Adapter createindexOfCharFromIndex_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_EvaluationOperation_Argument <em>Double Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createDouble_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_And_BitOperator <em>Number And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_And_BitOperator
	 * @generated
	 */
	public Adapter createNumber_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Countable <em>Countable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Countable
	 * @generated
	 */
	public Adapter createCountableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_FunctionalType <em>Boolean Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_FunctionalType
	 * @generated
	 */
	public Adapter createBoolean_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculateableElement_ReferenceArgument <em>Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculateableElement_ReferenceArgument
	 * @generated
	 */
	public Adapter createCalculateableElement_ReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.endsWith_FunctionalOperator <em>ends With Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.endsWith_FunctionalOperator
	 * @generated
	 */
	public Adapter createendsWith_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.startsWithOffset_FunctionalOperator <em>starts With Offset Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.startsWithOffset_FunctionalOperator
	 * @generated
	 */
	public Adapter createstartsWithOffset_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_FunctionalOperator <em>Number Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FindQueryCollection <em>Find Query Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FindQueryCollection
	 * @generated
	 */
	public Adapter createFindQueryCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Professor_Containment_OrGroup <em>Professor Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Professor_Containment_OrGroup
	 * @generated
	 */
	public Adapter createProfessor_Containment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_CalculateableElement <em>Number Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_CalculateableElement
	 * @generated
	 */
	public Adapter createNumber_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_BitOperator <em>Double Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_BitOperator
	 * @generated
	 */
	public Adapter createDouble_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Course_courseType_AttrEClass <em>Course course Type Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Course_courseType_AttrEClass
	 * @generated
	 */
	public Adapter createCourse_courseType_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_CalculateableElement <em>Character Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_CalculateableElement
	 * @generated
	 */
	public Adapter createCharacter_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_CalculateableParameter <em>Boolean Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_CalculateableParameter
	 * @generated
	 */
	public Adapter createBoolean_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_FunctionalOperator <em>Character Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharacter_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_CalculateableParameter <em>Character Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_CalculateableParameter
	 * @generated
	 */
	public Adapter createCharacter_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RegularAttributeEClass <em>Regular Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RegularAttributeEClass
	 * @generated
	 */
	public Adapter createRegularAttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_BitOperator <em>String Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_BitOperator
	 * @generated
	 */
	public Adapter createString_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Argument <em>Character Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Argument
	 * @generated
	 */
	public Adapter createCharacter_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Person_Reference_OrGroup <em>Person Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Person_Reference_OrGroup
	 * @generated
	 */
	public Adapter createPerson_Reference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_CalculateableElement <em>Char Sequence Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_CalculateableElement
	 * @generated
	 */
	public Adapter createCharSequence_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_FunctionalOperator <em>Char Sequence Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_PrimitiveArgument <em>Character Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_PrimitiveArgument
	 * @generated
	 */
	public Adapter createCharacter_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_ExpressionOperator <em>Integer Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_ExpressionOperator
	 * @generated
	 */
	public Adapter createInteger_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Type <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Type
	 * @generated
	 */
	public Adapter createBoolean_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.parseBoolean_FunctionalOperator <em>parse Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.parseBoolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createparseBoolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_greaterThan_FunctionalOperator <em>Number Integer greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_greaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Number_to_Double_FunctionalOperator <em>Inherited From Number to Double Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Number_to_Double_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Number_to_Double_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationOperator
	 * @generated
	 */
	public Adapter createEvaluationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Person_email_AttrEClass <em>Person email Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Person_email_AttrEClass
	 * @generated
	 */
	public Adapter createPerson_email_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_AttributeEClass <em>Integer Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_AttributeEClass
	 * @generated
	 */
	public Adapter createInteger_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CourseType_EnumerationOperator <em>Course Type Enumeration Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CourseType_EnumerationOperator
	 * @generated
	 */
	public Adapter createCourseType_EnumerationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Max_AggregationOperator_Integer <em>Max Aggregation Operator Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Max_AggregationOperator_Integer
	 * @generated
	 */
	public Adapter createMax_AggregationOperator_IntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Original_FunctionalOperator <em>Char Sequence Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GeneralizableElement <em>Generalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GeneralizableElement
	 * @generated
	 */
	public Adapter createGeneralizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Course_Containment_OrGroup <em>Course Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Course_Containment_OrGroup
	 * @generated
	 */
	public Adapter createCourse_Containment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_FunctionalType <em>Double Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_FunctionalType
	 * @generated
	 */
	public Adapter createDouble_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_FunctionalType <em>Object Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_FunctionalType
	 * @generated
	 */
	public Adapter createObject_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ClassOperator <em>Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ClassOperator
	 * @generated
	 */
	public Adapter createClassOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_FunctionalType <em>Integer Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_FunctionalType
	 * @generated
	 */
	public Adapter createInteger_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_AttributeEClass <em>String Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_AttributeEClass
	 * @generated
	 */
	public Adapter createString_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_PrimitiveArgument <em>Boolean Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_PrimitiveArgument
	 * @generated
	 */
	public Adapter createBoolean_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_EvaluationOperation_Argument <em>String Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createString_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_CalculateableElement <em>Integer Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_CalculateableElement
	 * @generated
	 */
	public Adapter createInteger_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Sum_AggregationOperator_Integer <em>Sum Aggregation Operator Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Sum_AggregationOperator_Integer
	 * @generated
	 */
	public Adapter createSum_AggregationOperator_IntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalParameter <em>Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalParameter
	 * @generated
	 */
	public Adapter createFunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EnumerationOperator <em>Enumeration Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EnumerationOperator
	 * @generated
	 */
	public Adapter createEnumerationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_greaterEquals_FunctionalOperator <em>Number Double greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_greaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_CalculateableParameter <em>Integer Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_CalculateableParameter
	 * @generated
	 */
	public Adapter createInteger_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_FunctionalType <em>Char Sequence Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_FunctionalType
	 * @generated
	 */
	public Adapter createCharSequence_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_CalculateableElement <em>String Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_CalculateableElement
	 * @generated
	 */
	public Adapter createString_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Number_to_Integer_FunctionalOperator <em>Inherited From Number to Integer Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Number_to_Integer_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Number_to_Integer_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_length_FunctionalOperator <em>Char Sequence String length Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_length_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_length_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Calculateable <em>Char Sequence Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Calculateable
	 * @generated
	 */
	public Adapter createCharSequence_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_ExpressionOperator <em>Char Sequence Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_ExpressionOperator
	 * @generated
	 */
	public Adapter createCharSequence_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.indexOfString_FunctionalOperator <em>index Of String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.indexOfString_FunctionalOperator
	 * @generated
	 */
	public Adapter createindexOfString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.trim_FunctionalOperator <em>trim Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.trim_FunctionalOperator
	 * @generated
	 */
	public Adapter createtrim_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.greaterEquals_FunctionalOperator <em>greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter creategreaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Student_Reference_OrGroup <em>Student Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Student_Reference_OrGroup
	 * @generated
	 */
	public Adapter createStudent_Reference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_And_BitOperator <em>String And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_And_BitOperator
	 * @generated
	 */
	public Adapter createString_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculateableElement <em>Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculateableElement
	 * @generated
	 */
	public Adapter createCalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Course_courseNumber_AttrEClass <em>Course course Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Course_courseNumber_AttrEClass
	 * @generated
	 */
	public Adapter createCourse_courseNumber_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_EvaluationOperation_Argument <em>Boolean Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createBoolean_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.greaterThan_FunctionalOperator <em>greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter creategreaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Count_AggregationOperator <em>Count Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Count_AggregationOperator
	 * @generated
	 */
	public Adapter createCount_AggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CalculateableElement <em>Object Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CalculateableElement
	 * @generated
	 */
	public Adapter createObject_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Min_AggregationOperator_Integer <em>Min Aggregation Operator Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Min_AggregationOperator_Integer
	 * @generated
	 */
	public Adapter createMin_AggregationOperator_IntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.BitOperator <em>Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.BitOperator
	 * @generated
	 */
	public Adapter createBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_greaterEquals_FunctionalOperator <em>Number Integer greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_greaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_And_BitOperator <em>Object And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_And_BitOperator
	 * @generated
	 */
	public Adapter createObject_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RootClass <em>Root Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RootClass
	 * @generated
	 */
	public Adapter createRootClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Containment_OrGroup <em>Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Containment_OrGroup
	 * @generated
	 */
	public Adapter createContainment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CharSequence_toString_FunctionalOperator <em>Object Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CharSequence_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_CharSequence_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_Object_Number_equals_FunctionalOperator <em>Number Integer Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_Object_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NegatableElement <em>Negatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NegatableElement
	 * @generated
	 */
	public Adapter createNegatableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_EvaluationOperation_Argument <em>Character Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createCharacter_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_FunctionalParameter <em>Object Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_FunctionalParameter
	 * @generated
	 */
	public Adapter createObject_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_FunctionalType <em>Number Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_FunctionalType
	 * @generated
	 */
	public Adapter createNumber_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CourseType_Calculateable <em>Course Type Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CourseType_Calculateable
	 * @generated
	 */
	public Adapter createCourseType_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Or_BitOperator <em>Char Sequence Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Or_BitOperator
	 * @generated
	 */
	public Adapter createCharSequence_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Operator <em>Double Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Operator
	 * @generated
	 */
	public Adapter createDouble_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Character_equals_FunctionalOperator <em>Object Character equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Character_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Character_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Or_BitOperator <em>Object Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Or_BitOperator
	 * @generated
	 */
	public Adapter createObject_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_BitOperator <em>Char Sequence Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_BitOperator
	 * @generated
	 */
	public Adapter createCharSequence_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.startsWith_FunctionalOperator <em>starts With Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.startsWith_FunctionalOperator
	 * @generated
	 */
	public Adapter createstartsWith_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_CalculateableElementReferenceArgument <em>Integer Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_CalculateableElementReferenceArgument
	 * @generated
	 */
	public Adapter createInteger_CalculateableElementReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_FunctionalType <em>Character Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_FunctionalType
	 * @generated
	 */
	public Adapter createCharacter_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Student_matriculationNumber_AttrEClass <em>Student matriculation Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Student_matriculationNumber_AttrEClass
	 * @generated
	 */
	public Adapter createStudent_matriculationNumber_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_ExpressionOperator <em>Double Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_ExpressionOperator
	 * @generated
	 */
	public Adapter createDouble_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalType <em>Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalType
	 * @generated
	 */
	public Adapter createFunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_FunctionalParameter <em>Double Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_FunctionalParameter
	 * @generated
	 */
	public Adapter createDouble_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Original_FunctionalOperator <em>Character Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharacter_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_FunctionalOperator <em>Double Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_FunctionalOperator
	 * @generated
	 */
	public Adapter createDouble_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Sum_AggregationOperator_Double <em>Sum Aggregation Operator Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Sum_AggregationOperator_Double
	 * @generated
	 */
	public Adapter createSum_AggregationOperator_DoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculateableParameter <em>Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculateableParameter
	 * @generated
	 */
	public Adapter createCalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_Object_Number_toString_FunctionalOperator <em>Number Double Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_Object_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Boolean_equals_FunctionalOperator <em>Object Boolean equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Boolean_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Boolean_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CourseType_Operator <em>Course Type Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CourseType_Operator
	 * @generated
	 */
	public Adapter createCourseType_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_And_BitOperator <em>Integer And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_And_BitOperator
	 * @generated
	 */
	public Adapter createInteger_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_CharSequence_FunctionalOperator <em>Inherited From Object to Char Sequence Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_CharSequence_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_CharSequence_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Countable_ReferenceArgument <em>Countable Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Countable_ReferenceArgument
	 * @generated
	 */
	public Adapter createCountable_ReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_CalculateableElement <em>Boolean Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_CalculateableElement
	 * @generated
	 */
	public Adapter createBoolean_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_smallerEquals_FunctionalOperator <em>Number Integer smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_smallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Character_hashCode_FunctionalOperator <em>Object Character hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Character_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Character_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.UniversityManagementSystem_Containment_OrGroup <em>University Management System Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.UniversityManagementSystem_Containment_OrGroup
	 * @generated
	 */
	public Adapter createUniversityManagementSystem_Containment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_ExpressionOperator <em>Object Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_ExpressionOperator
	 * @generated
	 */
	public Adapter createObject_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Exam_Containment_OrGroup <em>Exam Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Exam_Containment_OrGroup
	 * @generated
	 */
	public Adapter createExam_Containment_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Operator <em>Char Sequence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Operator
	 * @generated
	 */
	public Adapter createCharSequence_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_smallerThan_FunctionalOperator <em>Number Double smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_smallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ReferenceArgument <em>Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ReferenceArgument
	 * @generated
	 */
	public Adapter createReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Professor_employeeNumber_AttrEClass <em>Professor employee Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Professor_employeeNumber_AttrEClass
	 * @generated
	 */
	public Adapter createProfessor_employeeNumber_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.doubleValue_FunctionalOperator <em>double Value Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.doubleValue_FunctionalOperator
	 * @generated
	 */
	public Adapter createdoubleValue_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalArgument <em>Functional Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalArgument
	 * @generated
	 */
	public Adapter createFunctionalArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Argument <em>Char Sequence Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Argument
	 * @generated
	 */
	public Adapter createCharSequence_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_PrimitiveArgument <em>String Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_PrimitiveArgument
	 * @generated
	 */
	public Adapter createString_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CalculateableParameter <em>Object Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CalculateableParameter
	 * @generated
	 */
	public Adapter createObject_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FindQuery <em>Find Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FindQuery
	 * @generated
	 */
	public Adapter createFindQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.charAt_FunctionalOperator <em>char At Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.charAt_FunctionalOperator
	 * @generated
	 */
	public Adapter createcharAt_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Calculateable <em>Integer Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Calculateable
	 * @generated
	 */
	public Adapter createInteger_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.compareToStringIgnoreCase_FunctionalOperator <em>compare To String Ignore Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.compareToStringIgnoreCase_FunctionalOperator
	 * @generated
	 */
	public Adapter createcompareToStringIgnoreCase_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Or_BitOperator <em>Number Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Or_BitOperator
	 * @generated
	 */
	public Adapter createNumber_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Operator <em>Object Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Operator
	 * @generated
	 */
	public Adapter createObject_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator <em>Char Sequence String Object Char Sequence equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_Object_CharSequence_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.toUpperCase_FunctionalOperator <em>to Upper Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.toUpperCase_FunctionalOperator
	 * @generated
	 */
	public Adapter createtoUpperCase_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Boolean_hashCode_FunctionalOperator <em>Object Boolean hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Boolean_hashCode_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Boolean_hashCode_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalOperator <em>Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalOperator
	 * @generated
	 */
	public Adapter createFunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_smallerEquals_FunctionalOperator <em>Number Double smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_smallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Calculateable <em>Double Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Calculateable
	 * @generated
	 */
	public Adapter createDouble_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EnumerationAttributeEClass <em>Enumeration Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EnumerationAttributeEClass
	 * @generated
	 */
	public Adapter createEnumerationAttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_PrimitiveArgument <em>Double Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_PrimitiveArgument
	 * @generated
	 */
	public Adapter createDouble_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.substring_FunctionalOperator <em>substring Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.substring_FunctionalOperator
	 * @generated
	 */
	public Adapter createsubstring_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationOperation_Argument <em>Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createEvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Course_Reference_OrGroup <em>Course Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Course_Reference_OrGroup
	 * @generated
	 */
	public Adapter createCourse_Reference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Course_name_AttrEClass <em>Course name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Course_name_AttrEClass
	 * @generated
	 */
	public Adapter createCourse_name_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Argument <em>Integer Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Argument
	 * @generated
	 */
	public Adapter createInteger_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Calculateable <em>Character Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Calculateable
	 * @generated
	 */
	public Adapter createCharacter_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_BitOperator <em>Object Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_BitOperator
	 * @generated
	 */
	public Adapter createObject_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_CharSequence_to_String_FunctionalOperator <em>Inherited From Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_CharSequence_to_String_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_CharSequence_to_String_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.UniversityManagementSystem_Reference_OrGroup <em>University Management System Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.UniversityManagementSystem_Reference_OrGroup
	 * @generated
	 */
	public Adapter createUniversityManagementSystem_Reference_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_EvaluationOperation_Argument <em>Object Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createObject_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_greaterThan_FunctionalOperator <em>Number Double greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_greaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CharSequence_equals_FunctionalOperator <em>Object Char Sequence equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CharSequence_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_CharSequence_equals_FunctionalOperatorAdapter() {
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

} //QmmAdapterFactory
