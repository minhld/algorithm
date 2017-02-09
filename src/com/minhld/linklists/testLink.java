package com.minhld.linklists;

public class testLink extends Thread {
	public void run() {
		LinkList list = new LinkList();
		list.insertFirst(5);
		list.insertFirst(7);
		list.insertFirst(3);
		list.insertFirst(9);
		list.insertFirst(11);
		list.insertFirst(1);
		
		System.out.print("full list: ");
		list.displayList();
		System.out.println();
		
		Object key = 11;
		System.out.println("find " + key + ": " + list.find(key));
		
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteFirst();
		
		list.delete(key);
		key = 5;
		list.delete(key);
		key = 1;
		list.delete(key);

		System.out.print("cut-out list: ");
		list.displayList();
		
	}
	
	public static void main(String args[]) {
		new testLink().start();
	}
}
