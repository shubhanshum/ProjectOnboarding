package com.epam.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class ResponseTest {

	/*
	 * Define a predicate to check if the status code is 400. Print all the
	 * responses with status code 400 from the given list of responses.
	 */
	
	@Test(priority=1)
	public void checkTest1() {
		List<Response> list=new ArrayList<>();
		
		Response response1=new Response("Response1", 200, "JSON");
		Response response2=new Response("Response2", 400, "JSON");
		Response response3=new Response("Response3", 400, "JSON");
		Response response4=new Response("Response4", 200, "XML");
		Response response5=new Response("Response5", 201, "HTML");
		
		list.add(response1);
		list.add(response2);
		list.add(response3);
		list.add(response4);
		list.add(response5);
		
		for (int i=0;i<=list.size()-1;i++) {
			Response myresponse=list.get(i);
			Predicate<Response> p=code->myresponse.getStatusCode()==400;
			if (p.test(myresponse)==true) {
				System.out.println("Responses with 400 code are:"+myresponse.getResponseBody());
			}
		}
	}
	
	/*
	 * Define a predicate to check if the response type JSON. Print all the
	 * responses the response type JSON from the given list of responses.
	 */
	
	@Test(priority=2)
	public void checkTest2() {
		List<Response> list=new ArrayList<>();
		
		Response response1=new Response("Response1", 200, "JSON");
		Response response2=new Response("Response2", 400, "JSON");
		Response response3=new Response("Response3", 400, "JSON");
		Response response4=new Response("Response4", 200, "XML");
		Response response5=new Response("Response5", 201, "HTML");
		
		list.add(response1);
		list.add(response2);
		list.add(response3);
		list.add(response4);
		list.add(response5);
		
		for (int i=0;i<=list.size()-1;i++) {
			Response myresponse=list.get(i);
			Predicate<Response> p=code->myresponse.getResponseType().equals("JSON");
			if (p.test(myresponse)==true) {
				System.out.println("Responses with JSON response type are:"+myresponse.getResponseBody());
			}
		}
	}
	
	/* Print all the responses with status code 400 and response type JSON 
	 * 
	 */
	
	@Test(priority=3)
	public void checkTest3() {
		List<Response> list=new ArrayList<>();
		
		Response response1=new Response("Response1", 200, "JSON");
		Response response2=new Response("Response2", 400, "JSON");
		Response response3=new Response("Response3", 400, "JSON");
		Response response4=new Response("Response4", 200, "XML");
		Response response5=new Response("Response5", 201, "HTML");
		
		list.add(response1);
		list.add(response2);
		list.add(response3);
		list.add(response4);
		list.add(response5);
		
		for (int i=0;i<=list.size()-1;i++) {
			Response myresponse=list.get(i);
			Predicate<Response> p=code->myresponse.getResponseType().equals("JSON") && myresponse.statusCode==400;
			if (p.test(myresponse)==true) {
				System.out.println("Responses with JSON response type and 400 code are:"+myresponse.getResponseBody());
			}
		}
	}
	
	/* Print all the responses with status code 400 or response type JSON 
	 * 
	 */
	
	@Test(priority=4)
	public void checkTest4() {
		List<Response> list=new ArrayList<>();
		
		Response response1=new Response("Response1", 200, "JSON");
		Response response2=new Response("Response2", 400, "JSON");
		Response response3=new Response("Response3", 400, "JSON");
		Response response4=new Response("Response4", 200, "XML");
		Response response5=new Response("Response5", 201, "HTML");
		
		list.add(response1);
		list.add(response2);
		list.add(response3);
		list.add(response4);
		list.add(response5);
		
		for (int i=0;i<=list.size()-1;i++) {
			Response myresponse=list.get(i);
			Predicate<Response> p=code->myresponse.getResponseType().equals("JSON") || myresponse.statusCode==400;
			if (p.test(myresponse)==true) {
				System.out.println("Responses with JSON response type or 400 code are:"+myresponse.getResponseBody());
			}
		}
	}
	
	/* Print all the responses with status code is not 400 and response type JSON 
	 * 
	 */
	
	@Test(priority=5)
	public void checkTest5() {
		List<Response> list=new ArrayList<>();
		
		Response response1=new Response("Response1", 200, "JSON");
		Response response2=new Response("Response2", 400, "JSON");
		Response response3=new Response("Response3", 400, "JSON");
		Response response4=new Response("Response4", 200, "XML");
		Response response5=new Response("Response5", 201, "HTML");
		
		list.add(response1);
		list.add(response2);
		list.add(response3);
		list.add(response4);
		list.add(response5);
		
		for (int i=0;i<=list.size()-1;i++) {
			Response myresponse=list.get(i);
			Predicate<Response> p=code->myresponse.getResponseType().equals("JSON") && myresponse.statusCode!=400;
			if (p.test(myresponse)==true) {
				System.out.println("Responses with JSON response type and not 400 code is:"+myresponse.getResponseBody());
			}
		}
	}
}
