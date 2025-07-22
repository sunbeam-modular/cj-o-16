package com.sunbeam.p2;

import java.util.Scanner;

class Time {
	private int hr;
	private int min;

	public void displayTime() {
		System.out.println("Time - " + this.hr + ":" + min);
	}

	public void acceptTime() // Time this = t3
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hrs-");
		hr = sc.nextInt();
		System.out.println("Enter the mins-");
		this.min = sc.nextInt();
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();

		t1.acceptTime(); // acceptTime(t1)
		t2.acceptTime();
		t3.acceptTime();
		t1.displayTime();

	}

}
