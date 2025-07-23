package com.sunbeam.p2;

class BankAccount {
	private int accno; // read
	private String name; // write/read
	private double balance; // read

	public int getAccno() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// facilitators
	public void withdraw(double amount) {

	}

	// facilitators
	public void deposit() {
		// logic
	}
}

public class Program02 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		// a1.accno = 1000;

		System.out.println("a1.accno - " + a1.getAccno());
		System.out.println("a1.balance - " + a1.getBalance());
		System.out.println("a1.name - " + a1.getName());

	}

}
