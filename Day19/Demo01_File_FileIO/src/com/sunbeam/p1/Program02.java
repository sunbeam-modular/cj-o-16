package com.sunbeam.p1;

import java.io.File;
import java.io.IOException;

public class Program02 {

	public static void main(String[] args) {
		String dirpath = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test";
		String filepath1 = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test/one.txt";
		String filepath2 = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test/two.txt";
		File file1 = new File(dirpath);

//		if (file1.mkdir()) // create a new directory
//			System.out.println("Directory created");
//		else
//			System.out.println("Directory not created");

		// File file2 = new File(filepath1);
		File file2 = new File(filepath2);
		try {
			if (file2.createNewFile()) {
				System.out.println("File created");
			} else
				System.out.println("File not created");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
