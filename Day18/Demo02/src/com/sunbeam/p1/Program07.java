package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program07 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Nitin", "Nilesh", "Rohan", "Smita", "Rahul", "Pratik", "Yogesh", "Ketan");

		// display all the names in sorted order
		System.out.println("Asc order ->");
//		Collections.sort(l1);
//		for (String e : l1)
//			System.out.println(e);

		l1.stream().sorted().forEach(System.out::println);

		// display all the names in sorted desc order
		System.out.println("Desc order ->");

//		Collections.sort(l1,(s1,s2)->s1.compareTo(s2));
//		for (String e : l1)
//			System.out.println(e);

		l1.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
	}
}
