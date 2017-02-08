package com.minhld.simplesort;

public class InsertSort {
	private long[] arr;
	private int nElems = 0;
	
	public InsertSort(int maxElems) {
		arr = new long[maxElems];
	}
	
	public void insert(long val) {
		arr[nElems++] = val;
	}
	
	public long sort() {
		long st = System.currentTimeMillis();
		int gPos;
		long temp;
		for (int i = 0; i < nElems - 1; i++) {
			gPos = i + 1;
			temp = arr[gPos];
			while (gPos > 0 && temp < arr[gPos - 1]) {
				arr[gPos] = arr[gPos - 1];
				gPos--;
			}
			arr[gPos] = temp;
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
