package com.sunbeam.p2;

import com.sunbeam.p1.Employee;

// inheritance - Once again we will revise
// subclass (child class)
class Manager extends Employee {
	public void displayManager() {
		// System.out.println(empid); // NOT OK
		// System.out.println(name);// NOT OK
		System.out.println(salary); // OK
		System.out.println(mobile); // OK
	}
}

public class Program02 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		// System.out.println(e1.empid); // NOT OK
		// System.out.println(e1.name); // NOT OK
		// System.out.println(e1.salary); // NOT OK
		System.out.println(e1.mobile); // NOT OK
	}

}
