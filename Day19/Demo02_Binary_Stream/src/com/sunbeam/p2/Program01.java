package com.sunbeam.p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Program01 {

	public static void write(List<Employee> empList) {
		try (FileOutputStream fos = new FileOutputStream("emp2.db")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(empList);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read() {
		try (FileInputStream fis = new FileInputStream("emp2.db")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				List<Employee> empList = (List<Employee>) ois.readObject();
				empList.forEach(System.out::println);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// List<Employee> empList = new ArrayList<>();
		// empList.add(new Employee(1, "anil", 10000));
		// empList.add(new Employee(2, "mukesh", 20000));
		// write(empList);

		read();
	}

}
