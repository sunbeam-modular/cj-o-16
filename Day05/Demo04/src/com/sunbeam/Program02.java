package com.sunbeam;

class Circle {
	int radius;
	final double PI = 3.14; // field initializer

}

class BankAccount {
	final int accno;
	String name;
	double balance;

	{
		accno = 1001; // auto generation
		balance = 100;
	}

	public BankAccount() {
	}

	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public BankAccount(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void displayAccountDetails() {
		System.out.println("accno - " + accno);
		System.out.println("name - " + name);
		System.out.println("balance - " + balance);
	}
}

public class Program02 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount("Anil");
		final BankAccount a3 = new BankAccount("Mukesh", 10000);

//		a1.accno = 1003; // NOT OK
		a1.balance = 15000;

		a1.displayAccountDetails();
		a2.displayAccountDetails();

	}

}
