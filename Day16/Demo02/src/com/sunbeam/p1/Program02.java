package com.sunbeam.p1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program02 {

	public static void main(String[] args) {
		// Map<Keys, Values> m1;
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(121, "Mukesh");
		m1.put(132, "Suresh");
		m1.put(143, "Anil");
		m1.put(154, "Ramesh");
		m1.put(154, "Ramesh"); // Duplicate key in the map
		m1.put(154, "Ram"); // Duplicate key but the value is different
		// If keys are duplicated the value will be replaced
		m1.put(null, "Sham"); // null key is allowed
		m1.put(null, "Prasad"); // multiple null keys are not allowed it will replace the value
		m1.put(165, "Mukesh"); // value is duplicated
		m1.put(176, null); // value as null
		m1.put(187, null); // multiple null values

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
