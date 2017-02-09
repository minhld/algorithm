package com.minhld.linklists;

public class Link {
	public Object data;
	public Link next;
	
	public Link(Object data) {
		this.data = data;
	}
	
	public void displayLink() {
		System.out.print("{" + data + "}");
	}
}
