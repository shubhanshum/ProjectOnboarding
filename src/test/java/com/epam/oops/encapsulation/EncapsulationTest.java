package com.epam.oops.encapsulation;

import org.testng.annotations.Test;

public class EncapsulationTest {

	@Test
	public void validateEncapsulation() {
		DataBinding binding=new DataBinding("me@gmail.com");
		System.out.println(binding.toString());
	}
}
