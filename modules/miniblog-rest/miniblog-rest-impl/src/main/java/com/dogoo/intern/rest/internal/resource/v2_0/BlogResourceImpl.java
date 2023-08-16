package com.dogoo.intern.rest.internal.resource.v2_0;

import com.dogoo.intern.rest.dto.v2_0.Blog;
import com.dogoo.intern.rest.internal.exception.DG_NoSuchEntryException;
import com.dogoo.intern.rest.internal.service.MiniblogService;
import com.dogoo.intern.rest.internal.validator.BlogValidator;
import com.dogoo.intern.rest.resource.v2_0.BlogResource;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.core.Response;

/**
 * @author duynd
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v2_0/blog.properties",
	scope = ServiceScope.PROTOTYPE, service = BlogResource.class
)
public class BlogResourceImpl extends BaseBlogResourceImpl {

	@Override
	public Page<Blog> getBlogs(){

		return miniblogService.getAll();
	}

	@Override
	public Blog getBlog(Long id) throws DG_NoSuchEntryException {
		blogValidator.validateMiniBlogEntryExist(id);
		return miniblogService.getOne(id);
	}

	@Override
	public Blog addBlog(Blog blog){

		return miniblogService.addMiniBlog(blog);
	}

	@Override
	public Blog putBlog(Long id, Blog blog) throws PortalException {

		blogValidator.validateMiniBlogEntryExist(id);
		return miniblogService.updateMiniBlog(id, blog);
	}

	@Override
	public Response deleteBlog(Long id) throws PortalException {

		blogValidator.validateMiniBlogEntryExist(id);
		miniblogService.deleteMiniBlog(id);

		return Response.ok().build();
	}

	@Override
	public Page<Blog> getAllSearch(String search, Filter filter, Pagination pagination, Sort[] sorts) throws Exception {

		return miniblogService.getBlogSearch(search, filter, pagination, sorts, getServiceContext());
	}

	public ServiceContext getServiceContext() {

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(contextCompany.getCompanyId());
		serviceContext.setUserId(contextUser.getUserId());
		serviceContext.setScopeGroupId(contextUser.getGroupId());

		return serviceContext;
	}

	@Reference
	private MiniblogService miniblogService;

	@Reference
	private BlogValidator blogValidator;

}