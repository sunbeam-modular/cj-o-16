package com.sunbeam.p2;

import java.util.Arrays;

class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary, o.salary); // Ascending order
		// return Double.compare(o.salary, this.salary); // Descending order
	}

}

public class Program01 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(5, "Mukesh", 40000);
		arr[1] = new Employee(3, "Suresh", 10000);
		arr[2] = new Employee(4, "Sham", 20000);
		arr[3] = new Employee(1, "Ramesh", 50000);
		arr[4] = new Employee(2, "Anil", 30000);

		// System.out.println("Before Sorting -> " + Arrays.toString(arr));
		System.out.println("Before Sorting -> ");
		for (Employee e : arr)
			System.out.println(e);

		// What is the natural order of employees?
		// -> on salary in ascending order
		Arrays.sort(arr);

		System.out.println("After Sorting -> ");
		for (Employee e : arr)
			System.out.println(e);

	}
}
