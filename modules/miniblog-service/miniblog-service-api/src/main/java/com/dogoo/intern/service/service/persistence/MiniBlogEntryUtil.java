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

import com.dogoo.intern.service.model.MiniBlogEntry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mini blog entry service. This utility wraps <code>com.dogoo.intern.service.service.persistence.impl.MiniBlogEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiniBlogEntryPersistence
 * @generated
 */
public class MiniBlogEntryUtil {

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
	public static void clearCache(MiniBlogEntry miniBlogEntry) {
		getPersistence().clearCache(miniBlogEntry);
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
	public static Map<Serializable, MiniBlogEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiniBlogEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiniBlogEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiniBlogEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiniBlogEntry update(MiniBlogEntry miniBlogEntry) {
		return getPersistence().update(miniBlogEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiniBlogEntry update(
		MiniBlogEntry miniBlogEntry, ServiceContext serviceContext) {

		return getPersistence().update(miniBlogEntry, serviceContext);
	}

	/**
	 * Returns all the mini blog entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the mini blog entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @return the range of matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the mini blog entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mini blog entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mini blog entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry findByUuid_First(
			String uuid, OrderByComparator<MiniBlogEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first mini blog entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchByUuid_First(
		String uuid, OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last mini blog entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry findByUuid_Last(
			String uuid, OrderByComparator<MiniBlogEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last mini blog entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchByUuid_Last(
		String uuid, OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the mini blog entries before and after the current mini blog entry in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current mini blog entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<MiniBlogEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the mini blog entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of mini blog entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mini blog entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the mini blog entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiniBlogEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry findByUUID_G(String uuid, long groupId)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mini blog entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mini blog entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the mini blog entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mini blog entry that was removed
	 */
	public static MiniBlogEntry removeByUUID_G(String uuid, long groupId)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of mini blog entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mini blog entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the mini blog entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the mini blog entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @return the range of matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the mini blog entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mini blog entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mini blog entries
	 */
	public static List<MiniBlogEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mini blog entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiniBlogEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first mini blog entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mini blog entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiniBlogEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mini blog entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mini blog entry, or <code>null</code> if a matching mini blog entry could not be found
	 */
	public static MiniBlogEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the mini blog entries before and after the current mini blog entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current mini blog entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<MiniBlogEntry> orderByComparator)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the mini blog entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of mini blog entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mini blog entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the mini blog entry in the entity cache if it is enabled.
	 *
	 * @param miniBlogEntry the mini blog entry
	 */
	public static void cacheResult(MiniBlogEntry miniBlogEntry) {
		getPersistence().cacheResult(miniBlogEntry);
	}

	/**
	 * Caches the mini blog entries in the entity cache if it is enabled.
	 *
	 * @param miniBlogEntries the mini blog entries
	 */
	public static void cacheResult(List<MiniBlogEntry> miniBlogEntries) {
		getPersistence().cacheResult(miniBlogEntries);
	}

	/**
	 * Creates a new mini blog entry with the primary key. Does not add the mini blog entry to the database.
	 *
	 * @param id the primary key for the new mini blog entry
	 * @return the new mini blog entry
	 */
	public static MiniBlogEntry create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the mini blog entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mini blog entry
	 * @return the mini blog entry that was removed
	 * @throws NoSuchMiniBlogEntryException if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry remove(long id)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().remove(id);
	}

	public static MiniBlogEntry updateImpl(MiniBlogEntry miniBlogEntry) {
		return getPersistence().updateImpl(miniBlogEntry);
	}

	/**
	 * Returns the mini blog entry with the primary key or throws a <code>NoSuchMiniBlogEntryException</code> if it could not be found.
	 *
	 * @param id the primary key of the mini blog entry
	 * @return the mini blog entry
	 * @throws NoSuchMiniBlogEntryException if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry findByPrimaryKey(long id)
		throws com.dogoo.intern.service.exception.NoSuchMiniBlogEntryException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the mini blog entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mini blog entry
	 * @return the mini blog entry, or <code>null</code> if a mini blog entry with the primary key could not be found
	 */
	public static MiniBlogEntry fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the mini blog entries.
	 *
	 * @return the mini blog entries
	 */
	public static List<MiniBlogEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mini blog entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @return the range of mini blog entries
	 */
	public static List<MiniBlogEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mini blog entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mini blog entries
	 */
	public static List<MiniBlogEntry> findAll(
		int start, int end,
		OrderByComparator<MiniBlogEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mini blog entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiniBlogEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mini blog entries
	 * @param end the upper bound of the range of mini blog entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mini blog entries
	 */
	public static List<MiniBlogEntry> findAll(
		int start, int end, OrderByComparator<MiniBlogEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mini blog entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mini blog entries.
	 *
	 * @return the number of mini blog entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiniBlogEntryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile MiniBlogEntryPersistence _persistence;

}