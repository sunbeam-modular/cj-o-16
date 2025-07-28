package com.sunbeam.p2;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1;
//		e1 = new Employee();
//		e1 = new Manager(); // upcasting
		e1 = new Salesman(); // upcasting
		e1.accept(sc);
		e1.display();

		// e1.calculateTotalCommission(); // Object Slicing - NOT OK

		if (e1 instanceof Salesman)// true
		{
			Salesman s1 = (Salesman) e1; // Downcasting
			s1.calculateTotalCommission();
		}
	}

}
