package com.sunbeam.p1;

import java.util.Stack;

public class Program04 {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);

		System.out.println("Element at top - " + s1.peek());

		s1.pop();
		System.out.println("After Pop, Element at top - " + s1.peek());
		s1.pop();
		System.out.println("After Pop, Element at top - " + s1.peek());
	}

}
