package com.sunbeam.p1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Program07 {

	public static void main1(String[] args) {
		List<Integer> l1 = new LinkedList<>();

		l1.add(10);
		l1.add(20);
		l1.add(1, 30);
		l1.add(1, 40);

		Deque<Integer> q1 = new LinkedList<>();

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
