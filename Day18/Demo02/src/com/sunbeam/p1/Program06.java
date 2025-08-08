package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program06 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Nitin", "Nilesh", "Rohan", "Smita", "Rahul", "Pratik", "Yogesh", "Ketan");

		// get the emps with name starting with R
		l1.stream().filter(s -> s.startsWith("R")).forEach(System.out::println);

		// attatch -sunbeam to the emps whose name starting with N and display
		// l1.stream().filter(s -> s.charAt(0) == 'N').map(s -> s +
		// "-sunbeam").forEach(System.out::println);
		l1.stream().filter(s -> s.charAt(0) == 'N').forEach(s -> System.out.println(s + "-sunbeam"));
	}
}
