package com.sunbeam;

public class Program01 {
	public static void changeValue(int n) {
		n = 20;
	}

	public static void main(String[] args) {
		int num1 = 10;
		System.out.println("Before change in num1 - " + num1);
		changeValue(num1); // pass by value
		// In java for primitive types it is always pass by value
		System.out.println("After change in num1 - " + num1);
	}

}
