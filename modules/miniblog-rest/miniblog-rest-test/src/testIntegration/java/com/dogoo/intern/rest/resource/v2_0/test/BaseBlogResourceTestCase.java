package com.dogoo.intern.rest.resource.v2_0.test;

import com.dogoo.intern.rest.client.dto.v2_0.Blog;
import com.dogoo.intern.rest.client.http.HttpInvoker;
import com.dogoo.intern.rest.client.pagination.Page;
import com.dogoo.intern.rest.client.pagination.Pagination;
import com.dogoo.intern.rest.client.resource.v2_0.BlogResource;
import com.dogoo.intern.rest.client.serdes.v2_0.BlogSerDes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.function.UnsafeTriConsumer;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.search.test.util.SearchTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.lang.reflect.InvocationTargetException;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.time.DateUtils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author duynd
 * @generated
 */
@Generated("")
public abstract class BaseBlogResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_blogResource.setContextCompany(testCompany);

		BlogResource.Builder builder = BlogResource.builder();

		blogResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		Blog blog1 = randomBlog();

		String json = objectMapper.writeValueAsString(blog1);

		Blog blog2 = BlogSerDes.toDTO(json);

		Assert.assertTrue(equals(blog1, blog2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		Blog blog = randomBlog();

		String json1 = objectMapper.writeValueAsString(blog);
		String json2 = BlogSerDes.toJSON(blog);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		Blog blog = randomBlog();

		blog.setImage(regex);
		blog.setLongDescription(regex);
		blog.setShortDescription(regex);
		blog.setTitle(regex);

		String json = BlogSerDes.toJSON(blog);

		Assert.assertFalse(json.contains(regex));

		blog = BlogSerDes.toDTO(json);

		Assert.assertEquals(regex, blog.getImage());
		Assert.assertEquals(regex, blog.getLongDescription());
		Assert.assertEquals(regex, blog.getShortDescription());
		Assert.assertEquals(regex, blog.getTitle());
	}

	@Test
	public void testGetBlogs() throws Exception {
		Page<Blog> page = blogResource.getBlogs();

		long totalCount = page.getTotalCount();

		Blog blog1 = testGetBlogs_addBlog(randomBlog());

		Blog blog2 = testGetBlogs_addBlog(randomBlog());

		page = blogResource.getBlogs();

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(blog1, (List<Blog>)page.getItems());
		assertContains(blog2, (List<Blog>)page.getItems());
		assertValid(page);

		blogResource.deleteBlog(blog1.getId());

		blogResource.deleteBlog(blog2.getId());
	}

	protected Blog testGetBlogs_addBlog(Blog blog) throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetBlogs() throws Exception {
		GraphQLField graphQLField = new GraphQLField(
			"blogs",
			new HashMap<String, Object>() {
				{
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		JSONObject blogsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/blogs");

		long totalCount = blogsJSONObject.getLong("totalCount");

		Blog blog1 = testGraphQLBlog_addBlog();
		Blog blog2 = testGraphQLBlog_addBlog();

		blogsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/blogs");

		Assert.assertEquals(
			totalCount + 2, blogsJSONObject.getLong("totalCount"));

		assertContains(
			blog1,
			Arrays.asList(
				BlogSerDes.toDTOs(blogsJSONObject.getString("items"))));
		assertContains(
			blog2,
			Arrays.asList(
				BlogSerDes.toDTOs(blogsJSONObject.getString("items"))));
	}

	@Test
	public void testAddBlog() throws Exception {
		Blog randomBlog = randomBlog();

		Blog postBlog = testAddBlog_addBlog(randomBlog);

		assertEquals(randomBlog, postBlog);
		assertValid(postBlog);
	}

	protected Blog testAddBlog_addBlog(Blog blog) throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteBlog() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		Blog blog = testDeleteBlog_addBlog();

		assertHttpResponseStatusCode(
			204, blogResource.deleteBlogHttpResponse(blog.getId()));

		assertHttpResponseStatusCode(
			404, blogResource.getBlogHttpResponse(blog.getId()));

		assertHttpResponseStatusCode(
			404, blogResource.getBlogHttpResponse(blog.getId()));
	}

	protected Blog testDeleteBlog_addBlog() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteBlog() throws Exception {
		Blog blog = testGraphQLBlog_addBlog();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteBlog",
						new HashMap<String, Object>() {
							{
								put("id", blog.getId());
							}
						})),
				"JSONObject/data", "Object/deleteBlog"));

		JSONArray errorsJSONArray = JSONUtil.getValueAsJSONArray(
			invokeGraphQLQuery(
				new GraphQLField(
					"blog",
					new HashMap<String, Object>() {
						{
							put("id", blog.getId());
						}
					},
					new GraphQLField("id"))),
			"JSONArray/errors");

		Assert.assertTrue(errorsJSONArray.length() > 0);
	}

	@Test
	public void testGetBlog() throws Exception {
		Blog postBlog = testGetBlog_addBlog();

		Blog getBlog = blogResource.getBlog(postBlog.getId());

		assertEquals(postBlog, getBlog);
		assertValid(getBlog);
	}

	protected Blog testGetBlog_addBlog() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetBlog() throws Exception {
		Blog blog = testGraphQLBlog_addBlog();

		Assert.assertTrue(
			equals(
				blog,
				BlogSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"blog",
								new HashMap<String, Object>() {
									{
										put("id", blog.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/blog"))));
	}

	@Test
	public void testGraphQLGetBlogNotFound() throws Exception {
		Long irrelevantId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"blog",
						new HashMap<String, Object>() {
							{
								put("id", irrelevantId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	@Test
	public void testPutBlog() throws Exception {
		Blog postBlog = testPutBlog_addBlog();

		Blog randomBlog = randomBlog();

		Blog putBlog = blogResource.putBlog(postBlog.getId(), randomBlog);

		assertEquals(randomBlog, putBlog);
		assertValid(putBlog);

		Blog getBlog = blogResource.getBlog(putBlog.getId());

		assertEquals(randomBlog, getBlog);
		assertValid(getBlog);
	}

	protected Blog testPutBlog_addBlog() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetAllSearch() throws Exception {
		Page<Blog> page = blogResource.getAllSearch(
			null, null, Pagination.of(1, 10), null);

		long totalCount = page.getTotalCount();

		Blog blog1 = testGetAllSearch_addBlog(randomBlog());

		Blog blog2 = testGetAllSearch_addBlog(randomBlog());

		page = blogResource.getAllSearch(
			null, null, Pagination.of(1, 10), null);

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(blog1, (List<Blog>)page.getItems());
		assertContains(blog2, (List<Blog>)page.getItems());
		assertValid(page);

		blogResource.deleteBlog(blog1.getId());

		blogResource.deleteBlog(blog2.getId());
	}

	@Test
	public void testGetAllSearchWithFilterDateTimeEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		Blog blog1 = randomBlog();

		blog1 = testGetAllSearch_addBlog(blog1);

		for (EntityField entityField : entityFields) {
			Page<Blog> page = blogResource.getAllSearch(
				null, getFilterString(entityField, "between", blog1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(blog1), (List<Blog>)page.getItems());
		}
	}

	@Test
	public void testGetAllSearchWithFilterStringEquals() throws Exception {
		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.STRING);

		if (entityFields.isEmpty()) {
			return;
		}

		Blog blog1 = testGetAllSearch_addBlog(randomBlog());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		Blog blog2 = testGetAllSearch_addBlog(randomBlog());

		for (EntityField entityField : entityFields) {
			Page<Blog> page = blogResource.getAllSearch(
				null, getFilterString(entityField, "eq", blog1),
				Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(blog1), (List<Blog>)page.getItems());
		}
	}

	@Test
	public void testGetAllSearchWithPagination() throws Exception {
		Page<Blog> totalPage = blogResource.getAllSearch(
			null, null, null, null);

		int totalCount = GetterUtil.getInteger(totalPage.getTotalCount());

		Blog blog1 = testGetAllSearch_addBlog(randomBlog());

		Blog blog2 = testGetAllSearch_addBlog(randomBlog());

		Blog blog3 = testGetAllSearch_addBlog(randomBlog());

		Page<Blog> page1 = blogResource.getAllSearch(
			null, null, Pagination.of(1, totalCount + 2), null);

		List<Blog> blogs1 = (List<Blog>)page1.getItems();

		Assert.assertEquals(blogs1.toString(), totalCount + 2, blogs1.size());

		Page<Blog> page2 = blogResource.getAllSearch(
			null, null, Pagination.of(2, totalCount + 2), null);

		Assert.assertEquals(totalCount + 3, page2.getTotalCount());

		List<Blog> blogs2 = (List<Blog>)page2.getItems();

		Assert.assertEquals(blogs2.toString(), 1, blogs2.size());

		Page<Blog> page3 = blogResource.getAllSearch(
			null, null, Pagination.of(1, totalCount + 3), null);

		assertContains(blog1, (List<Blog>)page3.getItems());
		assertContains(blog2, (List<Blog>)page3.getItems());
		assertContains(blog3, (List<Blog>)page3.getItems());
	}

	@Test
	public void testGetAllSearchWithSortDateTime() throws Exception {
		testGetAllSearchWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, blog1, blog2) -> {
				BeanUtils.setProperty(
					blog1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetAllSearchWithSortInteger() throws Exception {
		testGetAllSearchWithSort(
			EntityField.Type.INTEGER,
			(entityField, blog1, blog2) -> {
				BeanUtils.setProperty(blog1, entityField.getName(), 0);
				BeanUtils.setProperty(blog2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetAllSearchWithSortString() throws Exception {
		testGetAllSearchWithSort(
			EntityField.Type.STRING,
			(entityField, blog1, blog2) -> {
				Class<?> clazz = blog1.getClass();

				String entityFieldName = entityField.getName();

				java.lang.reflect.Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanUtils.setProperty(
						blog1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanUtils.setProperty(
						blog2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanUtils.setProperty(
						blog1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanUtils.setProperty(
						blog2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanUtils.setProperty(
						blog1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanUtils.setProperty(
						blog2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetAllSearchWithSort(
			EntityField.Type type,
			UnsafeTriConsumer<EntityField, Blog, Blog, Exception>
				unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Blog blog1 = randomBlog();
		Blog blog2 = randomBlog();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(entityField, blog1, blog2);
		}

		blog1 = testGetAllSearch_addBlog(blog1);

		blog2 = testGetAllSearch_addBlog(blog2);

		for (EntityField entityField : entityFields) {
			Page<Blog> ascPage = blogResource.getAllSearch(
				null, null, Pagination.of(1, 2),
				entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(blog1, blog2), (List<Blog>)ascPage.getItems());

			Page<Blog> descPage = blogResource.getAllSearch(
				null, null, Pagination.of(1, 2),
				entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(blog2, blog1), (List<Blog>)descPage.getItems());
		}
	}

	protected Blog testGetAllSearch_addBlog(Blog blog) throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected Blog testGraphQLBlog_addBlog() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(Blog blog, List<Blog> blogs) {
		boolean contains = false;

		for (Blog item : blogs) {
			if (equals(blog, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(blogs + " does not contain " + blog, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(Blog blog1, Blog blog2) {
		Assert.assertTrue(
			blog1 + " does not equal " + blog2, equals(blog1, blog2));
	}

	protected void assertEquals(List<Blog> blogs1, List<Blog> blogs2) {
		Assert.assertEquals(blogs1.size(), blogs2.size());

		for (int i = 0; i < blogs1.size(); i++) {
			Blog blog1 = blogs1.get(i);
			Blog blog2 = blogs2.get(i);

			assertEquals(blog1, blog2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Blog> blogs1, List<Blog> blogs2) {

		Assert.assertEquals(blogs1.size(), blogs2.size());

		for (Blog blog1 : blogs1) {
			boolean contains = false;

			for (Blog blog2 : blogs2) {
				if (equals(blog1, blog2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(blogs2 + " does not contain " + blog1, contains);
		}
	}

	protected void assertValid(Blog blog) throws Exception {
		boolean valid = true;

		if (blog.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("createdDate", additionalAssertFieldName)) {
				if (blog.getCreatedDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("image", additionalAssertFieldName)) {
				if (blog.getImage() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("longDescription", additionalAssertFieldName)) {
				if (blog.getLongDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("shortDescription", additionalAssertFieldName)) {
				if (blog.getShortDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (blog.getTitle() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<Blog> page) {
		boolean valid = false;

		java.util.Collection<Blog> blogs = page.getItems();

		int size = blogs.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(com.dogoo.intern.rest.dto.v2_0.Blog.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(Blog blog1, Blog blog2) {
		if (blog1 == blog2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("createdDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						blog1.getCreatedDate(), blog2.getCreatedDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(blog1.getId(), blog2.getId())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("image", additionalAssertFieldName)) {
				if (!Objects.deepEquals(blog1.getImage(), blog2.getImage())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("longDescription", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						blog1.getLongDescription(),
						blog2.getLongDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("shortDescription", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						blog1.getShortDescription(),
						blog2.getShortDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (!Objects.deepEquals(blog1.getTitle(), blog2.getTitle())) {
					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		Stream<java.lang.reflect.Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			java.lang.reflect.Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_blogResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_blogResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, Blog blog) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("createdDate")) {
			if (operator.equals("between")) {
				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(blog.getCreatedDate(), -2)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(blog.getCreatedDate(), 2)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(blog.getCreatedDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("image")) {
			sb.append("'");
			sb.append(String.valueOf(blog.getImage()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("longDescription")) {
			sb.append("'");
			sb.append(String.valueOf(blog.getLongDescription()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("shortDescription")) {
			sb.append("'");
			sb.append(String.valueOf(blog.getShortDescription()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("title")) {
			sb.append("'");
			sb.append(String.valueOf(blog.getTitle()));
			sb.append("'");

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected Blog randomBlog() throws Exception {
		return new Blog() {
			{
				createdDate = RandomTestUtil.nextDate();
				id = RandomTestUtil.randomLong();
				image = StringUtil.toLowerCase(RandomTestUtil.randomString());
				longDescription = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				shortDescription = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				title = StringUtil.toLowerCase(RandomTestUtil.randomString());
			}
		};
	}

	protected Blog randomIrrelevantBlog() throws Exception {
		Blog randomIrrelevantBlog = randomBlog();

		return randomIrrelevantBlog;
	}

	protected Blog randomPatchBlog() throws Exception {
		return randomBlog();
	}

	protected BlogResource blogResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseBlogResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private com.dogoo.intern.rest.resource.v2_0.BlogResource _blogResource;

}