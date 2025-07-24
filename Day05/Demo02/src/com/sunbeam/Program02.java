package com.sunbeam;

class Test {
	int num1;

	public Test() {
		num1 = 10;
	}

	public void displayTest() {
		System.out.println("num1 - " + num1);
	}
}

public class Program02 {
	public static void changeValue(Test t) {
		t.num1 = 20;
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.displayTest();

		changeValue(t1); // pass by value
		// In java for non primitive types it is always pass by reference
		System.out.println("After change - ");
		t1.displayTest();
	}

}
