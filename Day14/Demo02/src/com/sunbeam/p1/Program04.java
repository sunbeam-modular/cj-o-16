package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program04 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		// the iterators that thow and exception ConcurrentModificationException
		// when underlying collection is modified during iteration are called as
		// fail-fast iterator
		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			Integer element = itr.next();
			if (element == 30)
				c1.add(60); // modifying the collection -> ConcurrentModificationException
			System.out.println("element - " + element);
		}
	}

}
