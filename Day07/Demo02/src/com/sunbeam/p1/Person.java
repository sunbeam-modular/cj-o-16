package com.sunbeam.p1;

import java.util.Scanner;

public class Person {
	String name;
	String mobile;

	public Person() {
		System.out.println("Person()");
	}

	public Person(String name, String mobile) {
		System.out.println("Person(String,String)");
		this.name = name;
		this.mobile = mobile;
	}

	public void acceptPerson(Scanner sc) {
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the mobile - ");
		mobile = sc.next();
	}

	public void displayPerson() {
		System.out.println("Name - " + name);
		System.out.println("Mobile - " + mobile);
	}

}
