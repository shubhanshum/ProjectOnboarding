package com.epam.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class LinkedHashmapTest {

	@Test
	public void validateLinkedMap() {
		LinkedHashMap<Integer, String> lMap=new LinkedHashMap<>();
		lMap.put(1, "one");
		lMap.put(1, "two");
		lMap.put(1, "three");
		
		Set<Entry<Integer, String>> es=lMap.entrySet();
		Iterator<Entry<Integer, String>> it=es.iterator();
		while(it.hasNext()) {
			
			Map.Entry me=(Map.Entry)it.next();
			System.out.println("key: "+me.getKey()+" "+"value: "+me.getValue());
		}

	}
}
