/**
 */
package com.devepos.adt.abaptags;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.devepos.adt.abaptags.ITags#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see com.devepos.adt.abaptags.IAbapTagsPackage#getTags()
 * @model extendedMetaData="kind='elementOnly' name='tags'"
 * @generated
 */
public interface ITags extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link com.devepos.adt.abaptags.ITag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see com.devepos.adt.abaptags.IAbapTagsPackage#getTags_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ITag> getTags();

} // ITags