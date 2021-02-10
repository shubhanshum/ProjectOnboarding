package com.epam.restassured;

import org.testng.annotations.Test;

import com.epam.utilities.PropUtils;

import io.restassured.response.Response;

public class RestTest {

	@Test
	public void validateApi() {
		String baseUri=PropUtils.getPropFileData("restconfig", "baseuri");
		String basePath=PropUtils.getPropFileData("restconfig", "updateUserApi");
		Payload payload=new Payload("shubhanshu khannh", "sm2.mishra@gmail.com", "Active");
		
		Response response=RestObjects.patchObject(baseUri, basePath, payload);
		Payload pay=(Payload) RestObjects.getPojoValue(response, payload);
		System.out.println(pay.getEmail());
		System.out.println(pay.getName());
	}
}
