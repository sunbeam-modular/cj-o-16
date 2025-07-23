package com.sunbeam.p1;

class Date {
	int day;
	int month;
	int year;

	public Date() {
		this(1, 1, 1900);
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

class Time {
	private int hr;
	private int min;

	public Time() {
		this(10, 10);// this statement
		// constructor chaining
		// this statement should be the first statement inside the ctor body
	}

	public Time(int hr, int min) {
		this.hr = hr;
		this.min = min;
	}

	public void displayTime() {
		System.out.println("Time - " + hr + " : " + min);
	}

}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.displayTime();

		Time t2 = new Time(11, 22);
		t2.displayTime();
	}

}
