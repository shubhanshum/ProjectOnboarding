package com.epam.java8.function;

public class Product {

	String name; 
	int price;
	String category;
	String grade;
	
	public Product(String name, int price, String category, String grade) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public String getGrade() {
		return grade;
	}
}
