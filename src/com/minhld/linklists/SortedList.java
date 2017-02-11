package com.minhld.linklists;

public class SortedList {
	private Link first;
	
	public SortedList() {
		this.first = null;
	}
	
	public void insert(Object data) {
		Link pre = null;
		Link iter = first;
		while (iter != null) {
			if ((int) data > (int) iter.data) {
				pre = iter;
				iter = iter.next;
			} else {
				break;
			}
		}
		
		Link newLink = new Link(data);
		if (pre == null) {
			newLink.next = first;
			first = newLink;
		} else {
			pre.next = newLink;
			newLink.next = iter;
		}
	}
	
	public Link delete() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public void displayList() {
		Link iter = first;
		while (iter != null) {
			iter.displayLink();
			iter = iter.next;
		}
	}
}
