package com.sunbeam.p1;

public class Program04 {

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
					System.out.println("MyThread - " + i);
				}
			}
		}

		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 7; i++) {
					delay();
					System.out.println("MyRunnable - " + i);
				}
			}
		}

		Thread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		t1.start(); // executing the thread
		t2.start();

		for (int i = 1; i <= 5; i++) {
			delay();
			System.out.println("Main Thread - " + i);
		}

		try {
			t2.join(); // Thread on which join is called will wait for the t2 thread to complete the
						// execution
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Program Finished ... ");
	}

}
