package com.sunbeam.p2;

interface Displayable {
	void display();
}

interface Printable {
	void display();
}

class SuperClassTest {
	public void display() {
		System.out.println("SuperClassTest::display");
	}
}

// multiple interface inheritance
class Test extends SuperClassTest implements Displayable, Printable {
	// It is optional to override the display()
	// As thge method implementation is inherited from the super class
	@Override
	public void display() {
		super.display();
		System.out.println("Test::display");
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
	}

}
