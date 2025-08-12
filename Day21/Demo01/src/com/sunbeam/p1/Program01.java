package com.sunbeam.p1;

import java.util.Date;

public class Program01 {

	public static void main(String[] args) {
		// way-3
		String s1 = "sunbeam";
		Date d1 = new Date();
		Class c1 = d1.getClass();
		System.out.println("class name - " + c1.getName());

	}

	public static void main2(String[] args) {
		// way-2
		Class c1 = String.class;
		System.out.println("class name - " + c1.getName());

	}

	public static void main1(String[] args) {
		// way-1
		try {
			Class c1 = Class.forName("java.lang.String"); // c1 will have metadata of the String
			System.out.println("class name - " + c1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
