package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program04 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		Collections.addAll(l1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// display the count of odd numbers
		int counter = 0;
		for (Integer i : l1) {
			if (i % 2 != 0) // filter
			{
				counter++; // value
			}
		}
		System.out.println("Total odd nos - " + counter);

//		long odd_count = l1.stream().filter(i -> i % 2 != 0).count();
//		System.out.println("Total Odd nos - " + odd_count);

		System.out.println("Total Odd nos - " + l1.stream().filter(i -> i % 2 != 0).count());
	}
}
