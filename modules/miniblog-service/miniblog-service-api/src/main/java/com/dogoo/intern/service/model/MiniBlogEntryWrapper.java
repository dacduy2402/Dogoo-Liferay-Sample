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
 * This class is a wrapper for {@link MiniBlogEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiniBlogEntry
 * @generated
 */
public class MiniBlogEntryWrapper
	extends BaseModelWrapper<MiniBlogEntry>
	implements MiniBlogEntry, ModelWrapper<MiniBlogEntry> {

	public MiniBlogEntryWrapper(MiniBlogEntry miniBlogEntry) {
		super(miniBlogEntry);
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
		attributes.put("title", getTitle());
		attributes.put("image", getImage());
		attributes.put("shortDescription", getShortDescription());
		attributes.put("longDescription", getLongDescription());

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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String shortDescription = (String)attributes.get("shortDescription");

		if (shortDescription != null) {
			setShortDescription(shortDescription);
		}

		String longDescription = (String)attributes.get("longDescription");

		if (longDescription != null) {
			setLongDescription(longDescription);
		}
	}

	@Override
	public MiniBlogEntry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this mini blog entry.
	 *
	 * @return the company ID of this mini blog entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mini blog entry.
	 *
	 * @return the create date of this mini blog entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this mini blog entry.
	 *
	 * @return the group ID of this mini blog entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this mini blog entry.
	 *
	 * @return the ID of this mini blog entry
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the image of this mini blog entry.
	 *
	 * @return the image of this mini blog entry
	 */
	@Override
	public String getImage() {
		return model.getImage();
	}

	/**
	 * Returns the long description of this mini blog entry.
	 *
	 * @return the long description of this mini blog entry
	 */
	@Override
	public String getLongDescription() {
		return model.getLongDescription();
	}

	/**
	 * Returns the modified date of this mini blog entry.
	 *
	 * @return the modified date of this mini blog entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this mini blog entry.
	 *
	 * @return the primary key of this mini blog entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the short description of this mini blog entry.
	 *
	 * @return the short description of this mini blog entry
	 */
	@Override
	public String getShortDescription() {
		return model.getShortDescription();
	}

	/**
	 * Returns the title of this mini blog entry.
	 *
	 * @return the title of this mini blog entry
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this mini blog entry.
	 *
	 * @return the user ID of this mini blog entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mini blog entry.
	 *
	 * @return the user name of this mini blog entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mini blog entry.
	 *
	 * @return the user uuid of this mini blog entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this mini blog entry.
	 *
	 * @return the uuid of this mini blog entry
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
	 * Sets the company ID of this mini blog entry.
	 *
	 * @param companyId the company ID of this mini blog entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mini blog entry.
	 *
	 * @param createDate the create date of this mini blog entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this mini blog entry.
	 *
	 * @param groupId the group ID of this mini blog entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this mini blog entry.
	 *
	 * @param id the ID of this mini blog entry
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the image of this mini blog entry.
	 *
	 * @param image the image of this mini blog entry
	 */
	@Override
	public void setImage(String image) {
		model.setImage(image);
	}

	/**
	 * Sets the long description of this mini blog entry.
	 *
	 * @param longDescription the long description of this mini blog entry
	 */
	@Override
	public void setLongDescription(String longDescription) {
		model.setLongDescription(longDescription);
	}

	/**
	 * Sets the modified date of this mini blog entry.
	 *
	 * @param modifiedDate the modified date of this mini blog entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this mini blog entry.
	 *
	 * @param primaryKey the primary key of this mini blog entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the short description of this mini blog entry.
	 *
	 * @param shortDescription the short description of this mini blog entry
	 */
	@Override
	public void setShortDescription(String shortDescription) {
		model.setShortDescription(shortDescription);
	}

	/**
	 * Sets the title of this mini blog entry.
	 *
	 * @param title the title of this mini blog entry
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this mini blog entry.
	 *
	 * @param userId the user ID of this mini blog entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mini blog entry.
	 *
	 * @param userName the user name of this mini blog entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mini blog entry.
	 *
	 * @param userUuid the user uuid of this mini blog entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this mini blog entry.
	 *
	 * @param uuid the uuid of this mini blog entry
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
	protected MiniBlogEntryWrapper wrap(MiniBlogEntry miniBlogEntry) {
		return new MiniBlogEntryWrapper(miniBlogEntry);
	}

}