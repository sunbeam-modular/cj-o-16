package com.sunbeam.p1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program01 {

	public static void main(String[] args) {
		// Map<Keys, Values> m1;
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(121, "Mukesh");
		m1.put(132, "Suresh");
		m1.put(143, "Anil");
		m1.put(154, "Ramesh");

		System.out.println("size of m1 - " + m1.size());

		System.out.println("132 key is present - " + m1.containsKey(132)); // equals() of the Key
		System.out.println("172 key is present - " + m1.containsKey(172));

		System.out.println("Anil value is present - " + m1.containsValue("Anil")); // equals() of the Value
		System.out.println("Ram value is present - " + m1.containsValue("Ram")); // equals() of the Value

		System.out.println("Value for the key 143 - " + m1.get(143)); // anil // equals() of the key
		System.out.println("Value for the key 153 - " + m1.get(153)); // null

		System.out.println("Value removed for key 143 - " + m1.remove(143));
		System.out.println("Value removed for key 153 - " + m1.remove(153));
		System.out.println("size of m1 - " + m1.size());

		System.out.println("Element removed for key 132,Suresh - " + m1.remove(132, "Suresh")); // equals() of both key
																								// and value
		System.out.println("Element removed for key 121,Suresh - " + m1.remove(121, "Suresh"));
		System.out.println("size of m1 - " + m1.size());

	}

}
