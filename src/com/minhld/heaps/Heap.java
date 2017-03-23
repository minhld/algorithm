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
		
		trickleUp(this.N - 1);
		
		return true;
	}
	
	private void trickleUp(int index) {
		int cPos = index;
		int pPos = (cPos - 1) / 2; 
		int bottomKey = this.heapArray[index].key;
		
		while (cPos > 0 && this.heapArray[pPos].key < bottomKey) {
			this.heapArray[cPos].key = this.heapArray[pPos].key;
			cPos = pPos;
			pPos = (pPos - 1) / 2;
		}
		
		this.heapArray[cPos].key = bottomKey;
	}
	
	public Node remove() {
		if (N == 0) return null;
		
		Node root = heapArray[0];
		heapArray[0] = heapArray[--N];
		
		trickleDown(0, heapArray[0].key);
		
		return root;
	}
	
	private void trickleDown(int index, int rootValue) {
		int lChild = 2 * index + 1;
		int rChild = lChild + 1;
		
		if (rChild < N && heapArray[lChild].key < heapArray[rChild].key) {
			heapArray[index].key = heapArray[rChild].key;
			trickleDown(rChild, rootValue);
		} else if (rChild < N && heapArray[lChild].key > heapArray[rChild].key) {
			heapArray[index].key = heapArray[lChild].key;
			trickleDown(lChild, rootValue);
		} else if (lChild < N && rootValue < heapArray[lChild].key) {
			heapArray[index].key = heapArray[lChild].key;
			trickleDown(lChild, rootValue);
		} else {
			heapArray[index].key = rootValue;
		}		
	}
	
	public void display() {
		int lineCnt = 1, itemCnt = 0;
		for (int i = 0; i < N; i++) {
			System.out.print(this.heapArray[i].key + " ");
			if (++itemCnt == (int)Math.pow(2, lineCnt) - 1) {
				System.out.println();
				lineCnt++;
			}
		}
		System.out.println();
	}
}
