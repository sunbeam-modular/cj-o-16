package com.sunbeam.p1;

import java.io.File;

public class Program03 {

	public static void main(String[] args) {
		String dirpath = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test";
		String filepath1 = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test/one.txt";
		String filepath2 = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test/two.txt";
		// File file1 = new File(filepath2);
		// File file1 = new File(filepath1);
		File file1 = new File(dirpath);

		if (file1.delete())
			System.out.println("deleted...");
		else
			System.out.println("delete failed...");

	}
}
