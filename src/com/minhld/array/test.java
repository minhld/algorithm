package com.minhld.array;

public class test extends Thread {
	public void run() {
		// testHighArray();
		testOrderArray();	
	}

	public void testOrderArray() {
		OrderedArray arr = new OrderedArray();
		
		// add random values
		arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(01); arr.insert(66); arr.insert(33);
		arr.insert(72); 
		
		arr.displayItems();
		System.out.println();
		
		int val = 21;
		System.out.println("find " + val + ": " + arr.find(val));
		val = 22;
		System.out.println("find " + val + ": " + arr.find(val));
		
	}
	
	public void testHighArray() {
		HighArray arr = new HighArray(100);
		
		// add random values
		arr.insert(77); arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22); arr.insert(88); arr.insert(11); arr.insert(00); arr.insert(66); arr.insert(33);
		
		arr.displayItems();
		System.out.println();
		
		// find a value
		int val = 22;
		System.out.println("find value " + val + " in array: " + arr.find(val));
		System.out.println("delete value " + val + ": " + arr.delete(val));
		val = 33;
		System.out.println("delete value " + val + ": " + arr.delete(val));
		
		arr.displayItems();
	}
	
	public static void main(String args[]) {
		new test().start();
	}
}
