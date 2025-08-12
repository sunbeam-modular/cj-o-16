package com.sunbeam.p2;

enum Weeks {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class Program01 {
	public static void main(String[] args) {
		System.out.println("Choose the week from 0-6");
		int choice = 2;
		Weeks enumChoice = Weeks.values()[choice];
		switch (enumChoice) {
		case Sunday:
			System.out.println("You have selected Sunday");
			break;
		case Monday:
			System.out.println("You have slected Monday");
			break;
		case Tuesday:
			System.out.println("You have slected Tuesday");
			break;
		case Wednesday:
			System.out.println("You have slected Wednesday");
			break;
		case Thursday:
			System.out.println("You have slected Thursday");
			break;
		case Friday:
			System.out.println("You have slected Friday");
			break;
		case Saturday:
			System.out.println("You have slected Saturday");
			break;
		default:
			System.out.println("Wrong choice...");
			break;
		}
	}

}
