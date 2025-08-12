package com.sunbeam.p1;

import java.util.Scanner;

class Date {
	int day;
	int month;
	int year;

	@Override // Annotation-> Information(Rules of method overriding)
	// Information is for the compiler
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

public class Program01 {

	@SuppressWarnings(value = { "unused", "resource" })
	public static void main(String[] args) {
//		@SuppressWarnings(value = "unused")
		int num1;
//		@SuppressWarnings(value = "resource")
		Scanner sc = new Scanner(System.in);
		sc.next();
	}

	public static void main1(String[] args) {
		// @SuppressWarnings("unused")
		@SuppressWarnings(value = "unused")
		int num1;
	}

}
