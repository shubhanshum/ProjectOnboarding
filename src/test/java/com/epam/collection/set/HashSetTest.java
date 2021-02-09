package com.epam.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class HashSetTest {

	@Test
	public void hashsetTest() {
		Set<String> set=new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
