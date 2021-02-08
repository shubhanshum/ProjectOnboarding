package com.epam.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {

	public void displayStackElements(Stack<Integer> elements) {
		Iterator<Integer> it=elements.iterator();
		while(it.hasNext()) {
			System.out.println("Stack element is: "+it.next());
		}
	}
}
