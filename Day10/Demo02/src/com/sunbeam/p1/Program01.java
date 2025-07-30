package com.sunbeam.p1;

public class Program01 {

	public static void div(int n, int d) {
		int result = n / d;
		System.out.println("division - " + result);
	}

	public static void main(String[] args) {
		int n = 10;
		int d = 0;
		try {
			// to check for the statements within this block
			// are generating any exceptions or no
			div(n, d);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		System.out.println("Program finished successfully");

	}

}
