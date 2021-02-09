package com.epam.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

	public void displayNumbers(PriorityQueue<Integer> numbers) {
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {
			System.out.println("Priority queue elements: "+it.next());
		}
	}
}
