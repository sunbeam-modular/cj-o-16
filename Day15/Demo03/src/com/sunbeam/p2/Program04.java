package com.sunbeam.p2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Program04 {

	public static void main(String[] args) {

		class EmpNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name); // asc order of name
			}
		}

		EmpNameComparator comparator = new EmpNameComparator();

		Set<Employee> s1 = new TreeSet<>(comparator);
		// given ordering of the elements provided by the comparator
		s1.add(new Employee(154, "Anil", 40000));
		s1.add(new Employee(132, "Suresh", 20000));
		s1.add(new Employee(121, "Mukesh", 10000));
		s1.add(new Employee(143, "Ramesh", 30000));
		s1.add(new Employee(154, "Ram", 40000));
		s1.add(new Employee(165, "Ram", 50000)); // Duplicate

		System.out.println("size of s1 - " + s1.size());

		for (Employee e : s1)
			System.out.println(e + "-" + e.hashCode());
	}

}
