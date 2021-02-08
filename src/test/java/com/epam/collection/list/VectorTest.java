package com.epam.collection.list;

import java.util.Vector;

import org.testng.annotations.Test;

public class VectorTest {

	@Test
	public void validateVector() {
		Vector<String> vector=new Vector<>();
		vector.add("shubham");
		vector.add("mishra");
		VectorImplementation vectorObj=new VectorImplementation();
		vectorObj.printNames(vector);
	}
}
