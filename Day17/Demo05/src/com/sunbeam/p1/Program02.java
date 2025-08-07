package com.sunbeam.p1;

import java.util.function.BinaryOperator;

public class Program02 {

	public static void doWork(BinaryOperator<Integer> op) {
		// does not know what to do.
		// the caller will tell what arithmetic operation to perform
		System.out.println("Result - " + op.apply(20, 10));
	}

	public static void main(String[] args) {
		// final int num = 10; // OK
		int num = 10; // effectively final
		// num = 20; // Not allowed for capturing

		// The local variable value can be captured in lambda
		// if and only if they are final or effectively final

		// Capturing Lambda's
		// they capture the value from the local variables declared
		// in the method where lambda expression are defined
		doWork((x, y) -> x + y + num);
		doWork((x, y) -> x - y - num);
		doWork((x, y) -> x * y * num);
		doWork((n, d) -> n / d + num);
	}

}
