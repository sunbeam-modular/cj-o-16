package com.sunbeam.p1;

import java.util.Enumeration;
import java.util.Vector;

public class Program02 {

	public static void main(String[] args) {
//		Collection<Integer> c1 = new Vector<>();
//		List<Integer> l1 = new Vector<>();
		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.addElement(20);

		// Iterator<Integer> itr = v1.iterator();
		// for (int i = 0; i < v1.size(); i++)
		// for (Integer e : v1)

		// only for vector
		Enumeration<Integer> en = v1.elements();
		while (en.hasMoreElements()) {
			Integer element = en.nextElement();
			System.out.println("element - " + element);
		}

	}

}
