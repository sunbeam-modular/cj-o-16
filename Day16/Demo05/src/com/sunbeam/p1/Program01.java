package com.sunbeam.p1;

class Test {
	public Test() {
		System.out.println("Test Created");
	}

	@Override
	protected void finalize() throws Throwable {
		// resourse clearance
		System.out.println("test is destroyed");
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test(); // GC
		t1 = null;
		// invoke the GC (request)
		// System.gc();
		// OR
		Runtime.getRuntime().gc();
	}

}
