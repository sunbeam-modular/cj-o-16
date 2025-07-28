package com.sunbeam.p1;

import java.util.Scanner;

public class Employee {
	int empid;
	double salary;

	public Employee() {
	}

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Salary - " + salary);
	}

}
