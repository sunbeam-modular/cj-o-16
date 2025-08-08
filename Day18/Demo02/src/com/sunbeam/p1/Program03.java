package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Program03 {

	public static void main(String[] args) {
		// way-1 : Stream Object Creation
		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> l1 = new ArrayList<>();
		Collections.addAll(l1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// way-2 : Stream object can be fetched from the Collection
		Stream<Integer> s2 = l1.stream();
	}

}
