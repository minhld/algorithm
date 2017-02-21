package com.minhld.heaps;

import com.minhld.binaries.Node;

public class Heap {
	private Node heapArray[];
	private int maxLength;
	private int N;
	
	public Heap(int maxLength) {
		this.maxLength = maxLength;
		this.heapArray = new Node[maxLength];
		this.N = 0;
	}
	
	public boolean insert(int key) {
		if (this.N == this.maxLength) {
			return false;
		}
		this.heapArray[N++] = new Node(key);
		
		trickleUp(this.N);
		
		return true;
	}
	
	private void trickleUp(int index) {
		int cPos = index;
		int pPos = (cPos - 1) / 2; // (int) Math.floor((cPos - 1) / 2);
		int pKey = 0;
		while (pPos >= 0 && this.heapArray[pPos].key < this.heapArray[cPos].key) {
			pKey = this.heapArray[pPos].key;
			this.heapArray[pPos].key = this.heapArray[cPos].key;
			cPos = pPos;
			pPos = (cPos - 1) / 2; //(int) Math.floor((cPos - 1) / 2);
		}
		this.heapArray[index].key = pKey;
	}
	
	public Node remove(int key) {
		return null;
	}
	
	private void trickleDown(int index) {
		
	}
}
