package com.sunbeam.p3;

public class Program01 {
	public static void main(String[] args) {
//		int[] arr = new int[2];
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println("using for loop -> ");
		for (int i = 0; i < arr.length; i++) // outer array for loop
		{
			for (int j = 0; j < arr[i].length; j++) // inner array for loop
			{
				System.out.println("element - " + arr[i][j]);
			}
		}

		System.out.println();
		System.out.println("using for each -> ");
		for (int[] element : arr) // outer for loop using i
			for (int ele : element) // inner for loop using j
				System.out.println("element - " + ele);

	}

}
