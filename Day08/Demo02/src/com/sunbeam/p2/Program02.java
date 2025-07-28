package com.sunbeam.p2;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = null; // one entity
		int choice;
		do {
			System.out.println("0. EXIT");
			System.out.println("1. Employee");
			System.out.println("2. Manager");
			System.out.println("3. Salesman");
			System.out.print("Enter your choice - ");
			choice = sc.nextInt();
			System.out.println("--------------------------");
			switch (choice) {
			case 0:
				System.out.println("Thank you for using the app .. :)");
				break;
			case 1:
				e1 = new Employee();
				break;
			case 2:
				e1 = new Manager(); // upcasting
				break;
			case 3:
				e1 = new Salesman(); // upcasting
				break;
			default:
				System.out.println("Wrong choice .. :(");
				break;
			}
			if (e1 != null) {
				e1.accept(sc);
				e1.display();
				e1 = null;
			}
		} while (choice != 0);
	}

}
