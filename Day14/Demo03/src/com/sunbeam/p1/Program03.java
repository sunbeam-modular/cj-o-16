package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;

public class Program03 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ram");
		names.add("Mukesh");

		System.out.println("Size - " + names.size());

		for (int i = 0; i < names.size(); i++)
			System.out.println("name at index " + i + " - " + names.get(i));

		System.out.println("index of Ram - " + names.indexOf("Ram"));
		System.out.println("index of Mukesh - " + names.indexOf("Mukesh"));
		System.out.println("last index of Mukesh - " + names.lastIndexOf("Mukesh"));
	}
}
