package com.sunbeam.p3;

import java.util.Scanner;

class Test {
	int num1;
	static int num2;

	// Inside static methods we cannot access non static fields directly
	// static methods this reference is not passed
	public static void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for num2 - ");
		num2 = sc.nextInt();
		System.out.println("Enter the value for num1 - ");
		// this.num1 = sc.nextInt();
	}

	// inside the non static method we can access
	// static as well as non static fields
	public void display() // this
	{
		System.out.println("Num1 - " + num1); // OK
		System.out.println("Num2 - " + num2); // OK
	}
}

public class Program02 {

	public static void main(String[] args) {
		Test.accept();
		Test t1 = new Test();
		Test.num2 = 30;
	}

}
