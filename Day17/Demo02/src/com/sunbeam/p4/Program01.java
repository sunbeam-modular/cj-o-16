package com.sunbeam.p4;

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

// Arrays
// Collections
// helper methods -> Till java 7
class Shapes {
	public static void addDummyData(Shape arr[]) {
		// add the dummy data
		arr[0] = new Circle(5);
		arr[1] = new Rectangle(10, 5);
		arr[2] = new Circle(7);
		arr[3] = new Circle(9);
		arr[4] = new Rectangle(12, 7);
	}

	public static void displayAllShape(Shape arr[]) {
		// display the area and perimeter
		for (Shape s : arr) {
			s.calculateArea();
			s.calculatePerimeter();
			System.out.println("------------------------------");
		}
	}
}

class Circle implements Shape {
	int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

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

	public Rectangle() {
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

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
		Shape arr[] = new Shape[5];

		Shapes.addDummyData(arr);
		Shapes.displayAllShape(arr);

	}
}
