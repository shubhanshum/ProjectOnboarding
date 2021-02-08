package com.epam.collection.list;

import java.util.Stack;

import org.testng.annotations.Test;

public class StackTest {

	@Test
	public void validateStack() {
		Stack<Integer> stack=new Stack<>();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		StackImplementation stackObj=new StackImplementation();
		stackObj.displayStackElements(stack);
	}
}
