/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qmm.Exam;
import qmm.Exam_Reference_OrGroup;
import qmm.NamedElement;
import qmm.OrGroup;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam Reference Or Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.Exam_Reference_OrGroupImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Exam_Reference_OrGroupImpl extends Reference_OrGroupImpl implements Exam_Reference_OrGroup {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam> reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Exam_Reference_OrGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getExam_Reference_OrGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<Exam>(Exam.class, this, QmmPackage.EXAM_REFERENCE_OR_GROUP__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		super.validate(diagnostic, context);
				java.util.ArrayList<org.eclipse.emf.ecore.EObject> thisContainers = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
				org.eclipse.emf.ecore.EObject thisContainer = this.eContainer();
		
				while(thisContainer != null){
					thisContainers.add(thisContainer);
					thisContainer = thisContainer.eContainer();
				}
		
				for(qmm.RootClass rc: this.reference){
					org.eclipse.emf.ecore.EObject eContainer = rc.eContainer();
					while(eContainer != null && !thisContainers.contains(rc)){
						if(eContainer instanceof qmm.Containment_OrGroup){
							EList containment = (EList)eContainer.eGet(eContainer.eClass().getEStructuralFeature("containment"));
		
							if(rc == this.eContainer) break;
		
							if(containment.size() > 1){
								String errorMessage = rc.getName() + " is defined within an alternative Or-branch of node " + ((qmm.OrGroup)eContainer).getName() + ". It's not possible to reference nodes that are defined in alternative Or-branches.";
								diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OR_GROUP__VALIDATE, errorMessage,new Object[] { this }));
							}
						}
						if(eContainer instanceof qmm.OrGroup && ((qmm.OrGroup)eContainer).isNegated()){
								if(!thisContainers.contains(eContainer)){
									String errorMessage = rc.getName() + " is a negated pattern or is defined within a negated pattern. It's not possible to reference nodes that are negated or are defined within negated patterns.";
									diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OR_GROUP__VALIDATE, errorMessage,new Object[] { this }));
								}
						}
						eContainer = eContainer.eContainer();
					}
				}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmmPackage.EXAM_REFERENCE_OR_GROUP__REFERENCE:
				return getReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmmPackage.EXAM_REFERENCE_OR_GROUP__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Exam>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QmmPackage.EXAM_REFERENCE_OR_GROUP__REFERENCE:
				getReference().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QmmPackage.EXAM_REFERENCE_OR_GROUP__REFERENCE:
				return reference != null && !reference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.EXAM_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == OrGroup.class) {
			switch (baseOperationID) {
				case QmmPackage.OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.EXAM_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.EXAM_REFERENCE_OR_GROUP___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Exam_Reference_OrGroupImpl
