package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;

public class Program06 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ram");

		names.set(3, "Sham");

		System.out.println("Size - " + names.size());

		for (int i = 0; i < names.size(); i++)
			System.out.println("name at index " + i + " - " + names.get(i));

	}
}
