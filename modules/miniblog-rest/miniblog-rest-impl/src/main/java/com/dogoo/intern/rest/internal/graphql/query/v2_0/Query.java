package com.dogoo.intern.rest.internal.graphql.query.v2_0;

import com.dogoo.intern.rest.dto.v2_0.Blog;
import com.dogoo.intern.rest.dto.v2_0.Contact;
import com.dogoo.intern.rest.resource.v2_0.BlogResource;
import com.dogoo.intern.rest.resource.v2_0.ContactResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author duynd
 * @generated
 */
@Generated("")
public class Query {

	public static void setBlogResourceComponentServiceObjects(
		ComponentServiceObjects<BlogResource>
			blogResourceComponentServiceObjects) {

		_blogResourceComponentServiceObjects =
			blogResourceComponentServiceObjects;
	}

	public static void setContactResourceComponentServiceObjects(
		ComponentServiceObjects<ContactResource>
			contactResourceComponentServiceObjects) {

		_contactResourceComponentServiceObjects =
			contactResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {blogs{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Get all blog")
	public BlogPage blogs() throws Exception {
		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> new BlogPage(blogResource.getBlogs()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {blog(id: ___){id, title, image, shortDescription, longDescription, createdDate}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Get detail blog by id")
	public Blog blog(@GraphQLName("id") Long id) throws Exception {
		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> blogResource.getBlog(id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {contacts{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Get all contact")
	public ContactPage contacts() throws Exception {
		return _applyComponentServiceObjects(
			_contactResourceComponentServiceObjects,
			this::_populateResourceContext,
			contactResource -> new ContactPage(contactResource.getContacts()));
	}

	@GraphQLName("BlogPage")
	public class BlogPage {

		public BlogPage(Page blogPage) {
			actions = blogPage.getActions();

			items = blogPage.getItems();
			lastPage = blogPage.getLastPage();
			page = blogPage.getPage();
			pageSize = blogPage.getPageSize();
			totalCount = blogPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Blog> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("ContactPage")
	public class ContactPage {

		public ContactPage(Page contactPage) {
			actions = contactPage.getActions();

			items = contactPage.getItems();
			lastPage = contactPage.getLastPage();
			page = contactPage.getPage();
			pageSize = contactPage.getPageSize();
			totalCount = contactPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Contact> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(BlogResource blogResource)
		throws Exception {

		blogResource.setContextAcceptLanguage(_acceptLanguage);
		blogResource.setContextCompany(_company);
		blogResource.setContextHttpServletRequest(_httpServletRequest);
		blogResource.setContextHttpServletResponse(_httpServletResponse);
		blogResource.setContextUriInfo(_uriInfo);
		blogResource.setContextUser(_user);
		blogResource.setGroupLocalService(_groupLocalService);
		blogResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(ContactResource contactResource)
		throws Exception {

		contactResource.setContextAcceptLanguage(_acceptLanguage);
		contactResource.setContextCompany(_company);
		contactResource.setContextHttpServletRequest(_httpServletRequest);
		contactResource.setContextHttpServletResponse(_httpServletResponse);
		contactResource.setContextUriInfo(_uriInfo);
		contactResource.setContextUser(_user);
		contactResource.setGroupLocalService(_groupLocalService);
		contactResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<BlogResource>
		_blogResourceComponentServiceObjects;
	private static ComponentServiceObjects<ContactResource>
		_contactResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}