package com.epam.java8.consumerandsupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import org.testng.annotations.Test;

public class SupplierTest {

	/*
	 * Write a supplier to produce a random product.
	 */
	
	@Test(priority=1)
	public void test1() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("TV",1500,"Electronics","A"));
		products.add(new Product("AC",2000,"Electronics","B"));
		products.add(new Product("Spoon",8000,"Utensils","Premium"));
		Supplier<Product> supplier = () -> {
            return products.get((int) (0 + Math.random() * products.size()));
        };
        System.out.println(supplier.get().getName());
	}
	
	/*
	 * Write a supplier to produce a random OTP.
	 */ 
	
	@Test(priority=2)
	public void test2() {
		Supplier<String> supplier = () -> {
            String otp="";
            Random random = new Random();
            for(int i=0;i<4;i++)
                otp += random.nextInt(10);
            return otp;
        };
        System.out.println("OTP : " + supplier.get().toString());
	}
}
