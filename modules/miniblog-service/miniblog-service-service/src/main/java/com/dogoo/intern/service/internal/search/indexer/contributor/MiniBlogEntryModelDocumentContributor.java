package com.dogoo.intern.service.internal.search.indexer.contributor;

import com.dogoo.intern.service.constant.SearchField;
import com.dogoo.intern.service.model.MiniBlogEntry;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = SearchField.BLOG_INDEXER_CLASS,
        service = ModelDocumentContributor.class
)
public class MiniBlogEntryModelDocumentContributor implements ModelDocumentContributor<MiniBlogEntry> {
    @Override
    public void contribute(Document document, MiniBlogEntry baseModel) {

        document.addText(SearchField.BLOG_TITLE, baseModel.getTitle());
        document.addTextSortable(SearchField.BLOG_TITLE, baseModel.getTitle());

        document.addText(SearchField.SHORT_DESCRIPTION, baseModel.getShortDescription());
    }

}
