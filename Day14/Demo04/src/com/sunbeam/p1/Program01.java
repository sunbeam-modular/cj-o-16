package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Suresh", "Ramesh", "Anil", "Mukesh", "Ram");

		System.out.println("Before Sorting -> ");
		for (String n : l1)
			System.out.println(n);

		System.out.println("After Sorting in asc -> ");
		Collections.sort(l1);
		for (String n : l1)
			System.out.println(n);

		class NameComparator implements Comparator<String> {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // desc
			}
		}
		NameComparator comp = new NameComparator();

		System.out.println("After Sorting in desc -> ");
		Collections.sort(l1, comp);
		for (String n : l1)
			System.out.println(n);

	}

}
