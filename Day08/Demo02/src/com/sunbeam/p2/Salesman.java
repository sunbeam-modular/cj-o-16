package com.sunbeam.p2;

import java.util.Scanner;

public class Salesman extends Employee {
	double commission;
	int noOfProducts;

	public Salesman() {
	}

	public Salesman(int empid, double salary, double commission, int noOfProducts) {
		super(empid, salary);
		this.commission = commission;
		this.noOfProducts = noOfProducts;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the products sold - ");
		noOfProducts = sc.nextInt();
		System.out.print("Enter the commission per product - ");
		commission = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("No of products sold - " + noOfProducts);
		System.out.println("Commission per product - " + commission);
	}

	public void calculateTotalCommission() {
		System.out.println("Total Commission - " + (noOfProducts * commission));
	}

}
