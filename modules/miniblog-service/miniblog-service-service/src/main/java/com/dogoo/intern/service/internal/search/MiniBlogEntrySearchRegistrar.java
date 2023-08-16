package com.dogoo.intern.service.internal.search;

import com.dogoo.intern.service.constant.SearchField;
import com.dogoo.intern.service.model.MiniBlogEntry;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchRegistrarHelper;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        service = MiniBlogEntrySearchRegistrar.class
)
public class MiniBlogEntrySearchRegistrar {

    @Activate
    protected void activate (BundleContext bundleContext){
        serviceRegistration = modelSearchRegistrarHelper.register(
                MiniBlogEntry.class, bundleContext,
                modelSearchDefinition -> {
                    modelSearchDefinition.setDefaultSelectedFieldNames(
                            Field.COMPANY_ID, Field.ENTRY_CLASS_NAME,
                            Field.ENTRY_CLASS_PK, Field.UID);
                    modelSearchDefinition.setModelIndexWriteContributor(
                            modelIndexWriterContributor);
                    modelSearchDefinition.setSearchResultPermissionFilterSuppressed(
                            true);
                }
        );
    }

    @Deactivate
    protected void deactivate(){
        serviceRegistration.unregister();
    }

    @Reference(
            target = StringPool.OPEN_PARENTHESIS
                    + SearchField.BLOG_INDEXER_CLASS
                    + StringPool.CLOSE_PARENTHESIS
    )
    protected ModelIndexerWriterContributor<MiniBlogEntry>
            modelIndexWriterContributor;

    @Reference
    private ModelSearchRegistrarHelper modelSearchRegistrarHelper;

    private ServiceRegistration<?> serviceRegistration;
}
