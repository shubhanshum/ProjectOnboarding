package com.epam.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapTest {

	@Test
	public void validateHashMap() {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "shubhanshu");
		map.put(2, "mishra");
		map.put(3, "satya");
		
		Set<Entry<Integer, String>> entry=map.entrySet();
		
		Iterator<Entry<Integer, String>> it=entry.iterator();
		while(it.hasNext()){
			Map.Entry m1=(Map.Entry)it.next();
			System.out.println("key is "+m1.getKey()+"----"+"value is "+m1.getValue());

		}
	}
}
