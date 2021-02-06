package com.epam.oops.composition;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class CompositionTest {

	@Test
	public void validateComposition() {
		Mobile mobile1=new Mobile("Samsung", "8GB", "126GB");
		Mobile mobile2=new Mobile("Nokia", "6GB", "90GB");
		
		List<Mobile> mobiles=new ArrayList<>();
		mobiles.add(mobile1);
		mobiles.add(mobile2);
		
		MobileStore store=new MobileStore(mobiles);
		List<Mobile> num=store.getTotalMobileNumber();
		
		for (Mobile mob:num) {
			System.out.println(mob.name+" "+mob.ram);
		}
	}
}
