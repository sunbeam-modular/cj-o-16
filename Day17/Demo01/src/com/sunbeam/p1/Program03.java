package com.sunbeam.p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program03 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println("d1 - " + d1);

//		int day = d1.getDayOfMonth();
//		int month = d1.getMonthValue();
//		int year = d1.getYear();
//		System.out.println("d1 - " + day + "-" + month + "-" + year);

		String s1 = d1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("s1 - " + s1);
	}

}
