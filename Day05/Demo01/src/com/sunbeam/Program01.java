package com.sunbeam;

import java.util.Scanner;

public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ragged Array
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the value at arr[" + i + "][" + j + "] - ");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int[] element : arr)
			for (int e : element)
				System.out.println("element - " + e);

	}

}
