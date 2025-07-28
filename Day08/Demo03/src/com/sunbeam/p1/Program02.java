package com.sunbeam.p1;

// class is 100% complete
final class Employee {
	private int empid;
	private double salary;

	// implementation of this method is 100% complete
	public final void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}

// we cannot extend the final class
class Manager extends Employee // NOT OK
{

	// final method cannot be overriden
//	@Override
//	public void setEmpid(int empid) {
//		super.setEmpid(empid);
//	}
}

public class Program02 {

	public static void main(String[] args) {

	}

}
