package com.epam.oops.inheritance;

import org.testng.annotations.Test;

public class InheritanceTest {

	@Test
	public void validateInheritance() {
		ChildClass inheri=new ChildClass();
		
		System.out.println(inheri.title);
		inheri.printFirstName("Ajay");
		inheri.printLastName("Vijay");
	}
}
