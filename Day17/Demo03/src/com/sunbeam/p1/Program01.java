package com.sunbeam.p1;

interface Displayable {
	void display();
}

interface Printable {
	void display();
}

// multiple interface inheritance
class Test implements Displayable, Printable {
	@Override
	public void display() {
		System.out.println("Test::display");
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
	}

}
