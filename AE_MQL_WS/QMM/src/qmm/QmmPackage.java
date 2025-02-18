/**
 */
package qmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qmm.QmmFactory
 * @model kind="package"
 * @generated
 */
public interface QmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/QMM/model/QMM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QmmPackage eINSTANCE = qmm.impl.QmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link qmm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.NamedElementImpl
	 * @see qmm.impl.QmmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qmm.impl.RootClassImpl <em>Root Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.RootClassImpl
	 * @see qmm.impl.QmmPackageImpl#getRootClass()
	 * @generated
	 */
	int ROOT_CLASS = 209;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__EVALUATION_OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.PersonImpl
	 * @see qmm.impl.QmmPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = ROOT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EVALUATION_OPERATOR = ROOT_CLASS__EVALUATION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME_ATTR_ECLASS = ROOT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL_ATTR_ECLASS = ROOT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = ROOT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_CHECK_EXPRESSION__OBJECT = ROOT_CLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = ROOT_CLASS___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VALIDATE__DIAGNOSTICCHAIN_MAP = ROOT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = ROOT_CLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.StudentImpl
	 * @see qmm.impl.QmmPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EVALUATION_OPERATOR = PERSON__EVALUATION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME_ATTR_ECLASS = PERSON__NAME_ATTR_ECLASS;

	/**
	 * The feature id for the '<em><b>Email Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL_ATTR_ECLASS = PERSON__EMAIL_ATTR_ECLASS;

	/**
	 * The feature id for the '<em><b>Attends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ATTENDS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matriculation Number Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VALIDATE_CHECK_EXPRESSION__OBJECT = PERSON___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = PERSON___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VALIDATE__DIAGNOSTICCHAIN_MAP = PERSON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ProfessorImpl
	 * @see qmm.impl.QmmPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EVALUATION_OPERATOR = PERSON__EVALUATION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME_ATTR_ECLASS = PERSON__NAME_ATTR_ECLASS;

	/**
	 * The feature id for the '<em><b>Email Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL_ATTR_ECLASS = PERSON__EMAIL_ATTR_ECLASS;

	/**
	 * The feature id for the '<em><b>Lectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__LECTURES = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Employee Number Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___VALIDATE_CHECK_EXPRESSION__OBJECT = PERSON___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = PERSON___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___VALIDATE__DIAGNOSTICCHAIN_MAP = PERSON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CourseImpl
	 * @see qmm.impl.QmmPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = ROOT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__EVALUATION_OPERATOR = ROOT_CLASS__EVALUATION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Mandatory For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MANDATORY_FOR = ROOT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__EXAM = ROOT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME_ATTR_ECLASS = ROOT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Course Number Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NUMBER_ATTR_ECLASS = ROOT_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Course Type Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_TYPE_ATTR_ECLASS = ROOT_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = ROOT_CLASS_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___VALIDATE_CHECK_EXPRESSION__OBJECT = ROOT_CLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = ROOT_CLASS___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___VALIDATE__DIAGNOSTICCHAIN_MAP = ROOT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = ROOT_CLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.UniversityManagementSystemImpl <em>University Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.UniversityManagementSystemImpl
	 * @see qmm.impl.QmmPackageImpl#getUniversityManagementSystem()
	 * @generated
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM__NAME = ROOT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM__EVALUATION_OPERATOR = ROOT_CLASS__EVALUATION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM__COURSE = ROOT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM__PERSON = ROOT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>University Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_FEATURE_COUNT = ROOT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM___VALIDATE_CHECK_EXPRESSION__OBJECT = ROOT_CLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = ROOT_CLASS___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM___VALIDATE__DIAGNOSTICCHAIN_MAP = ROOT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>University Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_OPERATION_COUNT = ROOT_CLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ExamImpl
	 * @see qmm.impl.QmmPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__NAME = ROOT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__EVALUATION_OPERATOR = ROOT_CLASS__EVALUATION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exam ID Attr EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__EXAM_ID_ATTR_ECLASS = ROOT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = ROOT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___VALIDATE_CHECK_EXPRESSION__OBJECT = ROOT_CLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate All Check Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT = ROOT_CLASS___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___VALIDATE__DIAGNOSTICCHAIN_MAP = ROOT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = ROOT_CLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 38;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_OperatorImpl <em>Number Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Operator()
	 * @generated
	 */
	int NUMBER_OPERATOR = 6;

	/**
	 * The number of structural features of the '<em>Number Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.ExpressionOperatorImpl <em>Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getExpressionOperator()
	 * @generated
	 */
	int EXPRESSION_OPERATOR = 89;

	/**
	 * The number of structural features of the '<em>Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_ExpressionOperatorImpl <em>Boolean Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_ExpressionOperator()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_OPERATOR = 60;

	/**
	 * The number of structural features of the '<em>Boolean Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_BitOperatorImpl <em>Boolean Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_BitOperator()
	 * @generated
	 */
	int BOOLEAN_BIT_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BIT_OPERATOR__NEGATED = BOOLEAN_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BIT_OPERATOR__CONNECTS = BOOLEAN_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BIT_OPERATOR_FEATURE_COUNT = BOOLEAN_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BIT_OPERATOR_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.TypedElementImpl
	 * @see qmm.impl.QmmPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 26;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___GET_TYPE = 0;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qmm.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 228;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT___GET_TYPE = TYPED_ELEMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.ReferenceArgumentImpl <em>Reference Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ReferenceArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getReferenceArgument()
	 * @generated
	 */
	int REFERENCE_ARGUMENT = 250;

	/**
	 * The number of structural features of the '<em>Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARGUMENT___GET_TYPE = ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Calculateable_ArgumentImpl <em>Calculateable Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Calculateable_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCalculateable_Argument()
	 * @generated
	 */
	int CALCULATEABLE_ARGUMENT = 32;

	/**
	 * The number of structural features of the '<em>Calculateable Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ARGUMENT_FEATURE_COUNT = REFERENCE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ARGUMENT___GET_TYPE = REFERENCE_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Calculateable Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ARGUMENT_OPERATION_COUNT = REFERENCE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.EvaluationOperation_ArgumentImpl <em>Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getEvaluationOperation_Argument()
	 * @generated
	 */
	int EVALUATION_OPERATION_ARGUMENT = 272;

	/**
	 * The number of structural features of the '<em>Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = CALCULATEABLE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_ARGUMENT___GET_TYPE = CALCULATEABLE_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = CALCULATEABLE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_EvaluationOperation_ArgumentImpl <em>Number Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_EvaluationOperation_Argument()
	 * @generated
	 */
	int NUMBER_EVALUATION_OPERATION_ARGUMENT = 8;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Number Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 183;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_TypeImpl <em>Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_Type()
	 * @generated
	 */
	int DOUBLE_TYPE = 22;

	/**
	 * The number of structural features of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_CalculateableParameterImpl <em>Double Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_CalculateableParameter()
	 * @generated
	 */
	int DOUBLE_CALCULATEABLE_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_PARAMETER__ARGUMENT = DOUBLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_PARAMETER_FEATURE_COUNT = DOUBLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_PARAMETER___GET_TYPE = DOUBLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = DOUBLE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_PARAMETER_OPERATION_COUNT = DOUBLE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_FunctionalOperatorImpl <em>String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_FunctionalOperator()
	 * @generated
	 */
	int STRING_FUNCTIONAL_OPERATOR = 40;

	/**
	 * The number of structural features of the '<em>String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_Original_FunctionalOperatorImpl <em>String Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_Original_FunctionalOperator()
	 * @generated
	 */
	int STRING_ORIGINAL_FUNCTIONAL_OPERATOR = 25;

	/**
	 * The number of structural features of the '<em>String Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>String Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.toLowerCase_FunctionalOperatorImpl <em>to Lower Case Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.toLowerCase_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#gettoLowerCase_FunctionalOperator()
	 * @generated
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>to Lower Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>to Lower Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_LOWER_CASE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_TypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getString_Type()
	 * @generated
	 */
	int STRING_TYPE = 68;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_CalculateableParameterImpl <em>String Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getString_CalculateableParameter()
	 * @generated
	 */
	int STRING_CALCULATEABLE_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_PARAMETER__ARGUMENT = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_PARAMETER_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_PARAMETER___GET_TYPE = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = STRING_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_PARAMETER_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_FunctionalOperatorImpl <em>Double Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_FunctionalOperator()
	 * @generated
	 */
	int DOUBLE_FUNCTIONAL_OPERATOR = 233;

	/**
	 * The number of structural features of the '<em>Double Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_Original_FunctionalOperatorImpl <em>Double Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_Original_FunctionalOperator()
	 * @generated
	 */
	int DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR = 12;

	/**
	 * The number of structural features of the '<em>Double Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Double Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_ExpressionOperatorImpl <em>Number Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_ExpressionOperator()
	 * @generated
	 */
	int NUMBER_EXPRESSION_OPERATOR = 13;

	/**
	 * The number of structural features of the '<em>Number Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_ExpressionOperatorImpl <em>Integer Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_ExpressionOperator()
	 * @generated
	 */
	int INTEGER_EXPRESSION_OPERATOR = 161;

	/**
	 * The number of structural features of the '<em>Integer Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_BitOperatorImpl <em>Integer Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_BitOperator()
	 * @generated
	 */
	int INTEGER_BIT_OPERATOR = 121;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BIT_OPERATOR__NEGATED = INTEGER_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BIT_OPERATOR__CONNECTS = INTEGER_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BIT_OPERATOR_FEATURE_COUNT = INTEGER_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BIT_OPERATOR_OPERATION_COUNT = INTEGER_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_Or_BitOperatorImpl <em>Integer Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_Or_BitOperator()
	 * @generated
	 */
	int INTEGER_OR_BIT_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OR_BIT_OPERATOR__NEGATED = INTEGER_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OR_BIT_OPERATOR__CONNECTS = INTEGER_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Integer Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OR_BIT_OPERATOR_FEATURE_COUNT = INTEGER_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OR_BIT_OPERATOR___GET_LITERAL = INTEGER_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OR_BIT_OPERATOR_OPERATION_COUNT = INTEGER_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_OperatorImpl <em>Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_Operator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 15;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_FunctionalOperatorImpl <em>Integer Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_FunctionalOperator()
	 * @generated
	 */
	int INTEGER_FUNCTIONAL_OPERATOR = 16;

	/**
	 * The number of structural features of the '<em>Integer Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.CalculateableImpl <em>Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getCalculateable()
	 * @generated
	 */
	int CALCULATEABLE = 33;

	/**
	 * The number of structural features of the '<em>Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_CalculateableImpl <em>Boolean Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_Calculateable()
	 * @generated
	 */
	int BOOLEAN_CALCULATEABLE = 17;

	/**
	 * The number of structural features of the '<em>Boolean Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.codePointBefore_FunctionalOperatorImpl <em>code Point Before Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.codePointBefore_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcodePointBefore_FunctionalOperator()
	 * @generated
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR__INDEX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>code Point Before Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>code Point Before Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.AttributeEClassImpl <em>Attribute EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.AttributeEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getAttributeEClass()
	 * @generated
	 */
	int ATTRIBUTE_ECLASS = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ECLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ECLASS__NEGATED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ECLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ECLASS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.RegularAttributeEClassImpl <em>Regular Attribute EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.RegularAttributeEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getRegularAttributeEClass()
	 * @generated
	 */
	int REGULAR_ATTRIBUTE_ECLASS = 154;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS__NAME = ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS__NEGATED = ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS__GENERALIZED = ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regular Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS_FEATURE_COUNT = ATTRIBUTE_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ATTRIBUTE_ECLASS_OPERATION_COUNT = ATTRIBUTE_ECLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.String_AttributeEClassImpl <em>String Attribute EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_AttributeEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getString_AttributeEClass()
	 * @generated
	 */
	int STRING_ATTRIBUTE_ECLASS = 178;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS__NAME = REGULAR_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS__NEGATED = REGULAR_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS__GENERALIZED = REGULAR_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS__OPERATOR = REGULAR_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS_FEATURE_COUNT = REGULAR_ATTRIBUTE_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = REGULAR_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = REGULAR_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_ECLASS_OPERATION_COUNT = REGULAR_ATTRIBUTE_ECLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Exam_examID_AttrEClassImpl <em>Exam exam ID Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Exam_examID_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getExam_examID_AttrEClass()
	 * @generated
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS__NAME = STRING_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS__NEGATED = STRING_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS__GENERALIZED = STRING_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS__OPERATOR = STRING_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Exam exam ID Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS_FEATURE_COUNT = STRING_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = STRING_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = STRING_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Exam exam ID Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_EXAM_ID_ATTR_ECLASS_OPERATION_COUNT = STRING_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.EvaluationOperatorImpl <em>Evaluation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.EvaluationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getEvaluationOperator()
	 * @generated
	 */
	int EVALUATION_OPERATOR = 166;

	/**
	 * The number of structural features of the '<em>Evaluation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evaluation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.EvaluationFunctionalOperatorImpl <em>Evaluation Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.EvaluationFunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getEvaluationFunctionalOperator()
	 * @generated
	 */
	int EVALUATION_FUNCTIONAL_OPERATOR = 93;

	/**
	 * The number of structural features of the '<em>Evaluation Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FUNCTIONAL_OPERATOR_FEATURE_COUNT = EVALUATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FUNCTIONAL_OPERATOR___GET_TYPE = EVALUATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = EVALUATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluation Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FUNCTIONAL_OPERATOR_OPERATION_COUNT = EVALUATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.AggregationOperatorImpl <em>Aggregation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.AggregationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getAggregationOperator()
	 * @generated
	 */
	int AGGREGATION_OPERATOR = 48;

	/**
	 * The number of structural features of the '<em>Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR_FEATURE_COUNT = EVALUATION_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR___GET_TYPE = EVALUATION_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR___GET_LAST_OPERATOR = EVALUATION_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR_OPERATION_COUNT = EVALUATION_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CalculatingAggregationOperatorImpl <em>Calculating Aggregation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CalculatingAggregationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCalculatingAggregationOperator()
	 * @generated
	 */
	int CALCULATING_AGGREGATION_OPERATOR = 34;

	/**
	 * The number of structural features of the '<em>Calculating Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATING_AGGREGATION_OPERATOR___GET_TYPE = AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR = AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Calculating Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT = AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Min_AggregationOperator_DoubleImpl <em>Min Aggregation Operator Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Min_AggregationOperator_DoubleImpl
	 * @see qmm.impl.QmmPackageImpl#getMin_AggregationOperator_Double()
	 * @generated
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE = 20;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE__OPERATOR = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Min Aggregation Operator Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE_FEATURE_COUNT = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE___GET_TYPE = CALCULATING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE___GET_LAST_OPERATOR = CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE___GET_LITERAL = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE___GET_ALL_PARAMETERS = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Aggregation Operator Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_DOUBLE_OPERATION_COUNT = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_Or_BitOperatorImpl <em>Boolean Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_Or_BitOperator()
	 * @generated
	 */
	int BOOLEAN_OR_BIT_OPERATOR = 21;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_BIT_OPERATOR__NEGATED = BOOLEAN_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_BIT_OPERATOR__CONNECTS = BOOLEAN_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Boolean Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_BIT_OPERATOR_FEATURE_COUNT = BOOLEAN_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_BIT_OPERATOR___GET_LITERAL = BOOLEAN_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_BIT_OPERATOR_OPERATION_COUNT = BOOLEAN_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_Original_FunctionalOperatorImpl <em>Integer Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_Original_FunctionalOperator()
	 * @generated
	 */
	int INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR = 23;

	/**
	 * The number of structural features of the '<em>Integer Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Integer Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_FunctionalOperatorImpl <em>Boolean Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_FunctionalOperator()
	 * @generated
	 */
	int BOOLEAN_FUNCTIONAL_OPERATOR = 56;

	/**
	 * The number of structural features of the '<em>Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_Object_to_Boolean_FunctionalOperatorImpl <em>Inherited From Object to Boolean Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_Object_to_Boolean_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_Object_to_Boolean_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR = 46;

	/**
	 * The number of structural features of the '<em>Inherited From Object to Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE = BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Object to Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Boolean_toString_FunctionalOperatorImpl <em>Object Boolean to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Boolean_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Boolean_toString_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR = 24;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Boolean to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Boolean to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_ExpressionOperatorImpl <em>Char Sequence Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_ExpressionOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_EXPRESSION_OPERATOR = 193;

	/**
	 * The number of structural features of the '<em>Char Sequence Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_BitOperatorImpl <em>Char Sequence Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_BitOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_BIT_OPERATOR = 223;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_BIT_OPERATOR__NEGATED = CHAR_SEQUENCE_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_BIT_OPERATOR__CONNECTS = CHAR_SEQUENCE_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Char Sequence Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_BIT_OPERATOR_FEATURE_COUNT = CHAR_SEQUENCE_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Char Sequence Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_BIT_OPERATOR_OPERATION_COUNT = CHAR_SEQUENCE_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_And_BitOperatorImpl <em>Char Sequence And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_And_BitOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_AND_BIT_OPERATOR = 27;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_AND_BIT_OPERATOR__NEGATED = CHAR_SEQUENCE_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_AND_BIT_OPERATOR__CONNECTS = CHAR_SEQUENCE_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Char Sequence And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_AND_BIT_OPERATOR_FEATURE_COUNT = CHAR_SEQUENCE_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_AND_BIT_OPERATOR___GET_LITERAL = CHAR_SEQUENCE_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_AND_BIT_OPERATOR_OPERATION_COUNT = CHAR_SEQUENCE_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_Number_to_Integer_FunctionalOperatorImpl <em>Inherited From Number to Integer Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_Number_to_Integer_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_Number_to_Integer_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR = 190;

	/**
	 * The number of structural features of the '<em>Inherited From Number to Integer Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE = INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Number to Integer Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_Object_Number_hashCode_FunctionalOperatorImpl <em>Number Integer Object Number hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_Object_Number_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_Object_Number_hashCode_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR = 28;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Integer Object Number hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer Object Number hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.compareToString_FunctionalOperatorImpl <em>compare To String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.compareToString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcompareToString_FunctionalOperator()
	 * @generated
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR = 29;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Another String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>compare To String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>compare To String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.contains_FunctionalOperatorImpl <em>contains Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.contains_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcontains_FunctionalOperator()
	 * @generated
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR = 30;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR__NEGATED = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Char Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>contains Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>contains Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_TypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_Type()
	 * @generated
	 */
	int BOOLEAN_TYPE = 162;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_FunctionalParameterImpl <em>Boolean Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_FunctionalParameter()
	 * @generated
	 */
	int BOOLEAN_FUNCTIONAL_PARAMETER = 31;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_PARAMETER__ARGUMENT = BOOLEAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_PARAMETER_FEATURE_COUNT = BOOLEAN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_PARAMETER___GET_TYPE = BOOLEAN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = BOOLEAN_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_PARAMETER_OPERATION_COUNT = BOOLEAN_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_EvaluationOperation_ArgumentImpl <em>Integer Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_EvaluationOperation_Argument()
	 * @generated
	 */
	int INTEGER_EVALUATION_OPERATION_ARGUMENT = 35;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Integer Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_ExpressionOperatorImpl <em>Double Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_ExpressionOperator()
	 * @generated
	 */
	int DOUBLE_EXPRESSION_OPERATOR = 229;

	/**
	 * The number of structural features of the '<em>Double Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_BitOperatorImpl <em>Double Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_BitOperator()
	 * @generated
	 */
	int DOUBLE_BIT_OPERATOR = 148;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BIT_OPERATOR__NEGATED = DOUBLE_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BIT_OPERATOR__CONNECTS = DOUBLE_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BIT_OPERATOR_FEATURE_COUNT = DOUBLE_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Double Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BIT_OPERATOR_OPERATION_COUNT = DOUBLE_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_And_BitOperatorImpl <em>Double And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_And_BitOperator()
	 * @generated
	 */
	int DOUBLE_AND_BIT_OPERATOR = 36;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_AND_BIT_OPERATOR__NEGATED = DOUBLE_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_AND_BIT_OPERATOR__CONNECTS = DOUBLE_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Double And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_AND_BIT_OPERATOR_FEATURE_COUNT = DOUBLE_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_AND_BIT_OPERATOR___GET_LITERAL = DOUBLE_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_AND_BIT_OPERATOR_OPERATION_COUNT = DOUBLE_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_FunctionalOperatorImpl <em>Number Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_FUNCTIONAL_OPERATOR = 144;

	/**
	 * The number of structural features of the '<em>Number Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Original_FunctionalOperatorImpl <em>Number Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Original_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR = 37;

	/**
	 * The number of structural features of the '<em>Number Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Number Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_Original_FunctionalOperatorImpl <em>Boolean Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_Original_FunctionalOperator()
	 * @generated
	 */
	int BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR = 39;

	/**
	 * The number of structural features of the '<em>Boolean Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Boolean Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_ExpressionOperatorImpl <em>Character Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_ExpressionOperator()
	 * @generated
	 */
	int CHARACTER_EXPRESSION_OPERATOR = 102;

	/**
	 * The number of structural features of the '<em>Character Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_BitOperatorImpl <em>Character Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_BitOperator()
	 * @generated
	 */
	int CHARACTER_BIT_OPERATOR = 86;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BIT_OPERATOR__NEGATED = CHARACTER_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BIT_OPERATOR__CONNECTS = CHARACTER_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BIT_OPERATOR_FEATURE_COUNT = CHARACTER_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Character Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_BIT_OPERATOR_OPERATION_COUNT = CHARACTER_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_Or_BitOperatorImpl <em>Character Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_Or_BitOperator()
	 * @generated
	 */
	int CHARACTER_OR_BIT_OPERATOR = 41;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OR_BIT_OPERATOR__NEGATED = CHARACTER_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OR_BIT_OPERATOR__CONNECTS = CHARACTER_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Character Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OR_BIT_OPERATOR_FEATURE_COUNT = CHARACTER_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OR_BIT_OPERATOR___GET_LITERAL = CHARACTER_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OR_BIT_OPERATOR_OPERATION_COUNT = CHARACTER_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_ExpressionOperatorImpl <em>Object Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_ExpressionOperator()
	 * @generated
	 */
	int OBJECT_EXPRESSION_OPERATOR = 246;

	/**
	 * The number of structural features of the '<em>Object Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_FunctionalOperatorImpl <em>Object Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_FUNCTIONAL_OPERATOR = 134;

	/**
	 * The number of structural features of the '<em>Object Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OBJECT_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_OPERATOR___GET_TYPE = OBJECT_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OBJECT_EXPRESSION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OBJECT_EXPRESSION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.equals_FunctionalOperatorImpl <em>equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getequals_FunctionalOperator()
	 * @generated
	 */
	int EQUALS_FUNCTIONAL_OPERATOR = 42;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR__NEGATED = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR__OBJ = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = OBJECT_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OBJECT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_Object_to_Number_FunctionalOperatorImpl <em>Inherited From Object to Number Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_Object_to_Number_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_Object_to_Number_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR = 91;

	/**
	 * The number of structural features of the '<em>Inherited From Object to Number Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT = NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE = NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Object to Number Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT = NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Number_equals_FunctionalOperatorImpl <em>Object Number equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Number_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Number_equals_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR = 43;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Number equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Number equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_CalculateableImpl <em>Double Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_Calculateable()
	 * @generated
	 */
	int DOUBLE_CALCULATEABLE = 268;

	/**
	 * The number of structural features of the '<em>Double Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_CalculateableElementImpl <em>Double Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_CalculateableElement()
	 * @generated
	 */
	int DOUBLE_CALCULATEABLE_ELEMENT = 44;

	/**
	 * The number of structural features of the '<em>Double Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_ELEMENT_FEATURE_COUNT = DOUBLE_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CALCULATEABLE_ELEMENT_OPERATION_COUNT = DOUBLE_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_Number_to_Double_FunctionalOperatorImpl <em>Inherited From Number to Double Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_Number_to_Double_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_Number_to_Double_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR = 165;

	/**
	 * The number of structural features of the '<em>Inherited From Number to Double Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE = DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Number to Double Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_Object_Number_hashCode_FunctionalOperatorImpl <em>Number Double Object Number hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_Object_Number_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_Object_Number_hashCode_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR = 45;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Double Object Number hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double Object Number hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_CharSequence_to_String_FunctionalOperatorImpl <em>Inherited From Char Sequence to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_CharSequence_to_String_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_CharSequence_to_String_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR = 278;

	/**
	 * The number of structural features of the '<em>Inherited From Char Sequence to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Char Sequence to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl <em>Char Sequence String Object Char Sequence to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_String_Object_CharSequence_toString_FunctionalOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR = 47;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.FunctionalArgumentImpl <em>Functional Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.FunctionalArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getFunctionalArgument()
	 * @generated
	 */
	int FUNCTIONAL_ARGUMENT = 253;

	/**
	 * The number of structural features of the '<em>Functional Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ARGUMENT___GET_TYPE = ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Functional Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_ArgumentImpl <em>Integer Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_Argument()
	 * @generated
	 */
	int INTEGER_ARGUMENT = 275;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Integer Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_PrimitiveArgumentImpl <em>Integer Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_PrimitiveArgument()
	 * @generated
	 */
	int INTEGER_PRIMITIVE_ARGUMENT = 49;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PRIMITIVE_ARGUMENT__OPERATOR = INTEGER_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PRIMITIVE_ARGUMENT__VALUE = INTEGER_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PRIMITIVE_ARGUMENT_FEATURE_COUNT = INTEGER_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PRIMITIVE_ARGUMENT___GET_TYPE = INTEGER_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Integer Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PRIMITIVE_ARGUMENT_OPERATION_COUNT = INTEGER_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_TypeImpl <em>Char Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_Type()
	 * @generated
	 */
	int CHAR_SEQUENCE_TYPE = 111;

	/**
	 * The number of structural features of the '<em>Char Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_FunctionalParameterImpl <em>Char Sequence Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_FunctionalParameter()
	 * @generated
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER = 50;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER__ARGUMENT = CHAR_SEQUENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER_FEATURE_COUNT = CHAR_SEQUENCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER___GET_TYPE = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER_OPERATION_COUNT = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_smallerThan_FunctionalOperatorImpl <em>Number Integer smaller Than Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_smallerThan_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_smallerThan_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR = 51;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Integer smaller Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer smaller Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_FunctionalOperatorImpl <em>Character Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_FunctionalOperator()
	 * @generated
	 */
	int CHARACTER_FUNCTIONAL_OPERATOR = 152;

	/**
	 * The number of structural features of the '<em>Character Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_Object_to_Character_FunctionalOperatorImpl <em>Inherited From Object to Character Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_Object_to_Character_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_Object_to_Character_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR = 129;

	/**
	 * The number of structural features of the '<em>Inherited From Object to Character Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT = CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE = CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Object to Character Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT = CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Character_toString_FunctionalOperatorImpl <em>Object Character to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Character_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Character_toString_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR = 52;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Character to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Character to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.OrGroupImpl <em>Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getOrGroup()
	 * @generated
	 */
	int OR_GROUP = 108;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP__GENERALIZED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP__NEGATED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP__TRANSITIVE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Containment_OrGroupImpl <em>Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getContainment_OrGroup()
	 * @generated
	 */
	int CONTAINMENT_OR_GROUP = 210;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP__NAME = OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP__GENERALIZED = OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP__NEGATED = OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP__TRANSITIVE = OR_GROUP__TRANSITIVE;

	/**
	 * The number of structural features of the '<em>Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP_FEATURE_COUNT = OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OR_GROUP_OPERATION_COUNT = OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Person_Containment_OrGroupImpl <em>Person Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Person_Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getPerson_Containment_OrGroup()
	 * @generated
	 */
	int PERSON_CONTAINMENT_OR_GROUP = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP__NAME = CONTAINMENT_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP__GENERALIZED = CONTAINMENT_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP__NEGATED = CONTAINMENT_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP__TRANSITIVE = CONTAINMENT_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP__CONTAINMENT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP_FEATURE_COUNT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTAINMENT_OR_GROUP_OPERATION_COUNT = CONTAINMENT_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.smallerEquals_FunctionalOperatorImpl <em>smaller Equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.smallerEquals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getsmallerEquals_FunctionalOperator()
	 * @generated
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR = 54;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR__I = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>smaller Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>smaller Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.PrimitiveArgumentImpl <em>Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getPrimitiveArgument()
	 * @generated
	 */
	int PRIMITIVE_ARGUMENT = 55;

	/**
	 * The number of structural features of the '<em>Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_Or_BitOperatorImpl <em>Double Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_Or_BitOperator()
	 * @generated
	 */
	int DOUBLE_OR_BIT_OPERATOR = 57;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OR_BIT_OPERATOR__NEGATED = DOUBLE_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OR_BIT_OPERATOR__CONNECTS = DOUBLE_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Double Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OR_BIT_OPERATOR_FEATURE_COUNT = DOUBLE_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OR_BIT_OPERATOR___GET_LITERAL = DOUBLE_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OR_BIT_OPERATOR_OPERATION_COUNT = DOUBLE_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_FunctionalOperatorImpl <em>Char Sequence Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_FunctionalOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_OPERATOR = 159;

	/**
	 * The number of structural features of the '<em>Char Sequence Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.InheritedFrom_Object_to_CharSequence_FunctionalOperatorImpl <em>Inherited From Object to Char Sequence Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.InheritedFrom_Object_to_CharSequence_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInheritedFrom_Object_to_CharSequence_FunctionalOperator()
	 * @generated
	 */
	int INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR = 240;

	/**
	 * The number of structural features of the '<em>Inherited From Object to Char Sequence Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Inherited From Object to Char Sequence Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_CharSequence_hashCode_FunctionalOperatorImpl <em>Object Char Sequence hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_CharSequence_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_CharSequence_hashCode_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR = 58;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Char Sequence hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Char Sequence hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_ArgumentImpl <em>Object Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Argument()
	 * @generated
	 */
	int OBJECT_ARGUMENT = 67;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Object Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_PrimitiveArgumentImpl <em>Object Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_PrimitiveArgument()
	 * @generated
	 */
	int OBJECT_PRIMITIVE_ARGUMENT = 59;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PRIMITIVE_ARGUMENT__OPERATOR = OBJECT_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PRIMITIVE_ARGUMENT__VALUE = OBJECT_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PRIMITIVE_ARGUMENT_FEATURE_COUNT = OBJECT_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PRIMITIVE_ARGUMENT___GET_TYPE = OBJECT_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Object Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PRIMITIVE_ARGUMENT_OPERATION_COUNT = OBJECT_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.EvaluationBitOperatorImpl <em>Evaluation Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.EvaluationBitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getEvaluationBitOperator()
	 * @generated
	 */
	int EVALUATION_BIT_OPERATOR = 63;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_BIT_OPERATOR__NEGATED = EVALUATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_BIT_OPERATOR__CONNECTS = EVALUATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluation Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_BIT_OPERATOR_FEATURE_COUNT = EVALUATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evaluation Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_BIT_OPERATOR_OPERATION_COUNT = EVALUATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_FunctionalTypeImpl <em>String Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getString_FunctionalType()
	 * @generated
	 */
	int STRING_FUNCTIONAL_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_TYPE__OPERATOR = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_TYPE_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_TYPE_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_CalculateableImpl <em>Object Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Calculateable()
	 * @generated
	 */
	int OBJECT_CALCULATEABLE = 65;

	/**
	 * The number of structural features of the '<em>Object Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_OperatorImpl <em>String Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_Operator()
	 * @generated
	 */
	int STRING_OPERATOR = 66;

	/**
	 * The number of structural features of the '<em>String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.compareToBoolean_FunctionalOperatorImpl <em>compare To Boolean Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.compareToBoolean_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcompareToBoolean_FunctionalOperator()
	 * @generated
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR = 69;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR__OPERATOR = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR__B = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>compare To Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LITERAL = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>compare To Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 221;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_TYPE = TYPED_ELEMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CountableReferenceParameterImpl <em>Countable Reference Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CountableReferenceParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getCountableReferenceParameter()
	 * @generated
	 */
	int COUNTABLE_REFERENCE_PARAMETER = 70;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_PARAMETER__ARGUMENT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Countable Reference Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_PARAMETER___GET_TYPE = PARAMETER___GET_TYPE;

	/**
	 * The number of operations of the '<em>Countable Reference Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_TypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_Type()
	 * @generated
	 */
	int INTEGER_TYPE = 96;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_FunctionalParameterImpl <em>Integer Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_FunctionalParameter()
	 * @generated
	 */
	int INTEGER_FUNCTIONAL_PARAMETER = 71;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_PARAMETER__ARGUMENT = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_PARAMETER_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_PARAMETER___GET_TYPE = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = INTEGER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_PARAMETER_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_FunctionalParameterImpl <em>String Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getString_FunctionalParameter()
	 * @generated
	 */
	int STRING_FUNCTIONAL_PARAMETER = 72;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_PARAMETER__ARGUMENT = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_PARAMETER_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_PARAMETER___GET_TYPE = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = STRING_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FUNCTIONAL_PARAMETER_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_TypeImpl <em>Character Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_Type()
	 * @generated
	 */
	int CHARACTER_TYPE = 114;

	/**
	 * The number of structural features of the '<em>Character Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_FunctionalParameterImpl <em>Character Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_FunctionalParameter()
	 * @generated
	 */
	int CHARACTER_FUNCTIONAL_PARAMETER = 73;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_PARAMETER__ARGUMENT = CHARACTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_PARAMETER_FEATURE_COUNT = CHARACTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_PARAMETER___GET_TYPE = CHARACTER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = CHARACTER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_PARAMETER_OPERATION_COUNT = CHARACTER_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_TypeImpl <em>Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Type()
	 * @generated
	 */
	int NUMBER_TYPE = 119;

	/**
	 * The number of structural features of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_CalculateableParameterImpl <em>Number Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_CalculateableParameter()
	 * @generated
	 */
	int NUMBER_CALCULATEABLE_PARAMETER = 74;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_PARAMETER__ARGUMENT = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_PARAMETER_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_PARAMETER___GET_TYPE = NUMBER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = NUMBER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_PARAMETER_OPERATION_COUNT = NUMBER_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_Object_Number_equals_FunctionalOperatorImpl <em>Number Double Object Number equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_Object_Number_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_Object_Number_equals_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR = 75;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Double Object Number equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double Object Number equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Person_name_AttrEClassImpl <em>Person name Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Person_name_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getPerson_name_AttrEClass()
	 * @generated
	 */
	int PERSON_NAME_ATTR_ECLASS = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS__NAME = STRING_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS__NEGATED = STRING_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS__GENERALIZED = STRING_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS__OPERATOR = STRING_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Person name Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS_FEATURE_COUNT = STRING_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = STRING_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = STRING_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person name Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_ATTR_ECLASS_OPERATION_COUNT = STRING_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_Original_FunctionalOperatorImpl <em>Char Sequence Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_Original_FunctionalOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR = 171;

	/**
	 * The number of structural features of the '<em>Char Sequence Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Char Sequence Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.length_FunctionalOperatorImpl <em>length Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.length_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getlength_FunctionalOperator()
	 * @generated
	 */
	int LENGTH_FUNCTIONAL_OPERATOR = 77;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR__OPERATOR = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>length Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR_FEATURE_COUNT = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR___GET_TYPE = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR___GET_LITERAL = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>length Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FUNCTIONAL_OPERATOR_OPERATION_COUNT = CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.concat_FunctionalOperatorImpl <em>concat Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.concat_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getconcat_FunctionalOperator()
	 * @generated
	 */
	int CONCAT_FUNCTIONAL_OPERATOR = 78;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR__STR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>concat Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>concat Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.EnumerationAttributeEClassImpl <em>Enumeration Attribute EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.EnumerationAttributeEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getEnumerationAttributeEClass()
	 * @generated
	 */
	int ENUMERATION_ATTRIBUTE_ECLASS = 269;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_ECLASS__NAME = ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_ECLASS__NEGATED = ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The number of structural features of the '<em>Enumeration Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_ECLASS_FEATURE_COUNT = ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Enumeration Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_ECLASS_OPERATION_COUNT = ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CourseType_AttributeEClassImpl <em>Course Type Attribute EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CourseType_AttributeEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getCourseType_AttributeEClass()
	 * @generated
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS__NAME = ENUMERATION_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS__NEGATED = ENUMERATION_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR = ENUMERATION_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Course Type Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS_FEATURE_COUNT = ENUMERATION_ATTRIBUTE_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = ENUMERATION_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Course Type Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ATTRIBUTE_ECLASS_OPERATION_COUNT = ENUMERATION_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_ArgumentImpl <em>Double Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_Argument()
	 * @generated
	 */
	int DOUBLE_ARGUMENT = 80;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Double Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_ArgumentImpl <em>Boolean Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_Argument()
	 * @generated
	 */
	int BOOLEAN_ARGUMENT = 81;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ARGUMENT__NEGATED = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Boolean Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_FunctionalParameterImpl <em>Number Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_FunctionalParameter()
	 * @generated
	 */
	int NUMBER_FUNCTIONAL_PARAMETER = 82;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_PARAMETER__ARGUMENT = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_PARAMETER_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_PARAMETER___GET_TYPE = NUMBER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = NUMBER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_PARAMETER_OPERATION_COUNT = NUMBER_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Reference_OrGroupImpl <em>Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getReference_OrGroup()
	 * @generated
	 */
	int REFERENCE_OR_GROUP = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP__NAME = OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP__GENERALIZED = OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP__NEGATED = OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP__TRANSITIVE = OR_GROUP__TRANSITIVE;

	/**
	 * The number of structural features of the '<em>Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP_FEATURE_COUNT = OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OR_GROUP_OPERATION_COUNT = OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_OperatorImpl <em>Integer Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_Operator()
	 * @generated
	 */
	int INTEGER_OPERATOR = 84;

	/**
	 * The number of structural features of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperatorImpl <em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR = 85;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.indexOfChar_FunctionalOperatorImpl <em>index Of Char Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.indexOfChar_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getindexOfChar_FunctionalOperator()
	 * @generated
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR = 87;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR__CH = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>index Of Char Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>index Of Char Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.equalsIgnoreCase_FunctionalOperatorImpl <em>equals Ignore Case Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.equalsIgnoreCase_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getequalsIgnoreCase_FunctionalOperator()
	 * @generated
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR = 88;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR__NEGATED = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Another String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR__ANOTHER_STRING = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>equals Ignore Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>equals Ignore Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_And_BitOperatorImpl <em>Boolean And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_And_BitOperator()
	 * @generated
	 */
	int BOOLEAN_AND_BIT_OPERATOR = 90;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_BIT_OPERATOR__NEGATED = BOOLEAN_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_BIT_OPERATOR__CONNECTS = BOOLEAN_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Boolean And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_BIT_OPERATOR_FEATURE_COUNT = BOOLEAN_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_BIT_OPERATOR___GET_LITERAL = BOOLEAN_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_BIT_OPERATOR_OPERATION_COUNT = BOOLEAN_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_ArgumentImpl <em>Char Sequence Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_Argument()
	 * @generated
	 */
	int CHAR_SEQUENCE_ARGUMENT = 254;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Char Sequence Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_PrimitiveArgumentImpl <em>Char Sequence Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_PrimitiveArgument()
	 * @generated
	 */
	int CHAR_SEQUENCE_PRIMITIVE_ARGUMENT = 92;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_PRIMITIVE_ARGUMENT__OPERATOR = CHAR_SEQUENCE_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_PRIMITIVE_ARGUMENT__VALUE = CHAR_SEQUENCE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_PRIMITIVE_ARGUMENT_FEATURE_COUNT = CHAR_SEQUENCE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_PRIMITIVE_ARGUMENT___GET_TYPE = CHAR_SEQUENCE_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Char Sequence Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_PRIMITIVE_ARGUMENT_OPERATION_COUNT = CHAR_SEQUENCE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_Object_Number_toString_FunctionalOperatorImpl <em>Number Integer Object Number to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_Object_Number_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_Object_Number_toString_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR = 94;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Integer Object Number to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer Object Number to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.isEmpty_FunctionalOperatorImpl <em>is Empty Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.isEmpty_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getisEmpty_FunctionalOperator()
	 * @generated
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR = 95;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR__NEGATED = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>is Empty Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>is Empty Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EMPTY_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.toString_FunctionalOperatorImpl <em>to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#gettoString_FunctionalOperator()
	 * @generated
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR = 97;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = OBJECT_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OBJECT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Number_hashCode_FunctionalOperatorImpl <em>Object Number hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Number_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Number_hashCode_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR = 98;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Number hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Number hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_TypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_TypeImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Type()
	 * @generated
	 */
	int OBJECT_TYPE = 99;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_EvaluationOperation_ArgumentImpl <em>Char Sequence Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_EvaluationOperation_Argument()
	 * @generated
	 */
	int CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT = 100;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Char Sequence Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Student_Containment_OrGroupImpl <em>Student Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Student_Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getStudent_Containment_OrGroup()
	 * @generated
	 */
	int STUDENT_CONTAINMENT_OR_GROUP = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP__NAME = CONTAINMENT_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP__GENERALIZED = CONTAINMENT_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP__NEGATED = CONTAINMENT_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP__TRANSITIVE = CONTAINMENT_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP__CONTAINMENT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Student Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP_FEATURE_COUNT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Student Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_CONTAINMENT_OR_GROUP_OPERATION_COUNT = CONTAINMENT_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.hashCode_FunctionalOperatorImpl <em>hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#gethashCode_FunctionalOperator()
	 * @generated
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR = 103;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = OBJECT_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = OBJECT_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = OBJECT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = OBJECT_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.ClassOperatorImpl <em>Class Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.ClassOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getClassOperator()
	 * @generated
	 */
	int CLASS_OPERATOR = 176;

	/**
	 * The number of structural features of the '<em>Class Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATOR_FEATURE_COUNT = EVALUATION_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATOR___GET_TYPE = EVALUATION_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATOR___GET_LAST_OPERATOR = EVALUATION_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Class Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATOR_OPERATION_COUNT = EVALUATION_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.IntegerParseInt_ClassOperatorImpl <em>Integer Parse Int Class Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.IntegerParseInt_ClassOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getIntegerParseInt_ClassOperator()
	 * @generated
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR = 104;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR__OPERATOR = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR__CALCULATEABLE = CLASS_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Parse Int Class Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR___GET_TYPE = CLASS_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR___GET_LAST_OPERATOR = CLASS_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR___GET_LITERAL = CLASS_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR___GET_ALL_PARAMETERS = CLASS_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Parse Int Class Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARSE_INT_CLASS_OPERATOR_OPERATION_COUNT = CLASS_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.CourseType_CalculateableImpl <em>Course Type Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CourseType_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getCourseType_Calculateable()
	 * @generated
	 */
	int COURSE_TYPE_CALCULATEABLE = 217;

	/**
	 * The number of structural features of the '<em>Course Type Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course Type Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CourseType_CalculateableElementImpl <em>Course Type Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CourseType_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getCourseType_CalculateableElement()
	 * @generated
	 */
	int COURSE_TYPE_CALCULATEABLE_ELEMENT = 105;

	/**
	 * The number of structural features of the '<em>Course Type Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_CALCULATEABLE_ELEMENT_FEATURE_COUNT = COURSE_TYPE_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course Type Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_CALCULATEABLE_ELEMENT_OPERATION_COUNT = COURSE_TYPE_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CountingAggregationOperatorImpl <em>Counting Aggregation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CountingAggregationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCountingAggregationOperator()
	 * @generated
	 */
	int COUNTING_AGGREGATION_OPERATOR = 106;

	/**
	 * The feature id for the '<em><b>Countable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_AGGREGATION_OPERATOR__COUNTABLE = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Counting Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_AGGREGATION_OPERATOR_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_AGGREGATION_OPERATOR___GET_TYPE = AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR = AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_AGGREGATION_OPERATOR___GET_ALL_PARAMETERS = AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Counting Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_AGGREGATION_OPERATOR_OPERATION_COUNT = AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Exam_Reference_OrGroupImpl <em>Exam Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Exam_Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getExam_Reference_OrGroup()
	 * @generated
	 */
	int EXAM_REFERENCE_OR_GROUP = 107;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP__NAME = REFERENCE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP__GENERALIZED = REFERENCE_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP__NEGATED = REFERENCE_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP__TRANSITIVE = REFERENCE_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP__REFERENCE = REFERENCE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exam Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP_FEATURE_COUNT = REFERENCE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exam Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_REFERENCE_OR_GROUP_OPERATION_COUNT = REFERENCE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Professor_Reference_OrGroupImpl <em>Professor Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Professor_Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getProfessor_Reference_OrGroup()
	 * @generated
	 */
	int PROFESSOR_REFERENCE_OR_GROUP = 109;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP__NAME = REFERENCE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP__GENERALIZED = REFERENCE_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP__NEGATED = REFERENCE_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP__TRANSITIVE = REFERENCE_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP__REFERENCE = REFERENCE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professor Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP_FEATURE_COUNT = REFERENCE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professor Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_REFERENCE_OR_GROUP_OPERATION_COUNT = REFERENCE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.smallerThan_FunctionalOperatorImpl <em>smaller Than Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.smallerThan_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getsmallerThan_FunctionalOperator()
	 * @generated
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR = 110;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR__NEGATED = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR__OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR__I = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>smaller Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_TYPE = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_LITERAL = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>smaller Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALLER_THAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_ExpressionOperatorImpl <em>String Expression Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_ExpressionOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_ExpressionOperator()
	 * @generated
	 */
	int STRING_EXPRESSION_OPERATOR = 112;

	/**
	 * The number of structural features of the '<em>String Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Expression Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Or_EvaluationBitOperatorImpl <em>Or Evaluation Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Or_EvaluationBitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getOr_EvaluationBitOperator()
	 * @generated
	 */
	int OR_EVALUATION_BIT_OPERATOR = 113;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EVALUATION_BIT_OPERATOR__NEGATED = EVALUATION_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EVALUATION_BIT_OPERATOR__CONNECTS = EVALUATION_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Or Evaluation Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EVALUATION_BIT_OPERATOR_FEATURE_COUNT = EVALUATION_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EVALUATION_BIT_OPERATOR___GET_LITERAL = EVALUATION_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Evaluation Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EVALUATION_BIT_OPERATOR_OPERATION_COUNT = EVALUATION_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_CalculateableParameterImpl <em>Char Sequence Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_CalculateableParameter()
	 * @generated
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER = 115;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER__ARGUMENT = CHAR_SEQUENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER_FEATURE_COUNT = CHAR_SEQUENCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER___GET_TYPE = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER_OPERATION_COUNT = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_And_BitOperatorImpl <em>Character And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_And_BitOperator()
	 * @generated
	 */
	int CHARACTER_AND_BIT_OPERATOR = 116;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_AND_BIT_OPERATOR__NEGATED = CHARACTER_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_AND_BIT_OPERATOR__CONNECTS = CHARACTER_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Character And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_AND_BIT_OPERATOR_FEATURE_COUNT = CHARACTER_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_AND_BIT_OPERATOR___GET_LITERAL = CHARACTER_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_AND_BIT_OPERATOR_OPERATION_COUNT = CHARACTER_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.String_CalculateableImpl <em>String Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getString_Calculateable()
	 * @generated
	 */
	int STRING_CALCULATEABLE = 117;

	/**
	 * The number of structural features of the '<em>String Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_OperatorImpl <em>Character Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_Operator()
	 * @generated
	 */
	int CHARACTER_OPERATOR = 118;

	/**
	 * The number of structural features of the '<em>Character Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.codePointAt_FunctionalOperatorImpl <em>code Point At Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.codePointAt_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcodePointAt_FunctionalOperator()
	 * @generated
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR = 120;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR__INDEX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>code Point At Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>code Point At Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_POINT_AT_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Number_toString_FunctionalOperatorImpl <em>Object Number to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Number_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Number_toString_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR = 122;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Number to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Number to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_BitOperatorImpl <em>String Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_BitOperator()
	 * @generated
	 */
	int STRING_BIT_OPERATOR = 155;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BIT_OPERATOR__NEGATED = STRING_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BIT_OPERATOR__CONNECTS = STRING_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BIT_OPERATOR_FEATURE_COUNT = STRING_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BIT_OPERATOR_OPERATION_COUNT = STRING_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_Or_BitOperatorImpl <em>String Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_Or_BitOperator()
	 * @generated
	 */
	int STRING_OR_BIT_OPERATOR = 123;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OR_BIT_OPERATOR__NEGATED = STRING_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OR_BIT_OPERATOR__CONNECTS = STRING_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>String Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OR_BIT_OPERATOR_FEATURE_COUNT = STRING_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OR_BIT_OPERATOR___GET_LITERAL = STRING_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OR_BIT_OPERATOR_OPERATION_COUNT = STRING_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_BitOperatorImpl <em>Number Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_BitOperator()
	 * @generated
	 */
	int NUMBER_BIT_OPERATOR = 124;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_BIT_OPERATOR__NEGATED = NUMBER_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_BIT_OPERATOR__CONNECTS = NUMBER_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_BIT_OPERATOR_FEATURE_COUNT = NUMBER_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_BIT_OPERATOR_OPERATION_COUNT = NUMBER_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.SelectClauseImpl <em>Select Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.SelectClauseImpl
	 * @see qmm.impl.QmmPackageImpl#getSelectClause()
	 * @generated
	 */
	int SELECT_CLAUSE = 125;

	/**
	 * The feature id for the '<em><b>Named Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE__NAMED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE___VALIDATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_ArgumentImpl <em>Number Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Argument()
	 * @generated
	 */
	int NUMBER_ARGUMENT = 133;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Number Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_PrimitiveArgumentImpl <em>Number Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_PrimitiveArgument()
	 * @generated
	 */
	int NUMBER_PRIMITIVE_ARGUMENT = 126;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PRIMITIVE_ARGUMENT__OPERATOR = NUMBER_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PRIMITIVE_ARGUMENT__VALUE = NUMBER_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PRIMITIVE_ARGUMENT_FEATURE_COUNT = NUMBER_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PRIMITIVE_ARGUMENT___GET_TYPE = NUMBER_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Number Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PRIMITIVE_ARGUMENT_OPERATION_COUNT = NUMBER_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Max_AggregationOperator_DoubleImpl <em>Max Aggregation Operator Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Max_AggregationOperator_DoubleImpl
	 * @see qmm.impl.QmmPackageImpl#getMax_AggregationOperator_Double()
	 * @generated
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE = 127;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Max Aggregation Operator Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE_FEATURE_COUNT = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE___GET_TYPE = CALCULATING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE___GET_LAST_OPERATOR = CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE___GET_LITERAL = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE___GET_ALL_PARAMETERS = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Aggregation Operator Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_DOUBLE_OPERATION_COUNT = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.And_EvaluationBitOperatorImpl <em>And Evaluation Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.And_EvaluationBitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getAnd_EvaluationBitOperator()
	 * @generated
	 */
	int AND_EVALUATION_BIT_OPERATOR = 128;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EVALUATION_BIT_OPERATOR__NEGATED = EVALUATION_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EVALUATION_BIT_OPERATOR__CONNECTS = EVALUATION_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>And Evaluation Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EVALUATION_BIT_OPERATOR_FEATURE_COUNT = EVALUATION_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EVALUATION_BIT_OPERATOR___GET_LITERAL = EVALUATION_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Evaluation Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EVALUATION_BIT_OPERATOR_OPERATION_COUNT = EVALUATION_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_CalculateableImpl <em>Number Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Calculateable()
	 * @generated
	 */
	int NUMBER_CALCULATEABLE = 130;

	/**
	 * The number of structural features of the '<em>Number Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CalculateableElement_ReferenceArgumentImpl <em>Calculateable Element Reference Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CalculateableElement_ReferenceArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCalculateableElement_ReferenceArgument()
	 * @generated
	 */
	int CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT = 141;

	/**
	 * The number of structural features of the '<em>Calculateable Element Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT = CALCULATEABLE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___GET_TYPE = CALCULATEABLE_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Calculateable Element Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT = CALCULATEABLE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_CalculateableElementReferenceArgumentImpl <em>String Calculateable Element Reference Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_CalculateableElementReferenceArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getString_CalculateableElementReferenceArgument()
	 * @generated
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT = 131;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Calculateable Element Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___GET_TYPE = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Calculateable Element Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.offsetByCodePoints_FunctionalOperatorImpl <em>offset By Code Points Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.offsetByCodePoints_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getoffsetByCodePoints_FunctionalOperator()
	 * @generated
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR = 132;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR__INDEX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code Point Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR__CODE_POINT_OFFSET = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>offset By Code Points Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>offset By Code Points Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_ArgumentImpl <em>String Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getString_Argument()
	 * @generated
	 */
	int STRING_ARGUMENT = 135;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>String Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.indexOfCharFromIndex_FunctionalOperatorImpl <em>index Of Char From Index Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.indexOfCharFromIndex_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getindexOfCharFromIndex_FunctionalOperator()
	 * @generated
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR = 136;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>index Of Char From Index Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>index Of Char From Index Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_EvaluationOperation_ArgumentImpl <em>Double Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_EvaluationOperation_Argument()
	 * @generated
	 */
	int DOUBLE_EVALUATION_OPERATION_ARGUMENT = 137;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Double Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_And_BitOperatorImpl <em>Number And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_And_BitOperator()
	 * @generated
	 */
	int NUMBER_AND_BIT_OPERATOR = 138;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_AND_BIT_OPERATOR__NEGATED = NUMBER_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_AND_BIT_OPERATOR__CONNECTS = NUMBER_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Number And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_AND_BIT_OPERATOR_FEATURE_COUNT = NUMBER_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_AND_BIT_OPERATOR___GET_LITERAL = NUMBER_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_AND_BIT_OPERATOR_OPERATION_COUNT = NUMBER_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CountableImpl <em>Countable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CountableImpl
	 * @see qmm.impl.QmmPackageImpl#getCountable()
	 * @generated
	 */
	int COUNTABLE = 139;

	/**
	 * The number of structural features of the '<em>Countable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Countable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_FunctionalTypeImpl <em>Boolean Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_FunctionalType()
	 * @generated
	 */
	int BOOLEAN_FUNCTIONAL_TYPE = 140;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_TYPE__NEGATED = BOOLEAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_TYPE__OPERATOR = BOOLEAN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_TYPE_FEATURE_COUNT = BOOLEAN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FUNCTIONAL_TYPE_OPERATION_COUNT = BOOLEAN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.endsWith_FunctionalOperatorImpl <em>ends With Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.endsWith_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getendsWith_FunctionalOperator()
	 * @generated
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR = 142;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR__NEGATED = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR__SUFFIX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ends With Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>ends With Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.startsWithOffset_FunctionalOperatorImpl <em>starts With Offset Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.startsWithOffset_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getstartsWithOffset_FunctionalOperator()
	 * @generated
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR = 143;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Toffset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>starts With Offset Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>starts With Offset Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.FindQueryCollectionImpl <em>Find Query Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.FindQueryCollectionImpl
	 * @see qmm.impl.QmmPackageImpl#getFindQueryCollection()
	 * @generated
	 */
	int FIND_QUERY_COLLECTION = 145;

	/**
	 * The feature id for the '<em><b>Find Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY_COLLECTION__FIND_QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Find Query Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Find Query Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Professor_Containment_OrGroupImpl <em>Professor Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Professor_Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getProfessor_Containment_OrGroup()
	 * @generated
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP = 146;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP__NAME = CONTAINMENT_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP__GENERALIZED = CONTAINMENT_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP__NEGATED = CONTAINMENT_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP__TRANSITIVE = CONTAINMENT_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP__CONTAINMENT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professor Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP_FEATURE_COUNT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Professor Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_CONTAINMENT_OR_GROUP_OPERATION_COUNT = CONTAINMENT_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_CalculateableElementImpl <em>Number Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_CalculateableElement()
	 * @generated
	 */
	int NUMBER_CALCULATEABLE_ELEMENT = 147;

	/**
	 * The number of structural features of the '<em>Number Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_ELEMENT_FEATURE_COUNT = NUMBER_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CALCULATEABLE_ELEMENT_OPERATION_COUNT = NUMBER_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Course_courseType_AttrEClassImpl <em>Course course Type Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Course_courseType_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getCourse_courseType_AttrEClass()
	 * @generated
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS = 149;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS__NAME = COURSE_TYPE_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS__NEGATED = COURSE_TYPE_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS__OPERATOR = COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Course course Type Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS_FEATURE_COUNT = COURSE_TYPE_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = COURSE_TYPE_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Course course Type Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_TYPE_ATTR_ECLASS_OPERATION_COUNT = COURSE_TYPE_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_CalculateableImpl <em>Character Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_Calculateable()
	 * @generated
	 */
	int CHARACTER_CALCULATEABLE = 276;

	/**
	 * The number of structural features of the '<em>Character Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_CalculateableElementImpl <em>Character Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_CalculateableElement()
	 * @generated
	 */
	int CHARACTER_CALCULATEABLE_ELEMENT = 150;

	/**
	 * The number of structural features of the '<em>Character Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_ELEMENT_FEATURE_COUNT = CHARACTER_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_ELEMENT_OPERATION_COUNT = CHARACTER_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_CalculateableParameterImpl <em>Boolean Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_CalculateableParameter()
	 * @generated
	 */
	int BOOLEAN_CALCULATEABLE_PARAMETER = 151;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_PARAMETER__ARGUMENT = BOOLEAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_PARAMETER_FEATURE_COUNT = BOOLEAN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_PARAMETER___GET_TYPE = BOOLEAN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = BOOLEAN_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_PARAMETER_OPERATION_COUNT = BOOLEAN_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_CalculateableParameterImpl <em>Character Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_CalculateableParameter()
	 * @generated
	 */
	int CHARACTER_CALCULATEABLE_PARAMETER = 153;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_PARAMETER__ARGUMENT = CHARACTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_PARAMETER_FEATURE_COUNT = CHARACTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_PARAMETER___GET_TYPE = CHARACTER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = CHARACTER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_CALCULATEABLE_PARAMETER_OPERATION_COUNT = CHARACTER_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_ArgumentImpl <em>Character Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_Argument()
	 * @generated
	 */
	int CHARACTER_ARGUMENT = 156;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ARGUMENT__OPERATOR = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ARGUMENT_FEATURE_COUNT = FUNCTIONAL_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ARGUMENT___GET_TYPE = FUNCTIONAL_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Character Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ARGUMENT_OPERATION_COUNT = FUNCTIONAL_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Person_Reference_OrGroupImpl <em>Person Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Person_Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getPerson_Reference_OrGroup()
	 * @generated
	 */
	int PERSON_REFERENCE_OR_GROUP = 157;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP__NAME = REFERENCE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP__GENERALIZED = REFERENCE_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP__NEGATED = REFERENCE_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP__TRANSITIVE = REFERENCE_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP__REFERENCE = REFERENCE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP_FEATURE_COUNT = REFERENCE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_REFERENCE_OR_GROUP_OPERATION_COUNT = REFERENCE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_CalculateableImpl <em>Char Sequence Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_Calculateable()
	 * @generated
	 */
	int CHAR_SEQUENCE_CALCULATEABLE = 192;

	/**
	 * The number of structural features of the '<em>Char Sequence Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_CalculateableElementImpl <em>Char Sequence Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_CalculateableElement()
	 * @generated
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_ELEMENT = 158;

	/**
	 * The number of structural features of the '<em>Char Sequence Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_ELEMENT_FEATURE_COUNT = CHAR_SEQUENCE_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_CALCULATEABLE_ELEMENT_OPERATION_COUNT = CHAR_SEQUENCE_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_PrimitiveArgumentImpl <em>Character Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_PrimitiveArgument()
	 * @generated
	 */
	int CHARACTER_PRIMITIVE_ARGUMENT = 160;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PRIMITIVE_ARGUMENT__OPERATOR = CHARACTER_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PRIMITIVE_ARGUMENT__VALUE = CHARACTER_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PRIMITIVE_ARGUMENT_FEATURE_COUNT = CHARACTER_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PRIMITIVE_ARGUMENT___GET_TYPE = CHARACTER_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Character Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PRIMITIVE_ARGUMENT_OPERATION_COUNT = CHARACTER_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.parseBoolean_FunctionalOperatorImpl <em>parse Boolean Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.parseBoolean_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getparseBoolean_FunctionalOperator()
	 * @generated
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR = 163;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR__NEGATED = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR__OPERATOR = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR__S = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>parse Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LITERAL = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>parse Boolean Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_greaterThan_FunctionalOperatorImpl <em>Number Integer greater Than Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_greaterThan_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_greaterThan_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR = 164;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Integer greater Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer greater Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Person_email_AttrEClassImpl <em>Person email Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Person_email_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getPerson_email_AttrEClass()
	 * @generated
	 */
	int PERSON_EMAIL_ATTR_ECLASS = 167;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS__NAME = STRING_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS__NEGATED = STRING_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS__GENERALIZED = STRING_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS__OPERATOR = STRING_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Person email Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS_FEATURE_COUNT = STRING_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = STRING_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = STRING_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person email Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_EMAIL_ATTR_ECLASS_OPERATION_COUNT = STRING_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_AttributeEClassImpl <em>Integer Attribute EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_AttributeEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_AttributeEClass()
	 * @generated
	 */
	int INTEGER_ATTRIBUTE_ECLASS = 168;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS__NAME = REGULAR_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS__NEGATED = REGULAR_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS__GENERALIZED = REGULAR_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS__OPERATOR = REGULAR_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS_FEATURE_COUNT = REGULAR_ATTRIBUTE_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = REGULAR_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = REGULAR_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Attribute EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_ECLASS_OPERATION_COUNT = REGULAR_ATTRIBUTE_ECLASS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.EnumerationOperatorImpl <em>Enumeration Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.EnumerationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getEnumerationOperator()
	 * @generated
	 */
	int ENUMERATION_OPERATOR = 185;

	/**
	 * The number of structural features of the '<em>Enumeration Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CourseType_EnumerationOperatorImpl <em>Course Type Enumeration Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CourseType_EnumerationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCourseType_EnumerationOperator()
	 * @generated
	 */
	int COURSE_TYPE_ENUMERATION_OPERATOR = 169;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ENUMERATION_OPERATOR__ARGUMENT = ENUMERATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ENUMERATION_OPERATOR__OR = ENUMERATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Course Type Enumeration Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ENUMERATION_OPERATOR_FEATURE_COUNT = ENUMERATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Course Type Enumeration Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_ENUMERATION_OPERATOR_OPERATION_COUNT = ENUMERATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Max_AggregationOperator_IntegerImpl <em>Max Aggregation Operator Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Max_AggregationOperator_IntegerImpl
	 * @see qmm.impl.QmmPackageImpl#getMax_AggregationOperator_Integer()
	 * @generated
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER = 170;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER__OPERATOR = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER__CALCULATEABLE = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Max Aggregation Operator Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER_FEATURE_COUNT = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER___GET_TYPE = CALCULATING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER___GET_LAST_OPERATOR = CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER___GET_LITERAL = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER___GET_ALL_PARAMETERS = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Aggregation Operator Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_AGGREGATION_OPERATOR_INTEGER_OPERATION_COUNT = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.GeneralizableElementImpl <em>Generalizable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.GeneralizableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getGeneralizableElement()
	 * @generated
	 */
	int GENERALIZABLE_ELEMENT = 172;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZABLE_ELEMENT__GENERALIZED = 0;

	/**
	 * The number of structural features of the '<em>Generalizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generalizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Course_Containment_OrGroupImpl <em>Course Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Course_Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getCourse_Containment_OrGroup()
	 * @generated
	 */
	int COURSE_CONTAINMENT_OR_GROUP = 173;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP__NAME = CONTAINMENT_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP__GENERALIZED = CONTAINMENT_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP__NEGATED = CONTAINMENT_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP__TRANSITIVE = CONTAINMENT_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP__CONTAINMENT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Course Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP_FEATURE_COUNT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Course Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CONTAINMENT_OR_GROUP_OPERATION_COUNT = CONTAINMENT_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_FunctionalTypeImpl <em>Double Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_FunctionalType()
	 * @generated
	 */
	int DOUBLE_FUNCTIONAL_TYPE = 174;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_TYPE__OPERATOR = DOUBLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_TYPE_FEATURE_COUNT = DOUBLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_TYPE_OPERATION_COUNT = DOUBLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_FunctionalTypeImpl <em>Object Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_FunctionalType()
	 * @generated
	 */
	int OBJECT_FUNCTIONAL_TYPE = 175;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_TYPE__OPERATOR = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_TYPE_OPERATION_COUNT = OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_FunctionalTypeImpl <em>Integer Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_FunctionalType()
	 * @generated
	 */
	int INTEGER_FUNCTIONAL_TYPE = 177;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_TYPE__OPERATOR = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_TYPE_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FUNCTIONAL_TYPE_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_PrimitiveArgumentImpl <em>Boolean Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_PrimitiveArgument()
	 * @generated
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT = 179;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT__NEGATED = BOOLEAN_ARGUMENT__NEGATED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT__OPERATOR = BOOLEAN_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT__VALUE = BOOLEAN_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT_FEATURE_COUNT = BOOLEAN_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT___GET_TYPE = BOOLEAN_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Boolean Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PRIMITIVE_ARGUMENT_OPERATION_COUNT = BOOLEAN_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_EvaluationOperation_ArgumentImpl <em>String Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getString_EvaluationOperation_Argument()
	 * @generated
	 */
	int STRING_EVALUATION_OPERATION_ARGUMENT = 180;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>String Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_CalculateableImpl <em>Integer Calculateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_CalculateableImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_Calculateable()
	 * @generated
	 */
	int INTEGER_CALCULATEABLE = 259;

	/**
	 * The number of structural features of the '<em>Integer Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Calculateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_CalculateableElementImpl <em>Integer Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_CalculateableElement()
	 * @generated
	 */
	int INTEGER_CALCULATEABLE_ELEMENT = 181;

	/**
	 * The number of structural features of the '<em>Integer Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_FEATURE_COUNT = INTEGER_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_OPERATION_COUNT = INTEGER_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Sum_AggregationOperator_IntegerImpl <em>Sum Aggregation Operator Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Sum_AggregationOperator_IntegerImpl
	 * @see qmm.impl.QmmPackageImpl#getSum_AggregationOperator_Integer()
	 * @generated
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER = 182;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER__OPERATOR = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER__CALCULATEABLE = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sum Aggregation Operator Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER_FEATURE_COUNT = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER___GET_TYPE = CALCULATING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER___GET_LAST_OPERATOR = CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER___GET_LITERAL = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER___GET_ALL_PARAMETERS = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sum Aggregation Operator Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_INTEGER_OPERATION_COUNT = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.FunctionalParameterImpl <em>Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getFunctionalParameter()
	 * @generated
	 */
	int FUNCTIONAL_PARAMETER = 184;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PARAMETER__ARGUMENT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PARAMETER___GET_TYPE = PARAMETER___GET_TYPE;

	/**
	 * The number of operations of the '<em>Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_greaterEquals_FunctionalOperatorImpl <em>Number Double greater Equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_greaterEquals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_greaterEquals_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR = 186;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Double greater Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double greater Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_CalculateableParameterImpl <em>Integer Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_CalculateableParameter()
	 * @generated
	 */
	int INTEGER_CALCULATEABLE_PARAMETER = 187;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_PARAMETER__ARGUMENT = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_PARAMETER_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_PARAMETER___GET_TYPE = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = INTEGER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_PARAMETER_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_FunctionalTypeImpl <em>Char Sequence Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_FunctionalType()
	 * @generated
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_TYPE = 188;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_TYPE__OPERATOR = CHAR_SEQUENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_TYPE_FEATURE_COUNT = CHAR_SEQUENCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_FUNCTIONAL_TYPE_OPERATION_COUNT = CHAR_SEQUENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.String_CalculateableElementImpl <em>String Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getString_CalculateableElement()
	 * @generated
	 */
	int STRING_CALCULATEABLE_ELEMENT = 189;

	/**
	 * The number of structural features of the '<em>String Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_FEATURE_COUNT = STRING_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CALCULATEABLE_ELEMENT_OPERATION_COUNT = STRING_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_String_length_FunctionalOperatorImpl <em>Char Sequence String length Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_String_length_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_String_length_FunctionalOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR = 191;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Sequence String length Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence String length Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.indexOfString_FunctionalOperatorImpl <em>index Of String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.indexOfString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getindexOfString_FunctionalOperator()
	 * @generated
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR = 194;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR__STR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>index Of String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>index Of String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.trim_FunctionalOperatorImpl <em>trim Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.trim_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#gettrim_FunctionalOperator()
	 * @generated
	 */
	int TRIM_FUNCTIONAL_OPERATOR = 195;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>trim Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>trim Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.greaterEquals_FunctionalOperatorImpl <em>greater Equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.greaterEquals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getgreaterEquals_FunctionalOperator()
	 * @generated
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR = 196;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR__I = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>greater Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>greater Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Student_Reference_OrGroupImpl <em>Student Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Student_Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getStudent_Reference_OrGroup()
	 * @generated
	 */
	int STUDENT_REFERENCE_OR_GROUP = 197;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP__NAME = REFERENCE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP__GENERALIZED = REFERENCE_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP__NEGATED = REFERENCE_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP__TRANSITIVE = REFERENCE_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP__REFERENCE = REFERENCE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Student Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP_FEATURE_COUNT = REFERENCE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Student Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_REFERENCE_OR_GROUP_OPERATION_COUNT = REFERENCE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.String_And_BitOperatorImpl <em>String And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getString_And_BitOperator()
	 * @generated
	 */
	int STRING_AND_BIT_OPERATOR = 198;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_AND_BIT_OPERATOR__NEGATED = STRING_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_AND_BIT_OPERATOR__CONNECTS = STRING_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>String And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_AND_BIT_OPERATOR_FEATURE_COUNT = STRING_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_AND_BIT_OPERATOR___GET_LITERAL = STRING_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_AND_BIT_OPERATOR_OPERATION_COUNT = STRING_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.CalculateableElementImpl <em>Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getCalculateableElement()
	 * @generated
	 */
	int CALCULATEABLE_ELEMENT = 199;

	/**
	 * The number of structural features of the '<em>Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ELEMENT_FEATURE_COUNT = CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_ELEMENT_OPERATION_COUNT = CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Course_courseNumber_AttrEClassImpl <em>Course course Number Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Course_courseNumber_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getCourse_courseNumber_AttrEClass()
	 * @generated
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS = 200;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS__NAME = INTEGER_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS__NEGATED = INTEGER_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS__GENERALIZED = INTEGER_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS__OPERATOR = INTEGER_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Course course Number Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS_FEATURE_COUNT = INTEGER_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = INTEGER_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = INTEGER_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Course course Number Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COURSE_NUMBER_ATTR_ECLASS_OPERATION_COUNT = INTEGER_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_EvaluationOperation_ArgumentImpl <em>Boolean Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_EvaluationOperation_Argument()
	 * @generated
	 */
	int BOOLEAN_EVALUATION_OPERATION_ARGUMENT = 201;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EVALUATION_OPERATION_ARGUMENT__NEGATED = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Boolean Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.greaterThan_FunctionalOperatorImpl <em>greater Than Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.greaterThan_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getgreaterThan_FunctionalOperator()
	 * @generated
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR = 202;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR__NEGATED = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR__OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR__I = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>greater Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR___GET_TYPE = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR___GET_LITERAL = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>greater Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Count_AggregationOperatorImpl <em>Count Aggregation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Count_AggregationOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCount_AggregationOperator()
	 * @generated
	 */
	int COUNT_AGGREGATION_OPERATOR = 203;

	/**
	 * The feature id for the '<em><b>Countable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR__COUNTABLE = COUNTING_AGGREGATION_OPERATOR__COUNTABLE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR__OPERATOR = COUNTING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR_FEATURE_COUNT = COUNTING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR___GET_TYPE = COUNTING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR___GET_LAST_OPERATOR = COUNTING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR___GET_ALL_PARAMETERS = COUNTING_AGGREGATION_OPERATOR___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR___GET_LITERAL = COUNTING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_AGGREGATION_OPERATOR_OPERATION_COUNT = COUNTING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_CalculateableElementImpl <em>Object Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_CalculateableElement()
	 * @generated
	 */
	int OBJECT_CALCULATEABLE_ELEMENT = 204;

	/**
	 * The number of structural features of the '<em>Object Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_ELEMENT_FEATURE_COUNT = OBJECT_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_ELEMENT_OPERATION_COUNT = OBJECT_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Min_AggregationOperator_IntegerImpl <em>Min Aggregation Operator Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Min_AggregationOperator_IntegerImpl
	 * @see qmm.impl.QmmPackageImpl#getMin_AggregationOperator_Integer()
	 * @generated
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER = 205;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER__OPERATOR = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER__CALCULATEABLE = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Min Aggregation Operator Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER_FEATURE_COUNT = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER___GET_TYPE = CALCULATING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER___GET_LAST_OPERATOR = CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER___GET_LITERAL = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER___GET_ALL_PARAMETERS = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Aggregation Operator Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AGGREGATION_OPERATOR_INTEGER_OPERATION_COUNT = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.BitOperatorImpl <em>Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getBitOperator()
	 * @generated
	 */
	int BIT_OPERATOR = 206;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OPERATOR__NEGATED = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_greaterEquals_FunctionalOperatorImpl <em>Number Integer greater Equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_greaterEquals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_greaterEquals_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR = 207;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Integer greater Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer greater Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_BitOperatorImpl <em>Object Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_BitOperator()
	 * @generated
	 */
	int OBJECT_BIT_OPERATOR = 277;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BIT_OPERATOR__NEGATED = OBJECT_EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BIT_OPERATOR__CONNECTS = OBJECT_EXPRESSION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BIT_OPERATOR_FEATURE_COUNT = OBJECT_EXPRESSION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BIT_OPERATOR_OPERATION_COUNT = OBJECT_EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_And_BitOperatorImpl <em>Object And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_And_BitOperator()
	 * @generated
	 */
	int OBJECT_AND_BIT_OPERATOR = 208;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AND_BIT_OPERATOR__NEGATED = OBJECT_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AND_BIT_OPERATOR__CONNECTS = OBJECT_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Object And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AND_BIT_OPERATOR_FEATURE_COUNT = OBJECT_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AND_BIT_OPERATOR___GET_LITERAL = OBJECT_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_AND_BIT_OPERATOR_OPERATION_COUNT = OBJECT_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_CharSequence_toString_FunctionalOperatorImpl <em>Object Char Sequence to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_CharSequence_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_CharSequence_toString_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR = 211;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Char Sequence to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Char Sequence to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_Object_Number_equals_FunctionalOperatorImpl <em>Number Integer Object Number equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_Object_Number_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_Object_Number_equals_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR = 212;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Integer Object Number equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer Object Number equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.NegatableElementImpl <em>Negatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.NegatableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getNegatableElement()
	 * @generated
	 */
	int NEGATABLE_ELEMENT = 213;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATABLE_ELEMENT__NEGATED = 0;

	/**
	 * The number of structural features of the '<em>Negatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Negatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_EvaluationOperation_ArgumentImpl <em>Character Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_EvaluationOperation_Argument()
	 * @generated
	 */
	int CHARACTER_EVALUATION_OPERATION_ARGUMENT = 214;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Character Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_FunctionalParameterImpl <em>Object Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_FunctionalParameter()
	 * @generated
	 */
	int OBJECT_FUNCTIONAL_PARAMETER = 215;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_PARAMETER__ARGUMENT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_PARAMETER_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_PARAMETER___GET_TYPE = OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = OBJECT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FUNCTIONAL_PARAMETER_OPERATION_COUNT = OBJECT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_FunctionalTypeImpl <em>Number Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_FunctionalType()
	 * @generated
	 */
	int NUMBER_FUNCTIONAL_TYPE = 216;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_TYPE__OPERATOR = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_TYPE_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FUNCTIONAL_TYPE_OPERATION_COUNT = NUMBER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_Or_BitOperatorImpl <em>Char Sequence Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_Or_BitOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_OR_BIT_OPERATOR = 218;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OR_BIT_OPERATOR__NEGATED = CHAR_SEQUENCE_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OR_BIT_OPERATOR__CONNECTS = CHAR_SEQUENCE_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Char Sequence Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OR_BIT_OPERATOR_FEATURE_COUNT = CHAR_SEQUENCE_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OR_BIT_OPERATOR___GET_LITERAL = CHAR_SEQUENCE_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OR_BIT_OPERATOR_OPERATION_COUNT = CHAR_SEQUENCE_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_OperatorImpl <em>Double Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_Operator()
	 * @generated
	 */
	int DOUBLE_OPERATOR = 219;

	/**
	 * The number of structural features of the '<em>Double Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Character_equals_FunctionalOperatorImpl <em>Object Character equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Character_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Character_equals_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR = 220;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Character equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Character equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Or_BitOperatorImpl <em>Object Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Or_BitOperator()
	 * @generated
	 */
	int OBJECT_OR_BIT_OPERATOR = 222;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OR_BIT_OPERATOR__NEGATED = OBJECT_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OR_BIT_OPERATOR__CONNECTS = OBJECT_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Object Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OR_BIT_OPERATOR_FEATURE_COUNT = OBJECT_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OR_BIT_OPERATOR___GET_LITERAL = OBJECT_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OR_BIT_OPERATOR_OPERATION_COUNT = OBJECT_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.startsWith_FunctionalOperatorImpl <em>starts With Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.startsWith_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getstartsWith_FunctionalOperator()
	 * @generated
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR = 224;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR__NEGATED = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR__PREFIX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>starts With Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>starts With Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_CalculateableElementReferenceArgumentImpl <em>Integer Calculateable Element Reference Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_CalculateableElementReferenceArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_CalculateableElementReferenceArgument()
	 * @generated
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT = 225;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Calculateable Element Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___GET_TYPE = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Calculateable Element Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT = CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_FunctionalTypeImpl <em>Character Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_FunctionalType()
	 * @generated
	 */
	int CHARACTER_FUNCTIONAL_TYPE = 226;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_TYPE__OPERATOR = CHARACTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_TYPE_FEATURE_COUNT = CHARACTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FUNCTIONAL_TYPE_OPERATION_COUNT = CHARACTER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Student_matriculationNumber_AttrEClassImpl <em>Student matriculation Number Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Student_matriculationNumber_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getStudent_matriculationNumber_AttrEClass()
	 * @generated
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS = 227;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS__NAME = INTEGER_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS__NEGATED = INTEGER_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS__GENERALIZED = INTEGER_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS__OPERATOR = INTEGER_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Student matriculation Number Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS_FEATURE_COUNT = INTEGER_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = INTEGER_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = INTEGER_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Student matriculation Number Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_MATRICULATION_NUMBER_ATTR_ECLASS_OPERATION_COUNT = INTEGER_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.FunctionalTypeImpl <em>Functional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.FunctionalTypeImpl
	 * @see qmm.impl.QmmPackageImpl#getFunctionalType()
	 * @generated
	 */
	int FUNCTIONAL_TYPE = 230;

	/**
	 * The number of structural features of the '<em>Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_FunctionalParameterImpl <em>Double Functional Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_FunctionalParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_FunctionalParameter()
	 * @generated
	 */
	int DOUBLE_FUNCTIONAL_PARAMETER = 231;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_PARAMETER__ARGUMENT = DOUBLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_PARAMETER_FEATURE_COUNT = DOUBLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_PARAMETER___GET_TYPE = DOUBLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = DOUBLE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Functional Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FUNCTIONAL_PARAMETER_OPERATION_COUNT = DOUBLE_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Character_Original_FunctionalOperatorImpl <em>Character Original Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Character_Original_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharacter_Original_FunctionalOperator()
	 * @generated
	 */
	int CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR = 232;

	/**
	 * The number of structural features of the '<em>Character Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT = CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE = CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The number of operations of the '<em>Character Original Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT = CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Sum_AggregationOperator_DoubleImpl <em>Sum Aggregation Operator Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Sum_AggregationOperator_DoubleImpl
	 * @see qmm.impl.QmmPackageImpl#getSum_AggregationOperator_Double()
	 * @generated
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE = 234;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE__OPERATOR = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sum Aggregation Operator Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE_FEATURE_COUNT = CALCULATING_AGGREGATION_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE___GET_TYPE = CALCULATING_AGGREGATION_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE___GET_LAST_OPERATOR = CALCULATING_AGGREGATION_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE___GET_LITERAL = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE___GET_ALL_PARAMETERS = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sum Aggregation Operator Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_AGGREGATION_OPERATOR_DOUBLE_OPERATION_COUNT = CALCULATING_AGGREGATION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.CalculateableParameterImpl <em>Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getCalculateableParameter()
	 * @generated
	 */
	int CALCULATEABLE_PARAMETER = 235;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_PARAMETER__ARGUMENT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_PARAMETER___GET_TYPE = PARAMETER___GET_TYPE;

	/**
	 * The number of operations of the '<em>Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEABLE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_Object_Number_toString_FunctionalOperatorImpl <em>Number Double Object Number to String Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_Object_Number_toString_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_Object_Number_toString_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR = 236;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Double Object Number to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double Object Number to String Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Boolean_equals_FunctionalOperatorImpl <em>Object Boolean equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Boolean_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Boolean_equals_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR = 237;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Boolean equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Boolean equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.CourseType_OperatorImpl <em>Course Type Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CourseType_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCourseType_Operator()
	 * @generated
	 */
	int COURSE_TYPE_OPERATOR = 238;

	/**
	 * The number of structural features of the '<em>Course Type Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course Type Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TYPE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Integer_And_BitOperatorImpl <em>Integer And Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Integer_And_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getInteger_And_BitOperator()
	 * @generated
	 */
	int INTEGER_AND_BIT_OPERATOR = 239;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AND_BIT_OPERATOR__NEGATED = INTEGER_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AND_BIT_OPERATOR__CONNECTS = INTEGER_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Integer And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AND_BIT_OPERATOR_FEATURE_COUNT = INTEGER_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AND_BIT_OPERATOR___GET_LITERAL = INTEGER_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer And Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AND_BIT_OPERATOR_OPERATION_COUNT = INTEGER_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Countable_ReferenceArgumentImpl <em>Countable Reference Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Countable_ReferenceArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getCountable_ReferenceArgument()
	 * @generated
	 */
	int COUNTABLE_REFERENCE_ARGUMENT = 241;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_ARGUMENT__REFERENCE = REFERENCE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Countable Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_ARGUMENT_FEATURE_COUNT = REFERENCE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_ARGUMENT___GET_TYPE = REFERENCE_ARGUMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Countable Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTABLE_REFERENCE_ARGUMENT_OPERATION_COUNT = REFERENCE_ARGUMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Boolean_CalculateableElementImpl <em>Boolean Calculateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Boolean_CalculateableElementImpl
	 * @see qmm.impl.QmmPackageImpl#getBoolean_CalculateableElement()
	 * @generated
	 */
	int BOOLEAN_CALCULATEABLE_ELEMENT = 242;

	/**
	 * The number of structural features of the '<em>Boolean Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_ELEMENT_FEATURE_COUNT = BOOLEAN_CALCULATEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Calculateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CALCULATEABLE_ELEMENT_OPERATION_COUNT = BOOLEAN_CALCULATEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Integer_smallerEquals_FunctionalOperatorImpl <em>Number Integer smaller Equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Integer_smallerEquals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Integer_smallerEquals_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR = 243;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Integer smaller Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Integer smaller Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Character_hashCode_FunctionalOperatorImpl <em>Object Character hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Character_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Character_hashCode_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR = 244;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Character hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Character hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.UniversityManagementSystem_Containment_OrGroupImpl <em>University Management System Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.UniversityManagementSystem_Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getUniversityManagementSystem_Containment_OrGroup()
	 * @generated
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP = 245;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP__NAME = CONTAINMENT_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP__GENERALIZED = CONTAINMENT_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP__NEGATED = CONTAINMENT_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP__TRANSITIVE = CONTAINMENT_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP__CONTAINMENT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>University Management System Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP_FEATURE_COUNT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>University Management System Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_CONTAINMENT_OR_GROUP_OPERATION_COUNT = CONTAINMENT_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Exam_Containment_OrGroupImpl <em>Exam Containment Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Exam_Containment_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getExam_Containment_OrGroup()
	 * @generated
	 */
	int EXAM_CONTAINMENT_OR_GROUP = 247;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP__NAME = CONTAINMENT_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP__GENERALIZED = CONTAINMENT_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP__NEGATED = CONTAINMENT_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP__TRANSITIVE = CONTAINMENT_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP__CONTAINMENT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exam Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP_FEATURE_COUNT = CONTAINMENT_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = CONTAINMENT_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Exam Containment Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_CONTAINMENT_OR_GROUP_OPERATION_COUNT = CONTAINMENT_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_OperatorImpl <em>Char Sequence Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_Operator()
	 * @generated
	 */
	int CHAR_SEQUENCE_OPERATOR = 248;

	/**
	 * The number of structural features of the '<em>Char Sequence Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Sequence Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_smallerThan_FunctionalOperatorImpl <em>Number Double smaller Than Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_smallerThan_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_smallerThan_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR = 249;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Double smaller Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double smaller Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Professor_employeeNumber_AttrEClassImpl <em>Professor employee Number Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Professor_employeeNumber_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getProfessor_employeeNumber_AttrEClass()
	 * @generated
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS = 251;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS__NAME = INTEGER_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS__NEGATED = INTEGER_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS__GENERALIZED = INTEGER_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS__OPERATOR = INTEGER_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Professor employee Number Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS_FEATURE_COUNT = INTEGER_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = INTEGER_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = INTEGER_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Professor employee Number Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_EMPLOYEE_NUMBER_ATTR_ECLASS_OPERATION_COUNT = INTEGER_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.doubleValue_FunctionalOperatorImpl <em>double Value Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.doubleValue_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getdoubleValue_FunctionalOperator()
	 * @generated
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR = 252;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR__OPERATOR = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>double Value Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR___GET_TYPE = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR___GET_LITERAL = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>double Value Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.String_PrimitiveArgumentImpl <em>String Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.String_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getString_PrimitiveArgument()
	 * @generated
	 */
	int STRING_PRIMITIVE_ARGUMENT = 255;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PRIMITIVE_ARGUMENT__OPERATOR = STRING_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PRIMITIVE_ARGUMENT__VALUE = STRING_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PRIMITIVE_ARGUMENT_FEATURE_COUNT = STRING_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PRIMITIVE_ARGUMENT___GET_TYPE = STRING_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>String Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PRIMITIVE_ARGUMENT_OPERATION_COUNT = STRING_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_CalculateableParameterImpl <em>Object Calculateable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_CalculateableParameterImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_CalculateableParameter()
	 * @generated
	 */
	int OBJECT_CALCULATEABLE_PARAMETER = 256;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_PARAMETER__ARGUMENT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_PARAMETER_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_PARAMETER___GET_TYPE = OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP = OBJECT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Calculateable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CALCULATEABLE_PARAMETER_OPERATION_COUNT = OBJECT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.FindQueryImpl <em>Find Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.FindQueryImpl
	 * @see qmm.impl.QmmPackageImpl#getFindQuery()
	 * @generated
	 */
	int FIND_QUERY = 257;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY__UNION = 0;

	/**
	 * The feature id for the '<em><b>Root Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY__ROOT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY__SELECT = 2;

	/**
	 * The number of structural features of the '<em>Find Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Find Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qmm.impl.charAt_FunctionalOperatorImpl <em>char At Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.charAt_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcharAt_FunctionalOperator()
	 * @generated
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR = 258;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR__I = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>char At Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>char At Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_AT_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.compareToStringIgnoreCase_FunctionalOperatorImpl <em>compare To String Ignore Case Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.compareToStringIgnoreCase_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getcompareToStringIgnoreCase_FunctionalOperator()
	 * @generated
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR = 260;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR__STR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>compare To String Ignore Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>compare To String Ignore Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Or_BitOperatorImpl <em>Number Or Bit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Or_BitOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Or_BitOperator()
	 * @generated
	 */
	int NUMBER_OR_BIT_OPERATOR = 261;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OR_BIT_OPERATOR__NEGATED = NUMBER_BIT_OPERATOR__NEGATED;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OR_BIT_OPERATOR__CONNECTS = NUMBER_BIT_OPERATOR__CONNECTS;

	/**
	 * The number of structural features of the '<em>Number Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OR_BIT_OPERATOR_FEATURE_COUNT = NUMBER_BIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OR_BIT_OPERATOR___GET_LITERAL = NUMBER_BIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Or Bit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OR_BIT_OPERATOR_OPERATION_COUNT = NUMBER_BIT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_OperatorImpl <em>Object Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_OperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Operator()
	 * @generated
	 */
	int OBJECT_OPERATOR = 262;

	/**
	 * The number of structural features of the '<em>Object Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.CharSequence_String_Object_CharSequence_equals_FunctionalOperatorImpl <em>Char Sequence String Object Char Sequence equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.CharSequence_String_Object_CharSequence_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getCharSequence_String_Object_CharSequence_equals_FunctionalOperator()
	 * @generated
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR = 263;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.toUpperCase_FunctionalOperatorImpl <em>to Upper Case Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.toUpperCase_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#gettoUpperCase_FunctionalOperator()
	 * @generated
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR = 264;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>to Upper Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>to Upper Case Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_UPPER_CASE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_Boolean_hashCode_FunctionalOperatorImpl <em>Object Boolean hash Code Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_Boolean_hashCode_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_Boolean_hashCode_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR = 265;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Boolean hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Boolean hash Code Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.FunctionalOperatorImpl <em>Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getFunctionalOperator()
	 * @generated
	 */
	int FUNCTIONAL_OPERATOR = 266;

	/**
	 * The number of structural features of the '<em>Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATOR_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATOR___GET_TYPE = EXPRESSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = EXPRESSION_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_smallerEquals_FunctionalOperatorImpl <em>Number Double smaller Equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_smallerEquals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_smallerEquals_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR = 267;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Double smaller Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double smaller Equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Double_PrimitiveArgumentImpl <em>Double Primitive Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Double_PrimitiveArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getDouble_PrimitiveArgument()
	 * @generated
	 */
	int DOUBLE_PRIMITIVE_ARGUMENT = 270;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_ARGUMENT__OPERATOR = DOUBLE_ARGUMENT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_ARGUMENT__VALUE = DOUBLE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_ARGUMENT_FEATURE_COUNT = DOUBLE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_ARGUMENT___GET_TYPE = DOUBLE_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Double Primitive Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRIMITIVE_ARGUMENT_OPERATION_COUNT = DOUBLE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.substring_FunctionalOperatorImpl <em>substring Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.substring_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getsubstring_FunctionalOperator()
	 * @generated
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR = 271;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>substring Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR_FEATURE_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR___GET_TYPE = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = STRING_ORIGINAL_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR___GET_LITERAL = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>substring Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FUNCTIONAL_OPERATOR_OPERATION_COUNT = STRING_ORIGINAL_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Course_Reference_OrGroupImpl <em>Course Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Course_Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getCourse_Reference_OrGroup()
	 * @generated
	 */
	int COURSE_REFERENCE_OR_GROUP = 273;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP__NAME = REFERENCE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP__GENERALIZED = REFERENCE_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP__NEGATED = REFERENCE_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP__TRANSITIVE = REFERENCE_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP__REFERENCE = REFERENCE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Course Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP_FEATURE_COUNT = REFERENCE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REFERENCE_OR_GROUP_OPERATION_COUNT = REFERENCE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Course_name_AttrEClassImpl <em>Course name Attr EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Course_name_AttrEClassImpl
	 * @see qmm.impl.QmmPackageImpl#getCourse_name_AttrEClass()
	 * @generated
	 */
	int COURSE_NAME_ATTR_ECLASS = 274;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS__NAME = STRING_ATTRIBUTE_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS__NEGATED = STRING_ATTRIBUTE_ECLASS__NEGATED;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS__GENERALIZED = STRING_ATTRIBUTE_ECLASS__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS__OPERATOR = STRING_ATTRIBUTE_ECLASS__OPERATOR;

	/**
	 * The number of structural features of the '<em>Course name Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS_FEATURE_COUNT = STRING_ATTRIBUTE_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Check Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT = STRING_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP = STRING_ATTRIBUTE_ECLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Course name Attr EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_NAME_ATTR_ECLASS_OPERATION_COUNT = STRING_ATTRIBUTE_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.UniversityManagementSystem_Reference_OrGroupImpl <em>University Management System Reference Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.UniversityManagementSystem_Reference_OrGroupImpl
	 * @see qmm.impl.QmmPackageImpl#getUniversityManagementSystem_Reference_OrGroup()
	 * @generated
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP = 279;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP__NAME = REFERENCE_OR_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Generalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP__GENERALIZED = REFERENCE_OR_GROUP__GENERALIZED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP__NEGATED = REFERENCE_OR_GROUP__NEGATED;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP__TRANSITIVE = REFERENCE_OR_GROUP__TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP__REFERENCE = REFERENCE_OR_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>University Management System Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP_FEATURE_COUNT = REFERENCE_OR_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP = REFERENCE_OR_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>University Management System Reference Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_REFERENCE_OR_GROUP_OPERATION_COUNT = REFERENCE_OR_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_EvaluationOperation_ArgumentImpl <em>Object Evaluation Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_EvaluationOperation_ArgumentImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_EvaluationOperation_Argument()
	 * @generated
	 */
	int OBJECT_EVALUATION_OPERATION_ARGUMENT = 280;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EVALUATION_OPERATION_ARGUMENT__OPERATOR = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT = EVALUATION_OPERATION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EVALUATION_OPERATION_ARGUMENT___GET_TYPE = EVALUATION_OPERATION_ARGUMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Object Evaluation Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT = EVALUATION_OPERATION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qmm.impl.Number_Double_greaterThan_FunctionalOperatorImpl <em>Number Double greater Than Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Number_Double_greaterThan_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getNumber_Double_greaterThan_FunctionalOperator()
	 * @generated
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR = 281;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR__I = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Double greater Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Double greater Than Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.impl.Object_CharSequence_equals_FunctionalOperatorImpl <em>Object Char Sequence equals Functional Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.impl.Object_CharSequence_equals_FunctionalOperatorImpl
	 * @see qmm.impl.QmmPackageImpl#getObject_CharSequence_equals_FunctionalOperator()
	 * @generated
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR = 282;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR__NEGATED = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR__OPERATOR = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR__OBJ = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Char Sequence equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR_FEATURE_COUNT = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_TYPE = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Last Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;

	/**
	 * The operation id for the '<em>Get Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_LITERAL = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Char Sequence equals Functional Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR_OPERATION_COUNT = INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qmm.CourseType <em>Course Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.CourseType
	 * @see qmm.impl.QmmPackageImpl#getCourseType()
	 * @generated
	 */
	int COURSE_TYPE = 283;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see qmm.impl.QmmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 284;

	/**
	 * The meta object id for the '<em>Char Sequence</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.CharSequence
	 * @see qmm.impl.QmmPackageImpl#getCharSequence()
	 * @generated
	 */
	int CHAR_SEQUENCE = 285;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see qmm.impl.QmmPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 286;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see qmm.impl.QmmPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 287;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see qmm.impl.QmmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 288;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see qmm.impl.QmmPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 289;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see qmm.impl.QmmPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 290;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see qmm.impl.QmmPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 291;


	/**
	 * Returns the meta object for class '{@link qmm.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see qmm.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Person#getName_AttrEClass <em>Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Attr EClass</em>'.
	 * @see qmm.Person#getName_AttrEClass()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Name_AttrEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Person#getEmail_AttrEClass <em>Email Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Attr EClass</em>'.
	 * @see qmm.Person#getEmail_AttrEClass()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Email_AttrEClass();

	/**
	 * Returns the meta object for the '{@link qmm.Person#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Person#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPerson__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see qmm.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Student#getAttends <em>Attends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attends</em>'.
	 * @see qmm.Student#getAttends()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Attends();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Student#getMatriculationNumber_AttrEClass <em>Matriculation Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matriculation Number Attr EClass</em>'.
	 * @see qmm.Student#getMatriculationNumber_AttrEClass()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_MatriculationNumber_AttrEClass();

	/**
	 * Returns the meta object for the '{@link qmm.Student#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Student#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStudent__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see qmm.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Professor#getLectures <em>Lectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lectures</em>'.
	 * @see qmm.Professor#getLectures()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Lectures();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Professor#getEmployeeNumber_AttrEClass <em>Employee Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee Number Attr EClass</em>'.
	 * @see qmm.Professor#getEmployeeNumber_AttrEClass()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_EmployeeNumber_AttrEClass();

	/**
	 * Returns the meta object for the '{@link qmm.Professor#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Professor#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProfessor__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see qmm.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Course#getMandatoryFor <em>Mandatory For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory For</em>'.
	 * @see qmm.Course#getMandatoryFor()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_MandatoryFor();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Course#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam</em>'.
	 * @see qmm.Course#getExam()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Exam();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Course#getName_AttrEClass <em>Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Attr EClass</em>'.
	 * @see qmm.Course#getName_AttrEClass()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Name_AttrEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Course#getCourseNumber_AttrEClass <em>Course Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Number Attr EClass</em>'.
	 * @see qmm.Course#getCourseNumber_AttrEClass()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseNumber_AttrEClass();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Course#getCourseType_AttrEClass <em>Course Type Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course Type Attr EClass</em>'.
	 * @see qmm.Course#getCourseType_AttrEClass()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseType_AttrEClass();

	/**
	 * Returns the meta object for the '{@link qmm.Course#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Course#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.UniversityManagementSystem <em>University Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University Management System</em>'.
	 * @see qmm.UniversityManagementSystem
	 * @generated
	 */
	EClass getUniversityManagementSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.UniversityManagementSystem#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see qmm.UniversityManagementSystem#getCourse()
	 * @see #getUniversityManagementSystem()
	 * @generated
	 */
	EReference getUniversityManagementSystem_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.UniversityManagementSystem#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see qmm.UniversityManagementSystem#getPerson()
	 * @see #getUniversityManagementSystem()
	 * @generated
	 */
	EReference getUniversityManagementSystem_Person();

	/**
	 * Returns the meta object for the '{@link qmm.UniversityManagementSystem#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.UniversityManagementSystem#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUniversityManagementSystem__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see qmm.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Exam#getExamID_AttrEClass <em>Exam ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam ID Attr EClass</em>'.
	 * @see qmm.Exam#getExamID_AttrEClass()
	 * @see #getExam()
	 * @generated
	 */
	EReference getExam_ExamID_AttrEClass();

	/**
	 * Returns the meta object for the '{@link qmm.Exam#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Exam#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExam__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Operator <em>Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Operator</em>'.
	 * @see qmm.Number_Operator
	 * @generated
	 */
	EClass getNumber_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_BitOperator <em>Boolean Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Bit Operator</em>'.
	 * @see qmm.Boolean_BitOperator
	 * @generated
	 */
	EClass getBoolean_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Boolean_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.Boolean_BitOperator#getConnects()
	 * @see #getBoolean_BitOperator()
	 * @generated
	 */
	EReference getBoolean_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.Number_EvaluationOperation_Argument <em>Number Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Evaluation Operation Argument</em>'.
	 * @see qmm.Number_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getNumber_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Double_CalculateableParameter <em>Double Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Calculateable Parameter</em>'.
	 * @see qmm.Double_CalculateableParameter
	 * @generated
	 */
	EClass getDouble_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Double_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Double_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDouble_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.toLowerCase_FunctionalOperator <em>to Lower Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>to Lower Case Functional Operator</em>'.
	 * @see qmm.toLowerCase_FunctionalOperator
	 * @generated
	 */
	EClass gettoLowerCase_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.toLowerCase_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.toLowerCase_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation gettoLowerCase_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.toLowerCase_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.toLowerCase_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation gettoLowerCase_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.String_CalculateableParameter <em>String Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Calculateable Parameter</em>'.
	 * @see qmm.String_CalculateableParameter
	 * @generated
	 */
	EClass getString_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.String_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.String_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getString_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Double_Original_FunctionalOperator <em>Double Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Original Functional Operator</em>'.
	 * @see qmm.Double_Original_FunctionalOperator
	 * @generated
	 */
	EClass getDouble_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_ExpressionOperator <em>Number Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Expression Operator</em>'.
	 * @see qmm.Number_ExpressionOperator
	 * @generated
	 */
	EClass getNumber_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_Or_BitOperator <em>Integer Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Or Bit Operator</em>'.
	 * @see qmm.Integer_Or_BitOperator
	 * @generated
	 */
	EClass getInteger_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Integer_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Integer_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getInteger_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_Operator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator</em>'.
	 * @see qmm.Boolean_Operator
	 * @generated
	 */
	EClass getBoolean_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_FunctionalOperator <em>Integer Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Functional Operator</em>'.
	 * @see qmm.Integer_FunctionalOperator
	 * @generated
	 */
	EClass getInteger_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_Calculateable <em>Boolean Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Calculateable</em>'.
	 * @see qmm.Boolean_Calculateable
	 * @generated
	 */
	EClass getBoolean_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.codePointBefore_FunctionalOperator <em>code Point Before Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>code Point Before Functional Operator</em>'.
	 * @see qmm.codePointBefore_FunctionalOperator
	 * @generated
	 */
	EClass getcodePointBefore_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.codePointBefore_FunctionalOperator#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see qmm.codePointBefore_FunctionalOperator#getIndex()
	 * @see #getcodePointBefore_FunctionalOperator()
	 * @generated
	 */
	EReference getcodePointBefore_FunctionalOperator_Index();

	/**
	 * Returns the meta object for the '{@link qmm.codePointBefore_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.codePointBefore_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcodePointBefore_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.codePointBefore_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.codePointBefore_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcodePointBefore_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Exam_examID_AttrEClass <em>Exam exam ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam exam ID Attr EClass</em>'.
	 * @see qmm.Exam_examID_AttrEClass
	 * @generated
	 */
	EClass getExam_examID_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Min_AggregationOperator_Double <em>Min Aggregation Operator Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Aggregation Operator Double</em>'.
	 * @see qmm.Min_AggregationOperator_Double
	 * @generated
	 */
	EClass getMin_AggregationOperator_Double();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Min_AggregationOperator_Double#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.Min_AggregationOperator_Double#getCalculateable()
	 * @see #getMin_AggregationOperator_Double()
	 * @generated
	 */
	EReference getMin_AggregationOperator_Double_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.Min_AggregationOperator_Double#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Min_AggregationOperator_Double#getLiteral()
	 * @generated
	 */
	EOperation getMin_AggregationOperator_Double__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Min_AggregationOperator_Double#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Min_AggregationOperator_Double#getAllParameters()
	 * @generated
	 */
	EOperation getMin_AggregationOperator_Double__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_Or_BitOperator <em>Boolean Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Or Bit Operator</em>'.
	 * @see qmm.Boolean_Or_BitOperator
	 * @generated
	 */
	EClass getBoolean_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Boolean_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Boolean_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getBoolean_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Double_Type <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Type</em>'.
	 * @see qmm.Double_Type
	 * @generated
	 */
	EClass getDouble_Type();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_Original_FunctionalOperator <em>Integer Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Original Functional Operator</em>'.
	 * @see qmm.Integer_Original_FunctionalOperator
	 * @generated
	 */
	EClass getInteger_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Boolean_toString_FunctionalOperator <em>Object Boolean to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Boolean to String Functional Operator</em>'.
	 * @see qmm.Object_Boolean_toString_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Boolean_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Boolean_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Boolean_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Boolean_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Boolean_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Boolean_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Boolean_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.String_Original_FunctionalOperator <em>String Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Original Functional Operator</em>'.
	 * @see qmm.String_Original_FunctionalOperator
	 * @generated
	 */
	EClass getString_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see qmm.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the '{@link qmm.TypedElement#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see qmm.TypedElement#getType()
	 * @generated
	 */
	EOperation getTypedElement__GetType();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_And_BitOperator <em>Char Sequence And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence And Bit Operator</em>'.
	 * @see qmm.CharSequence_And_BitOperator
	 * @generated
	 */
	EClass getCharSequence_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.CharSequence_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharSequence_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator <em>Number Integer Object Number hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * @see qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_Object_Number_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_Object_Number_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_Object_Number_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_Object_Number_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.compareToString_FunctionalOperator <em>compare To String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>compare To String Functional Operator</em>'.
	 * @see qmm.compareToString_FunctionalOperator
	 * @generated
	 */
	EClass getcompareToString_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.compareToString_FunctionalOperator#getAnotherString <em>Another String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Another String</em>'.
	 * @see qmm.compareToString_FunctionalOperator#getAnotherString()
	 * @see #getcompareToString_FunctionalOperator()
	 * @generated
	 */
	EReference getcompareToString_FunctionalOperator_AnotherString();

	/**
	 * Returns the meta object for the '{@link qmm.compareToString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.compareToString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcompareToString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.compareToString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.compareToString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcompareToString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.contains_FunctionalOperator <em>contains Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>contains Functional Operator</em>'.
	 * @see qmm.contains_FunctionalOperator
	 * @generated
	 */
	EClass getcontains_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.contains_FunctionalOperator#getCharSequence <em>Char Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char Sequence</em>'.
	 * @see qmm.contains_FunctionalOperator#getCharSequence()
	 * @see #getcontains_FunctionalOperator()
	 * @generated
	 */
	EReference getcontains_FunctionalOperator_CharSequence();

	/**
	 * Returns the meta object for the '{@link qmm.contains_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.contains_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcontains_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.contains_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.contains_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcontains_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_FunctionalParameter <em>Boolean Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Functional Parameter</em>'.
	 * @see qmm.Boolean_FunctionalParameter
	 * @generated
	 */
	EClass getBoolean_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Boolean_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Boolean_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBoolean_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Calculateable_Argument <em>Calculateable Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculateable Argument</em>'.
	 * @see qmm.Calculateable_Argument
	 * @generated
	 */
	EClass getCalculateable_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Calculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculateable</em>'.
	 * @see qmm.Calculateable
	 * @generated
	 */
	EClass getCalculateable();

	/**
	 * Returns the meta object for class '{@link qmm.CalculatingAggregationOperator <em>Calculating Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculating Aggregation Operator</em>'.
	 * @see qmm.CalculatingAggregationOperator
	 * @generated
	 */
	EClass getCalculatingAggregationOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_EvaluationOperation_Argument <em>Integer Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Evaluation Operation Argument</em>'.
	 * @see qmm.Integer_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getInteger_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Double_And_BitOperator <em>Double And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double And Bit Operator</em>'.
	 * @see qmm.Double_And_BitOperator
	 * @generated
	 */
	EClass getDouble_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Double_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Double_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getDouble_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Original_FunctionalOperator <em>Number Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Original Functional Operator</em>'.
	 * @see qmm.Number_Original_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see qmm.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_Original_FunctionalOperator <em>Boolean Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Original Functional Operator</em>'.
	 * @see qmm.Boolean_Original_FunctionalOperator
	 * @generated
	 */
	EClass getBoolean_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.String_FunctionalOperator <em>String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Functional Operator</em>'.
	 * @see qmm.String_FunctionalOperator
	 * @generated
	 */
	EClass getString_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Character_Or_BitOperator <em>Character Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Or Bit Operator</em>'.
	 * @see qmm.Character_Or_BitOperator
	 * @generated
	 */
	EClass getCharacter_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Character_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Character_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharacter_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.equals_FunctionalOperator <em>equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>equals Functional Operator</em>'.
	 * @see qmm.equals_FunctionalOperator
	 * @generated
	 */
	EClass getequals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.equals_FunctionalOperator#getObj()
	 * @see #getequals_FunctionalOperator()
	 * @generated
	 */
	EReference getequals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getequals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getequals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Number_equals_FunctionalOperator <em>Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Number equals Functional Operator</em>'.
	 * @see qmm.Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Number_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Object_Number_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.Object_Number_equals_FunctionalOperator#getObj()
	 * @see #getObject_Number_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getObject_Number_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Number_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Number_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Number_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Number_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Number_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Number_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Double_CalculateableElement <em>Double Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Calculateable Element</em>'.
	 * @see qmm.Double_CalculateableElement
	 * @generated
	 */
	EClass getDouble_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_Object_Number_hashCode_FunctionalOperator <em>Number Double Object Number hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * @see qmm.Number_Double_Object_Number_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_Object_Number_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_Object_Number_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_Object_Number_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_Object_Number_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_Object_Number_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_Object_Number_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_Object_Number_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_Object_to_Boolean_FunctionalOperator <em>Inherited From Object to Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Object to Boolean Functional Operator</em>'.
	 * @see qmm.InheritedFrom_Object_to_Boolean_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_Object_to_Boolean_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator <em>Char Sequence String Object Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * @see qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator
	 * @generated
	 */
	EClass getCharSequence_String_Object_CharSequence_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharSequence_String_Object_CharSequence_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getCharSequence_String_Object_CharSequence_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.AggregationOperator <em>Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Operator</em>'.
	 * @see qmm.AggregationOperator
	 * @generated
	 */
	EClass getAggregationOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_PrimitiveArgument <em>Integer Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Primitive Argument</em>'.
	 * @see qmm.Integer_PrimitiveArgument
	 * @generated
	 */
	EClass getInteger_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.Integer_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.Integer_PrimitiveArgument#getValue()
	 * @see #getInteger_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getInteger_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_FunctionalParameter <em>Char Sequence Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Functional Parameter</em>'.
	 * @see qmm.CharSequence_FunctionalParameter
	 * @generated
	 */
	EClass getCharSequence_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.CharSequence_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCharSequence_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_smallerThan_FunctionalOperator <em>Number Integer smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer smaller Than Functional Operator</em>'.
	 * @see qmm.Number_Integer_smallerThan_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_smallerThan_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Integer_smallerThan_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Integer_smallerThan_FunctionalOperator#getI()
	 * @see #getNumber_Integer_smallerThan_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Integer_smallerThan_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_smallerThan_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_smallerThan_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_smallerThan_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_smallerThan_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_smallerThan_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_smallerThan_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Character_toString_FunctionalOperator <em>Object Character to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Character to String Functional Operator</em>'.
	 * @see qmm.Object_Character_toString_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Character_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Character_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Character_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Character_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Character_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Character_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Character_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Person_Containment_OrGroup <em>Person Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Containment Or Group</em>'.
	 * @see qmm.Person_Containment_OrGroup
	 * @generated
	 */
	EClass getPerson_Containment_OrGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Person_Containment_OrGroup#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment</em>'.
	 * @see qmm.Person_Containment_OrGroup#getContainment()
	 * @see #getPerson_Containment_OrGroup()
	 * @generated
	 */
	EReference getPerson_Containment_OrGroup_Containment();

	/**
	 * Returns the meta object for class '{@link qmm.smallerEquals_FunctionalOperator <em>smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>smaller Equals Functional Operator</em>'.
	 * @see qmm.smallerEquals_FunctionalOperator
	 * @generated
	 */
	EClass getsmallerEquals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.smallerEquals_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.smallerEquals_FunctionalOperator#getI()
	 * @see #getsmallerEquals_FunctionalOperator()
	 * @generated
	 */
	EReference getsmallerEquals_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.smallerEquals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.smallerEquals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getsmallerEquals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.smallerEquals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.smallerEquals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getsmallerEquals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.PrimitiveArgument <em>Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Argument</em>'.
	 * @see qmm.PrimitiveArgument
	 * @generated
	 */
	EClass getPrimitiveArgument();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_FunctionalOperator <em>Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Functional Operator</em>'.
	 * @see qmm.Boolean_FunctionalOperator
	 * @generated
	 */
	EClass getBoolean_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Double_Or_BitOperator <em>Double Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Or Bit Operator</em>'.
	 * @see qmm.Double_Or_BitOperator
	 * @generated
	 */
	EClass getDouble_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Double_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Double_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getDouble_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Object_CharSequence_hashCode_FunctionalOperator <em>Object Char Sequence hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * @see qmm.Object_CharSequence_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getObject_CharSequence_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CharSequence_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_CharSequence_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_CharSequence_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CharSequence_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_CharSequence_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_CharSequence_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_PrimitiveArgument <em>Object Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Primitive Argument</em>'.
	 * @see qmm.Object_PrimitiveArgument
	 * @generated
	 */
	EClass getObject_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.Object_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.Object_PrimitiveArgument#getValue()
	 * @see #getObject_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getObject_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_ExpressionOperator <em>Boolean Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Operator</em>'.
	 * @see qmm.Boolean_ExpressionOperator
	 * @generated
	 */
	EClass getBoolean_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.AttributeEClass <em>Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute EClass</em>'.
	 * @see qmm.AttributeEClass
	 * @generated
	 */
	EClass getAttributeEClass();

	/**
	 * Returns the meta object for class '{@link qmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see qmm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link qmm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qmm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the '{@link qmm.NamedElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.NamedElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNamedElement__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.EvaluationBitOperator <em>Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Bit Operator</em>'.
	 * @see qmm.EvaluationBitOperator
	 * @generated
	 */
	EClass getEvaluationBitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.EvaluationBitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.EvaluationBitOperator#getConnects()
	 * @see #getEvaluationBitOperator()
	 * @generated
	 */
	EReference getEvaluationBitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.String_FunctionalType <em>String Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Functional Type</em>'.
	 * @see qmm.String_FunctionalType
	 * @generated
	 */
	EClass getString_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.String_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.String_FunctionalType#getOperator()
	 * @see #getString_FunctionalType()
	 * @generated
	 */
	EReference getString_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Calculateable <em>Object Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Calculateable</em>'.
	 * @see qmm.Object_Calculateable
	 * @generated
	 */
	EClass getObject_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.String_Operator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Operator</em>'.
	 * @see qmm.String_Operator
	 * @generated
	 */
	EClass getString_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Argument <em>Object Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Argument</em>'.
	 * @see qmm.Object_Argument
	 * @generated
	 */
	EClass getObject_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.String_Type <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see qmm.String_Type
	 * @generated
	 */
	EClass getString_Type();

	/**
	 * Returns the meta object for class '{@link qmm.compareToBoolean_FunctionalOperator <em>compare To Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>compare To Boolean Functional Operator</em>'.
	 * @see qmm.compareToBoolean_FunctionalOperator
	 * @generated
	 */
	EClass getcompareToBoolean_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.compareToBoolean_FunctionalOperator#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see qmm.compareToBoolean_FunctionalOperator#getB()
	 * @see #getcompareToBoolean_FunctionalOperator()
	 * @generated
	 */
	EReference getcompareToBoolean_FunctionalOperator_B();

	/**
	 * Returns the meta object for the '{@link qmm.compareToBoolean_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.compareToBoolean_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcompareToBoolean_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.compareToBoolean_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.compareToBoolean_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcompareToBoolean_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CountableReferenceParameter <em>Countable Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countable Reference Parameter</em>'.
	 * @see qmm.CountableReferenceParameter
	 * @generated
	 */
	EClass getCountableReferenceParameter();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CountableReferenceParameter#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see qmm.CountableReferenceParameter#getArgument()
	 * @see #getCountableReferenceParameter()
	 * @generated
	 */
	EReference getCountableReferenceParameter_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_FunctionalParameter <em>Integer Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Functional Parameter</em>'.
	 * @see qmm.Integer_FunctionalParameter
	 * @generated
	 */
	EClass getInteger_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Integer_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Integer_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInteger_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.String_FunctionalParameter <em>String Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Functional Parameter</em>'.
	 * @see qmm.String_FunctionalParameter
	 * @generated
	 */
	EClass getString_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.String_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.String_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getString_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Character_FunctionalParameter <em>Character Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Functional Parameter</em>'.
	 * @see qmm.Character_FunctionalParameter
	 * @generated
	 */
	EClass getCharacter_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Character_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Character_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCharacter_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Number_CalculateableParameter <em>Number Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Calculateable Parameter</em>'.
	 * @see qmm.Number_CalculateableParameter
	 * @generated
	 */
	EClass getNumber_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Number_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Number_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNumber_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_Object_Number_equals_FunctionalOperator <em>Number Double Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double Object Number equals Functional Operator</em>'.
	 * @see qmm.Number_Double_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_Object_Number_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Double_Object_Number_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.Number_Double_Object_Number_equals_FunctionalOperator#getObj()
	 * @see #getNumber_Double_Object_Number_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Double_Object_Number_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_Object_Number_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_Object_Number_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_Object_Number_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_Object_Number_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_Object_Number_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_Object_Number_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Person_name_AttrEClass <em>Person name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person name Attr EClass</em>'.
	 * @see qmm.Person_name_AttrEClass
	 * @generated
	 */
	EClass getPerson_name_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.length_FunctionalOperator <em>length Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>length Functional Operator</em>'.
	 * @see qmm.length_FunctionalOperator
	 * @generated
	 */
	EClass getlength_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.length_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.length_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getlength_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.length_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.length_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getlength_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.concat_FunctionalOperator <em>concat Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>concat Functional Operator</em>'.
	 * @see qmm.concat_FunctionalOperator
	 * @generated
	 */
	EClass getconcat_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.concat_FunctionalOperator#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Str</em>'.
	 * @see qmm.concat_FunctionalOperator#getStr()
	 * @see #getconcat_FunctionalOperator()
	 * @generated
	 */
	EReference getconcat_FunctionalOperator_Str();

	/**
	 * Returns the meta object for the '{@link qmm.concat_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.concat_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getconcat_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.concat_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.concat_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getconcat_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CourseType_AttributeEClass <em>Course Type Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Type Attribute EClass</em>'.
	 * @see qmm.CourseType_AttributeEClass
	 * @generated
	 */
	EClass getCourseType_AttributeEClass();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CourseType_AttributeEClass#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.CourseType_AttributeEClass#getOperator()
	 * @see #getCourseType_AttributeEClass()
	 * @generated
	 */
	EReference getCourseType_AttributeEClass_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Double_Argument <em>Double Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Argument</em>'.
	 * @see qmm.Double_Argument
	 * @generated
	 */
	EClass getDouble_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_Argument <em>Boolean Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Argument</em>'.
	 * @see qmm.Boolean_Argument
	 * @generated
	 */
	EClass getBoolean_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Number_FunctionalParameter <em>Number Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Functional Parameter</em>'.
	 * @see qmm.Number_FunctionalParameter
	 * @generated
	 */
	EClass getNumber_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Number_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Number_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNumber_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Reference_OrGroup <em>Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Or Group</em>'.
	 * @see qmm.Reference_OrGroup
	 * @generated
	 */
	EClass getReference_OrGroup();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_Operator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Operator</em>'.
	 * @see qmm.Integer_Operator
	 * @generated
	 */
	EClass getInteger_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator <em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * @see qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Character_BitOperator <em>Character Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Bit Operator</em>'.
	 * @see qmm.Character_BitOperator
	 * @generated
	 */
	EClass getCharacter_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Character_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.Character_BitOperator#getConnects()
	 * @see #getCharacter_BitOperator()
	 * @generated
	 */
	EReference getCharacter_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.indexOfChar_FunctionalOperator <em>index Of Char Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>index Of Char Functional Operator</em>'.
	 * @see qmm.indexOfChar_FunctionalOperator
	 * @generated
	 */
	EClass getindexOfChar_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.indexOfChar_FunctionalOperator#getCh <em>Ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ch</em>'.
	 * @see qmm.indexOfChar_FunctionalOperator#getCh()
	 * @see #getindexOfChar_FunctionalOperator()
	 * @generated
	 */
	EReference getindexOfChar_FunctionalOperator_Ch();

	/**
	 * Returns the meta object for the '{@link qmm.indexOfChar_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.indexOfChar_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getindexOfChar_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.indexOfChar_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.indexOfChar_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getindexOfChar_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.equalsIgnoreCase_FunctionalOperator <em>equals Ignore Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>equals Ignore Case Functional Operator</em>'.
	 * @see qmm.equalsIgnoreCase_FunctionalOperator
	 * @generated
	 */
	EClass getequalsIgnoreCase_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.equalsIgnoreCase_FunctionalOperator#getAnotherString <em>Another String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Another String</em>'.
	 * @see qmm.equalsIgnoreCase_FunctionalOperator#getAnotherString()
	 * @see #getequalsIgnoreCase_FunctionalOperator()
	 * @generated
	 */
	EReference getequalsIgnoreCase_FunctionalOperator_AnotherString();

	/**
	 * Returns the meta object for the '{@link qmm.equalsIgnoreCase_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.equalsIgnoreCase_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getequalsIgnoreCase_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.equalsIgnoreCase_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.equalsIgnoreCase_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getequalsIgnoreCase_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.ExpressionOperator <em>Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Operator</em>'.
	 * @see qmm.ExpressionOperator
	 * @generated
	 */
	EClass getExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_And_BitOperator <em>Boolean And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean And Bit Operator</em>'.
	 * @see qmm.Boolean_And_BitOperator
	 * @generated
	 */
	EClass getBoolean_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Boolean_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Boolean_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getBoolean_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_Object_to_Number_FunctionalOperator <em>Inherited From Object to Number Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Object to Number Functional Operator</em>'.
	 * @see qmm.InheritedFrom_Object_to_Number_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_Object_to_Number_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_PrimitiveArgument <em>Char Sequence Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Primitive Argument</em>'.
	 * @see qmm.CharSequence_PrimitiveArgument
	 * @generated
	 */
	EClass getCharSequence_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.CharSequence_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.CharSequence_PrimitiveArgument#getValue()
	 * @see #getCharSequence_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getCharSequence_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.EvaluationFunctionalOperator <em>Evaluation Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Functional Operator</em>'.
	 * @see qmm.EvaluationFunctionalOperator
	 * @generated
	 */
	EClass getEvaluationFunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_Object_Number_toString_FunctionalOperator <em>Number Integer Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * @see qmm.Number_Integer_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_Object_Number_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_Object_Number_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_Object_Number_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_Object_Number_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_Object_Number_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_Object_Number_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_Object_Number_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.isEmpty_FunctionalOperator <em>is Empty Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>is Empty Functional Operator</em>'.
	 * @see qmm.isEmpty_FunctionalOperator
	 * @generated
	 */
	EClass getisEmpty_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.isEmpty_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.isEmpty_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getisEmpty_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.isEmpty_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.isEmpty_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getisEmpty_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_Type <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see qmm.Integer_Type
	 * @generated
	 */
	EClass getInteger_Type();

	/**
	 * Returns the meta object for class '{@link qmm.toString_FunctionalOperator <em>to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>to String Functional Operator</em>'.
	 * @see qmm.toString_FunctionalOperator
	 * @generated
	 */
	EClass gettoString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation gettoString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation gettoString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Number_hashCode_FunctionalOperator <em>Object Number hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Number hash Code Functional Operator</em>'.
	 * @see qmm.Object_Number_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Number_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Number_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Number_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Number_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Number_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Number_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Number_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Type <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see qmm.Object_Type
	 * @generated
	 */
	EClass getObject_Type();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_EvaluationOperation_Argument <em>Char Sequence Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Evaluation Operation Argument</em>'.
	 * @see qmm.CharSequence_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getCharSequence_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Student_Containment_OrGroup <em>Student Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student Containment Or Group</em>'.
	 * @see qmm.Student_Containment_OrGroup
	 * @generated
	 */
	EClass getStudent_Containment_OrGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Student_Containment_OrGroup#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment</em>'.
	 * @see qmm.Student_Containment_OrGroup#getContainment()
	 * @see #getStudent_Containment_OrGroup()
	 * @generated
	 */
	EReference getStudent_Containment_OrGroup_Containment();

	/**
	 * Returns the meta object for class '{@link qmm.Character_ExpressionOperator <em>Character Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Expression Operator</em>'.
	 * @see qmm.Character_ExpressionOperator
	 * @generated
	 */
	EClass getCharacter_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.hashCode_FunctionalOperator <em>hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>hash Code Functional Operator</em>'.
	 * @see qmm.hashCode_FunctionalOperator
	 * @generated
	 */
	EClass gethashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation gethashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation gethashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.IntegerParseInt_ClassOperator <em>Integer Parse Int Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Parse Int Class Operator</em>'.
	 * @see qmm.IntegerParseInt_ClassOperator
	 * @generated
	 */
	EClass getIntegerParseInt_ClassOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.IntegerParseInt_ClassOperator#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.IntegerParseInt_ClassOperator#getCalculateable()
	 * @see #getIntegerParseInt_ClassOperator()
	 * @generated
	 */
	EReference getIntegerParseInt_ClassOperator_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.IntegerParseInt_ClassOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.IntegerParseInt_ClassOperator#getLiteral()
	 * @generated
	 */
	EOperation getIntegerParseInt_ClassOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.IntegerParseInt_ClassOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.IntegerParseInt_ClassOperator#getAllParameters()
	 * @generated
	 */
	EOperation getIntegerParseInt_ClassOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CourseType_CalculateableElement <em>Course Type Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Type Calculateable Element</em>'.
	 * @see qmm.CourseType_CalculateableElement
	 * @generated
	 */
	EClass getCourseType_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.CountingAggregationOperator <em>Counting Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counting Aggregation Operator</em>'.
	 * @see qmm.CountingAggregationOperator
	 * @generated
	 */
	EClass getCountingAggregationOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CountingAggregationOperator#getCountable <em>Countable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Countable</em>'.
	 * @see qmm.CountingAggregationOperator#getCountable()
	 * @see #getCountingAggregationOperator()
	 * @generated
	 */
	EReference getCountingAggregationOperator_Countable();

	/**
	 * Returns the meta object for the '{@link qmm.CountingAggregationOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.CountingAggregationOperator#getAllParameters()
	 * @generated
	 */
	EOperation getCountingAggregationOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Exam_Reference_OrGroup <em>Exam Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Reference Or Group</em>'.
	 * @see qmm.Exam_Reference_OrGroup
	 * @generated
	 */
	EClass getExam_Reference_OrGroup();

	/**
	 * Returns the meta object for the reference list '{@link qmm.Exam_Reference_OrGroup#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see qmm.Exam_Reference_OrGroup#getReference()
	 * @see #getExam_Reference_OrGroup()
	 * @generated
	 */
	EReference getExam_Reference_OrGroup_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Exam_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Exam_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExam_Reference_OrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.OrGroup <em>Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Group</em>'.
	 * @see qmm.OrGroup
	 * @generated
	 */
	EClass getOrGroup();

	/**
	 * Returns the meta object for the attribute '{@link qmm.OrGroup#isTransitive <em>Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive</em>'.
	 * @see qmm.OrGroup#isTransitive()
	 * @see #getOrGroup()
	 * @generated
	 */
	EAttribute getOrGroup_Transitive();

	/**
	 * Returns the meta object for the '{@link qmm.OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Professor_Reference_OrGroup <em>Professor Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor Reference Or Group</em>'.
	 * @see qmm.Professor_Reference_OrGroup
	 * @generated
	 */
	EClass getProfessor_Reference_OrGroup();

	/**
	 * Returns the meta object for the reference list '{@link qmm.Professor_Reference_OrGroup#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see qmm.Professor_Reference_OrGroup#getReference()
	 * @see #getProfessor_Reference_OrGroup()
	 * @generated
	 */
	EReference getProfessor_Reference_OrGroup_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Professor_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Professor_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProfessor_Reference_OrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.smallerThan_FunctionalOperator <em>smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>smaller Than Functional Operator</em>'.
	 * @see qmm.smallerThan_FunctionalOperator
	 * @generated
	 */
	EClass getsmallerThan_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.smallerThan_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.smallerThan_FunctionalOperator#getI()
	 * @see #getsmallerThan_FunctionalOperator()
	 * @generated
	 */
	EReference getsmallerThan_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.smallerThan_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.smallerThan_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getsmallerThan_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.smallerThan_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.smallerThan_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getsmallerThan_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_Type <em>Char Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Type</em>'.
	 * @see qmm.CharSequence_Type
	 * @generated
	 */
	EClass getCharSequence_Type();

	/**
	 * Returns the meta object for class '{@link qmm.String_ExpressionOperator <em>String Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression Operator</em>'.
	 * @see qmm.String_ExpressionOperator
	 * @generated
	 */
	EClass getString_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Or_EvaluationBitOperator <em>Or Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Evaluation Bit Operator</em>'.
	 * @see qmm.Or_EvaluationBitOperator
	 * @generated
	 */
	EClass getOr_EvaluationBitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Or_EvaluationBitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Or_EvaluationBitOperator#getLiteral()
	 * @generated
	 */
	EOperation getOr_EvaluationBitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Character_Type <em>Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Type</em>'.
	 * @see qmm.Character_Type
	 * @generated
	 */
	EClass getCharacter_Type();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_CalculateableParameter <em>Char Sequence Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Calculateable Parameter</em>'.
	 * @see qmm.CharSequence_CalculateableParameter
	 * @generated
	 */
	EClass getCharSequence_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.CharSequence_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCharSequence_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Character_And_BitOperator <em>Character And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character And Bit Operator</em>'.
	 * @see qmm.Character_And_BitOperator
	 * @generated
	 */
	EClass getCharacter_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Character_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Character_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharacter_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.String_Calculateable <em>String Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Calculateable</em>'.
	 * @see qmm.String_Calculateable
	 * @generated
	 */
	EClass getString_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.Character_Operator <em>Character Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Operator</em>'.
	 * @see qmm.Character_Operator
	 * @generated
	 */
	EClass getCharacter_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Type <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Type</em>'.
	 * @see qmm.Number_Type
	 * @generated
	 */
	EClass getNumber_Type();

	/**
	 * Returns the meta object for class '{@link qmm.codePointAt_FunctionalOperator <em>code Point At Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>code Point At Functional Operator</em>'.
	 * @see qmm.codePointAt_FunctionalOperator
	 * @generated
	 */
	EClass getcodePointAt_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.codePointAt_FunctionalOperator#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see qmm.codePointAt_FunctionalOperator#getIndex()
	 * @see #getcodePointAt_FunctionalOperator()
	 * @generated
	 */
	EReference getcodePointAt_FunctionalOperator_Index();

	/**
	 * Returns the meta object for the '{@link qmm.codePointAt_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.codePointAt_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcodePointAt_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.codePointAt_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.codePointAt_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcodePointAt_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_BitOperator <em>Integer Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Bit Operator</em>'.
	 * @see qmm.Integer_BitOperator
	 * @generated
	 */
	EClass getInteger_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Integer_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.Integer_BitOperator#getConnects()
	 * @see #getInteger_BitOperator()
	 * @generated
	 */
	EReference getInteger_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Number_toString_FunctionalOperator <em>Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Number to String Functional Operator</em>'.
	 * @see qmm.Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Number_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Number_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Number_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Number_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Number_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Number_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Number_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.String_Or_BitOperator <em>String Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Or Bit Operator</em>'.
	 * @see qmm.String_Or_BitOperator
	 * @generated
	 */
	EClass getString_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.String_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.String_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getString_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Number_BitOperator <em>Number Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Bit Operator</em>'.
	 * @see qmm.Number_BitOperator
	 * @generated
	 */
	EClass getNumber_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Number_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.Number_BitOperator#getConnects()
	 * @see #getNumber_BitOperator()
	 * @generated
	 */
	EReference getNumber_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.SelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Clause</em>'.
	 * @see qmm.SelectClause
	 * @generated
	 */
	EClass getSelectClause();

	/**
	 * Returns the meta object for the reference list '{@link qmm.SelectClause#getNamedElements <em>Named Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Named Elements</em>'.
	 * @see qmm.SelectClause#getNamedElements()
	 * @see #getSelectClause()
	 * @generated
	 */
	EReference getSelectClause_NamedElements();

	/**
	 * Returns the meta object for the '{@link qmm.SelectClause#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.SelectClause#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSelectClause__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Number_PrimitiveArgument <em>Number Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Primitive Argument</em>'.
	 * @see qmm.Number_PrimitiveArgument
	 * @generated
	 */
	EClass getNumber_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.Number_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.Number_PrimitiveArgument#getValue()
	 * @see #getNumber_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getNumber_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.Max_AggregationOperator_Double <em>Max Aggregation Operator Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Aggregation Operator Double</em>'.
	 * @see qmm.Max_AggregationOperator_Double
	 * @generated
	 */
	EClass getMax_AggregationOperator_Double();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Max_AggregationOperator_Double#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.Max_AggregationOperator_Double#getCalculateable()
	 * @see #getMax_AggregationOperator_Double()
	 * @generated
	 */
	EReference getMax_AggregationOperator_Double_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.Max_AggregationOperator_Double#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Max_AggregationOperator_Double#getLiteral()
	 * @generated
	 */
	EOperation getMax_AggregationOperator_Double__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Max_AggregationOperator_Double#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Max_AggregationOperator_Double#getAllParameters()
	 * @generated
	 */
	EOperation getMax_AggregationOperator_Double__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.And_EvaluationBitOperator <em>And Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Evaluation Bit Operator</em>'.
	 * @see qmm.And_EvaluationBitOperator
	 * @generated
	 */
	EClass getAnd_EvaluationBitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.And_EvaluationBitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.And_EvaluationBitOperator#getLiteral()
	 * @generated
	 */
	EOperation getAnd_EvaluationBitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_Object_to_Character_FunctionalOperator <em>Inherited From Object to Character Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Object to Character Functional Operator</em>'.
	 * @see qmm.InheritedFrom_Object_to_Character_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_Object_to_Character_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Calculateable <em>Number Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Calculateable</em>'.
	 * @see qmm.Number_Calculateable
	 * @generated
	 */
	EClass getNumber_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.String_CalculateableElementReferenceArgument <em>String Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Calculateable Element Reference Argument</em>'.
	 * @see qmm.String_CalculateableElementReferenceArgument
	 * @generated
	 */
	EClass getString_CalculateableElementReferenceArgument();

	/**
	 * Returns the meta object for the reference '{@link qmm.String_CalculateableElementReferenceArgument#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see qmm.String_CalculateableElementReferenceArgument#getReference()
	 * @see #getString_CalculateableElementReferenceArgument()
	 * @generated
	 */
	EReference getString_CalculateableElementReferenceArgument_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.String_CalculateableElementReferenceArgument#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.String_CalculateableElementReferenceArgument#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getString_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.offsetByCodePoints_FunctionalOperator <em>offset By Code Points Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>offset By Code Points Functional Operator</em>'.
	 * @see qmm.offsetByCodePoints_FunctionalOperator
	 * @generated
	 */
	EClass getoffsetByCodePoints_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.offsetByCodePoints_FunctionalOperator#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see qmm.offsetByCodePoints_FunctionalOperator#getIndex()
	 * @see #getoffsetByCodePoints_FunctionalOperator()
	 * @generated
	 */
	EReference getoffsetByCodePoints_FunctionalOperator_Index();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.offsetByCodePoints_FunctionalOperator#getCodePointOffset <em>Code Point Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Point Offset</em>'.
	 * @see qmm.offsetByCodePoints_FunctionalOperator#getCodePointOffset()
	 * @see #getoffsetByCodePoints_FunctionalOperator()
	 * @generated
	 */
	EReference getoffsetByCodePoints_FunctionalOperator_CodePointOffset();

	/**
	 * Returns the meta object for the '{@link qmm.offsetByCodePoints_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.offsetByCodePoints_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getoffsetByCodePoints_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.offsetByCodePoints_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.offsetByCodePoints_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getoffsetByCodePoints_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Argument <em>Number Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Argument</em>'.
	 * @see qmm.Number_Argument
	 * @generated
	 */
	EClass getNumber_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Object_FunctionalOperator <em>Object Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Functional Operator</em>'.
	 * @see qmm.Object_FunctionalOperator
	 * @generated
	 */
	EClass getObject_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.String_Argument <em>String Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Argument</em>'.
	 * @see qmm.String_Argument
	 * @generated
	 */
	EClass getString_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.indexOfCharFromIndex_FunctionalOperator <em>index Of Char From Index Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>index Of Char From Index Functional Operator</em>'.
	 * @see qmm.indexOfCharFromIndex_FunctionalOperator
	 * @generated
	 */
	EClass getindexOfCharFromIndex_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.indexOfCharFromIndex_FunctionalOperator#getCh <em>Ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ch</em>'.
	 * @see qmm.indexOfCharFromIndex_FunctionalOperator#getCh()
	 * @see #getindexOfCharFromIndex_FunctionalOperator()
	 * @generated
	 */
	EReference getindexOfCharFromIndex_FunctionalOperator_Ch();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.indexOfCharFromIndex_FunctionalOperator#getFromIndex <em>From Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Index</em>'.
	 * @see qmm.indexOfCharFromIndex_FunctionalOperator#getFromIndex()
	 * @see #getindexOfCharFromIndex_FunctionalOperator()
	 * @generated
	 */
	EReference getindexOfCharFromIndex_FunctionalOperator_FromIndex();

	/**
	 * Returns the meta object for the '{@link qmm.indexOfCharFromIndex_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.indexOfCharFromIndex_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getindexOfCharFromIndex_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.indexOfCharFromIndex_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.indexOfCharFromIndex_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getindexOfCharFromIndex_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Double_EvaluationOperation_Argument <em>Double Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Evaluation Operation Argument</em>'.
	 * @see qmm.Double_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getDouble_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Number_And_BitOperator <em>Number And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number And Bit Operator</em>'.
	 * @see qmm.Number_And_BitOperator
	 * @generated
	 */
	EClass getNumber_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Number_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Countable <em>Countable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countable</em>'.
	 * @see qmm.Countable
	 * @generated
	 */
	EClass getCountable();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_FunctionalType <em>Boolean Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Functional Type</em>'.
	 * @see qmm.Boolean_FunctionalType
	 * @generated
	 */
	EClass getBoolean_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Boolean_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Boolean_FunctionalType#getOperator()
	 * @see #getBoolean_FunctionalType()
	 * @generated
	 */
	EReference getBoolean_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.CalculateableElement_ReferenceArgument <em>Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculateable Element Reference Argument</em>'.
	 * @see qmm.CalculateableElement_ReferenceArgument
	 * @generated
	 */
	EClass getCalculateableElement_ReferenceArgument();

	/**
	 * Returns the meta object for class '{@link qmm.endsWith_FunctionalOperator <em>ends With Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ends With Functional Operator</em>'.
	 * @see qmm.endsWith_FunctionalOperator
	 * @generated
	 */
	EClass getendsWith_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.endsWith_FunctionalOperator#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see qmm.endsWith_FunctionalOperator#getSuffix()
	 * @see #getendsWith_FunctionalOperator()
	 * @generated
	 */
	EReference getendsWith_FunctionalOperator_Suffix();

	/**
	 * Returns the meta object for the '{@link qmm.endsWith_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.endsWith_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getendsWith_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.endsWith_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.endsWith_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getendsWith_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.startsWithOffset_FunctionalOperator <em>starts With Offset Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>starts With Offset Functional Operator</em>'.
	 * @see qmm.startsWithOffset_FunctionalOperator
	 * @generated
	 */
	EClass getstartsWithOffset_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.startsWithOffset_FunctionalOperator#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see qmm.startsWithOffset_FunctionalOperator#getPrefix()
	 * @see #getstartsWithOffset_FunctionalOperator()
	 * @generated
	 */
	EReference getstartsWithOffset_FunctionalOperator_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.startsWithOffset_FunctionalOperator#getToffset <em>Toffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toffset</em>'.
	 * @see qmm.startsWithOffset_FunctionalOperator#getToffset()
	 * @see #getstartsWithOffset_FunctionalOperator()
	 * @generated
	 */
	EReference getstartsWithOffset_FunctionalOperator_Toffset();

	/**
	 * Returns the meta object for the '{@link qmm.startsWithOffset_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.startsWithOffset_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getstartsWithOffset_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.startsWithOffset_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.startsWithOffset_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getstartsWithOffset_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Number_FunctionalOperator <em>Number Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Functional Operator</em>'.
	 * @see qmm.Number_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.FindQueryCollection <em>Find Query Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Query Collection</em>'.
	 * @see qmm.FindQueryCollection
	 * @generated
	 */
	EClass getFindQueryCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.FindQueryCollection#getFindQueries <em>Find Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Find Queries</em>'.
	 * @see qmm.FindQueryCollection#getFindQueries()
	 * @see #getFindQueryCollection()
	 * @generated
	 */
	EReference getFindQueryCollection_FindQueries();

	/**
	 * Returns the meta object for class '{@link qmm.Professor_Containment_OrGroup <em>Professor Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor Containment Or Group</em>'.
	 * @see qmm.Professor_Containment_OrGroup
	 * @generated
	 */
	EClass getProfessor_Containment_OrGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Professor_Containment_OrGroup#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment</em>'.
	 * @see qmm.Professor_Containment_OrGroup#getContainment()
	 * @see #getProfessor_Containment_OrGroup()
	 * @generated
	 */
	EReference getProfessor_Containment_OrGroup_Containment();

	/**
	 * Returns the meta object for class '{@link qmm.Number_CalculateableElement <em>Number Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Calculateable Element</em>'.
	 * @see qmm.Number_CalculateableElement
	 * @generated
	 */
	EClass getNumber_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Double_BitOperator <em>Double Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Bit Operator</em>'.
	 * @see qmm.Double_BitOperator
	 * @generated
	 */
	EClass getDouble_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Double_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.Double_BitOperator#getConnects()
	 * @see #getDouble_BitOperator()
	 * @generated
	 */
	EReference getDouble_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.Course_courseType_AttrEClass <em>Course course Type Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course course Type Attr EClass</em>'.
	 * @see qmm.Course_courseType_AttrEClass
	 * @generated
	 */
	EClass getCourse_courseType_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Character_CalculateableElement <em>Character Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Calculateable Element</em>'.
	 * @see qmm.Character_CalculateableElement
	 * @generated
	 */
	EClass getCharacter_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_CalculateableParameter <em>Boolean Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Calculateable Parameter</em>'.
	 * @see qmm.Boolean_CalculateableParameter
	 * @generated
	 */
	EClass getBoolean_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Boolean_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Boolean_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBoolean_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Character_FunctionalOperator <em>Character Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Functional Operator</em>'.
	 * @see qmm.Character_FunctionalOperator
	 * @generated
	 */
	EClass getCharacter_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Character_CalculateableParameter <em>Character Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Calculateable Parameter</em>'.
	 * @see qmm.Character_CalculateableParameter
	 * @generated
	 */
	EClass getCharacter_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Character_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Character_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCharacter_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.RegularAttributeEClass <em>Regular Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Attribute EClass</em>'.
	 * @see qmm.RegularAttributeEClass
	 * @generated
	 */
	EClass getRegularAttributeEClass();

	/**
	 * Returns the meta object for the '{@link qmm.RegularAttributeEClass#validateCheckExpression(java.lang.Object) <em>Validate Check Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Check Expression</em>' operation.
	 * @see qmm.RegularAttributeEClass#validateCheckExpression(java.lang.Object)
	 * @generated
	 */
	EOperation getRegularAttributeEClass__ValidateCheckExpression__Object();

	/**
	 * Returns the meta object for class '{@link qmm.String_BitOperator <em>String Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Bit Operator</em>'.
	 * @see qmm.String_BitOperator
	 * @generated
	 */
	EClass getString_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.String_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.String_BitOperator#getConnects()
	 * @see #getString_BitOperator()
	 * @generated
	 */
	EReference getString_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.Character_Argument <em>Character Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Argument</em>'.
	 * @see qmm.Character_Argument
	 * @generated
	 */
	EClass getCharacter_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Person_Reference_OrGroup <em>Person Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Reference Or Group</em>'.
	 * @see qmm.Person_Reference_OrGroup
	 * @generated
	 */
	EClass getPerson_Reference_OrGroup();

	/**
	 * Returns the meta object for the reference list '{@link qmm.Person_Reference_OrGroup#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see qmm.Person_Reference_OrGroup#getReference()
	 * @see #getPerson_Reference_OrGroup()
	 * @generated
	 */
	EReference getPerson_Reference_OrGroup_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Person_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Person_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPerson_Reference_OrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_CalculateableElement <em>Char Sequence Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Calculateable Element</em>'.
	 * @see qmm.CharSequence_CalculateableElement
	 * @generated
	 */
	EClass getCharSequence_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_FunctionalOperator <em>Char Sequence Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Functional Operator</em>'.
	 * @see qmm.CharSequence_FunctionalOperator
	 * @generated
	 */
	EClass getCharSequence_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Character_PrimitiveArgument <em>Character Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Primitive Argument</em>'.
	 * @see qmm.Character_PrimitiveArgument
	 * @generated
	 */
	EClass getCharacter_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.Character_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.Character_PrimitiveArgument#getValue()
	 * @see #getCharacter_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getCharacter_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_ExpressionOperator <em>Integer Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression Operator</em>'.
	 * @see qmm.Integer_ExpressionOperator
	 * @generated
	 */
	EClass getInteger_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_Type <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see qmm.Boolean_Type
	 * @generated
	 */
	EClass getBoolean_Type();

	/**
	 * Returns the meta object for class '{@link qmm.parseBoolean_FunctionalOperator <em>parse Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>parse Boolean Functional Operator</em>'.
	 * @see qmm.parseBoolean_FunctionalOperator
	 * @generated
	 */
	EClass getparseBoolean_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.parseBoolean_FunctionalOperator#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see qmm.parseBoolean_FunctionalOperator#getS()
	 * @see #getparseBoolean_FunctionalOperator()
	 * @generated
	 */
	EReference getparseBoolean_FunctionalOperator_S();

	/**
	 * Returns the meta object for the '{@link qmm.parseBoolean_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.parseBoolean_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getparseBoolean_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.parseBoolean_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.parseBoolean_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getparseBoolean_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_greaterThan_FunctionalOperator <em>Number Integer greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer greater Than Functional Operator</em>'.
	 * @see qmm.Number_Integer_greaterThan_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_greaterThan_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Integer_greaterThan_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Integer_greaterThan_FunctionalOperator#getI()
	 * @see #getNumber_Integer_greaterThan_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Integer_greaterThan_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_greaterThan_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_greaterThan_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_greaterThan_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_greaterThan_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_greaterThan_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_greaterThan_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_Number_to_Double_FunctionalOperator <em>Inherited From Number to Double Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Number to Double Functional Operator</em>'.
	 * @see qmm.InheritedFrom_Number_to_Double_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_Number_to_Double_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.EvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Operator</em>'.
	 * @see qmm.EvaluationOperator
	 * @generated
	 */
	EClass getEvaluationOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Person_email_AttrEClass <em>Person email Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person email Attr EClass</em>'.
	 * @see qmm.Person_email_AttrEClass
	 * @generated
	 */
	EClass getPerson_email_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_AttributeEClass <em>Integer Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Attribute EClass</em>'.
	 * @see qmm.Integer_AttributeEClass
	 * @generated
	 */
	EClass getInteger_AttributeEClass();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Integer_AttributeEClass#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Integer_AttributeEClass#getOperator()
	 * @see #getInteger_AttributeEClass()
	 * @generated
	 */
	EReference getInteger_AttributeEClass_Operator();

	/**
	 * Returns the meta object for the '{@link qmm.Integer_AttributeEClass#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Integer_AttributeEClass#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInteger_AttributeEClass__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.CourseType_EnumerationOperator <em>Course Type Enumeration Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Type Enumeration Operator</em>'.
	 * @see qmm.CourseType_EnumerationOperator
	 * @generated
	 */
	EClass getCourseType_EnumerationOperator();

	/**
	 * Returns the meta object for the attribute '{@link qmm.CourseType_EnumerationOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument</em>'.
	 * @see qmm.CourseType_EnumerationOperator#getArgument()
	 * @see #getCourseType_EnumerationOperator()
	 * @generated
	 */
	EAttribute getCourseType_EnumerationOperator_Argument();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CourseType_EnumerationOperator#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see qmm.CourseType_EnumerationOperator#getOr()
	 * @see #getCourseType_EnumerationOperator()
	 * @generated
	 */
	EReference getCourseType_EnumerationOperator_Or();

	/**
	 * Returns the meta object for class '{@link qmm.Max_AggregationOperator_Integer <em>Max Aggregation Operator Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Aggregation Operator Integer</em>'.
	 * @see qmm.Max_AggregationOperator_Integer
	 * @generated
	 */
	EClass getMax_AggregationOperator_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Max_AggregationOperator_Integer#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.Max_AggregationOperator_Integer#getCalculateable()
	 * @see #getMax_AggregationOperator_Integer()
	 * @generated
	 */
	EReference getMax_AggregationOperator_Integer_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.Max_AggregationOperator_Integer#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Max_AggregationOperator_Integer#getLiteral()
	 * @generated
	 */
	EOperation getMax_AggregationOperator_Integer__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Max_AggregationOperator_Integer#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Max_AggregationOperator_Integer#getAllParameters()
	 * @generated
	 */
	EOperation getMax_AggregationOperator_Integer__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_Original_FunctionalOperator <em>Char Sequence Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Original Functional Operator</em>'.
	 * @see qmm.CharSequence_Original_FunctionalOperator
	 * @generated
	 */
	EClass getCharSequence_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.GeneralizableElement <em>Generalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalizable Element</em>'.
	 * @see qmm.GeneralizableElement
	 * @generated
	 */
	EClass getGeneralizableElement();

	/**
	 * Returns the meta object for the attribute '{@link qmm.GeneralizableElement#isGeneralized <em>Generalized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generalized</em>'.
	 * @see qmm.GeneralizableElement#isGeneralized()
	 * @see #getGeneralizableElement()
	 * @generated
	 */
	EAttribute getGeneralizableElement_Generalized();

	/**
	 * Returns the meta object for class '{@link qmm.Course_Containment_OrGroup <em>Course Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Containment Or Group</em>'.
	 * @see qmm.Course_Containment_OrGroup
	 * @generated
	 */
	EClass getCourse_Containment_OrGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Course_Containment_OrGroup#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment</em>'.
	 * @see qmm.Course_Containment_OrGroup#getContainment()
	 * @see #getCourse_Containment_OrGroup()
	 * @generated
	 */
	EReference getCourse_Containment_OrGroup_Containment();

	/**
	 * Returns the meta object for class '{@link qmm.Double_FunctionalType <em>Double Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Functional Type</em>'.
	 * @see qmm.Double_FunctionalType
	 * @generated
	 */
	EClass getDouble_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Double_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Double_FunctionalType#getOperator()
	 * @see #getDouble_FunctionalType()
	 * @generated
	 */
	EReference getDouble_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Object_FunctionalType <em>Object Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Functional Type</em>'.
	 * @see qmm.Object_FunctionalType
	 * @generated
	 */
	EClass getObject_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Object_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Object_FunctionalType#getOperator()
	 * @see #getObject_FunctionalType()
	 * @generated
	 */
	EReference getObject_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.ClassOperator <em>Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operator</em>'.
	 * @see qmm.ClassOperator
	 * @generated
	 */
	EClass getClassOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_FunctionalType <em>Integer Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Functional Type</em>'.
	 * @see qmm.Integer_FunctionalType
	 * @generated
	 */
	EClass getInteger_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Integer_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Integer_FunctionalType#getOperator()
	 * @see #getInteger_FunctionalType()
	 * @generated
	 */
	EReference getInteger_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.String_AttributeEClass <em>String Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Attribute EClass</em>'.
	 * @see qmm.String_AttributeEClass
	 * @generated
	 */
	EClass getString_AttributeEClass();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.String_AttributeEClass#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.String_AttributeEClass#getOperator()
	 * @see #getString_AttributeEClass()
	 * @generated
	 */
	EReference getString_AttributeEClass_Operator();

	/**
	 * Returns the meta object for the '{@link qmm.String_AttributeEClass#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.String_AttributeEClass#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getString_AttributeEClass__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_PrimitiveArgument <em>Boolean Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Primitive Argument</em>'.
	 * @see qmm.Boolean_PrimitiveArgument
	 * @generated
	 */
	EClass getBoolean_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.Boolean_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.Boolean_PrimitiveArgument#getValue()
	 * @see #getBoolean_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getBoolean_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.String_EvaluationOperation_Argument <em>String Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Evaluation Operation Argument</em>'.
	 * @see qmm.String_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getString_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_CalculateableElement <em>Integer Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculateable Element</em>'.
	 * @see qmm.Integer_CalculateableElement
	 * @generated
	 */
	EClass getInteger_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Sum_AggregationOperator_Integer <em>Sum Aggregation Operator Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Aggregation Operator Integer</em>'.
	 * @see qmm.Sum_AggregationOperator_Integer
	 * @generated
	 */
	EClass getSum_AggregationOperator_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Sum_AggregationOperator_Integer#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.Sum_AggregationOperator_Integer#getCalculateable()
	 * @see #getSum_AggregationOperator_Integer()
	 * @generated
	 */
	EReference getSum_AggregationOperator_Integer_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.Sum_AggregationOperator_Integer#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Sum_AggregationOperator_Integer#getLiteral()
	 * @generated
	 */
	EOperation getSum_AggregationOperator_Integer__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Sum_AggregationOperator_Integer#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Sum_AggregationOperator_Integer#getAllParameters()
	 * @generated
	 */
	EOperation getSum_AggregationOperator_Integer__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see qmm.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link qmm.FunctionalParameter <em>Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Parameter</em>'.
	 * @see qmm.FunctionalParameter
	 * @generated
	 */
	EClass getFunctionalParameter();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.FunctionalParameter#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see qmm.FunctionalParameter#getArgument()
	 * @see #getFunctionalParameter()
	 * @generated
	 */
	EReference getFunctionalParameter_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.EnumerationOperator <em>Enumeration Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Operator</em>'.
	 * @see qmm.EnumerationOperator
	 * @generated
	 */
	EClass getEnumerationOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_greaterEquals_FunctionalOperator <em>Number Double greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double greater Equals Functional Operator</em>'.
	 * @see qmm.Number_Double_greaterEquals_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_greaterEquals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Double_greaterEquals_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Double_greaterEquals_FunctionalOperator#getI()
	 * @see #getNumber_Double_greaterEquals_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Double_greaterEquals_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_greaterEquals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_greaterEquals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_greaterEquals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_greaterEquals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_greaterEquals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_greaterEquals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_CalculateableParameter <em>Integer Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculateable Parameter</em>'.
	 * @see qmm.Integer_CalculateableParameter
	 * @generated
	 */
	EClass getInteger_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Integer_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Integer_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInteger_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_FunctionalType <em>Char Sequence Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Functional Type</em>'.
	 * @see qmm.CharSequence_FunctionalType
	 * @generated
	 */
	EClass getCharSequence_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CharSequence_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.CharSequence_FunctionalType#getOperator()
	 * @see #getCharSequence_FunctionalType()
	 * @generated
	 */
	EReference getCharSequence_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.String_CalculateableElement <em>String Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Calculateable Element</em>'.
	 * @see qmm.String_CalculateableElement
	 * @generated
	 */
	EClass getString_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_Number_to_Integer_FunctionalOperator <em>Inherited From Number to Integer Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Number to Integer Functional Operator</em>'.
	 * @see qmm.InheritedFrom_Number_to_Integer_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_Number_to_Integer_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_String_length_FunctionalOperator <em>Char Sequence String length Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence String length Functional Operator</em>'.
	 * @see qmm.CharSequence_String_length_FunctionalOperator
	 * @generated
	 */
	EClass getCharSequence_String_length_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_length_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.CharSequence_String_length_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharSequence_String_length_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_length_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.CharSequence_String_length_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getCharSequence_String_length_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_Calculateable <em>Char Sequence Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Calculateable</em>'.
	 * @see qmm.CharSequence_Calculateable
	 * @generated
	 */
	EClass getCharSequence_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_ExpressionOperator <em>Char Sequence Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Expression Operator</em>'.
	 * @see qmm.CharSequence_ExpressionOperator
	 * @generated
	 */
	EClass getCharSequence_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.indexOfString_FunctionalOperator <em>index Of String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>index Of String Functional Operator</em>'.
	 * @see qmm.indexOfString_FunctionalOperator
	 * @generated
	 */
	EClass getindexOfString_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.indexOfString_FunctionalOperator#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Str</em>'.
	 * @see qmm.indexOfString_FunctionalOperator#getStr()
	 * @see #getindexOfString_FunctionalOperator()
	 * @generated
	 */
	EReference getindexOfString_FunctionalOperator_Str();

	/**
	 * Returns the meta object for the '{@link qmm.indexOfString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.indexOfString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getindexOfString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.indexOfString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.indexOfString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getindexOfString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.trim_FunctionalOperator <em>trim Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>trim Functional Operator</em>'.
	 * @see qmm.trim_FunctionalOperator
	 * @generated
	 */
	EClass gettrim_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.trim_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.trim_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation gettrim_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.trim_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.trim_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation gettrim_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.greaterEquals_FunctionalOperator <em>greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>greater Equals Functional Operator</em>'.
	 * @see qmm.greaterEquals_FunctionalOperator
	 * @generated
	 */
	EClass getgreaterEquals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.greaterEquals_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.greaterEquals_FunctionalOperator#getI()
	 * @see #getgreaterEquals_FunctionalOperator()
	 * @generated
	 */
	EReference getgreaterEquals_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.greaterEquals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.greaterEquals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getgreaterEquals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.greaterEquals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.greaterEquals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getgreaterEquals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Student_Reference_OrGroup <em>Student Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student Reference Or Group</em>'.
	 * @see qmm.Student_Reference_OrGroup
	 * @generated
	 */
	EClass getStudent_Reference_OrGroup();

	/**
	 * Returns the meta object for the reference list '{@link qmm.Student_Reference_OrGroup#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see qmm.Student_Reference_OrGroup#getReference()
	 * @see #getStudent_Reference_OrGroup()
	 * @generated
	 */
	EReference getStudent_Reference_OrGroup_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Student_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Student_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStudent_Reference_OrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.String_And_BitOperator <em>String And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String And Bit Operator</em>'.
	 * @see qmm.String_And_BitOperator
	 * @generated
	 */
	EClass getString_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.String_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.String_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getString_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.CalculateableElement <em>Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculateable Element</em>'.
	 * @see qmm.CalculateableElement
	 * @generated
	 */
	EClass getCalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Course_courseNumber_AttrEClass <em>Course course Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course course Number Attr EClass</em>'.
	 * @see qmm.Course_courseNumber_AttrEClass
	 * @generated
	 */
	EClass getCourse_courseNumber_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_EvaluationOperation_Argument <em>Boolean Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Evaluation Operation Argument</em>'.
	 * @see qmm.Boolean_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getBoolean_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.greaterThan_FunctionalOperator <em>greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>greater Than Functional Operator</em>'.
	 * @see qmm.greaterThan_FunctionalOperator
	 * @generated
	 */
	EClass getgreaterThan_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.greaterThan_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.greaterThan_FunctionalOperator#getI()
	 * @see #getgreaterThan_FunctionalOperator()
	 * @generated
	 */
	EReference getgreaterThan_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.greaterThan_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.greaterThan_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getgreaterThan_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.greaterThan_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.greaterThan_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getgreaterThan_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Count_AggregationOperator <em>Count Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Aggregation Operator</em>'.
	 * @see qmm.Count_AggregationOperator
	 * @generated
	 */
	EClass getCount_AggregationOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Count_AggregationOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Count_AggregationOperator#getLiteral()
	 * @generated
	 */
	EOperation getCount_AggregationOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Object_CalculateableElement <em>Object Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Calculateable Element</em>'.
	 * @see qmm.Object_CalculateableElement
	 * @generated
	 */
	EClass getObject_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Min_AggregationOperator_Integer <em>Min Aggregation Operator Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Aggregation Operator Integer</em>'.
	 * @see qmm.Min_AggregationOperator_Integer
	 * @generated
	 */
	EClass getMin_AggregationOperator_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Min_AggregationOperator_Integer#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.Min_AggregationOperator_Integer#getCalculateable()
	 * @see #getMin_AggregationOperator_Integer()
	 * @generated
	 */
	EReference getMin_AggregationOperator_Integer_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.Min_AggregationOperator_Integer#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Min_AggregationOperator_Integer#getLiteral()
	 * @generated
	 */
	EOperation getMin_AggregationOperator_Integer__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Min_AggregationOperator_Integer#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Min_AggregationOperator_Integer#getAllParameters()
	 * @generated
	 */
	EOperation getMin_AggregationOperator_Integer__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.BitOperator <em>Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Operator</em>'.
	 * @see qmm.BitOperator
	 * @generated
	 */
	EClass getBitOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_greaterEquals_FunctionalOperator <em>Number Integer greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer greater Equals Functional Operator</em>'.
	 * @see qmm.Number_Integer_greaterEquals_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_greaterEquals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Integer_greaterEquals_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Integer_greaterEquals_FunctionalOperator#getI()
	 * @see #getNumber_Integer_greaterEquals_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Integer_greaterEquals_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_greaterEquals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_greaterEquals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_greaterEquals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_greaterEquals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_greaterEquals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_greaterEquals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_And_BitOperator <em>Object And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object And Bit Operator</em>'.
	 * @see qmm.Object_And_BitOperator
	 * @generated
	 */
	EClass getObject_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.RootClass <em>Root Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Class</em>'.
	 * @see qmm.RootClass
	 * @generated
	 */
	EClass getRootClass();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.RootClass#getEvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation Operator</em>'.
	 * @see qmm.RootClass#getEvaluationOperator()
	 * @see #getRootClass()
	 * @generated
	 */
	EReference getRootClass_EvaluationOperator();

	/**
	 * Returns the meta object for the '{@link qmm.RootClass#validateCheckExpression(java.lang.Object) <em>Validate Check Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Check Expression</em>' operation.
	 * @see qmm.RootClass#validateCheckExpression(java.lang.Object)
	 * @generated
	 */
	EOperation getRootClass__ValidateCheckExpression__Object();

	/**
	 * Returns the meta object for the '{@link qmm.RootClass#validateAllCheckExpressions(java.lang.Object) <em>Validate All Check Expressions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate All Check Expressions</em>' operation.
	 * @see qmm.RootClass#validateAllCheckExpressions(java.lang.Object)
	 * @generated
	 */
	EOperation getRootClass__ValidateAllCheckExpressions__Object();

	/**
	 * Returns the meta object for class '{@link qmm.Containment_OrGroup <em>Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Or Group</em>'.
	 * @see qmm.Containment_OrGroup
	 * @generated
	 */
	EClass getContainment_OrGroup();

	/**
	 * Returns the meta object for class '{@link qmm.Object_CharSequence_toString_FunctionalOperator <em>Object Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Char Sequence to String Functional Operator</em>'.
	 * @see qmm.Object_CharSequence_toString_FunctionalOperator
	 * @generated
	 */
	EClass getObject_CharSequence_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CharSequence_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_CharSequence_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_CharSequence_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CharSequence_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_CharSequence_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_CharSequence_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_Object_Number_equals_FunctionalOperator <em>Number Integer Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * @see qmm.Number_Integer_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_Object_Number_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Integer_Object_Number_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.Number_Integer_Object_Number_equals_FunctionalOperator#getObj()
	 * @see #getNumber_Integer_Object_Number_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Integer_Object_Number_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_Object_Number_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_Object_Number_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_Object_Number_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_Object_Number_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_Object_Number_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_Object_Number_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.NegatableElement <em>Negatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negatable Element</em>'.
	 * @see qmm.NegatableElement
	 * @generated
	 */
	EClass getNegatableElement();

	/**
	 * Returns the meta object for the attribute '{@link qmm.NegatableElement#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see qmm.NegatableElement#isNegated()
	 * @see #getNegatableElement()
	 * @generated
	 */
	EAttribute getNegatableElement_Negated();

	/**
	 * Returns the meta object for class '{@link qmm.Character_EvaluationOperation_Argument <em>Character Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Evaluation Operation Argument</em>'.
	 * @see qmm.Character_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getCharacter_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Object_FunctionalParameter <em>Object Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Functional Parameter</em>'.
	 * @see qmm.Object_FunctionalParameter
	 * @generated
	 */
	EClass getObject_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Object_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Object_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObject_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Number_FunctionalType <em>Number Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Functional Type</em>'.
	 * @see qmm.Number_FunctionalType
	 * @generated
	 */
	EClass getNumber_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Number_FunctionalType#getOperator()
	 * @see #getNumber_FunctionalType()
	 * @generated
	 */
	EReference getNumber_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.CourseType_Calculateable <em>Course Type Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Type Calculateable</em>'.
	 * @see qmm.CourseType_Calculateable
	 * @generated
	 */
	EClass getCourseType_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_Or_BitOperator <em>Char Sequence Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Or Bit Operator</em>'.
	 * @see qmm.CharSequence_Or_BitOperator
	 * @generated
	 */
	EClass getCharSequence_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.CharSequence_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharSequence_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Double_Operator <em>Double Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Operator</em>'.
	 * @see qmm.Double_Operator
	 * @generated
	 */
	EClass getDouble_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Character_equals_FunctionalOperator <em>Object Character equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Character equals Functional Operator</em>'.
	 * @see qmm.Object_Character_equals_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Character_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Object_Character_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.Object_Character_equals_FunctionalOperator#getObj()
	 * @see #getObject_Character_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getObject_Character_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Character_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Character_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Character_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Character_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Character_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Character_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see qmm.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Or_BitOperator <em>Object Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Or Bit Operator</em>'.
	 * @see qmm.Object_Or_BitOperator
	 * @generated
	 */
	EClass getObject_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_BitOperator <em>Char Sequence Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Bit Operator</em>'.
	 * @see qmm.CharSequence_BitOperator
	 * @generated
	 */
	EClass getCharSequence_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.CharSequence_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.CharSequence_BitOperator#getConnects()
	 * @see #getCharSequence_BitOperator()
	 * @generated
	 */
	EReference getCharSequence_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.startsWith_FunctionalOperator <em>starts With Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>starts With Functional Operator</em>'.
	 * @see qmm.startsWith_FunctionalOperator
	 * @generated
	 */
	EClass getstartsWith_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.startsWith_FunctionalOperator#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see qmm.startsWith_FunctionalOperator#getPrefix()
	 * @see #getstartsWith_FunctionalOperator()
	 * @generated
	 */
	EReference getstartsWith_FunctionalOperator_Prefix();

	/**
	 * Returns the meta object for the '{@link qmm.startsWith_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.startsWith_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getstartsWith_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.startsWith_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.startsWith_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getstartsWith_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_CalculateableElementReferenceArgument <em>Integer Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculateable Element Reference Argument</em>'.
	 * @see qmm.Integer_CalculateableElementReferenceArgument
	 * @generated
	 */
	EClass getInteger_CalculateableElementReferenceArgument();

	/**
	 * Returns the meta object for the reference '{@link qmm.Integer_CalculateableElementReferenceArgument#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see qmm.Integer_CalculateableElementReferenceArgument#getReference()
	 * @see #getInteger_CalculateableElementReferenceArgument()
	 * @generated
	 */
	EReference getInteger_CalculateableElementReferenceArgument_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Integer_CalculateableElementReferenceArgument#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Integer_CalculateableElementReferenceArgument#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInteger_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Character_FunctionalType <em>Character Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Functional Type</em>'.
	 * @see qmm.Character_FunctionalType
	 * @generated
	 */
	EClass getCharacter_FunctionalType();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Character_FunctionalType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see qmm.Character_FunctionalType#getOperator()
	 * @see #getCharacter_FunctionalType()
	 * @generated
	 */
	EReference getCharacter_FunctionalType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Student_matriculationNumber_AttrEClass <em>Student matriculation Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student matriculation Number Attr EClass</em>'.
	 * @see qmm.Student_matriculationNumber_AttrEClass
	 * @generated
	 */
	EClass getStudent_matriculationNumber_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see qmm.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link qmm.Double_ExpressionOperator <em>Double Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Expression Operator</em>'.
	 * @see qmm.Double_ExpressionOperator
	 * @generated
	 */
	EClass getDouble_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.FunctionalType <em>Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Type</em>'.
	 * @see qmm.FunctionalType
	 * @generated
	 */
	EClass getFunctionalType();

	/**
	 * Returns the meta object for class '{@link qmm.Double_FunctionalParameter <em>Double Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Functional Parameter</em>'.
	 * @see qmm.Double_FunctionalParameter
	 * @generated
	 */
	EClass getDouble_FunctionalParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Double_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Double_FunctionalParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDouble_FunctionalParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Character_Original_FunctionalOperator <em>Character Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Original Functional Operator</em>'.
	 * @see qmm.Character_Original_FunctionalOperator
	 * @generated
	 */
	EClass getCharacter_Original_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Double_FunctionalOperator <em>Double Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Functional Operator</em>'.
	 * @see qmm.Double_FunctionalOperator
	 * @generated
	 */
	EClass getDouble_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Sum_AggregationOperator_Double <em>Sum Aggregation Operator Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Aggregation Operator Double</em>'.
	 * @see qmm.Sum_AggregationOperator_Double
	 * @generated
	 */
	EClass getSum_AggregationOperator_Double();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Sum_AggregationOperator_Double#getCalculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculateable</em>'.
	 * @see qmm.Sum_AggregationOperator_Double#getCalculateable()
	 * @see #getSum_AggregationOperator_Double()
	 * @generated
	 */
	EReference getSum_AggregationOperator_Double_Calculateable();

	/**
	 * Returns the meta object for the '{@link qmm.Sum_AggregationOperator_Double#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Sum_AggregationOperator_Double#getLiteral()
	 * @generated
	 */
	EOperation getSum_AggregationOperator_Double__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Sum_AggregationOperator_Double#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Sum_AggregationOperator_Double#getAllParameters()
	 * @generated
	 */
	EOperation getSum_AggregationOperator_Double__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CalculateableParameter <em>Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculateable Parameter</em>'.
	 * @see qmm.CalculateableParameter
	 * @generated
	 */
	EClass getCalculateableParameter();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CalculateableParameter#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see qmm.CalculateableParameter#getArgument()
	 * @see #getCalculateableParameter()
	 * @generated
	 */
	EReference getCalculateableParameter_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_Object_Number_toString_FunctionalOperator <em>Number Double Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double Object Number to String Functional Operator</em>'.
	 * @see qmm.Number_Double_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_Object_Number_toString_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_Object_Number_toString_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_Object_Number_toString_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_Object_Number_toString_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_Object_Number_toString_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_Object_Number_toString_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_Object_Number_toString_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Boolean_equals_FunctionalOperator <em>Object Boolean equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Boolean equals Functional Operator</em>'.
	 * @see qmm.Object_Boolean_equals_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Boolean_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Object_Boolean_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.Object_Boolean_equals_FunctionalOperator#getObj()
	 * @see #getObject_Boolean_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getObject_Boolean_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Boolean_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Boolean_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Boolean_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Boolean_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Boolean_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Boolean_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.CourseType_Operator <em>Course Type Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Type Operator</em>'.
	 * @see qmm.CourseType_Operator
	 * @generated
	 */
	EClass getCourseType_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_And_BitOperator <em>Integer And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer And Bit Operator</em>'.
	 * @see qmm.Integer_And_BitOperator
	 * @generated
	 */
	EClass getInteger_And_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Integer_And_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Integer_And_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getInteger_And_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_Object_to_CharSequence_FunctionalOperator <em>Inherited From Object to Char Sequence Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Object to Char Sequence Functional Operator</em>'.
	 * @see qmm.InheritedFrom_Object_to_CharSequence_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_Object_to_CharSequence_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Countable_ReferenceArgument <em>Countable Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countable Reference Argument</em>'.
	 * @see qmm.Countable_ReferenceArgument
	 * @generated
	 */
	EClass getCountable_ReferenceArgument();

	/**
	 * Returns the meta object for the reference '{@link qmm.Countable_ReferenceArgument#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see qmm.Countable_ReferenceArgument#getReference()
	 * @see #getCountable_ReferenceArgument()
	 * @generated
	 */
	EReference getCountable_ReferenceArgument_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Countable_ReferenceArgument#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Countable_ReferenceArgument#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCountable_ReferenceArgument__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Boolean_CalculateableElement <em>Boolean Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Calculateable Element</em>'.
	 * @see qmm.Boolean_CalculateableElement
	 * @generated
	 */
	EClass getBoolean_CalculateableElement();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Integer_smallerEquals_FunctionalOperator <em>Number Integer smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * @see qmm.Number_Integer_smallerEquals_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Integer_smallerEquals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Integer_smallerEquals_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Integer_smallerEquals_FunctionalOperator#getI()
	 * @see #getNumber_Integer_smallerEquals_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Integer_smallerEquals_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_smallerEquals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Integer_smallerEquals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Integer_smallerEquals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Integer_smallerEquals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Integer_smallerEquals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Integer_smallerEquals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Character_hashCode_FunctionalOperator <em>Object Character hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Character hash Code Functional Operator</em>'.
	 * @see qmm.Object_Character_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Character_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Character_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Character_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Character_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Character_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Character_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Character_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.UniversityManagementSystem_Containment_OrGroup <em>University Management System Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University Management System Containment Or Group</em>'.
	 * @see qmm.UniversityManagementSystem_Containment_OrGroup
	 * @generated
	 */
	EClass getUniversityManagementSystem_Containment_OrGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.UniversityManagementSystem_Containment_OrGroup#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment</em>'.
	 * @see qmm.UniversityManagementSystem_Containment_OrGroup#getContainment()
	 * @see #getUniversityManagementSystem_Containment_OrGroup()
	 * @generated
	 */
	EReference getUniversityManagementSystem_Containment_OrGroup_Containment();

	/**
	 * Returns the meta object for class '{@link qmm.Object_ExpressionOperator <em>Object Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Expression Operator</em>'.
	 * @see qmm.Object_ExpressionOperator
	 * @generated
	 */
	EClass getObject_ExpressionOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Exam_Containment_OrGroup <em>Exam Containment Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Containment Or Group</em>'.
	 * @see qmm.Exam_Containment_OrGroup
	 * @generated
	 */
	EClass getExam_Containment_OrGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Exam_Containment_OrGroup#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment</em>'.
	 * @see qmm.Exam_Containment_OrGroup#getContainment()
	 * @see #getExam_Containment_OrGroup()
	 * @generated
	 */
	EReference getExam_Containment_OrGroup_Containment();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_Operator <em>Char Sequence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Operator</em>'.
	 * @see qmm.CharSequence_Operator
	 * @generated
	 */
	EClass getCharSequence_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_smallerThan_FunctionalOperator <em>Number Double smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double smaller Than Functional Operator</em>'.
	 * @see qmm.Number_Double_smallerThan_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_smallerThan_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Double_smallerThan_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Double_smallerThan_FunctionalOperator#getI()
	 * @see #getNumber_Double_smallerThan_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Double_smallerThan_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_smallerThan_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_smallerThan_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_smallerThan_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_smallerThan_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_smallerThan_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_smallerThan_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.ReferenceArgument <em>Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Argument</em>'.
	 * @see qmm.ReferenceArgument
	 * @generated
	 */
	EClass getReferenceArgument();

	/**
	 * Returns the meta object for class '{@link qmm.Professor_employeeNumber_AttrEClass <em>Professor employee Number Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor employee Number Attr EClass</em>'.
	 * @see qmm.Professor_employeeNumber_AttrEClass
	 * @generated
	 */
	EClass getProfessor_employeeNumber_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.doubleValue_FunctionalOperator <em>double Value Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>double Value Functional Operator</em>'.
	 * @see qmm.doubleValue_FunctionalOperator
	 * @generated
	 */
	EClass getdoubleValue_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.doubleValue_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.doubleValue_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getdoubleValue_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.doubleValue_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.doubleValue_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getdoubleValue_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.FunctionalArgument <em>Functional Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Argument</em>'.
	 * @see qmm.FunctionalArgument
	 * @generated
	 */
	EClass getFunctionalArgument();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_Argument <em>Char Sequence Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence Argument</em>'.
	 * @see qmm.CharSequence_Argument
	 * @generated
	 */
	EClass getCharSequence_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.String_PrimitiveArgument <em>String Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Primitive Argument</em>'.
	 * @see qmm.String_PrimitiveArgument
	 * @generated
	 */
	EClass getString_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.String_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.String_PrimitiveArgument#getValue()
	 * @see #getString_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getString_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.Object_CalculateableParameter <em>Object Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Calculateable Parameter</em>'.
	 * @see qmm.Object_CalculateableParameter
	 * @generated
	 */
	EClass getObject_CalculateableParameter();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Object_CalculateableParameter#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObject_CalculateableParameter__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.FindQuery <em>Find Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Query</em>'.
	 * @see qmm.FindQuery
	 * @generated
	 */
	EClass getFindQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.FindQuery#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union</em>'.
	 * @see qmm.FindQuery#getUnion()
	 * @see #getFindQuery()
	 * @generated
	 */
	EReference getFindQuery_Union();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.FindQuery#getRootClass <em>Root Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Class</em>'.
	 * @see qmm.FindQuery#getRootClass()
	 * @see #getFindQuery()
	 * @generated
	 */
	EReference getFindQuery_RootClass();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.FindQuery#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see qmm.FindQuery#getSelect()
	 * @see #getFindQuery()
	 * @generated
	 */
	EReference getFindQuery_Select();

	/**
	 * Returns the meta object for class '{@link qmm.charAt_FunctionalOperator <em>char At Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>char At Functional Operator</em>'.
	 * @see qmm.charAt_FunctionalOperator
	 * @generated
	 */
	EClass getcharAt_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.charAt_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.charAt_FunctionalOperator#getI()
	 * @see #getcharAt_FunctionalOperator()
	 * @generated
	 */
	EReference getcharAt_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.charAt_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.charAt_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcharAt_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.charAt_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.charAt_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcharAt_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_Calculateable <em>Integer Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculateable</em>'.
	 * @see qmm.Integer_Calculateable
	 * @generated
	 */
	EClass getInteger_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.compareToStringIgnoreCase_FunctionalOperator <em>compare To String Ignore Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>compare To String Ignore Case Functional Operator</em>'.
	 * @see qmm.compareToStringIgnoreCase_FunctionalOperator
	 * @generated
	 */
	EClass getcompareToStringIgnoreCase_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.compareToStringIgnoreCase_FunctionalOperator#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Str</em>'.
	 * @see qmm.compareToStringIgnoreCase_FunctionalOperator#getStr()
	 * @see #getcompareToStringIgnoreCase_FunctionalOperator()
	 * @generated
	 */
	EReference getcompareToStringIgnoreCase_FunctionalOperator_Str();

	/**
	 * Returns the meta object for the '{@link qmm.compareToStringIgnoreCase_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.compareToStringIgnoreCase_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getcompareToStringIgnoreCase_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.compareToStringIgnoreCase_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.compareToStringIgnoreCase_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getcompareToStringIgnoreCase_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Or_BitOperator <em>Number Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Or Bit Operator</em>'.
	 * @see qmm.Number_Or_BitOperator
	 * @generated
	 */
	EClass getNumber_Or_BitOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Or_BitOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Or_BitOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Or_BitOperator__GetLiteral();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Operator <em>Object Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Operator</em>'.
	 * @see qmm.Object_Operator
	 * @generated
	 */
	EClass getObject_Operator();

	/**
	 * Returns the meta object for class '{@link qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator <em>Char Sequence String Object Char Sequence equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * @see qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator
	 * @generated
	 */
	EClass getCharSequence_String_Object_CharSequence_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator#getObj()
	 * @see #getCharSequence_String_Object_CharSequence_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getCharSequence_String_Object_CharSequence_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getCharSequence_String_Object_CharSequence_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getCharSequence_String_Object_CharSequence_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.toUpperCase_FunctionalOperator <em>to Upper Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>to Upper Case Functional Operator</em>'.
	 * @see qmm.toUpperCase_FunctionalOperator
	 * @generated
	 */
	EClass gettoUpperCase_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.toUpperCase_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.toUpperCase_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation gettoUpperCase_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.toUpperCase_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.toUpperCase_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation gettoUpperCase_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_Boolean_hashCode_FunctionalOperator <em>Object Boolean hash Code Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Boolean hash Code Functional Operator</em>'.
	 * @see qmm.Object_Boolean_hashCode_FunctionalOperator
	 * @generated
	 */
	EClass getObject_Boolean_hashCode_FunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Boolean_hashCode_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_Boolean_hashCode_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_Boolean_hashCode_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_Boolean_hashCode_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_Boolean_hashCode_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_Boolean_hashCode_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.FunctionalOperator <em>Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Operator</em>'.
	 * @see qmm.FunctionalOperator
	 * @generated
	 */
	EClass getFunctionalOperator();

	/**
	 * Returns the meta object for the '{@link qmm.FunctionalOperator#getLastOperator() <em>Get Last Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Operator</em>' operation.
	 * @see qmm.FunctionalOperator#getLastOperator()
	 * @generated
	 */
	EOperation getFunctionalOperator__GetLastOperator();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_smallerEquals_FunctionalOperator <em>Number Double smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double smaller Equals Functional Operator</em>'.
	 * @see qmm.Number_Double_smallerEquals_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_smallerEquals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Double_smallerEquals_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Double_smallerEquals_FunctionalOperator#getI()
	 * @see #getNumber_Double_smallerEquals_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Double_smallerEquals_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_smallerEquals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_smallerEquals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_smallerEquals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_smallerEquals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_smallerEquals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_smallerEquals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Double_Calculateable <em>Double Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Calculateable</em>'.
	 * @see qmm.Double_Calculateable
	 * @generated
	 */
	EClass getDouble_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.EnumerationAttributeEClass <em>Enumeration Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Attribute EClass</em>'.
	 * @see qmm.EnumerationAttributeEClass
	 * @generated
	 */
	EClass getEnumerationAttributeEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Double_PrimitiveArgument <em>Double Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Primitive Argument</em>'.
	 * @see qmm.Double_PrimitiveArgument
	 * @generated
	 */
	EClass getDouble_PrimitiveArgument();

	/**
	 * Returns the meta object for the attribute '{@link qmm.Double_PrimitiveArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qmm.Double_PrimitiveArgument#getValue()
	 * @see #getDouble_PrimitiveArgument()
	 * @generated
	 */
	EAttribute getDouble_PrimitiveArgument_Value();

	/**
	 * Returns the meta object for class '{@link qmm.substring_FunctionalOperator <em>substring Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>substring Functional Operator</em>'.
	 * @see qmm.substring_FunctionalOperator
	 * @generated
	 */
	EClass getsubstring_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.substring_FunctionalOperator#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Index</em>'.
	 * @see qmm.substring_FunctionalOperator#getStartIndex()
	 * @see #getsubstring_FunctionalOperator()
	 * @generated
	 */
	EReference getsubstring_FunctionalOperator_StartIndex();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.substring_FunctionalOperator#getEndIndex <em>End Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Index</em>'.
	 * @see qmm.substring_FunctionalOperator#getEndIndex()
	 * @see #getsubstring_FunctionalOperator()
	 * @generated
	 */
	EReference getsubstring_FunctionalOperator_EndIndex();

	/**
	 * Returns the meta object for the '{@link qmm.substring_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.substring_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getsubstring_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.substring_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.substring_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getsubstring_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.EvaluationOperation_Argument <em>Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Operation Argument</em>'.
	 * @see qmm.EvaluationOperation_Argument
	 * @generated
	 */
	EClass getEvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Course_Reference_OrGroup <em>Course Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Reference Or Group</em>'.
	 * @see qmm.Course_Reference_OrGroup
	 * @generated
	 */
	EClass getCourse_Reference_OrGroup();

	/**
	 * Returns the meta object for the reference list '{@link qmm.Course_Reference_OrGroup#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see qmm.Course_Reference_OrGroup#getReference()
	 * @see #getCourse_Reference_OrGroup()
	 * @generated
	 */
	EReference getCourse_Reference_OrGroup_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.Course_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.Course_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse_Reference_OrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Course_name_AttrEClass <em>Course name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course name Attr EClass</em>'.
	 * @see qmm.Course_name_AttrEClass
	 * @generated
	 */
	EClass getCourse_name_AttrEClass();

	/**
	 * Returns the meta object for class '{@link qmm.Integer_Argument <em>Integer Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Argument</em>'.
	 * @see qmm.Integer_Argument
	 * @generated
	 */
	EClass getInteger_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Character_Calculateable <em>Character Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Calculateable</em>'.
	 * @see qmm.Character_Calculateable
	 * @generated
	 */
	EClass getCharacter_Calculateable();

	/**
	 * Returns the meta object for class '{@link qmm.Object_BitOperator <em>Object Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Bit Operator</em>'.
	 * @see qmm.Object_BitOperator
	 * @generated
	 */
	EClass getObject_BitOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link qmm.Object_BitOperator#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see qmm.Object_BitOperator#getConnects()
	 * @see #getObject_BitOperator()
	 * @generated
	 */
	EReference getObject_BitOperator_Connects();

	/**
	 * Returns the meta object for class '{@link qmm.InheritedFrom_CharSequence_to_String_FunctionalOperator <em>Inherited From Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited From Char Sequence to String Functional Operator</em>'.
	 * @see qmm.InheritedFrom_CharSequence_to_String_FunctionalOperator
	 * @generated
	 */
	EClass getInheritedFrom_CharSequence_to_String_FunctionalOperator();

	/**
	 * Returns the meta object for class '{@link qmm.UniversityManagementSystem_Reference_OrGroup <em>University Management System Reference Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University Management System Reference Or Group</em>'.
	 * @see qmm.UniversityManagementSystem_Reference_OrGroup
	 * @generated
	 */
	EClass getUniversityManagementSystem_Reference_OrGroup();

	/**
	 * Returns the meta object for the reference list '{@link qmm.UniversityManagementSystem_Reference_OrGroup#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see qmm.UniversityManagementSystem_Reference_OrGroup#getReference()
	 * @see #getUniversityManagementSystem_Reference_OrGroup()
	 * @generated
	 */
	EReference getUniversityManagementSystem_Reference_OrGroup_Reference();

	/**
	 * Returns the meta object for the '{@link qmm.UniversityManagementSystem_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see qmm.UniversityManagementSystem_Reference_OrGroup#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUniversityManagementSystem_Reference_OrGroup__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qmm.Object_EvaluationOperation_Argument <em>Object Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Evaluation Operation Argument</em>'.
	 * @see qmm.Object_EvaluationOperation_Argument
	 * @generated
	 */
	EClass getObject_EvaluationOperation_Argument();

	/**
	 * Returns the meta object for class '{@link qmm.Number_Double_greaterThan_FunctionalOperator <em>Number Double greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Double greater Than Functional Operator</em>'.
	 * @see qmm.Number_Double_greaterThan_FunctionalOperator
	 * @generated
	 */
	EClass getNumber_Double_greaterThan_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Number_Double_greaterThan_FunctionalOperator#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see qmm.Number_Double_greaterThan_FunctionalOperator#getI()
	 * @see #getNumber_Double_greaterThan_FunctionalOperator()
	 * @generated
	 */
	EReference getNumber_Double_greaterThan_FunctionalOperator_I();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_greaterThan_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Number_Double_greaterThan_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getNumber_Double_greaterThan_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Number_Double_greaterThan_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Number_Double_greaterThan_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getNumber_Double_greaterThan_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for class '{@link qmm.Object_CharSequence_equals_FunctionalOperator <em>Object Char Sequence equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Char Sequence equals Functional Operator</em>'.
	 * @see qmm.Object_CharSequence_equals_FunctionalOperator
	 * @generated
	 */
	EClass getObject_CharSequence_equals_FunctionalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link qmm.Object_CharSequence_equals_FunctionalOperator#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj</em>'.
	 * @see qmm.Object_CharSequence_equals_FunctionalOperator#getObj()
	 * @see #getObject_CharSequence_equals_FunctionalOperator()
	 * @generated
	 */
	EReference getObject_CharSequence_equals_FunctionalOperator_Obj();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CharSequence_equals_FunctionalOperator#getLiteral() <em>Get Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Literal</em>' operation.
	 * @see qmm.Object_CharSequence_equals_FunctionalOperator#getLiteral()
	 * @generated
	 */
	EOperation getObject_CharSequence_equals_FunctionalOperator__GetLiteral();

	/**
	 * Returns the meta object for the '{@link qmm.Object_CharSequence_equals_FunctionalOperator#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see qmm.Object_CharSequence_equals_FunctionalOperator#getAllParameters()
	 * @generated
	 */
	EOperation getObject_CharSequence_equals_FunctionalOperator__GetAllParameters();

	/**
	 * Returns the meta object for enum '{@link qmm.CourseType <em>Course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Type</em>'.
	 * @see qmm.CourseType
	 * @generated
	 */
	EEnum getCourseType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.CharSequence <em>Char Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Char Sequence</em>'.
	 * @see java.lang.CharSequence
	 * @model instanceClass="java.lang.CharSequence"
	 * @generated
	 */
	EDataType getCharSequence();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 * @generated
	 */
	EDataType getCharacter();

	/**
	 * Returns the meta object for data type '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QmmFactory getQmmFactory();

} //QmmPackage
