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

import com.dogoo.intern.service.model.DGContactEntry;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DGContactEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DGContactEntryCacheModel
	implements CacheModel<DGContactEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DGContactEntryCacheModel)) {
			return false;
		}

		DGContactEntryCacheModel dgContactEntryCacheModel =
			(DGContactEntryCacheModel)object;

		if (id == dgContactEntryCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

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
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DGContactEntry toEntityModel() {
		DGContactEntryImpl dgContactEntryImpl = new DGContactEntryImpl();

		if (uuid == null) {
			dgContactEntryImpl.setUuid("");
		}
		else {
			dgContactEntryImpl.setUuid(uuid);
		}

		dgContactEntryImpl.setId(id);
		dgContactEntryImpl.setGroupId(groupId);
		dgContactEntryImpl.setCompanyId(companyId);
		dgContactEntryImpl.setUserId(userId);

		if (userName == null) {
			dgContactEntryImpl.setUserName("");
		}
		else {
			dgContactEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dgContactEntryImpl.setCreateDate(null);
		}
		else {
			dgContactEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dgContactEntryImpl.setModifiedDate(null);
		}
		else {
			dgContactEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			dgContactEntryImpl.setName("");
		}
		else {
			dgContactEntryImpl.setName(name);
		}

		if (email == null) {
			dgContactEntryImpl.setEmail("");
		}
		else {
			dgContactEntryImpl.setEmail(email);
		}

		if (message == null) {
			dgContactEntryImpl.setMessage("");
		}
		else {
			dgContactEntryImpl.setMessage(message);
		}

		dgContactEntryImpl.resetOriginalValues();

		return dgContactEntryImpl;
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
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		message = objectInput.readUTF();
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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
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
	public String name;
	public String email;
	public String message;

}