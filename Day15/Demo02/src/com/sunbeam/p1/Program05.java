package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program05 {

	// Deque methods to be used to implement stack
	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<>();
		q1.addLast(10);
		q1.offerLast(20);
		q1.addLast(30);
		q1.offerLast(40);

		System.out.println("Element at top - " + q1.getLast());
		System.out.println("Element at top - " + q1.peekLast());

		System.out.println("Element removed - " + q1.removeLast());
		System.out.println("Element removed - " + q1.pollLast());
	}

	// Deque methods to be used to implement stack
	public static void main1(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<>();
		q1.addFirst(10);
		q1.offerFirst(20);
		q1.addFirst(30);
		q1.offerFirst(40);

		System.out.println("Element at top - " + q1.getFirst());
		System.out.println("Element at top - " + q1.peekFirst());

		System.out.println("Element removed - " + q1.removeFirst());
		System.out.println("Element removed - " + q1.pollFirst());
	}

}
