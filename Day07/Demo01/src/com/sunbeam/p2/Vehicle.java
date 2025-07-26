package com.sunbeam.p2;

import java.util.Scanner;

public class Vehicle {
	String vehName;
	String vehNumber;

	public Vehicle() {
	}

	public Vehicle(String vehName, String vehNumber) {
		this.vehName = vehName;
		this.vehNumber = vehNumber;
	}

	public void acceptVehicle(Scanner sc) {
		System.out.print("Enter the vehicle name - ");
		vehName = sc.next();
		System.out.print("Enter the vehicle number - ");
		vehNumber = sc.next();
	}

	public void displayVehicle() {
		System.out.println("Vehicle name - " + vehName);
		System.out.println("Vehicle number - " + vehNumber);
	}

}
