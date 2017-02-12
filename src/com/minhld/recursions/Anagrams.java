package com.minhld.recursions;

public class Anagrams extends Thread {
	public void run() {
		String text = "time";
		anagram(text, "");
		System.out.println();
	}
	
	private void anagram(String text, String ana) {
		if (text.length() == 1) {
			System.out.println(ana + text);
		} else {
			char c;
			String subText;
			for (int i = 0; i < text.length(); i++) {
				c = text.charAt(0);
				subText = text.substring(1);
				anagram(subText, ana + c);				
				text = subText + c;
			}
		}
	}
	
	
	public static void main(String args[]) {
		new Anagrams().start();
	}
}
