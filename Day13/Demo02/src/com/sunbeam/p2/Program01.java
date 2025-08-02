package com.sunbeam.p2;

import java.util.Comparator;

class Employee {
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

}

public class Program01 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Anil", 8000);
		Employee e2 = new Employee(2, "Mukesh", 8000);

		class EmpComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.salary > o2.salary)
					return 7;
				else if (o1.salary < o2.salary)
					return -3;
				return 0;
			}
		}
		EmpComparator empComparator = new EmpComparator();
		if (empComparator.compare(e1, e2) > 0)
			System.out.println("Anil is greater");
		else if (empComparator.compare(e1, e2) < 0)
			System.out.println("Mukesh is greater");
		else
			System.out.println("Both are equal");

	}

}
