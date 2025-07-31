package com.sunebam.p1;

public class Program02 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("sunbeam");
		StringBuffer sb2 = new StringBuffer("sunbeam");

		System.out.println("sb1 - " + sb1);
		System.out.println("sb2 - " + sb2);
		System.out.println("sb1==sb2 - " + (sb1 == sb2)); // false
		System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2))); // false
		// String Builder and StringBuffer class do not override
		// the hashcode and equals method
		System.out.println("sb1.equals(sb2) - " + (sb1.toString().equals(sb2.toString()))); // true
	}

}
