package com.minhld.stackqueue;

public class Stack {
	int length = 0;
	Object[] stackArray;
	int top;
	
	public Stack(int length) {
		this.length = length;
		this.stackArray = new Object[length];
		this.top = -1;
	}
	
	public void push(Object val) {
		if (isFull()) {
			System.err.println("can't push!");
			return;
		}
		stackArray[++top] = val;
	}
	
	public Object pop() {
		return stackArray[top--];
	}
	
	public Object peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == length - 1;
	}
}
