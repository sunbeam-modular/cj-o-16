package com.sunbeam.p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program04 {

	public static void main(String[] args) {
//		String s1 = "2025-08-07";
		String s1 = "07-08-2025";
		System.out.println("s1 - " + s1);

		LocalDate d1 = LocalDate.parse(s1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("d1 - " + d1);
	}

}
