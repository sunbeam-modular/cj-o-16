package com.sunbeam.p1;

import java.util.StringTokenizer;

public class Program01 {

	public static void main(String[] args) {
		String s1 = "India is my country";
		StringTokenizer stk1 = new StringTokenizer(s1); // by default the delimiter is space
		while (stk1.hasMoreTokens())
			System.out.println(stk1.nextToken());

		String s2 = "www.sunbeaminfo.com";
		StringTokenizer stk2 = new StringTokenizer(s2, "."); // delimiter is .(dot)
		while (stk2.hasMoreTokens())
			System.out.println(stk2.nextToken());
	}

}
