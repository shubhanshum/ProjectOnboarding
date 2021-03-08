package com.epam.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ProductTest {

	/*
	 * From the given list of the products get all the products with price > 1000/-
	 */

	@Test(priority = 1)
	public void test1() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 1500, "Electronics", "A"));
		list.add(new Product("Washing Machine", 2000, "Electronics", "B"));
		list.add(new Product("Spoon", 1000, "Utensils", "C"));

		List<String> productPriceList = list.stream().filter(p -> p.price > 1000).map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println("Products with price > 1000 are: " + productPriceList);
	}

	/*
	 * From the given list of the products get all the products from electronics
	 * category.
	 */

	@Test(priority = 2)
	public void test2() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 1500, "Electronics", "A"));
		list.add(new Product("Washing Machine", 2000, "Electronics", "B"));
		list.add(new Product("Spoon", 1000, "Utensils", "C"));

		List<String> productcategory = list.stream().filter(p -> p.category.equals("Electronics")).map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println("Electronics Products are: " + productcategory);
	}

	/*
	 * From th given list of the products get all the products with price>1000/- and
	 * from electronics category. Change the name of the result list into CAP
	 * letters before printing.
	 */
	
	@Test(priority = 3)
	public void test3() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 1500, "Electronics", "A"));
		list.add(new Product("Washing Machine", 2000, "Electronics", "B"));
		list.add(new Product("Spoon", 1000, "Utensils", "C"));

		List<String> productcategory = list.stream().filter(p -> p.price>1000 && p.category.equals("Electronics")).
				map(p -> p.name).collect(Collectors.toList());
		productcategory.replaceAll(String::toUpperCase);
		System.out.println("Electronics Products having price>1000 are: " + productcategory);
	}
	
	/*
	 * Calculate the count of all products in the given list of products.
	 */
	
	@Test(priority = 4)
	public void test4() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 1500, "Electronics", "A"));
		list.add(new Product("Washing Machine", 2000, "Electronics", "B"));
		list.add(new Product("Spoon", 1000, "Utensils", "C"));
		Map<String, Long> countForName = list.stream()
		        .collect(Collectors.groupingBy(Product::getName ,Collectors.counting()));
		System.out.println("Electronics Products count: " + countForName);
	}
}
