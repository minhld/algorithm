package com.minhld.binaries;

import com.minhld.stackqueue.Queue;

public class Tree {
	private Node root;
	
	public Node find(int key) {
		Node c = root;
		while (c != null) {
			if (key == c.key) {
				return c;
			} else if (key < c.key) {
				c = c.lChild;
			} else {
				c = c.rChild;
			}
		}
		return null; 	// not found
	}

	public void insert(int key) {
		Node ins = new Node(key);
		Node c = root;
		if (c == null) {
			root = ins;
			return;
		}
		
		Node p;
		while (c != null) {
			p = c;
			if (key < c.key) {
				c = c.lChild;
				if (c == null) {
					p.lChild = ins;
					return;
				}
			} else {
				c = c.rChild;
				if (c == null) {
					p.rChild = ins;
					return;
				}
			}
		}
	}

	public void delete(int iKey) {
	
	}
	
	public void display() {
		if (root == null) {
			System.out.println("tree is empty");
		}
		
		Queue q = new Queue(100);
		q.insert(root);
		
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
