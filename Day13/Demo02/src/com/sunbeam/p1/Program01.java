package com.sunbeam.p1;

class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary > o.salary)
			return 3;// (+ve value)
		else if (this.salary < o.salary)
			return -2; // (-ve value)
		return 0;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Anil", 8000);
		Employee e2 = new Employee(2, "Mukesh", 8000);
		if (e1.compareTo(e2) > 0)
			System.out.println("Anil is greater");
		else if (e1.compareTo(e2) < 0)
			System.out.println("Mukesh is greater");
		else
			System.out.println("Both are equal");

	}

}
