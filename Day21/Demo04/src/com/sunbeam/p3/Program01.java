package com.sunbeam.p3;

enum Weeks {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class Program01 {
	public static void main(String[] args) {
		System.out.println("Choose the week from 0-6");
		int choice = 0;
		Weeks enumChoice = Weeks.values()[choice];
		System.out.println("Selected Week is - " + enumChoice.name());
	}

}
