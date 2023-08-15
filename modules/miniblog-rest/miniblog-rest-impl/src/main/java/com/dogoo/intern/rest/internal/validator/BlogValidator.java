package com.dogoo.intern.rest.internal.validator;

import com.dogoo.intern.rest.internal.exception.DG_NoSuchEntryException;
import com.dogoo.intern.service.model.MiniBlogEntry;
import com.dogoo.intern.service.service.MiniBlogEntryLocalService;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        service = BlogValidator.class
)
public class BlogValidator {

    public void validateMiniBlogEntryExist(Long id) throws DG_NoSuchEntryException {
        MiniBlogEntry miniBlogEntry = miniBlogEntryLocalService.fetchMiniBlogEntry(id);

        if (Validator.isNotNull(miniBlogEntry)){
            return;
        }

        throw new DG_NoSuchEntryException("Failed! No Such Mini Blog!");
    }

    @Reference
    private MiniBlogEntryLocalService miniBlogEntryLocalService;
}
