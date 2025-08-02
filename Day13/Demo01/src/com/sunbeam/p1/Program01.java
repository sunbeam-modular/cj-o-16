package com.sunbeam.p1;

import java.sql.Date;

// Genrics
class Box<E> {
	private E ref = null;

	public void setRef(E ref) {
		this.ref = ref;
	}

	public E getRef() {
		return ref;
	}
}

class Carboard<K> {
	private K ref;

	public void setRef(K ref) {
		this.ref = ref;
	}

	public K getRef() {
		return ref;
	}
}

class Employee {

}

public class Program01 {

	public void square(int num) {
		System.out.println(num * num);
	}

	// Upper bounded, lower bounded
	public static void display(Box<? super Integer> b) {
		System.out.println(b.getRef());
	}

	// generic Method
	public static <T> void displayArray(T[] arr) {
		for (T element : arr)
			System.out.println(element);
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setRef(new Integer(10));
		display(b1);

		Box<String> b2 = new Box<>();
		b2.setRef(new String("sunbeam"));
		// display(b2);

		Carboard<Integer> c1 = new Carboard<>();
		// display(c1);

		Integer[] arr1 = {};
		String[] arr2 = {};
		Date[] arr3 = {};
		Employee[] arr4 = {};

		displayArray(arr1);
		displayArray(arr2);
		displayArray(arr3);
		displayArray(arr4);
	}

}
