package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;

public class Program01 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");

		names.add(2, "Ram"); //

		System.out.println("Size - " + names.size());

		System.out.println("name at index 3 - " + names.get(3));

//		for (String n : names)
//			System.out.println("name - " + n);

		for (int i = 0; i < names.size(); i++)
			System.out.println("name at index " + i + " - " + names.get(i));
	}
}
