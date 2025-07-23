package com.sunbeam.p2;

class Time {
	private int hr;
	private int min;

	public Time() {
	}

	public Time(int hr, int min) {
		this.hr = hr;
		this.min = min;
	}

	// Setters
	public void setHr(int h) {
		hr = h;
	}

	public void setMin(int min) {
		this.min = min;
	}

	// Getters
	public int getHr() {
		return hr;
	}

	public int getMin() {
		return min;
	}

	// facilitator
	public void displayTime() {
		System.out.println("Time - " + hr + " : " + min);
	}

}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
//		 t1.hr = 12;
		t1.setHr(12);
//		t1.min = 30;
		t1.setMin(30);

		// System.out.println("t1.hr - " + t1.hr);
		System.out.println("t1.hr - " + t1.getHr());

		// System.out.println("t1.min - " + t1.min);
		System.out.println("t1.min - " + t1.getMin());
	}

}
