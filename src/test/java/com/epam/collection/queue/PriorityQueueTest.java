package com.epam.collection.queue;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class PriorityQueueTest {

	@Test
	public void validatePriorityQueue() {
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(2);
		queue.add(3);
		PriorityQueueImpl priority=new PriorityQueueImpl();
		priority.displayNumbers(queue);
	}
}
