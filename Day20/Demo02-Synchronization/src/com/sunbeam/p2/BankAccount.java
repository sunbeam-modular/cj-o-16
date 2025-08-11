package com.sunbeam.p2;

public class BankAccount {
	private int accno;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(int accno, double balance) {
		this.accno = accno;
		this.balance = balance;
	}

	// synchronized methods
	public synchronized void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}

	public synchronized void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}

}
