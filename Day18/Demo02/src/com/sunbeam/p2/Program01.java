package com.sunbeam.p2;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(5, "Ruler", 12));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(1, "Pen", 20));
		products.add(new Product(4, "Eraser", 8));
		products.add(new Product(3, "Book", 50));

		// display all products
		System.out.println("Original List -> ");
		products.forEach(System.out::println);
		System.out.println("--------------------------------------------------");

		// display all products sorted on pid (natural ordering)
		System.out.println("List Sorted on Pid -> ");
		products.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------------------------------------");

		// display all products sorted on price (desc order)
		System.out.println("List Sorted on price(desc) -> ");
		products.stream().sorted((p1, p2) -> Double.compare(p2.price, p1.price)).forEach(System.out::println);
		System.out.println("--------------------------------------------------");

		// display all the products whose price > 15 with price sorted low to high
		System.out.println("Products with price > 15 with rpice low to high -> ");
		products.stream().filter(p -> p.price > 15).sorted((p1, p2) -> Double.compare(p1.price, p2.price))
				.forEach(System.out::println);
		System.out.println("--------------------------------------------------");

	}

}
