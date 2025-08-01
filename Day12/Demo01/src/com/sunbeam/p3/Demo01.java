package com.sunbeam.p3;

// java 1.5 onwards
// Generics
class Box<T extends Number> {// Bounded Type parameter
	public T obj; // any type of data inside it

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(new Integer(10));
		Integer i1 = b1.getObj();
		System.out.println("i1 - " + i1);

		Box<Double> b2 = new Box<Double>();
		Box<Number> b3 = new Box<Number>();

		// Box<String> b2 = new Box<String>(); // NOT OK
		// Box<Date> b3 = new Box<Date>(); // NOT OK
	}

}
