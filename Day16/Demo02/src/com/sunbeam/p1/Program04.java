package com.sunbeam.p1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//interface Map<K,V> {
//	static interface Entry<K,V> {
//
//	}
//}

public class Program04 {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(121, "Mukesh"); // Entry Object -> Key(Integer) and Value(String)
		m1.put(143, "Anil");
		m1.put(154, "Ramesh");
		m1.put(132, "Suresh");

		System.out.println("size of m1 - " + m1.size());

		Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
		for (Map.Entry<Integer, String> element : s1)
			System.out.println(element.getKey() + " - " + element.getValue());

	}

}
