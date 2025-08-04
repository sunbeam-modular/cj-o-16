package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program04 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ram");

		System.out.println("Using Iterator traversal only in fwd direction - ");
		Iterator<String> itr1 = names.iterator();
		while (itr1.hasNext())
			System.out.println("name - " + itr1.next());

		System.out.println("Using ListIterator traversal in fwd direction - ");
		ListIterator<String> itr2 = names.listIterator();
		while (itr2.hasNext())
			System.out.println("name - " + itr2.next());

		System.out.println("Using ListIterator traversal in reverse direction - ");
		ListIterator<String> itr3 = names.listIterator(names.size());
		while (itr3.hasPrevious())
			System.out.println("names - " + itr3.previous());
	}
}
