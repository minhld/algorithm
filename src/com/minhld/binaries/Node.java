package com.minhld.binaries;

public class Node {
	public int key; 
	public double data; 
	public Node lChild; 
	public Node rChild;
	
	public Node(int key, double data) {
		this.key = key;
		this.data = data;
	}

	public Node(int key) {
		this.key = key;
		this.data = (double) key;
	}
	
	public void displayNode() {
		
	} 
}
