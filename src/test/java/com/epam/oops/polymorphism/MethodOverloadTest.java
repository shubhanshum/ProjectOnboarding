package com.epam.oops.polymorphism;

import org.testng.annotations.Test;

public class MethodOverloadTest {

	@Test
	public void checkMethodOverloading() {
		MethodOverloading methodLoad=new MethodOverloading();
		methodLoad.printName("shubhanshu");
		methodLoad.printName("shubhanshu", "mishra");
	}
}
