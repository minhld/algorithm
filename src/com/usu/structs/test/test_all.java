package com.usu.structs.test;

public class test_all extends Thread {
	public void run() {
		// 1.1
		String s = "abcswrde";
		boolean isUnique = isUniqueChars(s);
		System.out.println("array is " + (isUnique ? "unique" : "not unique"));
		
		int a = 5;
		System.out.println(a << 2);
	}
	
	public boolean isUniqueChars(String str) {
		// assume that the string is in ASCII, so there
		// are less than 128 unique characters
		if (str.length() > 128) return false;
		
		boolean[] chars = new boolean[128];
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (!chars[c]) {
				chars[c] = true;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		new test_all().start();
	}
}
