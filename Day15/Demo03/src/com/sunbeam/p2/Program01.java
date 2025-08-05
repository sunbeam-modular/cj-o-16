package com.sunbeam.p2;

import java.util.Set;
import java.util.TreeSet;

public class Program01 {

	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		s1.add(40);
		s1.add(10);
		s1.add(30);
		s1.add(20);
		s1.add(20); // duplicate element - not added
		// s1.add(null); // we cannot add null value in the tree set

		System.out.println("size of s1 - " + s1.size());

		for (Integer i1 : s1)
			System.out.println("element - " + i1);
	}

}
