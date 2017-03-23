package com.minhld.heaps;

import com.minhld.binaries.Node;

public class testHeap extends Thread {
	public void run() {
		Heap heap = new Heap(100);
		int sKey = 0;
		for (int i = 0; i < 20; i++) {
			sKey = (int) (Math.random() * 100);
			heap.insert(sKey);
		}
		
		heap.display();
		
		Node root = heap.remove();
		System.out.println("deleted: " + root.key);
		
		heap.display();

		
	}
	
	public static void main(String args[]) {
		new testHeap().start();
	}
	
}
