package com.epam.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class LinkedHashSetTest {

	@Test
	public void linkedHashSetTest() {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
