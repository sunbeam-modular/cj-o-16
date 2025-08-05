package com.sunbeam.p1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program02 {

	public static void main(String[] args) {
//		Set<String> s1 = new HashSet<>(); // It does not maintain any order
		Set<String> s1 = new LinkedHashSet<>(); // maintains the insertion order
		s1.add("Ramesh");
		s1.add("Anil");
		s1.add("Mukesh");
		s1.add("Suresh");
		s1.add("Mukesh"); // duplicate element - not added
		s1.add(null); // we can add null value in the set
		s1.add(null); // multiple null values are not allowed

		System.out.println("size of s1 - " + s1.size());

		for (String e : s1)
			System.out.println("element - " + e);
	}

}
