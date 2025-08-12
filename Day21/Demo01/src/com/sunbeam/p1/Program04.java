package com.sunbeam.p1;

import java.lang.reflect.Method;
import java.time.LocalDate;

class Student {
	int rollno;
	String name;

	public Student() {
		rollno = 1;
		name = "Anil";
	}

	public void display() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
	}
}

class Date {
	int day;
	int month;
	int year;

	public Date() {
		LocalDate ld = LocalDate.now();
		this.day = ld.getDayOfMonth();
		this.month = ld.getMonthValue();
		this.year = ld.getYear();
	}

	public void display() {
		System.out.println("Date - " + day + "/" + month + "/" + year);
	}
}

class Time {
	int hr;
	int min;

	public Time() {
		hr = 10;
		min = 10;
	}

	public void displayTime() {
		System.out.println("Time - " + hr + ":" + min);
	}

}

public class Program04 {

	public static void invoke(Class c) {
		try {
			Object obj = c.getDeclaredConstructor().newInstance();
			Method method = c.getDeclaredMethod("display");
			method.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		invoke(Student.class);
		invoke(Date.class);
		invoke(Time.class);
	}

	public static void main1(String[] args) {
		Student s1 = new Student();
		s1.display();

		Date d1 = new Date();
		d1.display();
	}

}
