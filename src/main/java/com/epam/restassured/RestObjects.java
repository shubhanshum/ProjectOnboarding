package com.epam.restassured;

import java.util.HashMap;
import java.util.Map;

import com.epam.utilities.PropUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestObjects {
	
	  static ObjectMapper mapper=null;
	  
	  /**
	   * This method is to perform patch operation
	   * @param uri
	   * @param uriPath
	   * @param headers
	   * @param payload
	   * @return response
	   */
		public static Response patchObject(String uri, String uriPath, Object payload) {
			RestAssured.baseURI = uri;
			RestAssured.basePath = uriPath;
			RequestSpecification request = RestAssured.given();
			Response response = request.headers(getHeaders()).body(payload).patch();
			return response;
		}

		/**
		 * This method return object of pojo class
		 * @param response
		 * @param payload
		 * @return Pojo class object
		 */
		public static Object getPojoValue(Response response, Object payload) {
			Object mapperObj = null;
			if (mapper == null) {
				mapper = new ObjectMapper();
			}
			try {
				String objResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload).toString();
				mapperObj = mapper.readValue(objResponse, payload.getClass());
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			return mapperObj;
		}
		
		public static Map<String, String> getHeaders() {
			Map<String, String> headers=new HashMap<>();
			headers.put("Authorization", PropUtils.getPropFileData("restconfig", "Authorization"));
			return headers;
		}
}
