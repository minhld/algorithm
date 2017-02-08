package com.minhld.simplesort;

public class BubbleSort {
	private long[] arr;
	private int nElems = 0;
	
	public BubbleSort(int maxElems) {
		arr = new long[maxElems];
	}
	
	public void insert(long val) {
		arr[nElems++] = val;
	}
	
	public long sort() {
		long st = System.currentTimeMillis();
		long temp;
		for (int i = nElems - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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
