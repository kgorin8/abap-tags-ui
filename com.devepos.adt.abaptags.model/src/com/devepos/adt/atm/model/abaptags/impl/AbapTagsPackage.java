/**
 */
package com.devepos.adt.atm.model.abaptags.impl;

import com.devepos.adt.atm.model.abaptags.IAbapTagsFactory;
import com.devepos.adt.atm.model.abaptags.IAbapTagsPackage;
import com.devepos.adt.atm.model.abaptags.IAdtObjectTag;
import com.devepos.adt.atm.model.abaptags.ITag;
import com.devepos.adt.atm.model.abaptags.ITagBase;
import com.devepos.adt.atm.model.abaptags.ITagList;
import com.devepos.adt.atm.model.abaptags.ITagPreviewInfo;
import com.devepos.adt.atm.model.abaptags.ITaggedObject;
import com.devepos.adt.atm.model.abaptags.ITaggedObjectList;
import com.devepos.adt.atm.model.abaptags.ITaggedObjectSearchParams;
import com.devepos.adt.atm.model.abaptags.TagInfoType;
import com.devepos.adt.atm.model.abaptags.TagQueryFocus;
import com.devepos.adt.atm.model.abaptags.TagQueryType;
import com.devepos.adt.atm.model.abaptags.TagSearchScope;

