package com.sunbeam.p4;

// types of methods
class Time {
	private int hr;
	private int min;

	// constructor - parameterless
	public Time() {
		System.out.println("Inside parameterless Ctor");
		hr = 10;
		min = 10;
	}

	// ctor overloading - Defining multiple ctor inside your class
	// constructor - parameterized
	public Time(int h, int m) {
		System.out.println("Inside parameterized Ctor");
		hr = h;
		min = m;
	}

	public void displayTime() {
		System.out.println("Time - " + this.hr + ":" + min);
	}

}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time(); // Default ctor / paramaterless ctor
		// object creation without passing any arguments
		t1.displayTime();

		Time t2 = new Time(11, 33); // parameterized ctor
		// object creation by passing arguments
		t2.displayTime();

		Time t3 = new Time(12, 20);
		t3.displayTime();
	}
}
