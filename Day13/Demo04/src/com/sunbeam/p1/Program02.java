package com.sunbeam.p1;

import java.util.Arrays;
import java.util.Comparator;

class Manager extends Employee {
	int bonus;
}

class Salesman extends Employee {
	int comm;
}

public class Program02 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(5, "Mukesh", 40000);
		arr[1] = new Employee(3, "Suresh", 10000);
		arr[2] = new Employee(4, "Sham", 20000);
		arr[3] = new Employee(1, "Ramesh", 50000);
		arr[4] = new Employee(2, "Anil", 30000);
//		arr[5] = new Manager();
//		arr[6] = new Salesman();

		System.out.println("Before Sorting -> ");
		for (Employee e : arr)
			System.out.println(e);

		System.out.println("After Sorting on empid -> ");
		Arrays.sort(arr);
		for (Employee e : arr)
			System.out.println(e); // e.toString()

		class EmpNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		}

		System.out.println("After Sorting on name -> ");
		// sort(T[] a, Comparator<? super T> c)
		// sort(Employee[] arr, Comparator<? super Employee> c)
		EmpNameComparator comp = new EmpNameComparator();
		Arrays.sort(arr, comp);
		for (Employee e : arr)
			System.out.println(e);

		class EmpSalaryComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.salary, o1.salary);
			}
		}

		System.out.println("After Sorting on salary in desc -> ");
		EmpSalaryComparator comp2 = new EmpSalaryComparator();
		Arrays.sort(arr, comp2);
		for (Employee e : arr)
			System.out.println(e);
	}
}
