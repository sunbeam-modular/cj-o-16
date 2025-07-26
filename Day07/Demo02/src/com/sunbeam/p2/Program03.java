package com.sunbeam.p2;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.display();

		Student s2 = new Student("Anil", "9876543210", 1, 70);
		s2.display();

		Student s3 = new Student();
		s3.accept(sc);
		s3.display();
	}

}
