package com.sunbeam.p2;

import java.util.Set;
import java.util.TreeSet;

public class Program02 {

	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<>();
		// maintains the natural ordering
		s1.add("Ramesh");
		s1.add("Anil");
		s1.add("Mukesh");
		s1.add("Suresh");
		s1.add("Mukesh"); // duplicate element - not added

		System.out.println("size of s1 - " + s1.size());

		for (String e : s1)
			System.out.println("element - " + e);
	}

}
