package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

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

public class Program04 {

	public static void main(String[] args) {
		Collection<Employee> c1 = new ArrayList<>(); // upcasting
		c1.add(new Employee(1, "Anil", 10000));
		c1.add(new Employee(2, "Mukesh", 20000));
		c1.add(new Employee(3, "Ramesh", 30000));
		c1.add(new Employee(4, "Suresh", 40000));
		c1.add(new Employee(5, "Ram", 50000));

		System.out.println("size of c1 - " + c1.size());

		for (Employee e : c1)
			System.out.println(e);

		Employee e1 = new Employee(4);
		// remove method internally uses equals method
		System.out.println("Remove the employee with Id 4 - " + c1.remove(e1));
		System.out.println("size of c1 - " + c1.size());

	}

	public static void main1(String[] args) {
		Collection<Employee> c1 = new ArrayList<>(); // upcasting
		// Collection<Employee> c1 = new LinkedHashSet<>(); // upcasting
		// Collection<Employee> c1 = new LinkedList<>(); // upcasting
		c1.add(new Employee(1, "Anil", 10000));
		c1.add(new Employee(2, "Mukesh", 20000));
		c1.add(new Employee(3, "Ramesh", 30000));
		c1.add(new Employee(4, "Suresh", 40000));
		c1.add(new Employee(5, "Ram", 50000));

		System.out.println("size of c1 - " + c1.size());

		for (Employee e : c1)
			System.out.println(e);

		Employee e1 = new Employee(3);
		// contains method internally uses equals method
		System.out.println("Is c1 contains employee with empid 3 - " + c1.contains(e1));

	}

}
