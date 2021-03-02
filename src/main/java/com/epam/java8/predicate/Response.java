package com.epam.java8.predicate;

public class Response {

	String responseBody;
	int statusCode;
	String responseType;
	
	public Response(String responseBody, int statusCode, String responseType) {
		super();
		this.responseBody = responseBody;
		this.statusCode = statusCode;
		this.responseType = responseType;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getResponseType() {
		return responseType;
	}
	
}
