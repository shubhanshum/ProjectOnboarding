package com.epam.collection.queue;

import java.util.Deque;

public class ArrayDequeImpl {

	public void printElements(Deque<String> deque) {
		for (String i:deque) {
			System.out.println("Array Deque elemet: "+i);
		}
	}
}
