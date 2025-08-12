package com.sunbeam.p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FQCL to get the class information - ");
		String className = sc.next();
		try {
			Class c1 = Class.forName(className);
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

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
