package com.epam.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class ProductPriceTest {

	/*
	 * Define a predicate to check if the price of given product is greater than
	 * 1000/-. Print all the products from the given list of the products if the
	 * price is greater than 1000/-.
	 */ 
	
	@Test(priority=1)
	public void greaterPriceCheck() {
		List<Product> list=new ArrayList<Product>();
		Product product1 = new Product("AC", 2000, "Electronic", "A");
		Product product2 = new Product("Refrigerator", 1500, "Electronic", "B");
		Product product3 = new Product("Chair", 800, "Furniture", "C");
		Product product4 = new Product("Spoon", 200, "Utensils", "A");
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		
		for (int i=0;i<=list.size()-1;i++) {
			Product myProduct=list.get(i);
			Predicate<Product> p=price->myProduct.getPrice()>1000;
			if (p.test(myProduct)==true) {
				System.out.println("Product name is: "+myProduct.getName());
			}
		}	
	}
	
	/*
	 * Define a predicate to check if the product is of electronics category. Print
	 * all the products from the given list of the products if the product is of
	 * electronics category.
	 */
	
	@Test(priority=2)
	public void electronicCategoryCheck() {
		List<Product> list=new ArrayList<Product>();
		Product product1 = new Product("AC", 2000, "Electronic", "A");
		Product product2 = new Product("Refrigerator", 1500, "Electronic", "B");
		Product product3 = new Product("Chair", 800, "Furniture", "C");
		Product product4 = new Product("Spoon", 200, "Utensils", "A");
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		
		for (int i=0;i<=list.size()-1;i++) {
			Product myProduct=list.get(i);
			Predicate<Product> p=price->myProduct.getCategory().equals("Electronic");
			if (p.test(myProduct)==true) {
				System.out.println("Electronic product name is: "+myProduct.getName());
			}
		}	
	}
	
	/*
	 * Print all the products from the given list of product if the product price is
	 * greater than 100/- which are in electronics category.
	 */
	
	@Test(priority=3)
	public void categoryAndPriceCheck() {
		List<Product> list=new ArrayList<Product>();
		Product product1 = new Product("AC", 200, "Electronic", "A");
		Product product2 = new Product("Refrigerator", 1500, "Electronic", "B");
		Product product3 = new Product("Chair", 80, "Furniture", "C");
		Product product4 = new Product("Spoon", 100, "Utensils", "A");
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		
		for (int i = 0; i <= list.size() - 1; i++) {
			Product myProduct = list.get(i);
			Predicate<Product> p = price -> myProduct.getPrice() > 100 && myProduct.getCategory().equals("Electronic");
			if (p.test(myProduct) == true) {
				System.out.println("Electronic product with price > 100 is: " + myProduct.getName());
			}
		}
	}
	
	/*
	 * Print all the products from the given list of product if the product price is
	 * greater than 100/- or product is in electronics category.
	 */
	
	@Test(priority=4)
	public void categoryOrPriceCheck() {
		List<Product> list=new ArrayList<Product>();
		Product product1 = new Product("AC", 200, "Electronic", "A");
		Product product2 = new Product("Refrigerator", 1500, "Electronic", "B");
		Product product3 = new Product("Chair", 80, "Furniture", "C");
		Product product4 = new Product("Spoon", 100, "Utensils", "A");
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		
		for (int i=0;i<=list.size()-1;i++) {
			Product myProduct=list.get(i);
			Predicate<Product> p=price->myProduct.getPrice()>100 || myProduct.getCategory().equals("Electronic");
			if (p.test(myProduct)==true) {
				System.out.println("Electronic product or product with price > 100 is: "+myProduct.getName());
			}
		}	
	}
	
	/*
	 * Print all the products from the given list of product if the product price is
	 * less than 100/- and product is in electronics category.
	 */
	
	@Test(priority=5)
	public void categoryAndLessPriceCheck() {
		List<Product> list=new ArrayList<Product>();
		Product product1 = new Product("AC", 90, "Electronic", "A");
		Product product2 = new Product("Refrigerator", 1500, "Electronic", "B");
		Product product3 = new Product("Chair", 80, "Furniture", "C");
		Product product4 = new Product("Spoon", 100, "Utensils", "A");
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		
		for (int i=0;i<=list.size()-1;i++) {
			Product myProduct=list.get(i);
			Predicate<Product> p=price->myProduct.getPrice()<100 && myProduct.getCategory().equals("Electronic");
			if (p.test(myProduct)==true) {
				System.out.println("Electronic product with price < 100 is: "+myProduct.getName());
			}
		}	
	}
}
