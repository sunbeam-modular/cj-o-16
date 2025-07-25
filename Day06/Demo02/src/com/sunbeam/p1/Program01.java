package com.sunbeam.p1;

import static com.sunbeam.p2.Arithmetic.square;

import com.sunbeam.p2.Arithmetic;

public class Program01 {

	public static void add(int n1, int n2) {
		System.out.println("Addition - " + (n1 + n2));
	}

	public static void sub(int n1, int n2) {
		System.out.println("Substraction - " + (n1 - n2));
	}

	public static void main(String[] args) {
		add(10, 20);
		Program01.sub(20, 10);

		square(5);
		Arithmetic.mul(5, 7);
	}

}
