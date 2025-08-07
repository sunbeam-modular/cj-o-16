package com.sunbeam.p3;

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

// multiple interface inheritance
class Test implements Displayable, Printable {
	// overrding the method is mandatory
	@Override
	public void display() {
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
