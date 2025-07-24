package com.sunbeam.p2;

class BankAccount {
	private static int generate_accno = 1000;
	final private int accno;
	private String name;
	private double balance = 100;

	{
		generate_accno++; // increment the accno
		accno = generate_accno;
	}

	public BankAccount() {
	}

	public BankAccount(String name) {
		this.name = name;
	}

	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public void displayAccountDetails() {
		System.out.println("accno - " + accno);
		System.out.println("name - " + name);
		System.out.println("balance - " + balance);
		System.out.println("--------------------------");
	}
}

public class Program01 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount("Anil");
		BankAccount a3 = new BankAccount("Mukesh", 10000);

		a1.displayAccountDetails();
		a2.displayAccountDetails();
		a3.displayAccountDetails();
	}

}
