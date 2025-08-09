package com.sunbeam.p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program04 {

	public static void main(String[] args) {
		String srcFilepath = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/Day19_Help.MD";
		String destFilepath = "D:/Training/Courses/Modular/CJ-O-16/cj-o-16/Day19/test2.txt";

		try (FileInputStream fis = new FileInputStream(srcFilepath)) {
			try (FileOutputStream fos = new FileOutputStream(destFilepath)) {
				int b;
				while ((b = fis.read()) != -1) {
					fos.write(b);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
