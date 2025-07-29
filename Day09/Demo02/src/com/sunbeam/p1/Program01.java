package com.sunbeam.p1;

import java.util.Scanner;

class Time {
	int hr;
	int min;

	public void acceptTime() {

	}

	public void displayTime() {

	}
}

class Date {
	int month;
	int year;

	public void acceptData() {

	}

	public void displayData() {

	}
}

class Employee {
	int empid;
	double salary;

	public void accept(Scanner sc) {

	}

	public void display() {

	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.acceptTime();
		t1.displayTime();

		Date d2 = new Date();
		d2.acceptData();
		d2.displayData();

		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.accept(null);
		e1.display();
	}

}
