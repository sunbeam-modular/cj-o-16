package com.sunbeam.p2;

import java.util.Scanner;

//abstract class Acceptable {
//	public abstract void accept(Scanner sc);
//}

// java 7 Interface

// set of protocol
// interfaces are considered as immutable
// so as to avoid the fragile base class problem
// once interface is declared its should not be changed
interface Acceptable {
	// we should declare only the abstract methods
	void accept(Scanner sc);
}

// any new protocol addition should be done by creating a new interface
interface Displayable {
	void display();
}

class Time implements Acceptable, Displayable {
	int hr;
	int min;

	@Override
	public void accept(Scanner sc) {

	}

	@Override
	public void display() {

	}

}

class Date implements Acceptable {
	int month;
	int year;

	@Override
	public void accept(Scanner sc) {

	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", year=" + year + "]";
	}

}

class Employee implements Acceptable, Displayable {
	int empid;
	double salary;

	@Override
	public void accept(Scanner sc) {

	}

	@Override
	public void display() {

	}

}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Time t1 = new Time();
		Date d1 = new Date();
		Employee e1 = new Employee();

		t1.accept(sc);
		d1.accept(sc);
		e1.accept(sc);

	}

}
