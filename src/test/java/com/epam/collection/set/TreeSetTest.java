package com.epam.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetTest {

	@Test
	public void validateTreeSet() {
		TreeSet<String> set=new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
