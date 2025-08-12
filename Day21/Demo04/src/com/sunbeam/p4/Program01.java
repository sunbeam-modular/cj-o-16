package com.sunbeam.p4;

import java.util.Scanner;

public class Program01 {
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Addition");
		System.out.println("2. Square");
		System.out.println("3. Substraction");
		System.out.println("4. Multiplication");
		System.out.println("5. Division");
		System.out.println("Enter the choice - ");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Substraction");
				break;

			case 2:
				System.out.println("Square");
				break;

			case 5:
				System.out.println("Addition");
				break;

			case 3:
				System.out.println("Multiplication");
				break;

			case 4:
				System.out.println("Division");
				break;

			}
		}
	}

}
