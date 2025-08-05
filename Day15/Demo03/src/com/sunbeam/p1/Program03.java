package com.sunbeam.p1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program03 {

	public static void main(String[] args) {
		Set<Employee> s1 = new LinkedHashSet<>();
		// Set<Employee> s1 = new HashSet<>();
		s1.add(new Employee(154, "Suresh", 40000));
		s1.add(new Employee(132, "Mukesh", 20000));
		s1.add(new Employee(121, "Anil", 10000));
		s1.add(new Employee(143, "Ramesh", 30000));
		s1.add(new Employee(154, "Ram", 40000)); // Duplicate

		System.out.println("size of s1 - " + s1.size());

		for (Employee e : s1)
			System.out.println(e + "-" + e.hashCode());
	}

}
