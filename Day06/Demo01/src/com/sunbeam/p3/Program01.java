package com.sunbeam.p3;

class Arithmetic {

	public static void sum(int num1, int num2) {
		System.out.println("Addition - " + (num1 + num2));
	}

	public static void square(int n) {
		System.out.println("Square - " + (n * n));
	}
}

public class Program01 {
	public static void main(String[] args) {
		Arithmetic.sum(10, 20);
		Arithmetic.square(5);
	}

}
