package com.sunbeam.p1;

public class Program01 {
	public static void main(String[] args) {
		// int arr[]; // reference
		// int arr[] = new int[5]; // array in java
		int[] arr = new int[5]; // array in java

		System.out.println("Default values in the arr ->");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("element - " + arr[i]);
		}

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("Values stored in arr ->");
		// for-each -> only for display
		for (int element : arr)
			System.out.println("element - " + element);
	}

}
