package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person();
		p1.displayPerson();

		Person p2 = new Person("Anil", "9876543210");
		p2.displayPerson();

		Person p3 = new Person();
		p3.acceptPerson(sc);
		p3.displayPerson();
	}

}
