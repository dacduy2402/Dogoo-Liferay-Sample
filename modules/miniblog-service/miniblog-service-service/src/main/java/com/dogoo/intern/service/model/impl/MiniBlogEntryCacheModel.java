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

package com.dogoo.intern.service.model.impl;

import com.dogoo.intern.service.model.MiniBlogEntry;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiniBlogEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiniBlogEntryCacheModel
	implements CacheModel<MiniBlogEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiniBlogEntryCacheModel)) {
			return false;
		}

		MiniBlogEntryCacheModel miniBlogEntryCacheModel =
			(MiniBlogEntryCacheModel)object;

		if (id == miniBlogEntryCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", image=");
		sb.append(image);
		sb.append(", shortDescription=");
		sb.append(shortDescription);
		sb.append(", longDescription=");
		sb.append(longDescription);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiniBlogEntry toEntityModel() {
		MiniBlogEntryImpl miniBlogEntryImpl = new MiniBlogEntryImpl();

		if (uuid == null) {
			miniBlogEntryImpl.setUuid("");
		}
		else {
			miniBlogEntryImpl.setUuid(uuid);
		}

		miniBlogEntryImpl.setId(id);
		miniBlogEntryImpl.setGroupId(groupId);
		miniBlogEntryImpl.setCompanyId(companyId);
		miniBlogEntryImpl.setUserId(userId);

		if (userName == null) {
			miniBlogEntryImpl.setUserName("");
		}
		else {
			miniBlogEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miniBlogEntryImpl.setCreateDate(null);
		}
		else {
			miniBlogEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miniBlogEntryImpl.setModifiedDate(null);
		}
		else {
			miniBlogEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			miniBlogEntryImpl.setTitle("");
		}
		else {
			miniBlogEntryImpl.setTitle(title);
		}

		if (image == null) {
			miniBlogEntryImpl.setImage("");
		}
		else {
			miniBlogEntryImpl.setImage(image);
		}

		if (shortDescription == null) {
			miniBlogEntryImpl.setShortDescription("");
		}
		else {
			miniBlogEntryImpl.setShortDescription(shortDescription);
		}

		if (longDescription == null) {
			miniBlogEntryImpl.setLongDescription("");
		}
		else {
			miniBlogEntryImpl.setLongDescription(longDescription);
		}

		miniBlogEntryImpl.resetOriginalValues();

		return miniBlogEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		image = objectInput.readUTF();
		shortDescription = objectInput.readUTF();
		longDescription = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (image == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(image);
		}

		if (shortDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shortDescription);
		}

		if (longDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(longDescription);
		}
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String image;
	public String shortDescription;
	public String longDescription;

}