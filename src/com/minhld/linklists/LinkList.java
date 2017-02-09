package com.minhld.linklists;

public class LinkList {
	private Link first;
	
	public LinkList() {
		this.first = null;
	}
	
	public void insertFirst(Object data) {
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link find(Object key) {
		Link iter = first;
		while (iter != null) {
			if (iter.data == key) {
				return iter;
			}
			iter = iter.next;
		}
		return null;
	}
	
	public Link delete(Object key) {
		Link pre = null;
		Link iter = first;
		
		while (iter != null) {
			if (iter.data == key) {
				if (pre == null) {
					return deleteFirst();
				} else {
					pre.next = iter.next;
					return iter;
				}
			}
			pre = iter;
			iter = iter.next;
		}
		
		return null;
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
