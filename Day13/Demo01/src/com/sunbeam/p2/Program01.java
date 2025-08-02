package com.sunbeam.p2;

// Genrics
class Box<E> {
	private E ref;

	public void setRef(E ref) {
		this.ref = ref;
	}

	public E getRef() {
		return ref;
	}
}

public class Program01 {

	// NOt a method overloading
	public static void display(Box b1) {

	}

	// type Erasure
	public static void display(Box b1) {

	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		// Box<int> b2 = new Box<>(); // NOT OK

	}

}
