package com.epam.collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashtableTest {

	@Test
	public void validateHashtable() {
		Hashtable<Integer, String> table=new Hashtable<>();
		table.put(101, "one");
		table.put(102, "two");
		table.put(103, "three");
		
		Set<Entry<Integer, String>> es=table.entrySet();
		Iterator<Entry<Integer, String>> it=es.iterator();
		while(it.hasNext()) {
			
			Map.Entry me=(Map.Entry)it.next();
			System.out.println("key: "+me.getKey()+" "+"value: "+me.getValue());
		}
	}
}
