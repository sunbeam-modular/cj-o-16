package com.sunbeam.p5;

class Time {
	private int hr;
	private int min;

	public Time() {
		this.hr = 10;
		min = 10;
	}

	public Time(int hr, int min) {
		System.out.println("Inside parameterized Ctor");
		this.hr = hr;
		this.min = min;
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
