package com.sunbeam;

public class Program03 {
	public static void add(int[] arr) {
		int result = 0;
		for (int e : arr)
			result += e;
		System.out.println("Addition - " + result);
	}

	public static void main(String[] args) {
		add(new int[] { 10, 20 });

		add(new int[] { 10, 20, 30 });

		add(new int[] { 10, 20, 30, 40 });

		add(new int[] { 10, 20, 30, 40, 50 });

	}

}
