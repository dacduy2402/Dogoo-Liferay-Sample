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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiniBlogEntry service. Represents a row in the &quot;DG_MiniBlogEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiniBlogEntryModel
 * @generated
 */
@ImplementationClassName(
	"com.dogoo.intern.service.model.impl.MiniBlogEntryImpl"
)
@ProviderType
public interface MiniBlogEntry extends MiniBlogEntryModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dogoo.intern.service.model.impl.MiniBlogEntryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiniBlogEntry, Long> ID_ACCESSOR =
		new Accessor<MiniBlogEntry, Long>() {

			@Override
			public Long get(MiniBlogEntry miniBlogEntry) {
				return miniBlogEntry.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MiniBlogEntry> getTypeClass() {
				return MiniBlogEntry.class;
			}

		};

}