package com.sunbeam.p2;

// Runtime exception class and all its subclass are 
// unchecked exception
// custom exception class
class InvalidDateException extends RuntimeException {

	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message); // ctor chaining
	}
}

class Date {
	private int day;
	private int month;
	private int year;

	public void setDay(int day) {
		if (day <= 0 || day > 31)
			throw new InvalidDateException();
		this.day = day;
	}

	public void setMonth(int month) {
		if (month <= 0 || month > 12)
			throw new InvalidDateException("month should be between 1 to 12");
		this.month = month;
	}

	// 1900 to 2100
	public void setYear(int year) throws Exception {
		if (year < 1900 || year > 2100)
			// To- do
			this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.setDay(15);
		d1.setMonth(100);
		// testing of year

	}

}
