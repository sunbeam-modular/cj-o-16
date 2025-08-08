package com.sunbeam.p1;

import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// Pipeline of operations
		Stream.of(arr).filter(i -> i % 2 == 0).map(i -> i * i).forEach(i -> System.out.print(i + ","));

	}

	public static void main2(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Stream<Integer> s1 = Stream.of(arr); // Stream is generated
		Stream<Integer> s2 = s1.filter(i -> i % 2 == 0); // Intermediate Operation
		Stream<Integer> s3 = s2.map(i -> i * i); // Intermediate Operation
		s3.forEach(i -> System.out.print(i + ",")); // Terminal operations
	}

	public static void main1(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// display the square the even numbers from the array
		for (Integer e : arr) {
			if (e % 2 == 0) // is it a even number
			{
				int sq = e * e;
				System.out.println("square - " + sq);
			}
		}

	}

}
