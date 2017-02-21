package com.minhld.hashes;

public class HashTable {
	private DataItem[] hashArray; 
	int arraySize;
	
	public HashTable(int arraySize) {
		this.arraySize = arraySize;
		this.hashArray = new DataItem[arraySize];
	}
	
	public void insert(int key) {
		DataItem newItem = new DataItem(key);
		int nIndex = hashFunc(key);
		while (this.hashArray[nIndex] != null && this.hashArray[nIndex].getKey() != -1) {
			nIndex++;
			nIndex %= arraySize;
		}
		this.hashArray[nIndex] = newItem;
	}
	
	public DataItem find(int key) {
		int nIndex = hashFunc(key);
		while (this.hashArray[nIndex] != null) {
			if (this.hashArray[nIndex].getKey() == key) {
				return this.hashArray[nIndex];
			} else {
				nIndex++;
				nIndex %= arraySize;
			}
		}
		return null;
	}
	
	public int hashFunc(int key) {
		return key % arraySize;
	}
}
