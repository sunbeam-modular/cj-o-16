package com.sunbeam.p1;

import java.util.Scanner;

//Manager is-a Employee
public class Manager extends Employee {
	double bonus;

	public Manager() {
	}

	public Manager(int empid, double salary, double bonus) {
		super(empid, salary);
		this.bonus = bonus;
	}

	// inherited accept() -> Partial complete
	// overriden method hides the implemenation of the super class method
	@Override
	public void accept(Scanner sc) {
		// unhide the implementation of the super class method and call here
		super.accept(sc);
		System.out.print("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	// inherited display() -> Partial complete
	@Override
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}

}
