package com.dogoo.intern.service.internal.search.query.contributor;

import com.dogoo.intern.service.constant.SearchField;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = SearchField.BLOG_INDEXER_CLASS,
        service = KeywordQueryContributor.class
)
public class MiniBlogEntryKeywordQueryContributor implements KeywordQueryContributor{
    @Override
    public void contribute(String keywords,
                           BooleanQuery booleanQuery,
                           KeywordQueryContributorHelper keywordQueryContributorHelper) {

        SearchContext searchContext = keywordQueryContributorHelper.getSearchContext();

        queryHelper.addSearchTerm(booleanQuery, searchContext, Field.ENTRY_CLASS_PK, false);

        queryHelper.addSearchTerm(booleanQuery, searchContext, SearchField.BLOG_TITLE, true);

        queryHelper.addSearchTerm(booleanQuery, searchContext, SearchField.SHORT_DESCRIPTION, true);

    }

    @Reference
    private QueryHelper queryHelper;
}
