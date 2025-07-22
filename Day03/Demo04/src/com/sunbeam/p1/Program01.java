package com.sunbeam.p1;

import java.util.Scanner;

class Time {
	// fields
	private int hr; // (0 to 23)
	private int min;

	// methods
	public void displayTime() {
		System.out.println("Time - " + hr + ":" + min);
	}

	public void acceptTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hrs-");
		int h = sc.nextInt();
		if (h >= 0 && h < 24)
			hr = h;
		System.out.println("Enter the mins-");
		min = sc.nextInt();
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.acceptTime();
		// t1.hr = -23735; // To avoid this or to ensure data validation
		// fields should be declared as private
		t1.displayTime();
	}

}
