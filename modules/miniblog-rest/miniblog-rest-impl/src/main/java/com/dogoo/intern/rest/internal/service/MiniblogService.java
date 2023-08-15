package com.dogoo.intern.rest.internal.service;

import com.dogoo.intern.rest.dto.v2_0.Blog;
import com.dogoo.intern.rest.internal.mapper.MiniblogMapper;
import com.dogoo.intern.service.mapper.model.MiniblogEntryMapper;
import com.dogoo.intern.service.model.MiniBlogEntry;
import com.dogoo.intern.service.service.MiniBlogEntryLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.vulcan.pagination.Page;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

@Component(
        immediate = true,
        service = MiniblogService.class
)
public class MiniblogService {
    public Page<Blog> getAll(){
        List<MiniBlogEntry> miniBlogEntries = miniBlogEntryLocalService.getAllMiniBlog();
        List<Blog> blogs = new ArrayList<>();
        for (MiniBlogEntry miniBlogEntry: miniBlogEntries) {
            blogs.add(miniblogMapper.apply(miniBlogEntry));
        }
        return Page.of(blogs);
    }

    public Blog getOne(Long id){
        MiniBlogEntry miniBlogEntry = miniBlogEntryLocalService.getMiniBlogById(id);
        Blog blog = miniblogMapper.apply(miniBlogEntry);
        return blog;
    }

    public Blog addMiniBlog(Blog blog){

        MiniblogEntryMapper miniblogEntryMapper = miniblogMapper.mapMiniBlogEntryMapperFromBlog(blog);
        MiniBlogEntry miniBlogEntry = miniBlogEntryLocalService.addMiniBlog(miniblogEntryMapper);
        Blog newBlog = miniblogMapper.apply(miniBlogEntry);

        return newBlog;
    }

    public Blog updateMiniBlog(Long id, Blog blog) throws PortalException {

        MiniblogEntryMapper miniblogEntryMapper = miniblogMapper.mapMiniBlogEntryMapperFromBlog(blog);
        MiniBlogEntry miniBlogEntry = miniBlogEntryLocalService.updateMiniBlogById(id, miniblogEntryMapper);
        Blog newBlog = miniblogMapper.apply(miniBlogEntry);

        return newBlog;
    }

    public void deleteMiniBlog(Long id) throws PortalException {

        miniBlogEntryLocalService.deleteMiniBlogById(id);
    }

    @Reference
    private MiniblogMapper miniblogMapper;

    @Reference
    private MiniBlogEntryLocalService miniBlogEntryLocalService;
}
