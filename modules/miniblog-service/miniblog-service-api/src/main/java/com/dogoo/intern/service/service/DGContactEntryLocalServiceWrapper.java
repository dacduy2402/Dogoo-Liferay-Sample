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
 * Provides a wrapper for {@link DGContactEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DGContactEntryLocalService
 * @generated
 */
public class DGContactEntryLocalServiceWrapper
	implements DGContactEntryLocalService,
			   ServiceWrapper<DGContactEntryLocalService> {

	public DGContactEntryLocalServiceWrapper(
		DGContactEntryLocalService dgContactEntryLocalService) {

		_dgContactEntryLocalService = dgContactEntryLocalService;
	}

	@Override
	public com.dogoo.intern.service.model.DGContactEntry addContact(
		com.dogoo.intern.service.mapper.model.DGContactEntryMapper
			dgContactEntryMapper) {

		return _dgContactEntryLocalService.addContact(dgContactEntryMapper);
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
	@Override
	public com.dogoo.intern.service.model.DGContactEntry addDGContactEntry(
		com.dogoo.intern.service.model.DGContactEntry dgContactEntry) {

		return _dgContactEntryLocalService.addDGContactEntry(dgContactEntry);
	}

	/**
	 * Creates a new dg contact entry with the primary key. Does not add the dg contact entry to the database.
	 *
	 * @param id the primary key for the new dg contact entry
	 * @return the new dg contact entry
	 */
	@Override
	public com.dogoo.intern.service.model.DGContactEntry createDGContactEntry(
		long id) {

		return _dgContactEntryLocalService.createDGContactEntry(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dgContactEntryLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.dogoo.intern.service.model.DGContactEntry deleteDGContactEntry(
		com.dogoo.intern.service.model.DGContactEntry dgContactEntry) {

		return _dgContactEntryLocalService.deleteDGContactEntry(dgContactEntry);
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
	@Override
	public com.dogoo.intern.service.model.DGContactEntry deleteDGContactEntry(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dgContactEntryLocalService.deleteDGContactEntry(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dgContactEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dgContactEntryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _dgContactEntryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dgContactEntryLocalService.dynamicQuery();
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

		return _dgContactEntryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _dgContactEntryLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _dgContactEntryLocalService.dynamicQuery(
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

		return _dgContactEntryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dgContactEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dogoo.intern.service.model.DGContactEntry fetchDGContactEntry(
		long id) {

		return _dgContactEntryLocalService.fetchDGContactEntry(id);
	}

	/**
	 * Returns the dg contact entry matching the UUID and group.
	 *
	 * @param uuid the dg contact entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	@Override
	public com.dogoo.intern.service.model.DGContactEntry
		fetchDGContactEntryByUuidAndGroupId(String uuid, long groupId) {

		return _dgContactEntryLocalService.fetchDGContactEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dgContactEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.dogoo.intern.service.model.DGContactEntry>
		getAllContact() {

		return _dgContactEntryLocalService.getAllContact();
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
	@Override
	public java.util.List<com.dogoo.intern.service.model.DGContactEntry>
		getDGContactEntries(int start, int end) {

		return _dgContactEntryLocalService.getDGContactEntries(start, end);
	}

	/**
	 * Returns all the dg contact entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the dg contact entries
	 * @param companyId the primary key of the company
	 * @return the matching dg contact entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dogoo.intern.service.model.DGContactEntry>
		getDGContactEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _dgContactEntryLocalService.
			getDGContactEntriesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.dogoo.intern.service.model.DGContactEntry>
		getDGContactEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dogoo.intern.service.model.DGContactEntry>
					orderByComparator) {

		return _dgContactEntryLocalService.
			getDGContactEntriesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dg contact entries.
	 *
	 * @return the number of dg contact entries
	 */
	@Override
	public int getDGContactEntriesCount() {
		return _dgContactEntryLocalService.getDGContactEntriesCount();
	}

	/**
	 * Returns the dg contact entry with the primary key.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry
	 * @throws PortalException if a dg contact entry with the primary key could not be found
	 */
	@Override
	public com.dogoo.intern.service.model.DGContactEntry getDGContactEntry(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dgContactEntryLocalService.getDGContactEntry(id);
	}

	/**
	 * Returns the dg contact entry matching the UUID and group.
	 *
	 * @param uuid the dg contact entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dg contact entry
	 * @throws PortalException if a matching dg contact entry could not be found
	 */
	@Override
	public com.dogoo.intern.service.model.DGContactEntry
			getDGContactEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dgContactEntryLocalService.getDGContactEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _dgContactEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dgContactEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dgContactEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dgContactEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void mapContactData(
		com.dogoo.intern.service.mapper.model.DGContactEntryMapper
			dgContactEntryMapper,
		com.dogoo.intern.service.model.DGContactEntry dgContactEntry) {

		_dgContactEntryLocalService.mapContactData(
			dgContactEntryMapper, dgContactEntry);
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
	@Override
	public com.dogoo.intern.service.model.DGContactEntry updateDGContactEntry(
		com.dogoo.intern.service.model.DGContactEntry dgContactEntry) {

		return _dgContactEntryLocalService.updateDGContactEntry(dgContactEntry);
	}

	@Override
	public DGContactEntryLocalService getWrappedService() {
		return _dgContactEntryLocalService;
	}

	@Override
	public void setWrappedService(
		DGContactEntryLocalService dgContactEntryLocalService) {

		_dgContactEntryLocalService = dgContactEntryLocalService;
	}

	private DGContactEntryLocalService _dgContactEntryLocalService;

}