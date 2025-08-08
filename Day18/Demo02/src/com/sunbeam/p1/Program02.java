package com.sunbeam.p1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program02 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Stream.of(arr).filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				System.out.println("Inside Filter - " + i);
				return i % 2 == 0;
			}
		}).map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer i) {
				System.out.println("Inside Map - " + i);
				return i * i;
			}
		}).forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println("Square - " + i);
			}
		});

	}

	public static void main1(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// display the square the even numbers from the array
		for (Integer e : arr) {
			System.out.println("Inside For - " + e);
			if (e % 2 == 0) // is it a even number
			{
				System.out.println("Inside If - " + e);
				int sq = e * e;
				// System.out.println("square - " + sq);
			}
		}

	}

}
