package com.mani.gayi.ds.queue;

import java.util.Arrays;
import java.util.Stack;

public class QueueMaxMin extends Stack<Integer> {
	private static final long serialVersionUID = 1L;
	private Stack<Integer> minStack = null;
	private Stack<Integer> maxStack = null;

	public QueueMaxMin() {
		minStack = new Stack<Integer>();
		maxStack = new Stack<Integer>();
	}

	public void push(int value) {
		if (value <= min()) {
			minStack.push(value);
		}

		if (value >= max()) {
			maxStack.push(value);
		}

		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();

		if (value == min()) {
			minStack.pop();
		}

		if (value == max()) {
			maxStack.pop();
		}

		return value;
	}

	public int min() {
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return minStack.peek();
		}
	}

	public int max() {
		if (maxStack.isEmpty()) {
			return Integer.MIN_VALUE;
		} else {
			return maxStack.peek();
		}
	}

	public void display() {
		Stack<Integer> l = new Stack<Integer>();
		l.addAll(minStack);
		l.addAll(maxStack);
		if (!l.isEmpty())
			System.out.println("Itmes in the Stack: "
					+ Arrays.toString(l.toArray()));

	}

	public static void main(String[] args) {
		int[] array = { 12, 1, 56, 34, 78, 99, 11 };
		QueueMaxMin obj = new QueueMaxMin();
		for (int i : array)
			obj.push(i);

		obj.display();
		System.out.println("Minimum item from the stack:" + obj.min());
		System.out.println("Maximum item from the stack:" + obj.max());

	}
}
