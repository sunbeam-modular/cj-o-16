package com.sunbeam.p1;

enum Weeks {
	Sunday, Monday, Tuesday, Wednesday, Thursady, Friday, Saturday
}

public class Program01 {
	public static void main(String[] args) {
		System.out.println("Choose the week from 0-6");
		int choice = 0;
		switch (choice) {
		case 0:
			System.out.println("You have selected Tuesday");
			break;
		case 1:
			System.out.println("You have slected Monday");
			break;
		case 2:
			System.out.println("You have slected Tuesday");
			break;
		case 3:
			System.out.println("You have slected Wednesday");
			break;
		case 4:
			System.out.println("You have slected Thursday");
			break;
		case 5:
			System.out.println("You have slected Friday");
			break;
		case 6:
			System.out.println("You have slected Saturday");
			break;
		default:
			System.out.println("Wrong choice...");
			break;
		}
	}

}
