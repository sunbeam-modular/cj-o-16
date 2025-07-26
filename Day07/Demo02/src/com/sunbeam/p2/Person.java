package com.sunbeam.p2;

import java.util.Scanner;

public class Person {
	String name;
	String mobile;

	public Person() {
	}

	public Person(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the mobile - ");
		mobile = sc.next();
	}

	public void display() {
		System.out.println("Name - " + name);
		System.out.println("Mobile - " + mobile);
	}

}
