package com.sunbeam.p1;

import java.util.Scanner;

public class Salesman extends Employee {
	int noOfProducts;
	double commission;

	public Salesman() {
	}

	public Salesman(int empid, String name, double salary, int noOfProducts, double commission) {
		super(empid, name, salary);
		this.noOfProducts = noOfProducts;
		this.commission = commission;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);

		System.out.print("Enter the no of products sold - ");
		noOfProducts = sc.nextInt();
		System.out.print("Enter the commission per product - ");
		commission = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("No Of products sold - " + noOfProducts);
		System.out.println("Commission per product - " + commission);
	}

	@Override
	public void calculateTotalSalary() {
		System.out.println("Total salary of salesman - " + (salary + (commission * noOfProducts)));
	}

}
