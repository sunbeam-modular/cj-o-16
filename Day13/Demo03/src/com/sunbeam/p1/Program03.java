package com.sunbeam.p1;

import java.util.Arrays;

public class Program03 {

	public static void mysort(String[] arr1) {
		// logic -> Data Structure
	}

	public static void main(String[] args) {
		String arr[] = { "Suresh", "Ram", "Sham", "Anil", "Mukesh", "Ramesh" };
		System.out.println("Before Sorting -> " + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("After Sorting -> " + Arrays.toString(arr));
	}
}
