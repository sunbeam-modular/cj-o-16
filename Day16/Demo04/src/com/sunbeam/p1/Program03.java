package com.sunbeam.p1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Program03 {

	public static void main(String[] args) {

		Calendar c1 = new GregorianCalendar(2025, 8, 6);

		System.out.println("c1 - " + c1);
		System.out.println("Day - " + c1.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month - " + c1.get(Calendar.MONTH));
		System.out.println("Year - " + c1.get(Calendar.YEAR));
	}

}
