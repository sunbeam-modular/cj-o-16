package com.sunbeam.p4;

import java.util.Scanner;

interface Shape {
	double PI = 3.14; // public static final

	void accept(Scanner sc);

	void calculateArea();
}

// Rectangle is-a Shape
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
		System.out.println("Area of Rectangle = " + (length * breadth));
	}
}

// Circle is-a Shape
class Circle implements Shape {
	int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Circle = " + (PI * radius * radius));
	}

}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Shape s;
//		s = new Rectangle(); // upcasting
		s = new Circle(); // upcasting

		s.accept(sc);
		s.calculateArea();
	}

}
