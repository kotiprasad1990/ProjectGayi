package com.mani.gayi.ds.stack;

public class SingleArray3Stack {

	int stacksize = 300;

	int[] buffer = new int[stacksize * 3];

	int[] stackpointer = { 0, 0, 0 };

	public void push(int stackNum, int value) {
		int index = stackNum * stacksize + stackpointer[stackNum] + 1;
		stackpointer[stackNum]++;
		buffer[index] = value;
	}

	public int pop(int stackNum) {
		int index = stackNum * stacksize + stackpointer[stackNum];
		stackpointer[stackNum]--;
		int value = buffer[index];
		buffer[index] = 0;
		return value;
	}

	public int peek(int stackNum) {
		int index = stackNum * stacksize + stackpointer[stackNum];
		return buffer[index];
	}

	public boolean isBoolean(int stackNum) {
		return stackpointer[stackNum] == stackNum * stacksize;
	}

	public void display(int stackNum) {

	}

	public static void main(String[] args) {
		SingleArray3Stack obj = new SingleArray3Stack();

		obj.push(0, 12);
		System.out.println("Push to Stack 1 :" + obj.peek(0));
		obj.push(0, 48);
		System.out.println("Push to Stack 1 :" + obj.peek(0));
		obj.push(0, 86);
		System.out.println("Push to Stack 1 :" + obj.peek(0));
		System.out.println();

		obj.push(1, 45);
		System.out.println("Push to Stack 2 :" + obj.peek(1));
		obj.push(1, 23);
		System.out.println("Push to Stack 2 :" + obj.peek(1));
		obj.push(1, 34);
		System.out.println("Push to Stack 2 :" + obj.peek(1));
		System.out.println();
		obj.push(2, 9);
		System.out.println("Push to Stack 3 :" + obj.peek(2));
		obj.push(2, 67);
		System.out.println("Push to Stack 3 :" + obj.peek(2));
		obj.push(2, 22);
		System.out.println("Push to Stack 3 :" + obj.peek(2));
		System.out.println();
		System.out.println();

		System.out.println("Pop from Stack 1 : " + obj.pop(0));
		System.out.println("Pop from Stack 1 : " + obj.pop(0));
		System.out.println("Pop from Stack 1 : " + obj.pop(0));
		System.out.println();
		System.out.println("Pop from Stack 2 : " + obj.pop(1));
		System.out.println("Pop from Stack 2 : " + obj.pop(1));
		System.out.println("Pop from Stack 2 : " + obj.pop(1));
		System.out.println();
		System.out.println("Pop from Stack 3 : " + obj.pop(2));
		System.out.println("Pop from Stack 3 : " + obj.pop(2));
		System.out.println("Pop from Stack 3 : " + obj.pop(2));

	}

}
