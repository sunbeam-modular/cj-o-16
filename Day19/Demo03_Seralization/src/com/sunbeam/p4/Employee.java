package com.sunbeam.p4;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	int empid;
	String name;
	double salary;
	static final String company = "sunbeam"; // not stored inside the file
	double bonus;
	transient double totalSalary; // fields that are not added in the file

	public Employee() {
	}

	public Employee(int empid, String name, double salary, double bonus) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.totalSalary = this.salary + this.bonus;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus
				+ ", totalSalary=" + totalSalary + "]";
	}

	public void calculateTotalSalary() {
		this.totalSalary = this.salary + this.bonus;
	}

}
