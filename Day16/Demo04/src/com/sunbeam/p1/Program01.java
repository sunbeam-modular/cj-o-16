package com.sunbeam.p1;

import java.util.Date;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("d1 - " + d1);

		// Date d2 = new Date(2025, 8, 6);
		Date d2 = new Date(2025 - 1900, 8 - 1, 6);
		System.out.println("d2 - " + d2);
	}

}
