package com.minhld.hashes;

public class testHash extends Thread {
	
	public void run() {
		HashTable hash = new HashTable(100);
		hash.insert(1);
		hash.insert(101);
		hash.insert(102);
	}
	
	public static void main(String args[]) {
		new testHash().start();
	}
}
