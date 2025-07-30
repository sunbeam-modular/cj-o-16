package com.sunbeam.p1;

class Date {
	private int day;
	private int month;
	private int year;

	public void setDay(int day) {
		if (day <= 0 || day > 31)
			throw new RuntimeException(); // generate an exception -> unchecked
		this.day = day;
	}

	public void setMonth(int month) {
		if (month <= 0 || month > 12)
			throw new RuntimeException("Month should be between 1 to 12"); // generate an exception -> unchecked
		this.month = month;
	}

	// 1900 to 2100
	// handling the checked exception compulsary
	// if a method generates a checked exception then to navigate this
	// checked exception towards the caller method we use throws keyword
	public void setYear(int year) throws Exception {
		if (year < 1900 || year > 2100)
			throw new Exception();// generate exception -> checked
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
		// Data validation
		d1.setDay(12);
		d1.setMonth(10);
		try {
			d1.setYear(2000); // 1900 to 2100
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("d1 - " + d1);
	}

}
