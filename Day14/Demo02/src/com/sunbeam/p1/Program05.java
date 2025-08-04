package com.sunbeam.p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program05 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new CopyOnWriteArrayList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		// the iterators that do not thow exception ConcurrentModificationException
		// when underlying collection is modified during iteration are called as
		// fail-safe iterator
		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			Integer element = itr.next();
			if (element == 30)
				c1.add(60); // modifying the collection
			System.out.println("element - " + element);
		}

		System.out.println("After changes -> ");
		for (Integer e : c1)
			System.out.println("element - " + e);
	}

}
