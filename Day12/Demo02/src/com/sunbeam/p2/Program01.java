package com.sunbeam.p2;

import java.util.Date;

class Box<T> {
	private T obj;

	public Box(T obj) {
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program01 {

	// box class reference should be able to hold box of any type
	// unbounded type parameter -> wildcard -> ?
	public static void display(Box<?> b) {
		System.out.println("value - " + b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(new Integer(10));
		Box<Double> b2 = new Box<Double>(new Double(10.20));
		Box<String> b3 = new Box<String>(new String("sunbeam"));
		Box<Date> b4 = new Box<Date>(new Date());

		display(b1);
		display(b2);
		display(b3);
		display(b4);

	}

}
