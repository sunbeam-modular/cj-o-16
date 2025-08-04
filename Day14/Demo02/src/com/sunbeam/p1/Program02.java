package com.sunbeam.p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Program02 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new LinkedList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		// Internal implementation of for-each
		for (Iterator<Integer> itr = c1.iterator(); itr.hasNext();) {
			Integer element = itr.next();
			System.out.println("element - " + element);
		}

		// for-each will use interanlly the iterator object
		for (Integer element : c1)
			System.out.println("element - " + element);

	}

}
