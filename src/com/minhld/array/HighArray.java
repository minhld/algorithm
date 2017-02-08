package com.minhld.array;

public class HighArray {
	private long[] arr;
	private int nElems;
	
	public HighArray(int maxLength) {
		arr = new long[maxLength];
		for (int i = 0; i < maxLength; i++) {
			arr[i] = -1;	// non-exist values
		}
	}
	
	public void insert(long val) {
		arr[nElems++] = val;
	}
	
	public boolean find(long val) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i] == val) return true;
		}
		return false;
	}
	
	/**
	 * move higher one to one step down
	 * 
	 * @param val
	 * @return
	 */
	public boolean delete(long val) {
		// find the delete index
		int delIndex = -1;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] == val) {
				delIndex = i;
				break;
			}
		}
		
		// item not found
		if (delIndex == -1) return false;
		
		// item found
		if (delIndex == nElems - 1) {
			// the deleted item is at the last
			arr[delIndex] = -1;
			
		} else {
			// the deleted item is at somewhere at the middle
			for (int i = delIndex; i < nElems; i++) {
				arr[i] = arr[i + 1];
			}
		}
		nElems--;
		return true;
	}
	
	public void displayItems() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
