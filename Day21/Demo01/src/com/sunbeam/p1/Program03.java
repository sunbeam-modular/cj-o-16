package com.sunbeam.p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee {
	private int empid;
	private String name;
	private double salary;

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

public class Program03 {

	public static void main(String[] args) {
		Class c1 = Employee.class;
		System.out.println("class name - " + c1.getName());
		System.out.println("------------------------------------------------------------");
		System.out.println("*Fields* ->");
		// Field[] fields = c1.getFields();
		Field[] fields = c1.getDeclaredFields();
		for (Field f : fields)
			System.out.println(f);
		System.out.println("------------------------------------------------------------");
		System.out.println("*Constructors* ->");
		Constructor[] constructors = c1.getDeclaredConstructors();
		for (Constructor c : constructors)
			System.out.println(c);
		System.out.println("------------------------------------------------------------");
		System.out.println("*Methods* ->");
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods)
			System.out.println(m);
		System.out.println("------------------------------------------------------------");
		System.out.println("*Super class* ->");
		Class c2 = c1.getSuperclass();
		System.out.println("super class name - " + c2.getName());
		System.out.println("------------------------------------------------------------");
		System.out.println("*Super Interfaces* ->");
		Class[] interfaces = c1.getInterfaces();
		for (Class c : interfaces)
			System.out.println(c.getName());

	}

}
