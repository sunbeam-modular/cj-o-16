package com.sunbeam.p1;

import java.util.LinkedHashSet;
import java.util.Set;

class Employee {
	int id;
	String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id * 13;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class Program02 {

	public static void main(String[] args) {
		Set<Employee> empSet = new LinkedHashSet<>();
		empSet.add(new Employee(121, "Anil"));
		empSet.add(new Employee(132, "Mukesh"));
		empSet.add(new Employee(143, "Ramesh"));
		empSet.add(new Employee(132, "Mukesh")); // Duplicate

		for (Employee employee : empSet) {
			System.out.println(employee + "hashvale - " + employee.hashCode());
		}
	}

}
