package com.sunbeam.p1;

// Functional Interface
// an interface that has only single abstract method
@FunctionalInterface
interface I1 {
	void m1(); // Single Abstract Method
}

@FunctionalInterface
interface I2 {
	void m1(); // SAM

	default void m2() {

	}
}

@FunctionalInterface
interface I3 {
	void m1(); // SAM

	default void m2() {

	}

	static void m3() {

	}
}

// Not a functional interface
interface I4 {
	// multiple abstract methods
	void m1();

	void m2();
}

public class Program01 {
	public static void main(String[] args) {

	}

}
