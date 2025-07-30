package com.sunbeam.p1;

import java.util.Scanner;

public class Program08 {

	public static void div(int n, int d) {
		int result = n / d;
		System.out.println("division - " + result);
	}

	public static void main(String[] args) {
		// try with resource
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.println("Enter the denominator - ");
			int d = sc.nextInt();
			div(n, d);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Program finished successfully");

	}

}
