package com.danaboyina;

public class StringReverse1 {

	public static void main(String[] args) {
		System.out.println(reverseMethod1("Narahari Krishna"));
	}

	private static String reverseMethod1(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}
