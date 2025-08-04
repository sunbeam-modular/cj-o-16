package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program02 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>(); // upcasting
		// Collection<Integer> c1 = new LinkedHashSet<>(); // upcasting
		// Collection<Integer> c1 = new LinkedList<>(); // upcasting

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		c1.clear(); // removes all the elements from the collection

		System.out.println("size of c1 - " + c1.size());

		for (Integer element : c1)
			System.out.println("element - " + element);
	}

}
