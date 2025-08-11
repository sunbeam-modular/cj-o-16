package com.sunbeam.p1;

public class Program01 {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			delay();
			System.out.println("Main Thread task1 - " + i);
		}

		for (int i = 11; i <= 20; i++) {
			delay();
			System.out.println("Main Thread task2 - " + i);
		}
	}

}
