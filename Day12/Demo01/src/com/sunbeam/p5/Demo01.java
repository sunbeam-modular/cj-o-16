package com.sunbeam.p5;

class Box<T> {
	public T obj;

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
		Box<Integer> b2 = new Box<>(); // type inference

		// Box<Integer> b3 = new Box(); // OK NOT Recommended
		// Box b3 = new Box(); // OK NOT recommended
		// Box<Object> b3 = new Box<Object>();

		// b3.setObj(new Integer(10));
		// b3.setObj(new String("sunbeam"));
		// Box<Object> b4 = new Box<String>(); // NOT OK

		// Integer i1 = new Integer(10);

	}

}
