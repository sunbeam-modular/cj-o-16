package com.sunbeam.p1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program02 {

	public static void main(String[] args) {
//		String s1 = "07-08-2025";
		String s1 = "2025-08-07";

		System.out.println("s1 - " + s1);

//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sdf.parse(s1);
			System.out.println("d1 - " + d1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
