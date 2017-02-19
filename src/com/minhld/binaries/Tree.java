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

	public boolean delete(int key) {
		Node c = root, p = null;
		boolean isLeftChild = true;
		while (c != null && c.key != key) {
			if (key < c.key) {
				p = c;
				c = c.lChild;
				isLeftChild = true;
			} else if (key > c.key) {
				p = c;
				c = c.rChild;
				isLeftChild = false;
			}
		}
		
		if (c == null) {
			return false;
		}
		
		if (c.lChild == null && c.rChild == null) {
			if (p == null) {
				root = null;
			} else if (isLeftChild) {
				p.lChild = null;
			} else {
				p.rChild = null;
			}
		} else if (c.lChild != null && c.rChild == null) {
			if (p == null) {
				root.lChild = c.lChild;
			} else if (isLeftChild) {
				p.lChild = c.lChild;
			} else {
				p.rChild = c.lChild;
			}
		} else if (c.lChild == null && c.rChild != null) {
			if (p == null) {
				root.rChild = c.rChild;
			} else if (isLeftChild) {
				p.lChild = c.rChild;
			} else {
				p.rChild = c.rChild;
			}
		} else if (c.lChild != null && c.rChild != null) {
			Node successor = getSuccessor(c);
			if (p == null) {
				root = successor;
			} else if (isLeftChild) {
				p.lChild = successor;
			} else {
				p.rChild = successor;
			}
		}
		return true;
		
	}
	
	private Node getSuccessor(Node root) {
		Node p = root;
		Node c = root.rChild;
		while (c != null && c.lChild != null) {
			p = c;
			c = c.lChild;
		}
		return c;
	}
	
	public void displayInOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.lChild);
			System.out.print(root.key + " ");
			inOrder(root.rChild);
		}
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
