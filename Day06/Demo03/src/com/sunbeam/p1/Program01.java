package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		d1.acceptDate(sc);
		d1.displayDate();

		Date d2 = new Date(2, 2, 2002);
		d2.displayDate();

	}

}