import com.devepos.adt.tools.base.model.adtbase.IAdtBasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbapTagsPackage extends EPackageImpl implements IAbapTagsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adtObjectTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagPreviewInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedObjectListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedObjectSearchParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tagSearchScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tagQueryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tagInfoTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tagQueryFocusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.devepos.adt.atm.model.abaptags.IAbapTagsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbapTagsPackage() {
		super(eNS_URI, IAbapTagsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IAbapTagsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IAbapTagsPackage init() {
		if (isInited) return (IAbapTagsPackage)EPackage.Registry.INSTANCE.getEPackage(IAbapTagsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAbapTagsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AbapTagsPackage theAbapTagsPackage = registeredAbapTagsPackage instanceof AbapTagsPackage ? (AbapTagsPackage)registeredAbapTagsPackage : new AbapTagsPackage();

		isInited = true;

		// Initialize simple dependencies
		IAdtBasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAbapTagsPackage.createPackageContents();

		// Initialize created meta-data
		theAbapTagsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbapTagsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IAbapTagsPackage.eNS_URI, theAbapTagsPackage);
		return theAbapTagsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagBase() {
		return tagBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBase_Id() {
		return (EAttribute)tagBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBase_Name() {
		return (EAttribute)tagBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagBase_Owner() {
		return (EAttribute)tagBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Description() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_ChildTags() {
		return (EReference)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_CreatedBy() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_CreatedDateTime() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_ChangedBy() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_ChangedDateTime() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_TaggedObjectCount() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Changed() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_ParentTagId() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdtObjectTag() {
		return adtObjectTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdtObjectTag_ParentObjectName() {
		return (EAttribute)adtObjectTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdtObjectTag_ParentObjectType() {
		return (EAttribute)adtObjectTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdtObjectTag_ParentObjectUri() {
		return (EAttribute)adtObjectTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdtObjectTag_ParentTagId() {
		return (EAttribute)adtObjectTagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdtObjectTag_ParentTagName() {
		return (EAttribute)adtObjectTagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdtObjectTag_UserTag() {
		return (EAttribute)adtObjectTagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagList() {
		return tagListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagList_Tags() {
		return (EReference)tagListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagPreviewInfo() {
		return tagPreviewInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagPreviewInfo_Tags() {
		return (EReference)tagPreviewInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagPreviewInfo_AdtObjectRefs() {
		return (EReference)tagPreviewInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaggedObject() {
		return taggedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaggedObject_ObjectRef() {
		return (EReference)taggedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaggedObject_Tags() {
		return (EReference)taggedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaggedObjectList() {
		return taggedObjectListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaggedObjectList_TaggedObjects() {
		return (EReference)taggedObjectListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaggedObjectSearchParams() {
		return taggedObjectSearchParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_TagIds() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_SearchScope() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_Query() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_QueryType() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_QueryFocus() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_MaxResults() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_MatchesAllTags() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_WithTagInfo() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedObjectSearchParams_TagInfoType() {
		return (EAttribute)taggedObjectSearchParamsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTagSearchScope() {
		return tagSearchScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTagQueryType() {
		return tagQueryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTagInfoType() {
		return tagInfoTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTagQueryFocus() {
		return tagQueryFocusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAbapTagsFactory getAbapTagsFactory() {
		return (IAbapTagsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tagBaseEClass = createEClass(TAG_BASE);
		createEAttribute(tagBaseEClass, TAG_BASE__ID);
		createEAttribute(tagBaseEClass, TAG_BASE__NAME);
		createEAttribute(tagBaseEClass, TAG_BASE__OWNER);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__DESCRIPTION);
		createEReference(tagEClass, TAG__CHILD_TAGS);
		createEAttribute(tagEClass, TAG__CREATED_BY);
		createEAttribute(tagEClass, TAG__CREATED_DATE_TIME);
		createEAttribute(tagEClass, TAG__CHANGED_BY);
		createEAttribute(tagEClass, TAG__CHANGED_DATE_TIME);
		createEAttribute(tagEClass, TAG__TAGGED_OBJECT_COUNT);
		createEAttribute(tagEClass, TAG__CHANGED);
		createEAttribute(tagEClass, TAG__PARENT_TAG_ID);

		adtObjectTagEClass = createEClass(ADT_OBJECT_TAG);
		createEAttribute(adtObjectTagEClass, ADT_OBJECT_TAG__PARENT_OBJECT_NAME);
		createEAttribute(adtObjectTagEClass, ADT_OBJECT_TAG__PARENT_OBJECT_TYPE);
		createEAttribute(adtObjectTagEClass, ADT_OBJECT_TAG__PARENT_OBJECT_URI);
		createEAttribute(adtObjectTagEClass, ADT_OBJECT_TAG__PARENT_TAG_ID);
		createEAttribute(adtObjectTagEClass, ADT_OBJECT_TAG__PARENT_TAG_NAME);
		createEAttribute(adtObjectTagEClass, ADT_OBJECT_TAG__USER_TAG);

		tagListEClass = createEClass(TAG_LIST);
		createEReference(tagListEClass, TAG_LIST__TAGS);

		tagPreviewInfoEClass = createEClass(TAG_PREVIEW_INFO);
		createEReference(tagPreviewInfoEClass, TAG_PREVIEW_INFO__TAGS);
		createEReference(tagPreviewInfoEClass, TAG_PREVIEW_INFO__ADT_OBJECT_REFS);

		taggedObjectEClass = createEClass(TAGGED_OBJECT);
		createEReference(taggedObjectEClass, TAGGED_OBJECT__OBJECT_REF);
		createEReference(taggedObjectEClass, TAGGED_OBJECT__TAGS);

		taggedObjectListEClass = createEClass(TAGGED_OBJECT_LIST);
		createEReference(taggedObjectListEClass, TAGGED_OBJECT_LIST__TAGGED_OBJECTS);

		taggedObjectSearchParamsEClass = createEClass(TAGGED_OBJECT_SEARCH_PARAMS);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__TAG_IDS);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__SEARCH_SCOPE);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__QUERY);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__QUERY_TYPE);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__QUERY_FOCUS);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__MAX_RESULTS);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__MATCHES_ALL_TAGS);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__WITH_TAG_INFO);
		createEAttribute(taggedObjectSearchParamsEClass, TAGGED_OBJECT_SEARCH_PARAMS__TAG_INFO_TYPE);

		// Create enums
		tagSearchScopeEEnum = createEEnum(TAG_SEARCH_SCOPE);
		tagQueryTypeEEnum = createEEnum(TAG_QUERY_TYPE);
		tagInfoTypeEEnum = createEEnum(TAG_INFO_TYPE);
		tagQueryFocusEEnum = createEEnum(TAG_QUERY_FOCUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IAdtBasePackage theAdtBasePackage = (IAdtBasePackage)EPackage.Registry.INSTANCE.getEPackage(IAdtBasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tagEClass.getESuperTypes().add(this.getTagBase());
		adtObjectTagEClass.getESuperTypes().add(this.getTagBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(tagBaseEClass, ITagBase.class, "TagBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagBase_Id(), ecorePackage.getEString(), "id", null, 0, 1, ITagBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBase_Name(), ecorePackage.getEString(), "name", "", 0, 1, ITagBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagBase_Owner(), ecorePackage.getEString(), "owner", "", 0, 1, ITagBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, ITag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Description(), ecorePackage.getEString(), "description", "", 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_ChildTags(), this.getTag(), null, "childTags", null, 0, -1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_CreatedBy(), ecorePackage.getEString(), "createdBy", "", 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_CreatedDateTime(), ecorePackage.getEString(), "createdDateTime", "", 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_ChangedBy(), ecorePackage.getEString(), "changedBy", "", 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_ChangedDateTime(), ecorePackage.getEString(), "changedDateTime", "", 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_TaggedObjectCount(), ecorePackage.getEInt(), "taggedObjectCount", null, 0, 1, ITag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Changed(), ecorePackage.getEBoolean(), "changed", null, 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_ParentTagId(), ecorePackage.getEString(), "parentTagId", null, 0, 1, ITag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adtObjectTagEClass, IAdtObjectTag.class, "AdtObjectTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdtObjectTag_ParentObjectName(), ecorePackage.getEString(), "parentObjectName", null, 0, 1, IAdtObjectTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdtObjectTag_ParentObjectType(), ecorePackage.getEString(), "parentObjectType", null, 0, 1, IAdtObjectTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdtObjectTag_ParentObjectUri(), ecorePackage.getEString(), "parentObjectUri", null, 0, 1, IAdtObjectTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdtObjectTag_ParentTagId(), ecorePackage.getEString(), "parentTagId", null, 0, 1, IAdtObjectTag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdtObjectTag_ParentTagName(), ecorePackage.getEString(), "parentTagName", null, 0, 1, IAdtObjectTag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdtObjectTag_UserTag(), ecorePackage.getEBoolean(), "userTag", null, 0, 1, IAdtObjectTag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagListEClass, ITagList.class, "TagList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagList_Tags(), this.getTag(), null, "tags", null, 0, -1, ITagList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagPreviewInfoEClass, ITagPreviewInfo.class, "TagPreviewInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagPreviewInfo_Tags(), this.getTag(), null, "tags", null, 0, -1, ITagPreviewInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagPreviewInfo_AdtObjectRefs(), theAdtBasePackage.getAdtObjRef(), null, "adtObjectRefs", null, 0, -1, ITagPreviewInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedObjectEClass, ITaggedObject.class, "TaggedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaggedObject_ObjectRef(), theAdtBasePackage.getAdtObjRef(), null, "objectRef", null, 0, 1, ITaggedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaggedObject_Tags(), this.getAdtObjectTag(), null, "tags", null, 0, -1, ITaggedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedObjectListEClass, ITaggedObjectList.class, "TaggedObjectList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaggedObjectList_TaggedObjects(), this.getTaggedObject(), null, "taggedObjects", null, 0, -1, ITaggedObjectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedObjectSearchParamsEClass, ITaggedObjectSearchParams.class, "TaggedObjectSearchParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedObjectSearchParams_TagIds(), ecorePackage.getEString(), "tagIds", null, 0, -1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_SearchScope(), this.getTagSearchScope(), "searchScope", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_Query(), ecorePackage.getEString(), "query", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_QueryType(), this.getTagQueryType(), "queryType", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_QueryFocus(), this.getTagQueryFocus(), "queryFocus", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_MaxResults(), ecorePackage.getEInt(), "maxResults", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_MatchesAllTags(), ecorePackage.getEBoolean(), "matchesAllTags", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_WithTagInfo(), ecorePackage.getEBoolean(), "withTagInfo", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedObjectSearchParams_TagInfoType(), this.getTagInfoType(), "tagInfoType", null, 0, 1, ITaggedObjectSearchParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tagSearchScopeEEnum, TagSearchScope.class, "TagSearchScope");
		addEEnumLiteral(tagSearchScopeEEnum, TagSearchScope.ALL);
		addEEnumLiteral(tagSearchScopeEEnum, TagSearchScope.GLOBAL);
		addEEnumLiteral(tagSearchScopeEEnum, TagSearchScope.USER);

		initEEnum(tagQueryTypeEEnum, TagQueryType.class, "TagQueryType");
		addEEnumLiteral(tagQueryTypeEEnum, TagQueryType.OBJECT_NAME);
		addEEnumLiteral(tagQueryTypeEEnum, TagQueryType.OBJECT_URI);
		addEEnumLiteral(tagQueryTypeEEnum, TagQueryType.OBJECT_NAME_TYPE_COMBO);

		initEEnum(tagInfoTypeEEnum, TagInfoType.class, "TagInfoType");
		addEEnumLiteral(tagInfoTypeEEnum, TagInfoType.ALL);
		addEEnumLiteral(tagInfoTypeEEnum, TagInfoType.CHILDREN);

		initEEnum(tagQueryFocusEEnum, TagQueryFocus.class, "TagQueryFocus");
		addEEnumLiteral(tagQueryFocusEEnum, TagQueryFocus.OBJECT);
		addEEnumLiteral(tagQueryFocusEEnum, TagQueryFocus.PARENT_OBJECT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (tagBaseEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "tagBase"
		   });
		addAnnotation
		  (getTagBase_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTagBase_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTagBase_Owner(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "owner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tagEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "tag"
		   });
		addAnnotation
		  (getTag_Description(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_ChildTags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_CreatedBy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "createdBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_CreatedDateTime(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "createdDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_ChangedBy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "changedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_ChangedDateTime(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "changedDateTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_TaggedObjectCount(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "taggedObjectCount",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_Changed(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "changed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTag_ParentTagId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parentTagId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (adtObjectTagEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "adtObjectTag"
		   });
		addAnnotation
		  (getAdtObjectTag_ParentObjectName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parentObjectName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdtObjectTag_ParentObjectType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parentObjectType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdtObjectTag_ParentObjectUri(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parentObjectUri",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tagListEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "tags"
		   });
		addAnnotation
		  (getTagList_Tags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tagPreviewInfoEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "tagPreviewInfo"
		   });
		addAnnotation
		  (getTagPreviewInfo_Tags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTagPreviewInfo_AdtObjectRefs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adtObjRef",
			   "namespace", "http://www.devepos.com/adt/base"
		   });
		addAnnotation
		  (taggedObjectEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "taggedObject"
		   });
		addAnnotation
		  (getTaggedObject_ObjectRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adtObjRef",
			   "namespace", "http://www.devepos.com/adt/base"
		   });
		addAnnotation
		  (getTaggedObject_Tags(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "adtObjectTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (taggedObjectListEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "taggedObjects"
		   });
		addAnnotation
		  (getTaggedObjectList_TaggedObjects(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "taggedObject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (taggedObjectSearchParamsEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "taggedObjectSearchParams"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_TagIds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tagId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_SearchScope(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "searchScope",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_Query(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "query",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_QueryType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "queryType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_QueryFocus(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "queryFocus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_MaxResults(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "maxResults",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_MatchesAllTags(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "matchesAllTags",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_WithTagInfo(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "withTagInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTaggedObjectSearchParams_TagInfoType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "tagInfoType",
			   "namespace", "##targetNamespace"
		   });
	}

} //AbapTagsPackage
