package com.sunbeam.p2;

// Object class is the superclass of all the class in java

// Marker interface that provides permission for the Person class
// to clone itself
class Person implements Cloneable {
	String name;
	String city;
	String pincode;

	public Person() {
	}

	public Person(String name, String city, String pincode) {
		super();
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}

	// Upcasting and Downcasting
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Program01 {

	public static void main(String[] args) {
		Person p1 = new Person("Anil", "Pune", "411057");
		System.out.println("p1 - " + p1);

		try {
			Person p2 = (Person) p1.clone(); // Downcasting

			System.out.println("p2 - " + p2);

			p2.name = "Mukesh";

			System.out.println("After change in p2 -> ");
			System.out.println("p1 - " + p1);
			System.out.println("p2 - " + p2);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
