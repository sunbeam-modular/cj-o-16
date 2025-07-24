package com.sunbeam.p1;

class Test {
	int num1 = 10; // field initializer -> highest priority
	int num2;
	int num3;

	{
		System.out.println("Inside Object Initializer-2");
		num2 = 200;
		// num1 = 100;
	}

	// object/instance initializer block
	{
		System.out.println("Inside Object Initializer-1");
		num2 = 20;
		// num1 = 100;
	}

	public Test() {
		System.out.println("Inside Ctor");
		num3 = 30;
		// num1 = 1000;
	}

	public void displayTest() {
		System.out.println("num1 - " + num1);
		System.out.println("num2 - " + num2);
		System.out.println("num3 - " + num3);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.displayTest();
//		Test t2 = new Test();
//		t2.displayTest();
//		Test t3 = new Test();
//		t3.displayTest();
	}

}
