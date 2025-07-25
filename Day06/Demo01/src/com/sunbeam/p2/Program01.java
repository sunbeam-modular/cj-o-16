package com.sunbeam.p2;

class Test {
	// non static field
	int num1;
	// static field
	static int num2;
	// the memory for the static field will be allocated on the
	// method area only once at the time of class loading

	public void display() {
		System.out.println("num1 - " + num1);
		System.out.println("num2 - " + num2);
	}
}

public class Program01 {

	public static void main(String[] args) {
		// static members are designed to be accesssed on
		// classname using . operator
		System.out.println("Num2 - " + Test.num2);
		Test.num2 = 20;
		System.out.println("After change Num2 - " + Test.num2);

		Test t1 = new Test();
		t1.num1 = 10;
		t1.display();

		Test t2 = new Test();
		t2.num1 = 30;
		t2.display();

		System.out.println("t1 changes the value of num2 - ");
		t1.num2 = 40;
//		Test.num2 = 40;
		t1.display();
		t2.display();
	}

}
