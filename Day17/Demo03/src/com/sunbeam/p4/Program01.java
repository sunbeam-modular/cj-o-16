package com.sunbeam.p4;

interface Displayable {
	default void display() {
		System.out.println("Displayable::display");
	}
}

interface Printable {
	// void display();
	default void display() {
		System.out.println("Printable::display");
	}
}

class SuperClassTest {
	public void display() {
		System.out.println("SuperClassTest::display");
	}
}

// multiple interface inheritance
class Test extends SuperClassTest implements Displayable, Printable {
	// overrding the method is optional
	@Override
	public void display() {
		super.display();
		Displayable.super.display();
		Printable.super.display();
		System.out.println("Test::display");
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
	}

}
