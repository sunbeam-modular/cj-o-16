package com.sunbeam.p1;

public class Program02 {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					delay();
					System.out.println("MyThread task - " + i);
				}

			}
		}

		Thread t1 = new MyThread(); // upcasting
		t1.start(); // executing the thread

		for (int i = 11; i <= 20; i++) {
			delay();
			System.out.println("Main Thread task - " + i);
		}

	}

}
