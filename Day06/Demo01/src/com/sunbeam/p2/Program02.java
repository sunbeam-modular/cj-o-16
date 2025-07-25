package com.sunbeam.p2;

class Circle {
	int radius;
//	static double PI = 3.14; // Field initializer
	final static double PI = 3.14;

	// static block
	static {
		// // It is a block used to initialize the static fields of the class
		// this block executes only once
		System.out.println("Inside Static block");
		// PI = 3.14; // Initialization
	}

	// object initializer block
	{
		System.out.println("Inside Object Initializr block");
		// PI = 3.14; // assignment
	}

	public Circle(int radius) {
		System.out.println("Inside Ctor");
		this.radius = radius;
		// PI = 3.14; // assignment
	}

	public void calculateArea() {
		System.out.println("Area - " + (PI * radius * radius));
	}
}

public class Program02 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
//		Circle c2 = new Circle(7);
//		Circle c3 = new Circle(9);
//
		c1.calculateArea();
//		c2.calculateArea();
//		c3.calculateArea();

	}

}
