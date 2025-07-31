package com.sunbeam.p1;

public class Program08 {

	public static void main(String[] args) {
		String s1 = "SUNBEAM";
		String s2 = "sunbeam";
		s2 = s2.toUpperCase();

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);
		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + s1.equals(s2));

	}

}
