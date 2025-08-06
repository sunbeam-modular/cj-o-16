package com.sunbeam.p1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Program02 {

	public static void main(String[] args) {
		Calendar c1 = new GregorianCalendar();
		System.out.println("c1 - " + c1);

		Calendar c2 = Calendar.getInstance();
		System.out.println("c2 - " + c2);

		System.out.println("Day - " + c1.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month - " + c1.get(Calendar.MONTH));
		System.out.println("Year - " + c1.get(Calendar.YEAR));
	}

}
