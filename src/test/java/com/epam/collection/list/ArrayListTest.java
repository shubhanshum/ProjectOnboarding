package com.epam.collection.list;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListTest {

	@Test
	public void validateArrayList() {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		ArrayListImplementation array=new ArrayListImplementation();
		System.out.println("Elements are: "+array.displayNumbers(list));
	}
}
