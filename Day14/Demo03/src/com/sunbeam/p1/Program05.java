package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;

public class Program05 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ram");

		System.out.println("element removed from index 3 - " + names.remove(7));
		System.out.println("element removed Mukesh - " + names.remove("Mukesh"));

		System.out.println("Size - " + names.size());

		for (int i = 0; i < names.size(); i++)
			System.out.println("name at index " + i + " - " + names.get(i));

	}
}
