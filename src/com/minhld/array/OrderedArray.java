package com.minhld.array;

public class OrderedArray {
	private long[] arr;
	private int nElems = 0;
	
	public OrderedArray() {
		int maxLength = 1000;
		arr = new long[maxLength];
	}
	
	public OrderedArray(int maxLength) {
		arr = new long[maxLength];
	}
	
	public void insert(long val) {
		int insertIndex = 0;
		
		// search for insert index
		while (insertIndex < nElems && val > arr[insertIndex]) {
			insertIndex++;
		}
		
		// move the bigger values backward
		for (int i = nElems - 1; i >= insertIndex; i--) {
			arr[i + 1] = arr[i];
		}

		// insert
		arr[insertIndex] = val;

		nElems++;
	}
	
	public int size() {
		return nElems;
	}
	
	public boolean find(long val) {
		int f = 0, l = nElems - 1;
		int mid = (int) Math.floor((f + l) / 2);
		while (f < l) {
			if (val == arr[mid]) {
				return true;
			} else if (val > arr[mid]) {
				f = mid + 1;
			} else if (val < arr[mid]) {
				l = mid - 1;
			}
			// recalculate the mid point
			mid = (int) Math.floor((f + l) / 2);
		}
		return false;
	}
	
	public boolean delete(long val) {
		return false;
	}

	public void displayItems() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
