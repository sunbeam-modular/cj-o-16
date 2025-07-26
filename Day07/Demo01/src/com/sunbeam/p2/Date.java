package com.sunbeam.p2;

import java.util.Scanner;

public class Date {
	int day;
	int month;
	int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void acceptDate(Scanner sc) {
		System.out.print("Enter the day - ");
		day = sc.nextInt();
		System.out.print("Enter the month - ");
		month = sc.nextInt();
		System.out.print("Enter the year - ");
		year = sc.nextInt();

	}

	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}

}
