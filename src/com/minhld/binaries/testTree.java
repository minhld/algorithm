package com.minhld.binaries;

public class testTree extends Thread {
	public void run() {
		Tree t = new Tree();
		t.insert(5);
		t.insert(3);
		t.insert(8);
		t.insert(2);
		t.insert(4);
		t.insert(7);
		t.insert(11);
		
		t.display();
	}
	
	public static void main(String args[]) {
		new testTree().start();
	}
}
