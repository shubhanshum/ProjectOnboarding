package com.epam.java8.constreference;

import org.testng.annotations.Test;

public class EmployeeTest {

	@Test
	public void test() {
		MyInterface myInterface = Employee::new;
        System.out.println(myInterface.getEmployee("Shubhanshu", 1000));
	}
}
