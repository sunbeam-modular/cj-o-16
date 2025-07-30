package com.sunbeam.p1;

import java.util.Scanner;

public class Program04 {

	public static void div(int n, int d) {
		int result = n / d;
		System.out.println("division - " + result);
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.println("Enter the denominator - ");
			int d = sc.nextInt();
			div(n, d);
		} catch (Exception e)// Generic Catch Block // upcasting
		{
			e.printStackTrace(); // Runtime polymorphism
			System.out.println("Cannot perform the division");
		}
		System.out.println("Program finished successfully");

	}

}
