package com.minhld.simplesort;

public class test extends Thread {
	public void run() {
		testBubble();
		testSelect();
		testInsert();
	}
	
	public void testInsert() {
		InsertSort ss = new InsertSort(100);
		int randLength = 100, val;
		for (int i = 0; i < randLength; i++) {
			val = (int) (Math.random() * 100);
			ss.insert(val);
		}
		ss.printArray();
		long dur = ss.sort();
		ss.printArray();
		System.out.println("duration: " + dur + "ms");	
	}
	
	public void testSelect() {
		SelectSort ss = new SelectSort(100);
		int randLength = 100, val;
		for (int i = 0; i < randLength; i++) {
			val = (int) (Math.random() * 100);
			ss.insert(val);
		}
		ss.printArray();
		long dur = ss.sort();
		ss.printArray();
		System.out.println("duration: " + dur + "ms");		
	}
	
	public void testBubble() {
		BubbleSort bs = new BubbleSort(100);
		int randLength = 100, val;
		for (int i = 0; i < randLength; i++) {
			val = (int) (Math.random() * 100);
			bs.insert(val);
		}
		bs.printArray();
		long dur = bs.sort();
		bs.printArray();
		System.out.println("duration: " + dur + "ms");		
	}
	
	public static void main(String args[]) {
		new test().start();
	}
}
