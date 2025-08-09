package com.sunbeam.p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program01 {

	public static void write(Employee e) {
		try (FileOutputStream fos = new FileOutputStream("emp1.db", true)) {
			try (DataOutputStream dos = new DataOutputStream(fos)) {
				dos.writeInt(e.empid);
				dos.writeUTF(e.name);
				dos.writeDouble(e.salary);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void read() {
		try (FileInputStream fis = new FileInputStream("emp1.db")) {
			try (DataInputStream dis = new DataInputStream(fis)) {
				while (true) {
					int empid = dis.readInt();
					String name = dis.readUTF();
					double salary = dis.readDouble();
					Employee e = new Employee(empid, name, salary);
					System.out.println(e);
				}
			}
		} catch (EOFException e) {
			System.out.println("File Reading is complete...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Employee e1 = new Employee(1, "anil", 10000);
		// Employee e2 = new Employee(2, "mukesh", 20000);
		// write(e1);
		// write(e2);
		read();
	}

}
