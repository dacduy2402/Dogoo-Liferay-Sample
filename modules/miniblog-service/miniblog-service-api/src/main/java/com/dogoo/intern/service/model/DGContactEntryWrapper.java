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

package com.dogoo.intern.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DGContactEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DGContactEntry
 * @generated
 */
public class DGContactEntryWrapper
	extends BaseModelWrapper<DGContactEntry>
	implements DGContactEntry, ModelWrapper<DGContactEntry> {

	public DGContactEntryWrapper(DGContactEntry dgContactEntry) {
		super(dgContactEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public DGContactEntry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this dg contact entry.
	 *
	 * @return the company ID of this dg contact entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this dg contact entry.
	 *
	 * @return the create date of this dg contact entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this dg contact entry.
	 *
	 * @return the email of this dg contact entry
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this dg contact entry.
	 *
	 * @return the group ID of this dg contact entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this dg contact entry.
	 *
	 * @return the ID of this dg contact entry
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the message of this dg contact entry.
	 *
	 * @return the message of this dg contact entry
	 */
	@Override
	public String getMessage() {
		return model.getMessage();
	}

	/**
	 * Returns the modified date of this dg contact entry.
	 *
	 * @return the modified date of this dg contact entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this dg contact entry.
	 *
	 * @return the name of this dg contact entry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this dg contact entry.
	 *
	 * @return the primary key of this dg contact entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this dg contact entry.
	 *
	 * @return the user ID of this dg contact entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this dg contact entry.
	 *
	 * @return the user name of this dg contact entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this dg contact entry.
	 *
	 * @return the user uuid of this dg contact entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this dg contact entry.
	 *
	 * @return the uuid of this dg contact entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this dg contact entry.
	 *
	 * @param companyId the company ID of this dg contact entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this dg contact entry.
	 *
	 * @param createDate the create date of this dg contact entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this dg contact entry.
	 *
	 * @param email the email of this dg contact entry
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this dg contact entry.
	 *
	 * @param groupId the group ID of this dg contact entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this dg contact entry.
	 *
	 * @param id the ID of this dg contact entry
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the message of this dg contact entry.
	 *
	 * @param message the message of this dg contact entry
	 */
	@Override
	public void setMessage(String message) {
		model.setMessage(message);
	}

	/**
	 * Sets the modified date of this dg contact entry.
	 *
	 * @param modifiedDate the modified date of this dg contact entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this dg contact entry.
	 *
	 * @param name the name of this dg contact entry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this dg contact entry.
	 *
	 * @param primaryKey the primary key of this dg contact entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this dg contact entry.
	 *
	 * @param userId the user ID of this dg contact entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this dg contact entry.
	 *
	 * @param userName the user name of this dg contact entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this dg contact entry.
	 *
	 * @param userUuid the user uuid of this dg contact entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this dg contact entry.
	 *
	 * @param uuid the uuid of this dg contact entry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected DGContactEntryWrapper wrap(DGContactEntry dgContactEntry) {
		return new DGContactEntryWrapper(dgContactEntry);
	}

}