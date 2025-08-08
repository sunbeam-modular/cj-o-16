package com.sunbeam.p2;

import java.util.stream.Stream;

public class Program03 {

	public static void main(String[] args) {
		Integer arr[] = { 6, 3, 5, 1, 2, 4 };

		// display square of all numbers in asc order
		Stream.of(arr).map(e -> {
			System.out.println("Inside Map - " + e);
			return e * e;
		}).sorted().forEach(e -> System.out.println("Inside For-each - " + e));

	}

}
