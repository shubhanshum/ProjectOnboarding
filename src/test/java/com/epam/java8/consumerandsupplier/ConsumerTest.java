package com.epam.java8.consumerandsupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.testng.annotations.Test;

public class ConsumerTest {

	@Test(priority=1)
	public void test1() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("TV",1500,"Electronics","A"));
		products.add(new Product("AC",2000,"Electronics","B"));
		products.add(new Product("Spoon",1000,"Utensils","U"));
        Consumer<Product> consumer = (p)->{System.out.println(p.getName().toString());};
        for (Product p:products) {
            consumer.accept(p);
        }
	}
	
	@Test(priority=2)
	public void test2() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("TV",1500,"Electronics","A"));
		products.add(new Product("AC",2000,"Electronics","B"));
		products.add(new Product("Spoon",800,"Utensils","U"));
		Consumer<Product> consumer = (p) -> {
            if (p.getPrice() > 1000) {
                p.setGrade("Premium");
            }
            System.out.println(p.getGrade());
        };
        for (Product p : products) {
            consumer.accept(p);
            
        }
	}
	
	/*
	 * Write a Consumer to update the name of the product to be suffixed with '*' if
	 * the price of product is > 3000/-.
	 */
	@Test(priority=3)
	public void test3() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("TV",1500,"Electronics","A"));
		products.add(new Product("AC",2000,"Electronics","B"));
		products.add(new Product("Spoon",8000,"Utensils","U"));
		Consumer<Product> consumer = (p) -> {
            if (p.getPrice() > 3000) {
                p.setName(p.getName()+"*");
            }
            System.out.println(p.getName());
        };
        for (Product p : products) {
            consumer.accept(p);
        }
	}
	
	/* Print all the Premium grade products with name suffixed with '*'. 
	 * 
	 */
	@Test(priority=4)
	public void test4() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("TV",1500,"Electronics","A"));
		products.add(new Product("AC",2000,"Electronics","B"));
		products.add(new Product("Spoon",8000,"Utensils","Premium"));
		Consumer<Product> consumer = (p) -> {
			if (p.getGrade().equals("Premium")) {
				p.setName(p.getName()+"*");
            }
			System.out.println(p.getName());
        };
        for (Product p : products) {
            consumer.accept(p);
        }
	}
}
