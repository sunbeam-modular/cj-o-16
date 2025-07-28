package com.sunbeam.p1;

class Test {
	// final int num1 = 10; // field
	final int num1; // field

	{
		// num1 = 10;
	}

	public Test() {
		num1 = 10;
	}
}

public class Program01 {

	public static void main(String[] args) {
//		final int num1 = 10;
		final int num1;
		num1 = 10; // OK
		// num1 = 20; // NOT OK
	}

}
