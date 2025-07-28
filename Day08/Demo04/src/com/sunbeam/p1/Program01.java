package com.sunbeam.p1;

// subclass of Object
class Date {
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

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

//	public void display() {
//		System.out.println(day + "/" + month + "/" + year);
//	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		// d1.display();

		Date d2 = new Date(1, 1, 2001);
		// d2.display();

		System.out.println("d1 - " + d1.toString());
		System.out.println("d2 - " + d2); // d2.toString()

	}

}
