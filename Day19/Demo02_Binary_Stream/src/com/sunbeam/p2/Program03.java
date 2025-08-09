package com.sunbeam.p2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Program03 {
	public static void write(Employee e) {
		try (PrintStream out = new PrintStream("emp4.db")) {
			out.println(e.empid + "," + e.name + "," + e.salary);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static void read() {
		try (FileReader fr = new FileReader("emp4.db")) {
			int b;
			while ((b = fr.read()) != -1)
				System.out.print((char) b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Employee e1 = new Employee(1, "anil", 10000);
		// write(e1);
		read();
	}

}
