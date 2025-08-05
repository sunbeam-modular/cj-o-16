package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program01 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>();
//		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.offer(20);
		q1.add(30);
		q1.offer(40);

		System.out.println("Element at front - " + q1.element());
		System.out.println("Element at front - " + q1.peek());

		q1.remove();
		System.out.println("After remove, Element at front - " + q1.element());

		q1.poll();
		System.out.println("After poll, Element at front - " + q1.peek());

//		System.out.println("Element removed - " + q1.remove());
//		System.out.println("Element removed - " + q1.remove());
//		System.out.println("Element removed - " + q1.remove()); // NoSuchElementException

		System.out.println("Element removed - " + q1.poll());
		System.out.println("Element removed - " + q1.poll());
		System.out.println("Element removed - " + q1.poll()); // null

//		System.out.println("After poll, Element at front - " + q1.element()); // NoSuchElementException
		System.out.println("After poll, Element at front - " + q1.peek()); // null
	}

}
