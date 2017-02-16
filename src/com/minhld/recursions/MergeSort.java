package com.minhld.recursions;

public class MergeSort {
	private long[] arr;
	private int nElems = 0;
	
	public MergeSort(int maxElems) {
		arr = new long[maxElems];
	}
	
	public void insert(long val) {
		arr[nElems++] = val;
	}
	
	public void sort(int l, int u) {
		if (l == u) {
			return;
		} else {
			int subSize = (int) Math.floor((l + u) / 2);
			sort(l, subSize);
			sort(subSize + 1, u);
			merge(l, subSize, u);
		}
	}
	
	public void merge(int l, int s, int u) {
		long[] mergeArr = new long[u - l + 1];
		int mIdx = 0;
		int cArr1 = l, cArr2 = s + 1;
		while (cArr1 <= s && cArr2 <= u) {
			if (arr[cArr1] < arr[cArr2]) {
				mergeArr[mIdx++] = arr[cArr1++];
			} else {
				mergeArr[mIdx++] = arr[cArr2++];
			}
		}
		if (cArr1 > s) {
			while (cArr2 <= u) {
				mergeArr[mIdx++] = arr[cArr2++];
			}
		} else if (cArr2 > u) {
			while (cArr1 <= s) {
				mergeArr[mIdx++] = arr[cArr1++];
			}
		}
		
		for (int i = 0; i < (u - l + 1); i++) {
			arr[l + i] = mergeArr[i];
		}
	}
	
	public void printArray() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
