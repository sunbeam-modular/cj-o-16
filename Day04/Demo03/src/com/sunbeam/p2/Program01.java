package com.sunbeam.p2;

class Employee {
	int empid;
	private String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void acceptEmployee() {
		// scanner
		// TO-DO
	}

	public void displayEmployee() {
		System.out.println("empid - " + empid);
		System.out.println("name - " + name);
		System.out.println("salary - " + salary);
		System.out.println("-----------------------");
	}

}

public class Program01 {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(1, "Anil", 10000);
		arr[1] = new Employee(2, "Mukesh", 20000);
		arr[2] = new Employee(3, "Ramesh", 30000);
		arr[3] = new Employee(4, "Suresh", 40000);
		arr[4] = new Employee();
		// arr[4].setName("Ram");
		arr[4].acceptEmployee();

		for (Employee e : arr)
			e.displayEmployee();
	}

}
