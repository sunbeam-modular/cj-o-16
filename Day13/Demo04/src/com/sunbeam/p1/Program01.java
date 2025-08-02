package com.sunbeam.p1;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(5, "Mukesh", 40000);
		arr[1] = new Employee(3, "Suresh", 10000);
		arr[2] = new Employee(4, "Sham", 20000);
		arr[3] = new Employee(1, "Ramesh", 50000);
		arr[4] = new Employee(2, "Anil", 30000);

		System.out.println("Before Sorting -> ");
		for (Employee e : arr)
			System.out.println(e);

		// What is the natural order of employees?
		// -> empid
		Arrays.sort(arr);

		System.out.println("After Sorting -> ");
		for (Employee e : arr)
			System.out.println(e);

	}
}
