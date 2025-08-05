package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program02 {

	// Deque can be used as a normal queue using the method of Queue
	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<>();
		q1.add(10);
		q1.offer(20);
		q1.add(30);
		q1.offer(40);

		System.out.println("Element removed - " + q1.remove());
		System.out.println("Element removed - " + q1.poll());

		System.out.println("Element at front - " + q1.element());
		System.out.println("Element at front - " + q1.peek());
	}

}
