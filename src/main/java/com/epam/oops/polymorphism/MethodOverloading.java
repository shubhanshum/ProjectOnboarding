package com.epam.oops.polymorphism;

public class MethodOverloading {
	
	public void printName(String firstName) {
		System.out.println("My name is "+firstName);
	}
	
	public void printName(String firstName,String lastName) {
		System.out.println("My first name is "+firstName+" and last name is "+lastName);
	}
}
