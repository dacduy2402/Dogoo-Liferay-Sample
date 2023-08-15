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

import com.dogoo.intern.service.exception.NoSuchDGContactEntryException;
import com.dogoo.intern.service.model.DGContactEntry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dg contact entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DGContactEntryUtil
 * @generated
 */
@ProviderType
public interface DGContactEntryPersistence
	extends BasePersistence<DGContactEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DGContactEntryUtil} to access the dg contact entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dg contact entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dg contact entries
	 */
	public java.util.List<DGContactEntry> findByUuid(String uuid);

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
	public java.util.List<DGContactEntry> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<DGContactEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

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
	public java.util.List<DGContactEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public DGContactEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
				orderByComparator)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public DGContactEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public DGContactEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
				orderByComparator)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public DGContactEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

	/**
	 * Returns the dg contact entries before and after the current dg contact entry in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current dg contact entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dg contact entry
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public DGContactEntry[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
				orderByComparator)
		throws NoSuchDGContactEntryException;

	/**
	 * Removes all the dg contact entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of dg contact entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dg contact entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the dg contact entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDGContactEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public DGContactEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the dg contact entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public DGContactEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the dg contact entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public DGContactEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the dg contact entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dg contact entry that was removed
	 */
	public DGContactEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the number of dg contact entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dg contact entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dg contact entries
	 */
	public java.util.List<DGContactEntry> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<DGContactEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<DGContactEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

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
	public java.util.List<DGContactEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public DGContactEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
				orderByComparator)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the first dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public DGContactEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry
	 * @throws NoSuchDGContactEntryException if a matching dg contact entry could not be found
	 */
	public DGContactEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
				orderByComparator)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the last dg contact entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dg contact entry, or <code>null</code> if a matching dg contact entry could not be found
	 */
	public DGContactEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

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
	public DGContactEntry[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
				orderByComparator)
		throws NoSuchDGContactEntryException;

	/**
	 * Removes all the dg contact entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of dg contact entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dg contact entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the dg contact entry in the entity cache if it is enabled.
	 *
	 * @param dgContactEntry the dg contact entry
	 */
	public void cacheResult(DGContactEntry dgContactEntry);

	/**
	 * Caches the dg contact entries in the entity cache if it is enabled.
	 *
	 * @param dgContactEntries the dg contact entries
	 */
	public void cacheResult(java.util.List<DGContactEntry> dgContactEntries);

	/**
	 * Creates a new dg contact entry with the primary key. Does not add the dg contact entry to the database.
	 *
	 * @param id the primary key for the new dg contact entry
	 * @return the new dg contact entry
	 */
	public DGContactEntry create(long id);

	/**
	 * Removes the dg contact entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry that was removed
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public DGContactEntry remove(long id) throws NoSuchDGContactEntryException;

	public DGContactEntry updateImpl(DGContactEntry dgContactEntry);

	/**
	 * Returns the dg contact entry with the primary key or throws a <code>NoSuchDGContactEntryException</code> if it could not be found.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry
	 * @throws NoSuchDGContactEntryException if a dg contact entry with the primary key could not be found
	 */
	public DGContactEntry findByPrimaryKey(long id)
		throws NoSuchDGContactEntryException;

	/**
	 * Returns the dg contact entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dg contact entry
	 * @return the dg contact entry, or <code>null</code> if a dg contact entry with the primary key could not be found
	 */
	public DGContactEntry fetchByPrimaryKey(long id);

	/**
	 * Returns all the dg contact entries.
	 *
	 * @return the dg contact entries
	 */
	public java.util.List<DGContactEntry> findAll();

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
	public java.util.List<DGContactEntry> findAll(int start, int end);

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
	public java.util.List<DGContactEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator);

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
	public java.util.List<DGContactEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DGContactEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dg contact entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dg contact entries.
	 *
	 * @return the number of dg contact entries
	 */
	public int countAll();

}