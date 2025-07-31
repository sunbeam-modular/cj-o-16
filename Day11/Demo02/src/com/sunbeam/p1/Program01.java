package com.sunbeam.p1;

class Person {
	String name;
	String city;
	String pincode;

	public Person() {
	}

	public Person(String name, String city, String pincode) {
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}

}

public class Program01 {

	public static void main(String[] args) {
		Person p1 = new Person("Anil", "Pune", "411057");
		Person p2 = p1;
		System.out.println("p1 - " + p1);
		System.out.println("p2 - " + p2);

		p2.name = "Mukesh";
		System.out.println("After change in p2 -> ");
		System.out.println("p1 - " + p1);
		System.out.println("p2 - " + p2);
	}

}
