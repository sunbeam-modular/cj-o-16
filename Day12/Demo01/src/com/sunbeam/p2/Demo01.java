package com.sunbeam.p2;

import java.util.Date;

// java 1.5 onwards
// Generics
class Box<T> { // Type parameter
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
		b1.setObj(new Integer(10)); // OK
		// b1.setObj(new String("sunbeam")); // NOT OK
		Integer i1 = b1.getObj(); // Type safety
		System.out.println("i1 - " + i1);

		Box<String> b2 = new Box<String>();
		// b2.setObj(new Integer(10)); // NOT OK
		b2.setObj(new String("sunbeam")); // OK
		String s1 = b2.getObj();
		System.out.println("s1 - " + s1);

		Box<Date> b3 = new Box<Date>();
		b3.setObj(new Date());
		Date d1 = b3.getObj();
		System.out.println("d1 - " + d1);
	}

}
