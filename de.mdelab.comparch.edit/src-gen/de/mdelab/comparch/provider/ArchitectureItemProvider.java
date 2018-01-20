/**
 */
package de.mdelab.comparch.provider;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.ComparchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.mdelab.comparch.Architecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureItemProvider extends ArchitecturalElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addComponentTypesPropertyDescriptor(object);
			addInterfaceTypesPropertyDescriptor(object);
			addTenantsPropertyDescriptor(object);
			addAnnotationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Architecture_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Architecture_name_feature",
								"_UI_Architecture_type"),
						ComparchPackage.Literals.ARCHITECTURE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Component Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Architecture_componentTypes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Architecture_componentTypes_feature",
								"_UI_Architecture_type"),
						ComparchPackage.Literals.ARCHITECTURE__COMPONENT_TYPES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Interface Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Architecture_interfaceTypes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Architecture_interfaceTypes_feature",
								"_UI_Architecture_type"),
						ComparchPackage.Literals.ARCHITECTURE__INTERFACE_TYPES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Tenants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Architecture_tenants_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Architecture_tenants_feature",
								"_UI_Architecture_type"),
						ComparchPackage.Literals.ARCHITECTURE__TENANTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Annotations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Architecture_annotations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Architecture_annotations_feature",
								"_UI_Architecture_type"),
						ComparchPackage.Literals.ARCHITECTURE__ANNOTATIONS, true, false, true, null, null, null));
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
			childrenFeatures.add(ComparchPackage.Literals.ARCHITECTURE__COMPONENT_TYPES);
			childrenFeatures.add(ComparchPackage.Literals.ARCHITECTURE__INTERFACE_TYPES);
			childrenFeatures.add(ComparchPackage.Literals.ARCHITECTURE__TENANTS);
			childrenFeatures.add(ComparchPackage.Literals.ARCHITECTURE__ANNOTATIONS);
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
	 * This returns Architecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Architecture"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Architecture) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Architecture_type")
				: getString("_UI_Architecture_type") + " " + label;
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

		switch (notification.getFeatureID(Architecture.class)) {
		case ComparchPackage.ARCHITECTURE__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
		case ComparchPackage.ARCHITECTURE__TENANTS:
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
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

		newChildDescriptors.add(createChildParameter(ComparchPackage.Literals.ARCHITECTURE__COMPONENT_TYPES,
				ComparchFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add(createChildParameter(ComparchPackage.Literals.ARCHITECTURE__INTERFACE_TYPES,
				ComparchFactory.eINSTANCE.createInterfaceType()));

		newChildDescriptors.add(createChildParameter(ComparchPackage.Literals.ARCHITECTURE__TENANTS,
				ComparchFactory.eINSTANCE.createTenant()));

		newChildDescriptors.add(createChildParameter(ComparchPackage.Literals.ARCHITECTURE__ANNOTATIONS,
				ComparchFactory.eINSTANCE.createAnnotations()));
	}

}
