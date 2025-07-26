package com.sunbeam.p2;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person();
		p1.display();

		Person p2 = new Person("Anil", "9876543210");
		p2.display();

		Person p3 = new Person();
		p3.accept(sc);
		p3.display();
	}

}
