package com.sunbeam.p1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program03 {

	public static void main(String[] args) {
		// Map<Keys, Values> m1;
//		Map<Integer, String> m1 = new HashMap<>(); // no gurantee of the order
		Map<Integer, String> m1 = new LinkedHashMap<>(); // maintains the insertion order
//		Map<Integer, String> m1 = new TreeMap<>(); // maintains the natural ordering of the keys
		m1.put(121, "Mukesh");
		m1.put(143, "Anil");
		m1.put(154, "Ramesh");
		m1.put(132, "Suresh");

		System.out.println("size of m1 - " + m1.size());

		// Set<K> keys;
		Set<Integer> keys = m1.keySet(); // it will return all the keys
		for (Integer k : keys)
			System.out.print(k + ", ");
		System.out.println();

		// Collection<V> values;
		Collection<String> values = m1.values(); // it will return all the values
		for (String v : values)
			System.out.print(v + ", ");
		System.out.println();
	}

}
