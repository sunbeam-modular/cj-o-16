package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program08 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Nitin", "Nilesh", "Rohan", "Yogesh", "Rahul", "Nilesh", "Yogesh", "Rahul");

		// display all the unique names
		// l1.stream().distinct().forEach(System.out::println);

		// display all the unique names in desc order
		l1.stream().distinct().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);

		// l1.stream().sorted((s1, s2) ->
		// s2.compareTo(s1)).distinct().forEach(System.out::println);
	}
}
