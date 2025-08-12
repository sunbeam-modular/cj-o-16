package com.sunbeam.p2;

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
	class Inner {
		int num3 = 30; // OK
//		static int num4 = 40; // NOT OK

		public void method3() {
			System.out.println("outer class non static field - " + num1); // OK
			System.out.println("outer class static field - " + num2); // OK
			System.out.println("Inner class non static field - " + num3);
		}

//		public static void method4()  // NOT OK
//		{
//			System.out.println("outer class non static field - " + num1); // NOT OK
//			System.out.println("outer class static field - " + num2); // OK
//			System.out.println("Inner class non static field - " + num3); // NOT OK
//			System.out.println("Inner class static field - " + num4);
//		}
	}
}

public class Program01 {

	public static void main(String[] args) {
		Outer o1 = new Outer();
//		Outer.Inner i1 = new Outer.Inner();// NOT OK
//		Outer.Inner i1 = o1.new Inner();// OK
		Outer.Inner i1 = new Outer().new Inner();// OK
	}

}
