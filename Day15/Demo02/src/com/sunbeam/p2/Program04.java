package com.sunbeam.p2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program04 {

	public static void main(String[] args) {

		class EmpSalaryComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.salary, o1.salary); // Desc order of sal
			}
		}
		EmpSalaryComparator comparator = new EmpSalaryComparator();

		// For priority queue using its parameterized ctor
		// we must pass our comparator to maintain the order
		Queue<Employee> empQueue = new PriorityQueue<Employee>(comparator);
		empQueue.add(new Employee(5, "Mukesh", 20000));
		empQueue.add(new Employee(2, "Ramesh", 10000));
		empQueue.add(new Employee(4, "Anil", 50000));
		empQueue.add(new Employee(1, "Suresh", 30000));
		empQueue.add(new Employee(3, "Ram", 40000));

		Iterator<Employee> itr = empQueue.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Emp at Front - " + empQueue.peek());
		System.out.println("Emp removed - " + empQueue.poll());
		System.out.println("Emp removed - " + empQueue.poll());
		System.out.println("Emp removed - " + empQueue.poll());
		System.out.println("Emp removed - " + empQueue.poll());
		System.out.println("Emp removed - " + empQueue.poll());

	}

}
