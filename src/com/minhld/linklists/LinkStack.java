package com.minhld.linklists;

public class LinkStack {
	LinkList linkList;
	
	public LinkStack() {
		this.linkList = new LinkList();
	}
	
	public void push(Object val) {
		this.linkList.insertFirst(val);
	}
	
	public Object pop() {
		Link delLink = this.linkList.deleteFirst();
		return delLink.data;
	}
	
	public boolean isEmpty() {
		return linkList.isEmpty();
	}
	
}
