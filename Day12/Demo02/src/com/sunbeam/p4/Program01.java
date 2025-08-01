package com.sunbeam.p4;

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

	// Lower bounded type parameter
	public static void display(Box<? super Integer> b) {
		System.out.println("value - " + b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(new Integer(10));
		Box<Double> b2 = new Box<Double>(new Double(10.20));
		Box<String> b3 = new Box<String>(new String("sunbeam"));
		Box<Date> b4 = new Box<Date>(new Date());

		display(b1);
//		display(b2); // NOT OK
//		display(b3); // NOT OK
//		display(b4); // NOT OK

	}

}
