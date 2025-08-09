package com.sunbeam.p2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Program02 {

	public static void write(List<Employee> empList) {
		try (FileOutputStream fos = new FileOutputStream("emp3.db")) {
			try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
					oos.writeObject(empList);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read() {
		try (FileInputStream fis = new FileInputStream("emp3.db")) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(bis)) {
					List<Employee> empList = (List<Employee>) ois.readObject();
					empList.forEach(System.out::println);
				}
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
//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee(1, "anil", 10000));
//		empList.add(new Employee(2, "mukesh", 20000));
//		empList.add(new Employee(3, "ramesh", 30000));
//		write(empList);

		read();
	}

}
