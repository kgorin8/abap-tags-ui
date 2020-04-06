package com.devepos.adt.abaptags.tags.service;

import com.devepos.adt.abaptags.internal.tags.service.AbapTagsService;

/**
 * Factory for creating an instance for the ABAP Tags Service
 *
 * @author stockbal
 */
public class AbapTagsServiceFactory {

	/**
	 * Creates new instance of ABAP Tags service
	 *
	 * @return the created service instance
	 */
	public static IAbapTagsService createTagsService() {
		return new AbapTagsService();
	}
}