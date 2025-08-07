package com.sunbeam.p1;

import java.util.function.BinaryOperator;

public class Program01 {

	public static void doWork(BinaryOperator<Integer> op) {
		// does not know what to do.
		// the caller will tell what arithmetic operation to perform
		System.out.println("Result - " + op.apply(20, 10));
	}

	public static void main(String[] args) {
		// Non-Capaturing Lambda's
		doWork((x, y) -> x + y);
		doWork((x, y) -> x - y);
		doWork((x, y) -> x * y);
		doWork((n, d) -> n / d);
	}

}
