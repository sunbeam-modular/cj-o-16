package com.sunbeam.p2;

import java.util.Scanner;

// Java 8 interfaces

interface Shape {
	void accept(Scanner sc);

	void calculateArea();

	// to avoid fragile base class problem
	default void calculatePerimeter() {
		System.out.println("Perimeter is not avaialble...");
	}
}

class Circle implements Shape {
	int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Circle - " + (3.14 * radius * radius));
	}

}

class Rectangle implements Shape {
	int length;
	int breadth;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the length - ");
		length = sc.nextInt();
		System.out.println("Enter the breadth - ");
		breadth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle - " + (length * breadth));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle - " + (2 * (length + breadth)));
	}

}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s1;
		s1 = new Circle();
		// s1 = new Rectangle();

		s1.accept(sc);
		s1.calculateArea();
		s1.calculatePerimeter();
	}

}
