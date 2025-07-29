package com.sunbeam.p3;

interface Displayable {
	// fields declared inside the interface are by default public static final
	int num1 = 10;

	void display();
}

interface Showable {
	void display();
}

class Time implements Showable, Displayable {
	int hr;
	int min;

	@Override
	public void display() {

	}

}

public class Program01 {

	public static void main(String[] args) {
		System.out.println(Displayable.num1);
		Displayable d1 = new Time(); // upcasting
	}

}
