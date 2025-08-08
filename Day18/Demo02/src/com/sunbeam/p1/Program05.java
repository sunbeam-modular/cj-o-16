package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program05 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Nitin", "Nilesh", "Rohan", "Smita", "Rahul", "Pratik", "Yogesh", "Ketan");

		// display only first 5 names
		System.out.println("First 5 names -> ");
		l1.stream().limit(5).forEach(System.out::println);

		// skip first 2 names and display next 5 names
		System.out.println("Skip First 2 and display next 5 names -> ");
		l1.stream().skip(2).limit(5).forEach(System.out::println);
	}
}
