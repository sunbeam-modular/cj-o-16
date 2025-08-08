package com.sunbeam.p2;

import java.util.stream.Stream;

public class Program02 {

	public static void main(String[] args) {
		Integer arr[] = { 6, 9, 3, 5, 1, 7, 2, 8, 4 };

		// display square of even numbers
		Stream.of(arr).filter(i -> {
			System.out.println("Inside Filter - " + i);
			return i % 2 == 0;
		}).map(e -> {
			System.out.println("Inside Map - " + e);
			return e * e;
		}).forEach(e -> System.out.println("Inside For-each - " + e));

	}

}
