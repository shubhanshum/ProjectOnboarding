package com.epam.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.testng.annotations.Test;

public class ProductTest {

	/*
	 * Write a function to calculate the cost of all products in a given list of
	 * products.
	 */
	
	@Test(priority=1)
	public void test1() {
		
		List<Product> list=new ArrayList<>();
		Product products1=new Product("Television", 2000, "Electronics", "A");
		Product products2=new Product("Tape Recorder", 3000, "Electronics", "A");
		Product products3=new Product("Chair", 1000, "Furniture", "A");
		Product products4=new Product("Spoon", 500, "Utensils", "A");
		list.add(products1);
		list.add(products2);
		list.add(products3);
		list.add(products4);
		Function<Product, Integer> calculate = (t) -> {
            return t.getPrice();
        };
        int totalCost = 0;
        for (Product p : list)
            totalCost += calculate.apply(p);

        System.out.println("Total Cost of all Products : " + totalCost);
    
	}
	
	/*
	 * Write a function to calculate the cost of all products whose prices is >
	 * 1000/- in the given list of products.
	 */
	
	@Test(priority=2)
	public void test2() {
		
		List<Product> list=new ArrayList<>();
		Product products1=new Product("Television", 2000, "Electronics", "A");
		Product products2=new Product("Tape Recorder", 3000, "Electronics", "A");
		Product products3=new Product("Chair", 1000, "Furniture", "A");
		Product products4=new Product("Spoon", 500, "Utensils", "A");
		list.add(products1);
		list.add(products2);
		list.add(products3);
		list.add(products4);
		Function<Product, Integer> calculate = (t) -> {
            if(t.getPrice()>1000){
                return t.getPrice();
            } 
            return 0;
        };
        
        int totalCost = 0;
        for (Product p : list)
            totalCost += calculate.apply(p);

        System.out.println("Total Cost of all Products > 1000 : " + totalCost);
	}
	
	/*
	 * Write a function to calculate the cost of all electronic products in the
	 * given list of products.
	 */
	
	@Test(priority=3)
	public void test3() {
		
		List<Product> list=new ArrayList<>();
		Product products1=new Product("Television", 2000, "Electronics", "A");
		Product products2=new Product("Tape Recorder", 3000, "Electronics", "A");
		Product products3=new Product("Chair", 1000, "Furniture", "A");
		Product products4=new Product("Spoon", 500, "Utensils", "A");
		list.add(products1);
		list.add(products2);
		list.add(products3);
		list.add(products4);
		Function<Product, Integer> calculate = (t) -> {
            if(t.getCategory().equals("Electronics")) {
                return t.getPrice();
            }
            return 0;
        };
        int totalCost = 0;
        for (Product p : list)
            totalCost += calculate.apply(p);

        System.out.println("Total Cost of all Electronics Products : " + totalCost);
	}
	
	/*
	 * Write a function to get all the products whose price is is > 1000/- and
	 * belongs to electronic category.
	 */
	
	@Test(priority=4)
	public void test4() {
		
		List<Product> list=new ArrayList<>();
		Product products1=new Product("Television", 2000, "Electronics", "A");
		Product products2=new Product("Tape Recorder", 3000, "Electronics", "A");
		Product products3=new Product("Chair", 1000, "Furniture", "A");
		Product products4=new Product("Spoon", 500, "Utensils", "A");
		list.add(products1);
		list.add(products2);
		list.add(products3);
		list.add(products4);
		Function<Product, String> calculate = (t) -> {
            if (t.getCategory().equals("Electronics") && t.getPrice() > 1000) {
                return t.getName();
            }
            return null;
        };
        String name="";
        for (Product p : list)
            name += calculate.apply(p);

        System.out.println("Electronics Products With Price >1000: " + name);
	}
}
