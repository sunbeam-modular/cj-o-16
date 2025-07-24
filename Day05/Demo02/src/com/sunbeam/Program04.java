package com.sunbeam;

public class Program04 {
	public static void changeValue(int[] arr) {
		arr[0] = 20;
	}

	public static void main(String[] args) {
		int[] arr = { 10 };
		System.out.println("Before change in arr[0]- " + arr[0]);
		changeValue(arr); // pass by value
		// In java for non primitive types it is always pass by reference
		System.out.println("After change in arr[0]- " + arr[0]);
	}

}
