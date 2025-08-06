package com.sunbeam.p1;

import java.util.StringTokenizer;

public class Program02 {

	public static void main(String[] args) {
		String s2 = "www.sunbeaminfo.com/placements";
		StringTokenizer stk2 = new StringTokenizer(s2, "./"); // delimiter is .(dot) and also /
		while (stk2.hasMoreTokens())
			System.out.println(stk2.nextToken());
	}

}
