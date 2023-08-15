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

import com.dogoo.intern.service.model.MiniBlogEntry;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiniBlogEntry. This utility wraps
 * <code>com.dogoo.intern.service.service.impl.MiniBlogEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiniBlogEntryLocalService
 * @generated
 */
public class MiniBlogEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dogoo.intern.service.service.impl.MiniBlogEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static MiniBlogEntry addMiniBlog(
		com.dogoo.intern.service.mapper.model.MiniblogEntryMapper
			miniblogEntryMapper) {

		return getService().addMiniBlog(miniblogEntryMapper);
	}

	/**
	 * Adds the mini blog entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiniBlogEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miniBlogEntry the mini blog entry
	 * @return the mini blog entry that was added
	 */
	public static MiniBlogEntry addMiniBlogEntry(MiniBlogEntry miniBlogEntry) {
		return getService().addMiniBlogEntry(miniBlogEntry);
	}

	/**
	 * Creates a new mini blog entry with the primary key. Does not add the mini blog entry to the database.
	 *
	 * @param id the primary key for the new mini blog entry
	 * @return the new mini blog entry
	 */
	public static MiniBlogEntry createMiniBlogEntry(long id) {
		return getService().createMiniBlogEntry(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteMiniBlogById(Long id) throws PortalException {
		getService().deleteMiniBlogById(id);
	}

	/**
	 * Deletes the mini blog entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiniBlogEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the mini blog entry
	 * @return the mini blog entry that was removed
	 * @throws PortalException if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry deleteMiniBlogEntry(long id)
		throws PortalException {

		return getService().deleteMiniBlogEntry(id);
	}

	/**
	 * Deletes the mini blog entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiniBlogEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miniBlogEntry the mini blog entry
	 * @return the mini blog entry that was removed
	 */
	public static MiniBlogEntry deleteMiniBlogEntry(
		MiniBlogEntry miniBlogEntry) {

		return getService().deleteMiniBlogEntry(miniBlogEntry);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.intern.service.model.impl.MiniBlogEntryModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.intern.service.model.impl.MiniBlogEntryModelImpl</code>.
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

	public static MiniBlogEntry fetchMiniBlogEntry(long id) {
		return getService().fetchMiniBlogEntry(id);
	}

	/**
	 * Returns the mini blog entry matching the UUID and group.
	 *
	 * @param uuid the mini blog entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchMiniBlogEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMiniBlogEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<MiniBlogEntry> getAllMiniBlog() {
		return getService().getAllMiniBlog();
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

	public static MiniBlogEntry getMiniBlogById(Long id) {
		return getService().getMiniBlogById(id);
	}

	/**
	 * Returns a range of all the mini blog entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dogoo.intern.service.model.impl.MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @return the range of mini blog entries
	 */
	public static List<MiniBlogEntry> getMiniBlogEntries(int start, int end) {
		return getService().getMiniBlogEntries(start, end);
	}

	/**
	 * Returns all the mini blog entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the mini blog entries
	 * @param companyId the primary key of the company
	 * @return the matching mini blog entries, or an empty list if no matches were found
	 */
	public static List<MiniBlogEntry> getMiniBlogEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMiniBlogEntriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of mini blog entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the mini blog entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mini blog entries, or an empty list if no matches were found
	 */
	public static List<MiniBlogEntry> getMiniBlogEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getService().getMiniBlogEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mini blog entries.
	 *
	 * @return the number of mini blog entries
	 */
	public static int getMiniBlogEntriesCount() {
		return getService().getMiniBlogEntriesCount();
	}

	/**
	 * Returns the mini blog entry with the primary key.
	 *
	 * @param id the primary key of the mini blog entry
	 * @return the mini blog entry
	 * @throws PortalException if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry getMiniBlogEntry(long id)
		throws PortalException {

		return getService().getMiniBlogEntry(id);
	}

	/**
	 * Returns the mini blog entry matching the UUID and group.
	 *
	 * @param uuid the mini blog entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mini blog entry
	 * @throws PortalException if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry getMiniBlogEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMiniBlogEntryByUuidAndGroupId(uuid, groupId);
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

	public static void mapMiniBlogData(
		MiniBlogEntry miniBlogEntry,
		com.dogoo.intern.service.mapper.model.MiniblogEntryMapper
			miniblogEntryMapper) {

		getService().mapMiniBlogData(miniBlogEntry, miniblogEntryMapper);
	}

	public static MiniBlogEntry updateMiniBlogById(
			Long id,
			com.dogoo.intern.service.mapper.model.MiniblogEntryMapper
				miniBlogMapper)
		throws PortalException {

		return getService().updateMiniBlogById(id, miniBlogMapper);
	}

	/**
	 * Updates the mini blog entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiniBlogEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miniBlogEntry the mini blog entry
	 * @return the mini blog entry that was updated
	 */
	public static MiniBlogEntry updateMiniBlogEntry(
		MiniBlogEntry miniBlogEntry) {

		return getService().updateMiniBlogEntry(miniBlogEntry);
	}

	public static MiniBlogEntryLocalService getService() {
		return _service;
	}

	private static volatile MiniBlogEntryLocalService _service;

}