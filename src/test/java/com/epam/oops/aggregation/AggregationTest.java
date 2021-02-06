package com.epam.oops.aggregation;

import org.testng.annotations.Test;

public class AggregationTest {

	@Test
	public void validateAggregation() {
		Sim sim=new Sim("Airtel", "9205497688");
		Mobile mob=new Mobile("Nokia", true, sim);
		System.out.println(mob.name);
	}
}
