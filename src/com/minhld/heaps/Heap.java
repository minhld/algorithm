package com.minhld.heaps;

import com.minhld.binaries.Node;
import com.minhld.stackqueue.Queue;

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
		int pKey = 0;
		while (pPos >= 0 && this.heapArray[pPos].key < this.heapArray[cPos].key) {
			pKey = this.heapArray[pPos].key;
			this.heapArray[pPos].key = this.heapArray[cPos].key;
			cPos = pPos;
			pPos = (cPos - 1) / 2;
		}
		this.heapArray[index].key = pKey;
	}
	
	public Node remove(int key) {
		return null;
	}
	
	private void trickleDown(int index) {

	}
	
	public void display() {
//		if (root == null) {
//			System.out.println("tree is empty");
//		}
		
		Queue q = new Queue(100);
//		q.insert(root);
		
		Node c;
		int qSize = q.size();
		int cnt = 0;
		while (!q.isEmpty()) {
			while (cnt < qSize) {
				c = (Node) q.remove();
				
				System.out.print(c.key + " ");
				
				if (c.lChild != null) {
					q.insert(c.lChild);
				}
				
				if (c.rChild != null) {
					q.insert(c.rChild);
				}
				cnt++;
			}
			System.out.println();
			cnt = 0;
			qSize = q.size();
		}
	}
}
