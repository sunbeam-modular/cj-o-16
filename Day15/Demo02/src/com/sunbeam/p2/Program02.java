package com.sunbeam.p2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Program02 {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<>();
		q1.add("Suresh");
		q1.add("Ramesh");
		q1.add("Anil");
		q1.add("Mukesh");

		Iterator<String> itr = q1.iterator();
		while (itr.hasNext())
			System.out.println("element - " + itr.next());

		System.out.println("Element at front - " + q1.peek());
		System.out.println("Element removed - " + q1.poll());

		System.out.println("Element at front - " + q1.peek());
		System.out.println("Element removed - " + q1.poll());

	}

}
