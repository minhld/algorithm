package com.minhld.linklists;

public class ListIterator {
	private LinkList parentList;
	private Link current;
	private Link previous;
	
	public ListIterator(LinkList list) {
		this.parentList = list;
	}
	
	public void reset() {
		this.current = parentList.getFirst();
		this.previous = null;
	}
	
	public void nextLink() {
		this.previous = current;
		this.current = current.next;
	}

	public Link getCurrent() {
		return this.current;
	}
	
	public boolean atEnd() {
		return this.current.next == null;
	}
	
	public void insertAfter(Object data) {
		Link newLink = new Link(data);
		if (current == null) {
			current = newLink;
			this.parentList.setFirst(current);
		} else {
			newLink.next = current.next;
			current.next = newLink;
		}
	}
	
	public void insertBefore(Object data) {
		Link newLink = new Link(data);
		newLink.next = current;
		current = newLink;
		
		if (previous != null) {
			previous.next = newLink;
		} else {
			parentList.setFirst(newLink);
		}
	}
	
	public Link deleteCurrent() {
		if (current != null) {
			previous.next = current.next;
			Link temp = current;
			current = previous;
			return temp;
		} else {
			
		}
		return null; // shouldn't be this case
	}
	
}
