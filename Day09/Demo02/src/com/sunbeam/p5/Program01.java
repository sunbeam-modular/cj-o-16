package com.sunbeam.p5;

interface I1 {

}

interface I2 {

}

interface I3 {

}

class C1 {

}

class C2 {

}

class C3 {

}

public class Program01 {

	public static void main(String[] args) {
//		class C3 extends C1 // OK
//		class C3 extends C1,C2 //NOT OK
		// Multiple class inheritance is not allowed in java

//		class C3 implements I1 // OK
//		class C3 implements I1,I2 // OK
		// Multiple interface inheritance is allowed in java

//		class C3 extends I1 // NOT OK
//		class C3 implements C1 // NOT OK

//		interface I3 extends I1 // OK
//		interface I3 extends I1, I2  // OK

//		interface I3 implements I1 // NOT OK
//		interface I3 implements C1 // NOT OK
//		interface I3 extends C1 // NOT OK

//		class C3 extends C1 implements I1 // OK
//		class C3 extends C1 implements I1, I2// OK

//		class C3 implements I1 extends C1 // NOT OK

	}

}
