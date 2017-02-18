package com.minhld.recursions;

public class testMergeSort extends Thread {
	public void run() {
		int maxLength = 100;
		MergeSort merge = new MergeSort(maxLength);
		for (int i = 0; i < maxLength; i++) {
			merge.insert((long) (Math.random() * 1000));
		}
		System.out.println("original array:");
		merge.printArray();
		
		merge.sort(0, maxLength - 1);

		System.out.println("after merge sorted:");
		merge.printArray();
		
	}
	
	public static void main(String args[]) {
		new testMergeSort().start();
	}
}
