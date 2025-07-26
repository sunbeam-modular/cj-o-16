package com.sunbeam.p1;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
		e1.displayEmployee();

		Employee e2 = new Employee(1, 10000, "Anil", "9876543210");
		e2.displayEmployee();

		Employee e3 = new Employee();
		e3.acceptEmployee(sc);
		e3.displayEmployee();
	}

}
