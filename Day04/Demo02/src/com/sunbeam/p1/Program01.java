package com.sunbeam.p1;

class Time {
	int hr;
	int min;

	public Time()// no of parameters - 0
	{
	}

	// ctor overloading
	public Time(int value) // no of parameters - 1
	{
		this.hr = value;
		this.min = value;
	}

	// ctor overloading
	public Time(int hr, int min) // no of parameters - 2
	{
		this.hr = hr;
		this.min = min;
	}

}

class Arithmetic {
	public void add(int n1, int n2)// no of paramates - 2
	{
		System.out.println("Addition - " + (n1 + n2));
	}

	public void add(int n1, int n2, int n3) // no of paramates - 3
	{
		System.out.println("Addition - " + (n1 + n2));
	}

	public void sqaure(int n1) // type of n1 - int
	{
		System.out.println("Square - " + (n1 * n1));
	}

	public void sqaure(double n1) // type of n1 - double
	{
		System.out.println("Square - " + (n1 * n1));
	}

	public void division(int n, double d) // order of type parameters - int,double
	{
		System.out.println("Division - " + (n / d));
	}

	public void division(double n, int d)// order of type paramaters - double , int
	{
		System.out.println("Division - " + (n / d));
	}

}

public class Program01 {

	public static void main(String[] args) {
		Arithmetic a1 = new Arithmetic();
		a1.add(10, 20);
		a1.add(10, 20, 30);

		a1.sqaure(5);
		a1.sqaure(5.5);

		a1.division(10, 2.5);
		a1.division(10.5, 2);
	}

}
