package com.mani.gayi.ds.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStack<Item> {

	private Stack<Item> stack1 = null;
	private Stack<Item> stack2 = null;

	public QueueUsingStack() {
		stack1 = new Stack<Item>();
		stack2 = new Stack<Item>();
	}

	private void moveStack1ToStack2() {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public int size() {
		return stack1.size() + stack2.size();
	}

	public Item peek() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");

		if (stack2.isEmpty())
			moveStack1ToStack2();
		return stack2.peek();
	}

	public void enqueue(Item item) {
		stack1.push(item);
	}

	public void display() {
		if (!stack1.isEmpty())
			System.out.println(Arrays.toString(stack1.toArray()));

		if (!stack2.isEmpty())
			System.out.println(Arrays.toString(stack2.toArray()));
	}

	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");

		if (stack2.isEmpty())
			moveStack1ToStack2();

		return stack2.pop();
	}

	public static void main(String[] args) {

		QueueUsingStack<String> q = new QueueUsingStack<String>();
		String[] array = { "hello", "kid", "test" };

		System.out.println("Enqueue itmes to the queue: "
				+ Arrays.toString(array));
		for (String str : array)
			q.enqueue(str);

		System.out.println("Size of the Queue: " + q.size());
		System.out.print("Items in the Queue: ");
		q.display();

		System.out.println("Dequeue itme from queue: " + q.dequeue());
		System.out.println("Dequeue itme from queue: " + q.dequeue());

		System.out.print("Items in the Queue: ");
		q.display();
	}
}
