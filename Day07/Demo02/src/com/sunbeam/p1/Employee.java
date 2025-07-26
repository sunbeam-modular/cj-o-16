package com.sunbeam.p1;

import java.util.Scanner;

// Employee(Child-sub) is-a Person (parent-super)
public class Employee extends Person // inheritance
{
	int empid;
	double salary;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(int empid, double salary, String name, String mobile) {
		// call the paramaterized ctor of the super class
		// constructor chaining between sub class and super class use super();
		super(name, mobile);
		System.out.println("Employee(int,double,String,String)");
		this.empid = empid;
		this.salary = salary;
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Salary - " + salary);
//		this.displayPerson();
		displayPerson();
		System.out.println("--------------------------");
	}

	public void acceptEmployee(Scanner sc) {
		acceptPerson(sc);
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

}
