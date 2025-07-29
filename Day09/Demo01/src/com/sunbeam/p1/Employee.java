package com.sunbeam.p1;

import java.util.Scanner;

// a class which consists of abstract methods is called as abstract class
// we cannot create the object of this abstract class
// we can create only the reference of the abstract class
public abstract class Employee {
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

	public void accept(Scanner sc) {
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
	}

	// declaration of method
	// abstract methods are 100% incomplete methods
	public abstract void calculateTotalSalary();

}
