package com.sunbeam.p2;

class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this(1, 1, 1900);
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
