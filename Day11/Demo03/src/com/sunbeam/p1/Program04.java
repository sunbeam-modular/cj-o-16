package com.sunbeam.p1;

public class Program04 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = "sun" + "beam"; // At compile time
//		String s2 = "sunbeam";

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);
		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + s1.equals(s2));
	}

}
