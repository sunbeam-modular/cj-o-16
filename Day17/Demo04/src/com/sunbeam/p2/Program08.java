package com.sunbeam.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program08 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(4, "Mukesh", 20000));
		empList.add(new Employee(1, "Anil", 40000));
		empList.add(new Employee(5, "Ram", 30000));
		empList.add(new Employee(3, "Ramesh", 10000));
		empList.add(new Employee(2, "Suresh", 50000));

		System.out.println("Display all employees in unsorted order -> ");
		empList.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee e) {
				System.out.println(e);
			}
		});
		System.out.println("-------------------------------------------------------");

		// sort and display the emps on the empid in asc order
		empList.sort((o1, o2) -> o1.empid - o2.empid);
		System.out.println("Display all employees in sorted on empid in asc order -> ");
		empList.forEach(e -> System.out.println(e));
		System.out.println("-------------------------------------------------------");

		// sort and display the emps on the name in asc order
		empList.sort((o1, o2) -> o1.name.compareTo(o2.name));
		System.out.println("Display all employees in sorted on name in asc order-> ");
		empList.forEach(e -> System.out.println(e));
		System.out.println("-------------------------------------------------------");

		// sort and display the emps on the sal in desc order
		empList.sort((o1, o2) -> Double.compare(o2.salary, o1.salary));
		System.out.println("Display all employees in sorted on sal in desc order -> ");
		// empList.forEach(e -> System.out.println(e));

		// Shorthand implementation of Lambda Expression
		empList.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");

	}

}
