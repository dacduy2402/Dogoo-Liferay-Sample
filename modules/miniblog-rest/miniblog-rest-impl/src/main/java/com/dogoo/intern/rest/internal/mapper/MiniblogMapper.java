package com.dogoo.intern.rest.internal.mapper;

import com.dogoo.intern.rest.dto.v2_0.Blog;
import com.dogoo.intern.service.mapper.model.MiniblogEntryMapper;
import com.dogoo.intern.service.model.MiniBlogEntry;
import org.osgi.service.component.annotations.Component;

import java.util.function.Function;

@Component(
        immediate = true,
        service = MiniblogMapper.class
)
public class MiniblogMapper implements Function<MiniBlogEntry, Blog> {
    @Override
    public Blog apply(MiniBlogEntry miniBlogEntry) {

        Blog blog = new Blog();
        blog.setId(miniBlogEntry.getId());
        blog.setTitle(miniBlogEntry.getTitle());
        blog.setImage(miniBlogEntry.getImage());
        blog.setCreatedDate(miniBlogEntry.getCreateDate());
        blog.setShortDescription(miniBlogEntry.getShortDescription());
        blog.setLongDescription(miniBlogEntry.getLongDescription());

        return blog;
    }

    public MiniblogEntryMapper mapMiniBlogEntryMapperFromBlog(Blog from){

        MiniblogEntryMapper to = new MiniblogEntryMapper();
        to.setTitle(from.getTitle());
        to.setImage(from.getImage());
        to.setShortDescription(from.getShortDescription());
        to.setLongDescription(from.getLongDescription());

        return to;
    }
}
