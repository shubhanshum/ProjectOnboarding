package com.epam.collection.map;

import java.util.Iterator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreemapTest {

	@Test
	public void validateTreemap() {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}
