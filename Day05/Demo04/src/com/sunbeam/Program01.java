package com.sunbeam;

class Test {
	int num1;
//	final int num2 = 20; // field initializer
	final int num2;

	// object initializer
	{
		// num2 = 20;
	}

	public Test() {
		num2 = 20;
	}

	public void displayTest() {
		// num2 = 50; // NOT OK
		System.out.println("num1 - " + num1);
		System.out.println("num2 - " + num2);
	}
}

public class Program01 {

	public static void main(String[] args) {
		// final int num1 = 10;
		final int num1;
		num1 = 10;
		// num1 = 20; // NOT OK
		// System.out.println(num1);

		Test t1 = new Test();
		t1.displayTest();

	}

}
