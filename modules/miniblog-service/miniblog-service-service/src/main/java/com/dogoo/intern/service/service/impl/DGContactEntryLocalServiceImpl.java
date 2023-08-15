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

package com.dogoo.intern.service.service.impl;

import com.dogoo.intern.service.mapper.model.DGContactEntryMapper;
import com.dogoo.intern.service.model.DGContactEntry;
import com.dogoo.intern.service.service.base.DGContactEntryLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dogoo.intern.service.model.DGContactEntry",
	service = AopService.class
)
public class DGContactEntryLocalServiceImpl
	extends DGContactEntryLocalServiceBaseImpl {

	public List<DGContactEntry> getAllContact(){
		return dgContactEntryPersistence.findAll();
	}

	public DGContactEntry addContact(DGContactEntryMapper dgContactEntryMapper){

		DGContactEntry contactEntry = createDGContactEntry(counterLocalService.increment(DGContactEntry.class.getName()));
		mapContactData(dgContactEntryMapper, contactEntry);

		return addDGContactEntry(contactEntry);
	}

	public void mapContactData(DGContactEntryMapper dgContactEntryMapper, DGContactEntry dgContactEntry){

		dgContactEntry.setName(dgContactEntryMapper.getName());
		dgContactEntry.setEmail(dgContactEntryMapper.getEmail());
		dgContactEntry.setMessage(dgContactEntryMapper.getMessage());
	}
}