package com.sunbeam.p2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program03 {

	public static void main(String[] args) {
		// Queue<Employee> empQueue = new ArrayDeque<Employee>();

		// For priority queue using its parameterless ctor
		// requires our clas to implement Comparable interface
		// otherwise it will throw ClassCastException
		Queue<Employee> empQueue = new PriorityQueue<Employee>();
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
