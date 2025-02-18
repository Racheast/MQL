/**
 */
package qmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qmm.Double_BitOperator;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.Double_BitOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Double_BitOperatorItemProvider extends Double_ExpressionOperatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_BitOperatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNegatedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Negated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NegatableElement_negated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NegatableElement_negated_feature", "_UI_NegatableElement_type"),
				 QmmPackage.eINSTANCE.getNegatableElement_Negated(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Double_BitOperator double_BitOperator = (Double_BitOperator)object;
		return getString("_UI_Double_BitOperator_type") + " " + double_BitOperator.isNegated();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Double_BitOperator.class)) {
			case QmmPackage.DOUBLE_BIT_OPERATOR__NEGATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QmmPackage.DOUBLE_BIT_OPERATOR__CONNECTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createDouble_And_BitOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_Object_Number_hashCode_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createDouble_Or_BitOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_Object_Number_equals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_greaterEquals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_Object_Number_toString_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_smallerThan_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_smallerEquals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_BitOperator_Connects(),
				 QmmFactory.eINSTANCE.createNumber_Double_greaterThan_FunctionalOperator()));
	}

}
