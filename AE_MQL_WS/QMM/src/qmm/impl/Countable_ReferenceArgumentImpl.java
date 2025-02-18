/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.Countable;
import qmm.Countable_ReferenceArgument;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Countable Reference Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.Countable_ReferenceArgumentImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Countable_ReferenceArgumentImpl extends ReferenceArgumentImpl implements Countable_ReferenceArgument {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Countable reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Countable_ReferenceArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCountable_ReferenceArgument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countable getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Countable)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QmmPackage.COUNTABLE_REFERENCE_ARGUMENT__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countable basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Countable newReference) {
		Countable oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COUNTABLE_REFERENCE_ARGUMENT__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		qmm.RootClass containingRootClass = null;
		qmm.RootClass referencesRootClass = null;
		qmm.Countable containingCountable = null;
		
		if(this.reference != null){
				if(this.reference instanceof qmm.Reference_OrGroup){
					qmm.Reference_OrGroup rog = (qmm.Reference_OrGroup)this.reference;
					EList<org.eclipse.emf.ecore.EObject> references = (EList<org.eclipse.emf.ecore.EObject>)rog.eGet(rog.eClass().getEStructuralFeature("reference"));
					if(references.size()>0){
						String errorMessage = "Element " + rog.getName() + " is a concretized non-containment reference. It's not possible to use concretized non-containment references in evaluation operations in this prototype. Please remove ': ...' after the declaration of element " + rog.getName() + ", if you want to use " + rog.getName() + " in the evaluation operation.";
						diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.COUNTABLE_REFERENCE_ARGUMENT__VALIDATE, errorMessage,new Object[] { this }));
					}
				}
				if(this.eContainer() != null){
					org.eclipse.emf.ecore.EObject eContainer = this.eContainer();
					while(eContainer != null && !(eContainer instanceof qmm.RootClass)){
						if(eContainer instanceof qmm.Countable){
							containingCountable = (qmm.Countable)eContainer;
						}
						eContainer = eContainer.eContainer();
					}
					containingRootClass = (qmm.RootClass)eContainer;
		
					eContainer = this.reference.eContainer();
					while(eContainer != null && !(eContainer instanceof qmm.RootClass)){
						eContainer = eContainer.eContainer();
					}
		
					referencesRootClass = (qmm.RootClass)eContainer;
		
					if(containingCountable != null && containingCountable == reference){  //self-reference in expression !
						String errorMessage = "Self-reference in expression of " + containingCountable + " detected. Self-references are not allowed!";
						diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.COUNTABLE_REFERENCE_ARGUMENT__VALIDATE, errorMessage,new Object[] { this }));
					}
		
					if(containingRootClass != referencesRootClass){
						String errorMessage = "The referenced element " + this.reference + " is contained by a different parent-element than the expression's parent-element. Cross-references are not supported.";
						diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.COUNTABLE_REFERENCE_ARGUMENT__VALIDATE, errorMessage,new Object[] { this }));
					}
		
					if(this.reference instanceof qmm.NegatableElement && ((qmm.NegatableElement)this.reference).isNegated()){
		 				diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.COUNTABLE_REFERENCE_ARGUMENT__VALIDATE, "Reference to a negated element in " + this + " has been detected. References to negated elements are not allowed.",new Object[] { this }));
					}
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
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT__REFERENCE:
				setReference((Countable)newValue);
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
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT__REFERENCE:
				setReference((Countable)null);
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
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Countable_ReferenceArgumentImpl
