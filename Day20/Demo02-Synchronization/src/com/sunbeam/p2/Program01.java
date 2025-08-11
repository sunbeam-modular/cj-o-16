package com.sunbeam.p2;

public class Program01 {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1001, 10000);

		class DepositThread extends Thread {
			@Override
			public void run() {
				System.out.println("dt state - " + this.getState());
				for (int i = 0; i < 10; i++) {
					delay();
					a1.deposit(10000);
					System.out.println("After deposit balance - " + a1.getBalance());
				}
				System.out.println("dt state - " + this.getState());
			}
		}

		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					delay();
					a1.withdraw(10000);
					System.out.println("After withdraw balance - " + a1.getBalance());
				}
			}
		}

		DepositThread dt = new DepositThread();
		System.out.println("dt state - " + dt.getState());
		WithdrawThread wt = new WithdrawThread();

		dt.start();
		wt.start();

		System.out.println("dt state - " + dt.getState());
		System.out.println("wt state - " + wt.getState());
		try {
			dt.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final balance - " + a1.getBalance());
		System.out.println("dt state - " + dt.getState());
	}

}
