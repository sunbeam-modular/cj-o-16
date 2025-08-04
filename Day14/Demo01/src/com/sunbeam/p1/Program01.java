package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program01 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>(); // upcasting
		// Collection<Integer> c1 = new LinkedHashSet<>(); // upcasting
		// Collection<Integer> c1 = new LinkedList<>(); // upcasting

		c1.add(10); // to add the data inside the collection
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		System.out.println("size of c1 - " + c1.size()); // returns the no of elements in the collection

		// for-each
		for (Integer element : c1)
			System.out.println("element - " + element);
	}

}
