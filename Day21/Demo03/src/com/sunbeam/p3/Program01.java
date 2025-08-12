package com.sunbeam.p3;

// class consists of static as well as non static members
class Outer {
	// field
	int num1 = 10;
	static int num2 = 20;

	// method
	public void method1() {
		// a local class cannot be declared as static
		// inside local class we can declare only non static members
		// Local class declared inside the non static methods behave like the non
		// static nested class while accesing the outer class members
		class LocalClass {
			int num3 = 30;
//			static int num4 = 40; //NOT OK

			public void method1() {
				System.out.println("outer class non static field - " + num1); // NOT OK
				System.out.println("outer class static field - " + num2); // OK
				System.out.println("Inner class non static field - " + num3);
			}

//			public static void method2() {} // NOT OK
		}

	}

	public static void method2() {
		// a local class cannot be declared as static
		// inside local class we can declare only non static members
		// Local class declared inside the static methods behave like the
		// static nested class while accesing the outer class members
		class LocalClass {
			int num3 = 30;
//			static int num4 = 40; // NOT OK

			public void method1() {
//				System.out.println("outer class non static field - " + num1); // NOT OK
				System.out.println("outer class static field - " + num2); // OK
				System.out.println("Inner class non static field - " + num3);
			}

//			public static void method2() {} // NOT OK

		}
	}

}

public class Program01 {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.method1();
		Outer.method2();
	}

}
