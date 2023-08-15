/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dogoo.intern.service.service;

import com.dogoo.intern.service.model.DGContactEntry;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DGContactEntry. This utility wraps
 * <code>com.dogoo.intern.service.service.impl.DGContactEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DGContactEntryLocalService
 * @generated
 */
public class DGContactEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dogoo.intern.service.service.impl.DGContactEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DGContactEntry addContact(
		com.dogoo.intern.service.mapper.model.DGContactEntryMapper
			dgContactEntryMapper) {

		return getService().addContact(dgContactEntryMapper);
	}

	/**
	 * Adds the dg contact entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DGContactEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dgContactEntry the dg contact entry
	 * @return the dg contact entry that was added
	 */
	public static DGContactEntry addDGContactEntry(
		DGContactEntry dgContactEntry) {

		return getService().addDGContactEntry(dgContactEntry);
	}

	/**
	 * Creates a new dg contact entry with the primary key. Does not add the dg contact entry to the database.
	 *
	 * @param id the primary key for the new dg contact entry
	 * @return the new dg contact entry
	 */
	public static DGContactEntry createDGContactEntry(long id) {
		return getService().createDGContactEntry(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the dg contact entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DGContactEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dgContactEntry the dg contact entry
	 * @return the dg contact entry that was removed
	 */
	public static DGContactEntry deleteDGContactEntry(
		DGContactEntry dgContactEntry) {

		return getService().deleteDGContactEntry(dgContactEntry);
	}

	/**
	 * Deletes the dg contact entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DGContactEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry that was removed
	 * @throws PortalException if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry deleteDGContactEntry(long id)
		throws PortalException {

		return getService().deleteDGContactEntry(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.intern.service.model.impl.DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.intern.service.model.impl.DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static DGContactEntry fetchDGContactEntry(long id) {
		return getService().fetchDGContactEntry(id);
	}

	/**
	 * Returns the dg contact entry matching the UUID and group.
	 *
	 * @param uuid the dg contact entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchDGContactEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDGContactEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<DGContactEntry> getAllContact() {
		return getService().getAllContact();
	}

	/**
	 * Returns a range of all the dg contact entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.intern.service.model.impl.DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @return the range of dg contact entries
	 */
	public static List<DGContactEntry> getDGContactEntries(int start, int end) {
		return getService().getDGContactEntries(start, end);
	}

	/**
	 * Returns all the dg contact entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the dg contact entries
	 * @param companyId the primary key of the company
	 * @return the matching dg contact entries, or an empty list if no matches were found
	 */
	public static List<DGContactEntry> getDGContactEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDGContactEntriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of dg contact entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the dg contact entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dg contact entries, or an empty list if no matches were found
	 */
	public static List<DGContactEntry> getDGContactEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getService().getDGContactEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dg contact entries.
	 *
	 * @return the number of dg contact entries
	 */
	public static int getDGContactEntriesCount() {
		return getService().getDGContactEntriesCount();
	}

	/**
	 * Returns the dg contact entry with the primary key.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry
	 * @throws PortalException if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry getDGContactEntry(long id)
		throws PortalException {

		return getService().getDGContactEntry(id);
	}

	/**
	 * Returns the dg contact entry matching the UUID and group.
	 *
	 * @param uuid the dg contact entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dg contact entry
	 * @throws PortalException if a matching dg contact entry could not be found
	 */
	public static DGContactEntry getDGContactEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDGContactEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static void mapContactData(
		com.dogoo.intern.service.mapper.model.DGContactEntryMapper
			dgContactEntryMapper,
		DGContactEntry dgContactEntry) {

		getService().mapContactData(dgContactEntryMapper, dgContactEntry);
	}

	/**
	 * Updates the dg contact entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DGContactEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dgContactEntry the dg contact entry
	 * @return the dg contact entry that was updated
	 */
	public static DGContactEntry updateDGContactEntry(
		DGContactEntry dgContactEntry) {

		return getService().updateDGContactEntry(dgContactEntry);
	}

	public static DGContactEntryLocalService getService() {
		return _service;
	}

	private static volatile DGContactEntryLocalService _service;

}