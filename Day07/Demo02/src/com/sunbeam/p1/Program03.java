package com.sunbeam.p1;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.displayStudent();

		Student s2 = new Student("Anil", "9876543210", 1, 70);
		s2.displayStudent();

		Student s3 = new Student();
		s3.acceptStudent(sc);
		s3.displayStudent();
	}

}
