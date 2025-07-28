package com.sunbeam.p1;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Salesman s1 = new Salesman();
		s1.accept(sc);
		s1.display();
	}

}
