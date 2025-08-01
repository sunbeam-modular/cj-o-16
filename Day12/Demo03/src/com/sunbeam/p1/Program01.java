package com.sunbeam.p1;

// generic method
public class Program01 {

	// type parameter
	public static <T> void display(T[] arr) {
		for (T element : arr)
			System.out.println("element - " + element);
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 10, 20, 30, 40, 50 };
		display(arr1);

		Double[] arr2 = { 10.20, 20.30, 30.40, 40.50, 50.60 };
		display(arr2);

		String[] arr3 = { "Anil", "Mukesh", "Ramesh", "Suresh" };
		display(arr3);
	}

}
