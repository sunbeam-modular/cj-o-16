package com.sunbeam.p3;

// Singleton Design pattern
class Singleton {

	private static Singleton ref = null;

	// step-1: make the ctor as private
	private Singleton() {
		System.out.println("Inside Ctor");
	}

	// step-2 : Design a method that will return the instance of this class
	public static Singleton getInstance() {
		// step-3 : check for of the object is already created
		if (ref == null)
			ref = new Singleton();
		return ref;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		Singleton s7 = Singleton.getInstance();
	}

}
