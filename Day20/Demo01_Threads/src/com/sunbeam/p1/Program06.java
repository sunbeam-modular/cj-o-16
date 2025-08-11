package com.sunbeam.p1;

import java.util.Scanner;

public class Program06 {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					delay();
					System.out.println("MyThread - " + i);
				}
			}
		}

		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					delay();
					System.out.println("MyRunnable - " + i);
				}
			}
		}

		Thread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		System.out.println("State of t1 before start - " + t1.getState());
		System.out.println("State of t2 before start - " + t2.getState());
		t1.start(); // executing the thread
		System.out.println("State of t1 after start - " + t1.getState());
		t2.start();
		System.out.println("State of t2 after start - " + t2.getState());

		System.out.println("State of t1 in between - " + t1.getState());
		System.out.println("State of t2 in between - " + t2.getState());

		for (int i = 1; i <= 5; i++) {
			delay();
			System.out.println("Main Thread - " + i);
			if (i == 3)
				System.out.println("Main Thread State in between - " + Thread.currentThread().getState());
		}

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Program Finished ... ");
		System.out.println("State of t1 after finish - " + t1.getState());
		System.out.println("State of t2 after finish - " + t2.getState());
	}

}
