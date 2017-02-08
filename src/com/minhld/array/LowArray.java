package com.minhld.array;

public class LowArray {
	private long[] arr;
	
	public LowArray(int length) {
		arr = new long[length];
	}
	
	public void setElem(int index, long val) {
		arr[index] = val;
	}
	
	public long getElem(int index) {
		return arr[index];
	}
}
