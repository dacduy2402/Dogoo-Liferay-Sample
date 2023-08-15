package com.dogoo.intern.rest.client.serdes.v2_0;

import com.dogoo.intern.rest.client.dto.v2_0.Blog;
import com.dogoo.intern.rest.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author duynd
 * @generated
 */
@Generated("")
public class BlogSerDes {

	public static Blog toDTO(String json) {
		BlogJSONParser blogJSONParser = new BlogJSONParser();

		return blogJSONParser.parseToDTO(json);
	}

	public static Blog[] toDTOs(String json) {
		BlogJSONParser blogJSONParser = new BlogJSONParser();

		return blogJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Blog blog) {
		if (blog == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (blog.getCreatedDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createdDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(blog.getCreatedDate()));

			sb.append("\"");
		}

		if (blog.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(blog.getId());
		}

		if (blog.getImage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"image\": ");

			sb.append("\"");

			sb.append(_escape(blog.getImage()));

			sb.append("\"");
		}

		if (blog.getLongDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"longDescription\": ");

			sb.append("\"");

			sb.append(_escape(blog.getLongDescription()));

			sb.append("\"");
		}

		if (blog.getShortDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shortDescription\": ");

			sb.append("\"");

			sb.append(_escape(blog.getShortDescription()));

			sb.append("\"");
		}

		if (blog.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(blog.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BlogJSONParser blogJSONParser = new BlogJSONParser();

		return blogJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Blog blog) {
		if (blog == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (blog.getCreatedDate() == null) {
			map.put("createdDate", null);
		}
		else {
			map.put(
				"createdDate",
				liferayToJSONDateFormat.format(blog.getCreatedDate()));
		}

		if (blog.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(blog.getId()));
		}

		if (blog.getImage() == null) {
			map.put("image", null);
		}
		else {
			map.put("image", String.valueOf(blog.getImage()));
		}

		if (blog.getLongDescription() == null) {
			map.put("longDescription", null);
		}
		else {
			map.put(
				"longDescription", String.valueOf(blog.getLongDescription()));
		}

		if (blog.getShortDescription() == null) {
			map.put("shortDescription", null);
		}
		else {
			map.put(
				"shortDescription", String.valueOf(blog.getShortDescription()));
		}

		if (blog.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(blog.getTitle()));
		}

		return map;
	}

	public static class BlogJSONParser extends BaseJSONParser<Blog> {

		@Override
		protected Blog createDTO() {
			return new Blog();
		}

		@Override
		protected Blog[] createDTOArray(int size) {
			return new Blog[size];
		}

		@Override
		protected void setField(
			Blog blog, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "createdDate")) {
				if (jsonParserFieldValue != null) {
					blog.setCreatedDate(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					blog.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "image")) {
				if (jsonParserFieldValue != null) {
					blog.setImage((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "longDescription")) {
				if (jsonParserFieldValue != null) {
					blog.setLongDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "shortDescription")) {
				if (jsonParserFieldValue != null) {
					blog.setShortDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					blog.setTitle((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}