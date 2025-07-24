package com.sunbeam;

public class Program02 {
	public static void add(int arr[]) {
		int result = 0;
		for (int e : arr)
			result += e;
		System.out.println("Addition - " + result);
	}

	public static void main(String[] args) {
//		int arr1[] = new int[2];
//		arr1[0] = 10;
//		arr1[1] = 20;

		// int arr1[] = new int[] { 10, 20 };
		int arr1[] = { 10, 20 };
		add(arr1);

		int arr2[] = { 10, 20, 30 };
		add(arr2);

		int arr3[] = { 10, 20, 30, 40 };
		add(arr3);

		int arr4[] = { 10, 20, 30, 40, 50 };
		add(arr4);

	}

}
