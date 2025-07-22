package com.sunbeam.p3;

// types of methods
class Time {
	private int hr;
	private int min;

	// constructor - special method
	public Time() {
		// Used to initialize the state of an object with the default values other than
		// 0
		System.out.println("Inside Ctor");
		hr = 10;
		min = 10;
	}

	public void displayTime() {
		System.out.println("Time - " + this.hr + ":" + min);
	}

}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		Time t4 = new Time();
		t1.displayTime();
		t2.displayTime();
		t3.displayTime();
		t4.displayTime();
	}

}
