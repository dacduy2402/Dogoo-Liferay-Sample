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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiniBlogEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiniBlogEntryLocalService
 * @generated
 */
public class MiniBlogEntryLocalServiceWrapper
	implements MiniBlogEntryLocalService,
			   ServiceWrapper<MiniBlogEntryLocalService> {

	public MiniBlogEntryLocalServiceWrapper(
		MiniBlogEntryLocalService miniBlogEntryLocalService) {

		_miniBlogEntryLocalService = miniBlogEntryLocalService;
	}

	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry addMiniBlog(
		com.dogoo.intern.service.mapper.model.MiniblogEntryMapper
			miniblogEntryMapper) {

		return _miniBlogEntryLocalService.addMiniBlog(miniblogEntryMapper);
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
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry addMiniBlogEntry(
		com.dogoo.intern.service.model.MiniBlogEntry miniBlogEntry) {

		return _miniBlogEntryLocalService.addMiniBlogEntry(miniBlogEntry);
	}

	/**
	 * Creates a new mini blog entry with the primary key. Does not add the mini blog entry to the database.
	 *
	 * @param id the primary key for the new mini blog entry
	 * @return the new mini blog entry
	 */
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry createMiniBlogEntry(
		long id) {

		return _miniBlogEntryLocalService.createMiniBlogEntry(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteMiniBlogById(Long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		_miniBlogEntryLocalService.deleteMiniBlogById(id);
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
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry deleteMiniBlogEntry(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.deleteMiniBlogEntry(id);
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
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry deleteMiniBlogEntry(
		com.dogoo.intern.service.model.MiniBlogEntry miniBlogEntry) {

		return _miniBlogEntryLocalService.deleteMiniBlogEntry(miniBlogEntry);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miniBlogEntryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miniBlogEntryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miniBlogEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _miniBlogEntryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _miniBlogEntryLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _miniBlogEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _miniBlogEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _miniBlogEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry fetchMiniBlogEntry(
		long id) {

		return _miniBlogEntryLocalService.fetchMiniBlogEntry(id);
	}

	/**
	 * Returns the mini blog entry matching the UUID and group.
	 *
	 * @param uuid the mini blog entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry
		fetchMiniBlogEntryByUuidAndGroupId(String uuid, long groupId) {

		return _miniBlogEntryLocalService.fetchMiniBlogEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miniBlogEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.dogoo.intern.service.model.MiniBlogEntry>
		getAllMiniBlog() {

		return _miniBlogEntryLocalService.getAllMiniBlog();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miniBlogEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miniBlogEntryLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry getMiniBlogById(
		Long id) {

		return _miniBlogEntryLocalService.getMiniBlogById(id);
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
	@Override
	public java.util.List<com.dogoo.intern.service.model.MiniBlogEntry>
		getMiniBlogEntries(int start, int end) {

		return _miniBlogEntryLocalService.getMiniBlogEntries(start, end);
	}

	/**
	 * Returns all the mini blog entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the mini blog entries
	 * @param companyId the primary key of the company
	 * @return the matching mini blog entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dogoo.intern.service.model.MiniBlogEntry>
		getMiniBlogEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _miniBlogEntryLocalService.getMiniBlogEntriesByUuidAndCompanyId(
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
	@Override
	public java.util.List<com.dogoo.intern.service.model.MiniBlogEntry>
		getMiniBlogEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dogoo.intern.service.model.MiniBlogEntry>
					orderByComparator) {

		return _miniBlogEntryLocalService.getMiniBlogEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mini blog entries.
	 *
	 * @return the number of mini blog entries
	 */
	@Override
	public int getMiniBlogEntriesCount() {
		return _miniBlogEntryLocalService.getMiniBlogEntriesCount();
	}

	/**
	 * Returns the mini blog entry with the primary key.
	 *
	 * @param id the primary key of the mini blog entry
	 * @return the mini blog entry
	 * @throws PortalException if a mini blog entry with the primary key could not be found
	 */
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry getMiniBlogEntry(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.getMiniBlogEntry(id);
	}

	/**
	 * Returns the mini blog entry matching the UUID and group.
	 *
	 * @param uuid the mini blog entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mini blog entry
	 * @throws PortalException if a matching mini blog entry could not be found
	 */
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry
			getMiniBlogEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.getMiniBlogEntryByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miniBlogEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void mapMiniBlogData(
		com.dogoo.intern.service.model.MiniBlogEntry miniBlogEntry,
		com.dogoo.intern.service.mapper.model.MiniblogEntryMapper
			miniblogEntryMapper) {

		_miniBlogEntryLocalService.mapMiniBlogData(
			miniBlogEntry, miniblogEntryMapper);
	}

	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry updateMiniBlogById(
			Long id,
			com.dogoo.intern.service.mapper.model.MiniblogEntryMapper
				miniBlogMapper)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miniBlogEntryLocalService.updateMiniBlogById(
			id, miniBlogMapper);
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
	@Override
	public com.dogoo.intern.service.model.MiniBlogEntry updateMiniBlogEntry(
		com.dogoo.intern.service.model.MiniBlogEntry miniBlogEntry) {

		return _miniBlogEntryLocalService.updateMiniBlogEntry(miniBlogEntry);
	}

	@Override
	public MiniBlogEntryLocalService getWrappedService() {
		return _miniBlogEntryLocalService;
	}

	@Override
	public void setWrappedService(
		MiniBlogEntryLocalService miniBlogEntryLocalService) {

		_miniBlogEntryLocalService = miniBlogEntryLocalService;
	}

	private MiniBlogEntryLocalService _miniBlogEntryLocalService;

}