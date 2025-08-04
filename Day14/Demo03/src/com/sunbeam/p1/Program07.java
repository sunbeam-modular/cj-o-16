package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;

class Employee {
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

}

public class Program07 {

	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<>(); // upcasting
		l1.add(new Employee(1, "Anil", 10000));
		l1.add(new Employee(2, "Mukesh", 20000));
		l1.add(new Employee(3, "Ramesh", 30000));
		l1.add(new Employee(4, "Suresh", 40000));
		l1.add(new Employee(5, "Ram", 50000));

		for (Employee e : l1)
			System.out.println(e);

		System.out.println("Employee at index 2 - " + l1.get(2));
		Employee e1 = new Employee(4);
		System.out.println("Index of employee with empid 4 = " + l1.indexOf(e1));
	}

}
