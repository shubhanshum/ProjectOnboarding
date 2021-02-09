package com.epam.collection.map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class IdentityHashmapTest {

	@Test
	public void identityHashmapTest() {
		IdentityHashMap<Integer, String> map=new IdentityHashMap<>();
		map.put(101, "shubhanshu");
		map.put(201, "mishra");
		
		Set<Entry<Integer, String>> es=map.entrySet();
		Iterator<Entry<Integer, String>> it=es.iterator();
		while(it.hasNext()) {
			
			Map.Entry me=(Map.Entry)it.next();
			System.out.println("key: "+me.getKey()+" "+"value: "+me.getValue());
		}
	}
}
