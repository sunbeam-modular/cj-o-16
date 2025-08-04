package com.sunbeam.p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Program01 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new LinkedList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			Integer element = itr.next();
			System.out.println("element - " + element);
		}
	}

}
