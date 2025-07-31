package com.sunebam.p1;

public class Program03 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println("initial capacity - " + sb1.capacity());
		System.out.println("initial length - " + sb1.length());

		sb1.append("abcdefghijklmnop");
		System.out.println("capacity - " + sb1.capacity());
		System.out.println("length - " + sb1.length());

		sb1.append("qrstuvwxyz");
		sb1.append("12345678");
		// capacity increses
		// new capacity = old capaity * 2 +
		// 16 * 2 + 2
		System.out.println("capacity - " + sb1.capacity());
		System.out.println("length - " + sb1.length());

		sb1.append("9");
		System.out.println("capacity - " + sb1.capacity());
		System.out.println("length - " + sb1.length());
	}

}
