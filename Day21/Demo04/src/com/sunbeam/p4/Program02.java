package com.sunbeam.p4;

import java.util.Scanner;

enum ArithmeticOperation {
	EXIT, Addition, Square, Substration, Multiplication, Division
}

public class Program02 {
	public static ArithmeticOperation menu(Scanner sc) {
		ArithmeticOperation[] arr = ArithmeticOperation.values();
		for (ArithmeticOperation e : arr)
			System.out.println(e.ordinal() + ". " + e.name());
		System.out.println("Enter the choice - ");
		int choice = sc.nextInt();
		return arr[choice];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperation choice;
		while ((choice = menu(sc)) != ArithmeticOperation.EXIT) {
			switch (choice) {
			case Addition:
				System.out.println("Addition");
				break;

			case Substration:
				System.out.println("Substraction");
				break;

			case Multiplication:
				System.out.println("Multiplication");
				break;

			case Division:
				System.out.println("Division");
				break;

			case Square:
				System.out.println("Squre");
				break;

			}
		}
	}

}
