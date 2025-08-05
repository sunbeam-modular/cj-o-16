package com.sunbeam.p1;

import java.util.Objects;

public class Employee {
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
	public int hashCode() {
		return Objects.hash(empid);
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
