package com.epam.java8.primitiveinterface;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

import org.testng.annotations.Test;

public class PrimitiveInterfTest {

	/* Write an IntPredicate to verify if the given number is a primenumber 
	 * 
	 */
	
	@Test(priority=1)
	public void test1() {
		IntPredicate isPrime = (i) -> {
            for (int x = 2; x <= i / 2; x++) {
                if (i % x == 0) {
                    return false;
                }
            }
            return true;
        };

        if(isPrime.test(11)){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
	}
	
	/* Write an IntConsumer to print square of the given number 
	 * 
	 */
	@Test(priority=2)
	public void test2() {
		IntConsumer square = i -> {
            System.out.println("Square of " + i + " is : " + i * i);
        };
        square.accept(10);
	}
	
	/* Write a IntSupplier to give random int below 5000. 
	 * 
	 */ 
	@Test(priority=3)
	public void test3() {
		IntSupplier randomeNumber = () -> {
            return new Random().nextInt(5000);
        };
        System.out.println("Random Number below 5000 : " + randomeNumber.getAsInt());
	}
	
}
