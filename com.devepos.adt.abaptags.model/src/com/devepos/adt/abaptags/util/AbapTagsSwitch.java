/**
 */
package com.devepos.adt.abaptags.util;

import com.devepos.adt.abaptags.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.devepos.adt.abaptags.IAbapTagsPackage
 * @generated
 */
public class AbapTagsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IAbapTagsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbapTagsSwitch() {
		if (modelPackage == null) {
			modelPackage = IAbapTagsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IAbapTagsPackage.TAGS: {
				ITags tags = (ITags)theEObject;
				T result = caseTags(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAbapTagsPackage.TAG: {
				ITag tag = (ITag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAbapTagsPackage.ABAP_OBJECT_WITH_TAG: {
				IAbapObjectWithTag abapObjectWithTag = (IAbapObjectWithTag)theEObject;
				T result = caseAbapObjectWithTag(abapObjectWithTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAbapTagsPackage.ABAP_OBJECT_WITH_TAGS: {
				IAbapObjectWithTags abapObjectWithTags = (IAbapObjectWithTags)theEObject;
				T result = caseAbapObjectWithTags(abapObjectWithTags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAbapTagsPackage.ABAP_OBJECTS_WITH_TAGS: {
				IAbapObjectsWithTags abapObjectsWithTags = (IAbapObjectsWithTags)theEObject;
				T result = caseAbapObjectsWithTags(abapObjectsWithTags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAbapTagsPackage.ABAP_OBJECTS_WITH_TAG: {
				IAbapObjectsWithTag abapObjectsWithTag = (IAbapObjectsWithTag)theEObject;
				T result = caseAbapObjectsWithTag(abapObjectsWithTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTags(ITags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(ITag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abap Object With Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abap Object With Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbapObjectWithTag(IAbapObjectWithTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abap Object With Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abap Object With Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbapObjectWithTags(IAbapObjectWithTags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abap Objects With Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abap Objects With Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbapObjectsWithTags(IAbapObjectsWithTags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abap Objects With Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abap Objects With Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbapObjectsWithTag(IAbapObjectsWithTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbapTagsSwitch