package com.minhld.stackqueue;

public class Queue {
	int length = 0;
	Object[] queueArray;
	int front, rear;
	
	public Queue(int length) {
		this.length = length;
		this.queueArray = new Object[length];
		this.front = 0;
		this.rear = -1;
	}
	
	public void insert(Object val) {
		if (isFull()) {
			System.err.println("can't insert!");
			return;
		}
		
		if (rear == length - 1) {
			rear = -1;
		}
		
		queueArray[++rear] = val;
	}
	
	public Object remove() {
		Object rmvObj = queueArray[front++];
		if (front == length) {
			front = 0;
		}
		return rmvObj;
	}
	
	public Object peek() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (front - rear == 1) || (front - rear == -(length - 1));
	}
	
	public boolean isFull() {
		return (front - rear == 2) || (front - rear == -(length - 2));
	}
	
	public int size() {
		if (rear >= front) {
			return rear - front + 1;
		} else {
			return length - (front - rear) + 1;
		}
	}
}
