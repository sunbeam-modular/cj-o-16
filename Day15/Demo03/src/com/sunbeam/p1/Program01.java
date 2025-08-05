package com.sunbeam.p1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(20); // duplicate element - not added
		s1.add(null); // we can add null value in the set
		s1.add(null); // multiple null values are not allowed

		System.out.println("size of s1 - " + s1.size());

		for (Integer i1 : s1)
			System.out.println("element - " + i1);
	}

}
