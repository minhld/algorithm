package com.usu.structs.test;

public class test_all extends Thread {
	public void run() {
//		// 1.1
//		String s = "abcswrde";
//		boolean isUnique = isUniqueChars(s);
//		System.out.println("array is " + (isUnique ? "unique" : "not unique"));
		
//		// 1.2
//		String s1 = "abcade";
//		String s2 = "acbdae";
//		boolean isPermutation = isPermutation(s1, s2);
//		System.out.println("the two strings are " + (isPermutation ? "permuted" : "not permuted"));
		
		// 1.3
		String s = "tact coaaacceeee dff";
		boolean isPermutationOfPalindrome = isPermutationOfPalindrome(s);
		System.out.println("the string is " + (isPermutationOfPalindrome ? "" : "not ") + "a permutation of a palindrome");
	}
	
	/**
	 * solution 1.3
	 * 
	 * find if a string is a permutation of a palindrome
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPermutationOfPalindrome(String s) {
		int[] sChars = new int[128];
		
		int c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c != 32) sChars[c]++;
		}
		
		int numMidPoint = 0;
		for (int i = 0; i < sChars.length; i++) {
			if (sChars[i] % 2 == 1) {
				numMidPoint++;
				if (numMidPoint > 1) return false;
			}
		}
		
		return true;
	}
	
	/**
	 * solution 1.2
	 * check if the one string is a permutation of another
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean isPermutation(String s1, String s2) {
		int[] s1Chars = new int[128];
		
		for (int i = 0; i < s1.length(); i++) {
			s1Chars[s1.charAt(i)]++;
		}
		
		int c;
		for (int i = 0; i < s2.length(); i++) {
			c = s2.charAt(i);
			s1Chars[c]--;
			if (s1Chars[c] < 0) return false;
		}
		
		return true;
	}
	
	/**
	 * solution 1.1
	 * check if a string contains only unique characters 
	 * 
	 * @param str
	 * @return
	 */
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
