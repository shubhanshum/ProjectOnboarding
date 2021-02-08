package com.epam.collection.list;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListTest {

	@Test
	public void validateLinkedList() {
		List<String> list=new LinkedList<>();
		list.add("shubhanshu");
		list.add("mishra");
		LinkedListImpl linkedList=new LinkedListImpl();
		System.out.println("Linked list elements: "+linkedList.printElements(list));
	}
}
