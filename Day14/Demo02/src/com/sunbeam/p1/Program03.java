package com.sunbeam.p1;

import java.util.LinkedList;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {
		// Collection<Integer> c1 = new LinkedList<Integer>();
		List<Integer> c1 = new LinkedList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		// forloop can be used only on the List interface
		// and its sub class
		for (int i = 0; i < c1.size(); i++)
			System.out.println("element - " + c1.get(i));

	}

}
