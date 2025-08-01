package com.sunbeam.p1;

import java.util.Date;

// till java 1.4
class Box {
	public Object obj; // any type of data inside it

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObj(new Integer(10)); // OK
//		b1.setObj(new String("sunbeam")); // OK
		Integer i1 = (Integer) b1.getObj(); // downcasting
		System.out.println("I1 - " + i1);

		Box b2 = new Box();
		b2.setObj(new String("sunbeam"));
		String s1 = (String) b2.getObj();
		System.out.println("s1 - " + s1);

		Box b3 = new Box();
		b3.setObj(new Date());
		Date d1 = (Date) b3.getObj();
		System.out.println("d1 - " + d1);

		Box b4 = new Box();
		b4.setObj("12.35"); // new string("12.35")
		Double d2 = (Double) b4.getObj(); // ClassCastException
		// type safety was missing
		System.out.println("d2 - " + d2);
	}

}
