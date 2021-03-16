package com.epam.java8.bifunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import org.testng.annotations.Test;

import com.epam.java8.bifunction.Product;

public class BiFunctionTests {

/*	Given the name and price of the product, write a 
	Bifunction to create a product.
*/
	@Test(priority=1)
	public void test1() {
		BiFunction<String, Integer , Product> product = (n,p)->{return new Product(n,p,"home","1"); };

        System.out.println(product.apply("Laptop",5000).toString());
	}
	
	/*	Given the Product and quantity of the products, write a BiFunction to calculate the cost of products. 
	 * A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.
     */
	
	@Test(priority=2)
	public void test2() {
		Map<Product, Integer> cart = new HashMap<Product, Integer>();
        cart.put(new Product("TV", 1000, "cat1", "1"), 3);
        cart.put(new Product("TV2", 1200, "cat1", "1"), 2);
        cart.put(new Product("Tv3", 1300, "cat1", "1"), 1);
        cart.put(new Product("T4", 1040, "cat1", "1"), 1);

        BiFunction<Product, Integer, Double> totalCost = (p, q) -> {
            return Double.valueOf(p.getPrice() * q);
        };

        Double costOfCart = 0.0;
        for (Map.Entry<Product, Integer> p : cart.entrySet()) {
            costOfCart += totalCost.apply(p.getKey(), p.getValue());
        }
        System.out.println("Total cost of the cart : " + costOfCart);
	}
}
