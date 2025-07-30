package com.sunbeam.p1;

import java.util.Scanner;

public class Program05 {

	public static void div(int n, int d) {
		int result = n / d;
		System.out.println("division - " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.println("Enter the denominator - ");
			int d = sc.nextInt();
			div(n, d);
		} finally {
			// CLOSE THE RESOURCES
			System.out.println("Inside Finally");
			sc.close();
		}

		System.out.println("Program finished successfully");

	}

}
