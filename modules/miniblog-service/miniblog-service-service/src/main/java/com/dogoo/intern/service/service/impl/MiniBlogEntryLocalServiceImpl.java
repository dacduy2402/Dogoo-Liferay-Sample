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

import com.dogoo.intern.service.mapper.model.MiniblogEntryMapper;
import com.dogoo.intern.service.model.MiniBlogEntry;
import com.dogoo.intern.service.service.base.MiniBlogEntryLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dogoo.intern.service.model.MiniBlogEntry",
	service = AopService.class
)
public class MiniBlogEntryLocalServiceImpl
	extends MiniBlogEntryLocalServiceBaseImpl {

	public List<MiniBlogEntry> getAllMiniBlog(){

		return miniBlogEntryPersistence.findAll();
	}

	public MiniBlogEntry getMiniBlogById(Long id){

		return miniBlogEntryPersistence.fetchByPrimaryKey(id);
	}

	public MiniBlogEntry addMiniBlog(MiniblogEntryMapper miniblogEntryMapper){

		MiniBlogEntry miniBlogEntry = createMiniBlogEntry(counterLocalService.increment(MiniBlogEntry.class.getName()));
//		Date currDate = new Date();
		mapMiniBlogData(miniBlogEntry, miniblogEntryMapper);
//		miniBlogEntry.setCreateDate(currDate);

		return addMiniBlogEntry(miniBlogEntry);
	}

	public MiniBlogEntry updateMiniBlogById(Long id, MiniblogEntryMapper miniBlogMapper) throws PortalException {

		MiniBlogEntry miniBlogEntry = getMiniBlogEntry(id);
		mapMiniBlogData(miniBlogEntry, miniBlogMapper);

		return updateMiniBlogEntry(miniBlogEntry);
	}

	public void deleteMiniBlogById(Long id) throws PortalException {
		deleteMiniBlogEntry(id);

	}

	public void mapMiniBlogData(MiniBlogEntry miniBlogEntry, MiniblogEntryMapper miniblogEntryMapper){

		miniBlogEntry.setTitle(miniblogEntryMapper.getTitle());
		miniBlogEntry.setImage(miniblogEntryMapper.getImage());
		miniBlogEntry.setShortDescription(miniblogEntryMapper.getShortDescription());
		miniBlogEntry.setLongDescription(miniblogEntryMapper.getLongDescription());
	}
}