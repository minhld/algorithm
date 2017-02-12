package com.minhld.recursions;

public class BinarySearch extends Thread {
	private int[] arr;
	
	public void run() {
		arr = new int[] { 1, 3, 5, 7, 8, 9, 15, 21, 33, 35, 56, 68, 72, 83 };
		int key = 56;
		System.out.println("find " + key + " in array " + recursiveFind(key, 0, arr.length));
	}
	
	public int recursiveFind(int val, int f, int l) {
		int mid = (int) Math.floor((f + l) / 2);
		if (f <= l) {
			if (val == arr[mid]) {
				return val;
			} else if (val > arr[mid]) {
				return recursiveFind(val, mid + 1, l);
			} else if (val < arr[mid]) {
				return recursiveFind(val, f, mid - 1);
			}
		} else {
			return -1;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		new BinarySearch().start();
	}
}
