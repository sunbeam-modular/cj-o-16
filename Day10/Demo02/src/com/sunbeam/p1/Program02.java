package com.sunbeam.p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program02 {

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
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		} catch (InputMismatchException e) {
			System.out.println("Input is incorrect, ");
		}
		System.out.println("Program finished successfully");

	}

}
