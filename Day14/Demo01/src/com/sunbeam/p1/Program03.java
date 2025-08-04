package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program03 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>(); // upcasting
		// Collection<Integer> c1 = new LinkedHashSet<>(); // upcasting
		// Collection<Integer> c1 = new LinkedList<>(); // upcasting

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		System.out.println("size of c1 - " + c1.size());

		System.out.println("is 30 present in c1 - " + c1.contains(30));
		System.out.println("is 70 present in c1 - " + c1.contains(70));

		System.out.println("Remove the element 20 - " + c1.remove(20));
		System.out.println("Remove the element 60 - " + c1.remove(60));
		System.out.println("After remove, size of c1 - " + c1.size());

		for (Integer element : c1)
			System.out.println("element - " + element);

		c1.clear();
		System.out.println("Is c1 empty - " + c1.isEmpty());
	}

}
