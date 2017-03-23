package com.minhld.linklists;

public class testLink extends Thread {
	public void run() {
		// testLinkList();
		testSortedList();
	}
	
	public void testIterator() {
		LinkList list = new LinkList();
		ListIterator iter = list.getIterator();
		// Link aLink = iter.getCurrent();
		iter.nextLink();
		
	}
	
	public void testSortedList() {
		SortedList list = new SortedList();
		list.insert(5);
		list.insert(7);
		list.insert(3);
		list.insert(9);
		list.insert(11);
		list.insert(1);
		
		System.out.print("full list: ");
		list.displayList();
		System.out.println();
		
		list.delete();
		list.delete();
		
		System.out.print("cut-out list: ");
		list.displayList();
	}
	
	public void testLinkList() {
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
