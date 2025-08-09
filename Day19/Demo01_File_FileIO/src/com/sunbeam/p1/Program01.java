package com.sunbeam.p1;

import java.io.File;

public class Program01 {

	public static void main(String[] args) {
		String dirpath = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19";
		String filepath = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/Day20_Help.MD";
		File file1 = new File(dirpath);
		if (file1.exists())
			System.out.println("Directory exists");
		else
			System.out.println("Directory does not exists");

		File file2 = new File(filepath);
		if (file2.exists())
			System.out.println("File exists");
		else
			System.out.println("File does not exists");

	}

}
