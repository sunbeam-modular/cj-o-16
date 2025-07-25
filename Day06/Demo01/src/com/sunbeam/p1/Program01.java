package com.sunbeam.p1;

class Test {
	// non static fields
	int num1;
	int num2;

	public void display() {
		System.out.println("num1 - " + num1);
		System.out.println("num2 - " + num2);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		// memory inside the object is allocated
		// to all the non static fields of the class
		t1.num1 = 10;
		t1.num2 = 20;
		t1.display();

		Test t2 = new Test();
		t2.num1 = 30;
		t2.num2 = 40;
		t2.display();
	}

}
