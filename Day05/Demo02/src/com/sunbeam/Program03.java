package com.sunbeam;

public class Program03 {
	public static void changeValue(Integer n) {
		n = 20; // auto-boxing
	}

	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		System.out.println("Before change in num1 - " + num1);
		changeValue(num1); // pass by value
		// In java for primitive types it is always pass by value
		System.out.println("After change in num1 - " + num1);
		int n = num1;
	}

}
