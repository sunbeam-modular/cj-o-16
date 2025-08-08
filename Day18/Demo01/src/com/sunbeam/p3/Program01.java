package com.sunbeam.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Suresh", "Mukesh", "Anil", "Ramesh", "Ram", "Sham");
		System.out.println("Before Sort -> " + l1);

		Collections.sort(l1); // sorting on natural ordering of the elements
		System.out.println("After Sort(asc) -> " + l1);

		Collections.sort(l1, (s1, s2) -> s2.compareTo(s1)); // desc
		System.out.println("After Sort(desc) -> " + l1);

	}

}
