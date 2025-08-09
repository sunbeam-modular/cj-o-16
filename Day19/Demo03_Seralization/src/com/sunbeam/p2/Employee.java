package com.sunbeam.p2;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = 2L;
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
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
