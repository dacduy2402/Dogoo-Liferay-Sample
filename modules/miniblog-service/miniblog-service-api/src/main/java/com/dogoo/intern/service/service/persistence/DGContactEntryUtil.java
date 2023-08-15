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

package com.dogoo.intern.service.service.persistence;

import com.dogoo.intern.service.model.DGContactEntry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the dg contact entry service. This utility wraps <code>com.dogoo.intern.service.service.persistence.impl.DGContactEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DGContactEntryPersistence
 * @generated
 */
public class DGContactEntryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DGContactEntry dgContactEntry) {
		getPersistence().clearCache(dgContactEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, DGContactEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DGContactEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DGContactEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DGContactEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DGContactEntry update(DGContactEntry dgContactEntry) {
		return getPersistence().update(dgContactEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DGContactEntry update(
		DGContactEntry dgContactEntry, ServiceContext serviceContext) {

		return getPersistence().update(dgContactEntry, serviceContext);
	}

	/**
	 * Returns all the dg contact entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the dg contact entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @return the range of matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the dg contact entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dg contact entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public static DGContactEntry findByUuid_First(
			String uuid, OrderByComparator<DGContactEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchByUuid_First(
		String uuid, OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public static DGContactEntry findByUuid_Last(
			String uuid, OrderByComparator<DGContactEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchByUuid_Last(
		String uuid, OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the dg contact entries before and after the current dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current dg contact entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dg contact entry
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<DGContactEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the dg contact entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of dg contact entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dg contact entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the dg contact entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDGContactEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public static DGContactEntry findByUUID_G(String uuid, long groupId)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dg contact entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dg contact entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the dg contact entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dg contact entry that was removed
	 */
	public static DGContactEntry removeByUUID_G(String uuid, long groupId)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of dg contact entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dg contact entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @return the range of matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dg contact entries
	 */
	public static List<DGContactEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public static DGContactEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DGContactEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public static DGContactEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DGContactEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public static DGContactEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the dg contact entries before and after the current dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current dg contact entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dg contact entry
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<DGContactEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the dg contact entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dg contact entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the dg contact entry in the entity cache if it is enabled.
	 *
	 * @param dgContactEntry the dg contact entry
	 */
	public static void cacheResult(DGContactEntry dgContactEntry) {
		getPersistence().cacheResult(dgContactEntry);
	}

	/**
	 * Caches the dg contact entries in the entity cache if it is enabled.
	 *
	 * @param dgContactEntries the dg contact entries
	 */
	public static void cacheResult(List<DGContactEntry> dgContactEntries) {
		getPersistence().cacheResult(dgContactEntries);
	}

	/**
	 * Creates a new dg contact entry with the primary key. Does not add the dg contact entry to the database.
	 *
	 * @param id the primary key for the new dg contact entry
	 * @return the new dg contact entry
	 */
	public static DGContactEntry create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the dg contact entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry that was removed
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry remove(long id)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().remove(id);
	}

	public static DGContactEntry updateImpl(DGContactEntry dgContactEntry) {
		return getPersistence().updateImpl(dgContactEntry);
	}

	/**
	 * Returns the dg contact entry with the primary key or throws a <code>NoSuchDGContactEntryException</code> if it could not be found.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry findByPrimaryKey(long id)
		throws com.dogoo.intern.service.exception.
			NoSuchDGContactEntryException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the dg contact entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry, or <code>null</code> if a dg contact entry with the primary key could not be found
	 */
	public static DGContactEntry fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the dg contact entries.
	 *
	 * @return the dg contact entries
	 */
	public static List<DGContactEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dg contact entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @return the range of dg contact entries
	 */
	public static List<DGContactEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dg contact entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dg contact entries
	 */
	public static List<DGContactEntry> findAll(
		int start, int end,
		OrderByComparator<DGContactEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dg contact entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DGContactEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dg contact entries
	 * @param end the upper bound of the range of dg contact entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dg contact entries
	 */
	public static List<DGContactEntry> findAll(
		int start, int end, OrderByComparator<DGContactEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dg contact entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dg contact entries.
	 *
	 * @return the number of dg contact entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DGContactEntryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DGContactEntryPersistence _persistence;

}