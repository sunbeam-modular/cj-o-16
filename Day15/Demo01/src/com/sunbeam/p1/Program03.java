package com.sunbeam.p1;

import java.util.Vector;

public class Program03 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();

		for (int i = 1; i <= 10; i++)
			v1.add(i);

		System.out.println("size of v1 - " + v1.size());
		System.out.println("capacity of v1 - " + v1.capacity());

		for (int i = 11; i <= 20; i++)
			v1.add(i);
		System.out.println("size of v1 - " + v1.size());
		System.out.println("capacity of v1 - " + v1.capacity());

		v1.add(21);
		System.out.println("size of v1 - " + v1.size());
		System.out.println("capacity of v1 - " + v1.capacity());

		v1.remove(2);
		v1.remove(3);
		System.out.println("size of v1 - " + v1.size());
		System.out.println("capacity of v1 - " + v1.capacity());

	}

}
