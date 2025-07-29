package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1;
		// e1 = new Employee(); // NOT OK

		// e1 = new Manager(); // upcasting
		e1 = new Salesman(); // upcasting

		e1.accept(sc);
		e1.display();
		e1.calculateTotalSalary();

	}

}
