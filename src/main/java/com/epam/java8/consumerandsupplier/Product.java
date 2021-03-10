package com.epam.java8.consumerandsupplier;

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

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
