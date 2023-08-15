package com.dogoo.intern.rest.internal.graphql.mutation.v2_0;

import com.dogoo.intern.rest.dto.v2_0.Blog;
import com.dogoo.intern.rest.dto.v2_0.Contact;
import com.dogoo.intern.rest.resource.v2_0.BlogResource;
import com.dogoo.intern.rest.resource.v2_0.ContactResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author duynd
 * @generated
 */
@Generated("")
public class Mutation {

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

	@GraphQLField
	public Blog addBlog(@GraphQLName("blog") Blog blog) throws Exception {
		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> blogResource.addBlog(blog));
	}

	@GraphQLField(description = "delete a blog")
	public Response deleteBlog(@GraphQLName("id") Long id) throws Exception {
		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> blogResource.deleteBlog(id));
	}

	@GraphQLField
	public Response deleteBlogBatch(
			@GraphQLName("id") Long id,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> blogResource.deleteBlogBatch(
				id, callbackURL, object));
	}

	@GraphQLField(description = "Update an existing blog by Id")
	public Blog updateBlog(
			@GraphQLName("id") Long id, @GraphQLName("blog") Blog blog)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> blogResource.putBlog(id, blog));
	}

	@GraphQLField
	public Response updateBlogBatch(
			@GraphQLName("id") Long id,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogResource -> blogResource.putBlogBatch(id, callbackURL, object));
	}

	@GraphQLField(description = "Add a new contact to author")
	public Contact addContact(@GraphQLName("contact") Contact contact)
		throws Exception {

		return _applyComponentServiceObjects(
			_contactResourceComponentServiceObjects,
			this::_populateResourceContext,
			contactResource -> contactResource.addContact(contact));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}