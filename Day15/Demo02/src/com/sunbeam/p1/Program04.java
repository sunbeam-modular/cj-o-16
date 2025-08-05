package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program04 {

	// Deque can be used as stack
	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<>();
		q1.push(10);
		q1.push(20);
		q1.push(30);
		q1.push(40);

		System.out.println("Element at top - " + q1.peek());
		System.out.println("Element removed - " + q1.pop());
		System.out.println("After pop, Element at top - " + q1.peek());
	}

}
