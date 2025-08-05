package com.sunbeam.p1;

import java.util.ArrayList;

public class Program01 {

	public static void main(String[] args) {
		// Collection<Integer> c1 = new ArrayList<>();
		// List<Integer> l1 = new ArrayList<>();

		// It is a resizable array
		// the capacity grows automatically when the elements are added
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);

		System.out.println("Size of a1 - " + a1.size());

		for (int i = 0; i < a1.size(); i++)
			System.out.println("element - " + a1.get(i));
	}

}
