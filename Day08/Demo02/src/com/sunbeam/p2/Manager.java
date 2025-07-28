package com.sunbeam.p2;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;

	public Manager() {
	}

	public Manager(int empid, double salary, double bonus) {
		super(empid, salary);
		this.bonus = bonus;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}

}
