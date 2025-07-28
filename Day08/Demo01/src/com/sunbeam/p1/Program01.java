package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Manager m1 = new Manager();
		m1.accept(sc);
		m1.display();
	}

}
