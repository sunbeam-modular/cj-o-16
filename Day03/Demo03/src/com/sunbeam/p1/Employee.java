package com.sunbeam.p1;

public class Employee {
	private int empid;
	String name; // defualt - package level private
	protected double salary;
	public String mobile;

	public void display() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(mobile);
	}
}
