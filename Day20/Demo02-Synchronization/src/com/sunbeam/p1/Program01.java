package com.sunbeam.p1;

public class Program01 {

	public static void delay() {
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1001, 10000);

		class DepositThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					synchronized (a1) { // synchronized block
						delay();
						a1.deposit(10000);
						System.out.println("After deposit balance - " + a1.getBalance());
					}
				}
			}
		}

		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					synchronized (a1) {
						delay();
						a1.withdraw(10000);
						System.out.println("After withdraw balance - " + a1.getBalance());

					}
				}
			}
		}

		DepositThread dt = new DepositThread();
		WithdrawThread wt = new WithdrawThread();

		dt.start();
		wt.start();

		try {
			dt.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final balance - " + a1.getBalance());
	}

}
