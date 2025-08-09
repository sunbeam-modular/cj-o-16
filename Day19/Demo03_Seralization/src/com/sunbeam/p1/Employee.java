package com.sunbeam.p1;

import java.io.Serializable;

public class Employee implements Serializable {
	int empid;
	String name;
	double salary;
	double bonus;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empid, String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
