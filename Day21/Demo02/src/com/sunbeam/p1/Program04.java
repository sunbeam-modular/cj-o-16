package com.sunbeam.p1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// multivalue annotation

@Documented
@Repeatable(DeveloperInfoCollection.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD })
@interface DeveloperInfo {
	int id();

	String name();
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD })
@interface DeveloperInfoCollection {
	DeveloperInfo[] value();
}

@DeveloperInfo(id = 1, name = "Rohan")
class Person {
	String name;
	String address;

	@DeveloperInfo(id = 2, name = "Ketan")
	public Person() {
	}

	@DeveloperInfo(id = 2, name = "Ketan")
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@DeveloperInfo(id = 1, name = "Rohan")
	@DeveloperInfo(id = 3, name = "Nilesh")
	void accept() {

	}

	@DeveloperInfo(id = 3, name = "Nilesh")
	void display() {

	}
}

public class Program04 {

	public static void main(String[] args) {

	}

}
