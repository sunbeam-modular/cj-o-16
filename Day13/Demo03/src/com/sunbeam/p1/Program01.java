package com.sunbeam.p1;

import java.util.Arrays;

public class Program01 {

	public static void mysort(int[] arr1) {
		// logic -> Data Structure
	}

	public static void main(String[] args) {
		int arr1[] = { 40, 20, 50, 10, 30 };
		System.out.println("Before Sorting -> " + Arrays.toString(arr1));

		Arrays.sort(arr1);

		System.out.println("After Sorting -> " + Arrays.toString(arr1));
	}
}
