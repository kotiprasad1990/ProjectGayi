package com.mani.gayi.ds.stack;

public class MyDynamicStack {

	private int stackSize;
	private int[] stackArr;
	private int top;

	public MyDynamicStack(int size) {
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	public void push(int entry) {
		if (this.isStackFull()) {
			System.out.println(("Stack is full! Double the size"));
			this.increaseStackCapacity();
		}
		System.out.println("Push the element: " + entry);
		this.stackArr[++top] = entry;
	}

	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}

	public long peek() {
		return stackArr[top];
	}

	private void increaseStackCapacity() {

		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.stackSize = this.stackSize * 2;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public static void main(String[] args) {
		int STACK_SIZE = 5;
		MyDynamicStack stack = new MyDynamicStack(STACK_SIZE);

		System.out.println("Stack Size: " + STACK_SIZE);

		for (int i = 0; i <= STACK_SIZE; i++) {

			stack.push(i);
		}
		for (int i = 0; i < STACK_SIZE - 2; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
