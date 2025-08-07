package com.sunbeam.p1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("d1 - " + d1);

//		int day = d1.getDate();
//		int month = d1.getMonth() + 1;
//		int year = d1.getYear() + 1900;
//		System.out.println("d1 - " + day + "-" + month + "-" + year);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s1 = sdf.format(d1);
		System.out.println("s1 - " + s1);

	}

}
