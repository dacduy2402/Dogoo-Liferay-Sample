package com.dogoo.intern.service.internal.search.indexer.contributor;

import com.dogoo.intern.service.constant.SearchField;
import com.dogoo.intern.service.model.MiniBlogEntry;
import com.dogoo.intern.service.service.MiniBlogEntryLocalService;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = SearchField.BLOG_INDEXER_CLASS,
        service = ModelIndexerWriterContributor.class
)
public class MiniBlogEntryModelIndexerWriterContributor implements ModelIndexerWriterContributor<MiniBlogEntry>{
    @Override
    public void customize(BatchIndexingActionable batchIndexingActionable, ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
        batchIndexingActionable.setPerformActionMethod(
                (MiniBlogEntry entry) -> batchIndexingActionable.addDocuments(
                        modelIndexerWriterDocumentHelper.getDocument(entry)));
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(
                miniBlogEntryLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(MiniBlogEntry baseModel) {
        return baseModel.getCompanyId();
    }

    @Reference
    protected DynamicQueryBatchIndexingActionableFactory dynamicQueryBatchIndexingActionableFactory;

    @Reference
    protected MiniBlogEntryLocalService miniBlogEntryLocalService;
}
