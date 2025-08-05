package com.sunbeam.p2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Program01 {

	public static void main(String[] args) {
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		// Natural ordering of the elements
		q1.add(40);
		q1.add(10);
		q1.add(30);
		q1.add(20);

		Iterator<Integer> itr = q1.iterator();
		while (itr.hasNext())
			System.out.println("element - " + itr.next());

		System.out.println("Element at front - " + q1.peek());
		System.out.println("Element removed - " + q1.poll());

		System.out.println("Element at front - " + q1.peek());
		System.out.println("Element removed - " + q1.poll());

	}

}
