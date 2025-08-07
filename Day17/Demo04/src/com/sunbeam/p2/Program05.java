package com.sunbeam.p2;

import java.util.ArrayList;
import java.util.List;

public class Program05 {

	public static void displayEmployees(List<Employee> empList) {
		for (Employee e : empList)
			System.out.println(e);
		System.out.println("-------------------------------------------------------");
	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(4, "Mukesh", 20000));
		empList.add(new Employee(1, "Anil", 40000));
		empList.add(new Employee(5, "Ram", 30000));
		empList.add(new Employee(3, "Ramesh", 10000));
		empList.add(new Employee(2, "Suresh", 50000));

		System.out.println("Display all employees in unsorted order -> ");
		displayEmployees(empList);

		// Anonymous Inner class of the functional interface
		// -> : Lambda operator
		// Lambda Expression -> ShortHand Implementation of Functional Interface
		empList.sort((Employee o1, Employee o2) -> {
			return o1.empid - o2.empid;
		});

		System.out.println("Display all employees sorted on empid in asc order -> ");

		displayEmployees(empList);

	}

}
