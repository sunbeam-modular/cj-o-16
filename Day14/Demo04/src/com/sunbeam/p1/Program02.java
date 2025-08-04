package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid) {
		this.empid = empid;
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}

}

public class Program02 {

	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<>(); // upcasting
		l1.add(new Employee(5, "Anil", 40000));
		l1.add(new Employee(2, "Mukesh", 10000));
		l1.add(new Employee(4, "Ramesh", 50000));
		l1.add(new Employee(1, "Suresh", 30000));
		l1.add(new Employee(3, "Ram", 20000));

		System.out.println("Before Sorting -> ");
		for (Employee e : l1)
			System.out.println(e);

		System.out.println("After Sorting on empid (Natural ordering)-> ");
		Collections.sort(l1);
		for (Employee e : l1)
			System.out.println(e);

		class EmpSalaryComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.salary, o1.salary); // desc sort on salary
			}
		}

		System.out.println("After Sorting on salary in desc order -> ");
		EmpSalaryComparator comp = new EmpSalaryComparator();
		Collections.sort(l1, comp);
		for (Employee e : l1)
			System.out.println(e);

	}

}
