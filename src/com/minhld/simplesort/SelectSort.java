package com.minhld.simplesort;

public class SelectSort {
	private long[] arr;
	private int nElems = 0;
	
	public SelectSort(int maxElems) {
		arr = new long[maxElems];
	}
	
	public void insert(long val) {
		arr[nElems++] = val;
	}
	
	public long sort() {
		long st = System.currentTimeMillis();
		int minPos;
		long temp;
		for (int i = 0; i < nElems - 1; i++) {
			minPos = i;
			for (int j = i + 1; j < nElems; j++) {
				if (arr[minPos] > arr[j]) {
					minPos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
		return System.currentTimeMillis() - st;		
	}
	
	public void printArray() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
