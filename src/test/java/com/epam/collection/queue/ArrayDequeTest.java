package com.epam.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

import org.testng.annotations.Test;

public class ArrayDequeTest {

	@Test
	public void validateArrayDeque() {
		Deque<String> arrayDeque=new ArrayDeque<>();
		arrayDeque.add("shubhanshu");
		arrayDeque.add("mishra");
		ArrayDequeImpl deque=new ArrayDequeImpl();
		deque.printElements(arrayDeque);
	}
}
