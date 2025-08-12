package com.sunbeam.p1;

// class consists of static as well as non static members
class Outer {
	// field
	int num1 = 10;
	static int num2 = 20;

	// method
	public void method1() {

	}

	public static void method2() {

	}

	// nested class
	static class Inner {
		// members of the inner class
		int num3 = 30;
		static int num4 = 40;

		public void method3() {
//			System.out.println("outer class non static field - " + num1); // NOT OK
			System.out.println("outer class static field - " + num2); // OK
			System.out.println("Inner class non static field - " + num3);
			System.out.println("Inner class static field - " + num4);
		}

		public static void method4() {
//			System.out.println("outer class non static field - " + num1); // NOT OK
			System.out.println("outer class static field - " + num2); // OK
//			System.out.println("Inner class non static field - " + num3); // NOT OK
			System.out.println("Inner class static field - " + num4);

		}
	}
}

public class Program01 {

	public static void main(String[] args) {
//		Outer o1 = new Outer();
//		o1.method1(); // non static

		Outer.method2(); // static

		Outer.Inner in = new Outer.Inner();
		in.method3(); // non static

		Outer.Inner.method4(); // static
	}

}
