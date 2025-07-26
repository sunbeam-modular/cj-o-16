package com.sunbeam.p2;

import java.util.Scanner;

// Student is-a Person
public class Student extends Person {
	int rollno;
	double marks;

	public Student() {
		System.out.println("Student()");
	}

	public Student(String name, String mobile, int rollno, double marks) {
		super(name, mobile);
		System.out.println("Student(String,String,int ,double)");
		this.rollno = rollno;
		this.marks = marks;
	}

	public void display() {
		super.display();
		System.out.println("Rollno - " + rollno);
		System.out.println("Marks - " + marks);
		System.out.println("------------------------");
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the rollno - ");
		rollno = sc.nextInt();
		System.out.print("Enter the marks - ");
		marks = sc.nextDouble();
	}

}
