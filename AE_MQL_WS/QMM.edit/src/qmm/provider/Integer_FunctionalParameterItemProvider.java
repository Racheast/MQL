/**
 */
package qmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qmm.Integer_FunctionalParameter;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.Integer_FunctionalParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Integer_FunctionalParameterItemProvider extends Integer_TypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameterItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getFunctionalParameter_Argument());
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
	 * This returns Integer_FunctionalParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Integer_FunctionalParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Integer_FunctionalParameter_type");
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

		switch (notification.getFeatureID(Integer_FunctionalParameter.class)) {
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER__ARGUMENT:
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
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createMin_AggregationOperator_Double()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createInteger_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createObject_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createCharSequence_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createIntegerParseInt_ClassOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createNumber_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createMax_AggregationOperator_Double()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createString_CalculateableElementReferenceArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createCharacter_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createMax_AggregationOperator_Integer()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createBoolean_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createSum_AggregationOperator_Integer()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createCount_AggregationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createMin_AggregationOperator_Integer()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createInteger_CalculateableElementReferenceArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createSum_AggregationOperator_Double()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createString_PrimitiveArgument()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFunctionalParameter_Argument(),
				 QmmFactory.eINSTANCE.createDouble_PrimitiveArgument()));
	}

}
