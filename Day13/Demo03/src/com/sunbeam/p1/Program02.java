package com.sunbeam.p1;

import java.util.Arrays;

public class Program02 {

	public static void mysort(double[] arr1) {
		// logic -> Data Structure
	}

	public static void main(String[] args) {
		double arr1[] = { 44.55, 22.33, 55.66, 11.22, 33.44 };
		System.out.println("Before Sorting -> " + Arrays.toString(arr1));

		Arrays.sort(arr1);

		System.out.println("After Sorting -> " + Arrays.toString(arr1));
	}
}
