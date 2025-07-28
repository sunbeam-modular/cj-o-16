package com.sunbeam.p2;

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

	@Override
	public boolean equals(Object obj) // this(d1), obj(d2)
	{
		if (obj == null)
			return false;
		if (this == obj)
			return true;

		if (obj instanceof Date) {
			// d1.day == d2.day && d1.month==d2.month && d1.year==d2.year;
			Date d = (Date) obj;// Downcasting
			if (this.day == d.day && this.month == d.month && this.year == d.year)
				return true;
		}
		return false;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2001);
		Date d2 = new Date(1, 1, 2001);
		// Object obj = new Date(1, 1, 2001);

		System.out.println("d1 - " + d1);
		System.out.println("d2 - " + d2);

		System.out.println("d1==d2 - " + (d1 == d2)); // false
		System.out.println("d1.equals(d2) - " + d1.equals(d2));
		// d1.day == d2.day && d1.month==d2.month && d1.year==d2.year;
	}

	public static void mainFirst(String[] args) {
		Date d1 = new Date(1, 1, 2001);
		Date d2 = d1;

		// d2.day = 2;

		System.out.println("d1 - " + d1);
		System.out.println("d2 - " + d2);
		System.out.println("d1==d2 - " + (d1 == d2)); // true
	}

}
