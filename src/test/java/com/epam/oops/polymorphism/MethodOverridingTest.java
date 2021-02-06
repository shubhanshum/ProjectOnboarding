package com.epam.oops.polymorphism;

import org.testng.annotations.Test;

public class MethodOverridingTest {

	@Test
	public void validateOverriding() {
		MethodOveriding overRiding=new MethodOveriding();
		overRiding.printname("rahul");
	}
}
