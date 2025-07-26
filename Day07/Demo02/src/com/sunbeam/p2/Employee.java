package com.sunbeam.p2;

import java.util.Scanner;

public class Employee extends Person {
	int empid;
	double salary;

	public Employee() {
	}

	public Employee(int empid, double salary, String name, String mobile) {
		super(name, mobile);
		this.empid = empid;
		this.salary = salary;
	}

	// implementation of the display from the person class is
	// partial complete for the employee
	// complete the implementation of display by overriding it
	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Salary - " + salary);
		super.display();
		System.out.println("-----------------------");
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

}
