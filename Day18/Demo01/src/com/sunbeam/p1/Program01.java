package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l1, "Suresh", "Mukesh", "Anil", "Ramesh", "Ram", "Sham");
		System.out.println("Before Sort -> " + l1);

		Collections.sort(l1); // sorting on natural ordering of the elements
		System.out.println("After Sort(asc) -> " + l1);

		class NameComparator implements Comparator<String> {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // desc order
			}
		}

		NameComparator nameComparator = new NameComparator();

		Collections.sort(l1, nameComparator); // desc order
		System.out.println("After Sort(desc) -> " + l1);
	}

}
