package com.sunbeam.p1;

import java.time.LocalDate;

public class Program05 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println("d1 - " + d1);

		LocalDate d2 = LocalDate.of(2025, 8, 6);
		System.out.println("d2 - " + d2);

		System.out.println("day - " + d2.getDayOfMonth());
		System.out.println("month - " + d2.getMonthValue());
		System.out.println("year - " + d2.getYear());
	}

}
