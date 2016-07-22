package com.mani.gayi.heap;

//A heap is stored in array level by level. 
//The topmost level contains root only. 
//It is mapped to the first element of an array (with index 0). 
//Root's children are mapped to the second and third elements and so on. 
//A heap is a complete binary tree, which guarantees, 
//that heap's nodes take up places in the array compactly, making the mapping quite efficient.
public class MinHeap {

	private int[] data;
	private int heapSize;

	public MinHeap(int size) {
		data = new int[size];
		heapSize = 0;
	}

	public int getMinimum() {
		if (isEmpty())
			throw new HeapException("Heap is empty");
		else
			return data[0];
	}

	public boolean isEmpty() {
		return (heapSize == 0);
	}

	private int getLeftChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 1;
	}

	private int getRightChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 2;
	}

	private int getParentIndex(int nodeIndex) {
		return (nodeIndex - 1) / 2;
	}

	public class HeapException extends RuntimeException {
		public HeapException(String message) {
			super(message);
		}
	}

	public void insert(int value) {
		if (heapSize == data.length)
			throw new HeapException("Heap's underlying storage is overflow");
		else {
			heapSize++;
			data[heapSize - 1] = value;
			siftUp(heapSize - 1);
		}
	}

	private void siftUp(int nodeIndex) {
		int parentIndex, tmp;
		if (nodeIndex != 0) {
			parentIndex = getParentIndex(nodeIndex);
			if (data[parentIndex] > data[nodeIndex]) {
				tmp = data[parentIndex];
				data[parentIndex] = data[nodeIndex];
				data[nodeIndex] = tmp;
				siftUp(parentIndex);
			}
		}
	}
}
