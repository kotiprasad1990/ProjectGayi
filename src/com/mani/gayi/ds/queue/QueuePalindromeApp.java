package com.mani.gayi.ds.queue;

import java.util.LinkedList;

public class QueuePalindromeApp {

	private static final int capacity = 3;
	Character arr[] = new Character[capacity];
	int size = 0;
	int top = -1;
	int rear = 0;

	public void enqueue(Character pushedElement) {
		if (top < capacity - 1) {
			top++;
			arr[top] = pushedElement;
		} else {
			System.out.println("Overflow !");
		}

	}

	public Character dequeue() {
		Character c = arr[rear];
		if (top >= rear) {
			rear++;
		} else {
			System.out.println("Underflow !");
		}
		return c;
	}

	private LinkedList<Character> linklist = new LinkedList<Character>();

	public void push(Character item) {
		linklist.addFirst(item);
	}

	public Character pop() {
		if (linklist.size() <= 0)
			System.out.println("Empty Stack");
		return linklist.removeFirst();
	}

	public Character top() {
		return linklist.getFirst();
	}

	boolean test(String candidate) {
		char ch;
		int length = candidate.length(), numLetters = 0, charCount;

		char fromStack, fromQueue;
		boolean stillPalindrome;

		for (int i = 0; i < length; i++) {
			ch = candidate.charAt(i);
			if (Character.isLetter(ch)) {
				numLetters++;
				ch = Character.toLowerCase(ch);
				push(ch);
				enqueue(ch);
			}
		}

		stillPalindrome = true;
		charCount = 0;
		while (stillPalindrome && (charCount < numLetters)) {
			fromStack = (Character) top();
			pop();
			fromQueue = dequeue();
			if (fromStack != fromQueue)
				stillPalindrome = false;
			charCount++;
		}

		return stillPalindrome;
	}

	public static void main(String[] args) {

		QueuePalindromeApp obj = new QueuePalindromeApp();
		String validatepal = "eye";
		System.out.println("Validate '" + validatepal
				+ "' is palindrome or not using queue");
		if (obj.test(validatepal))
			System.out.println("'" + validatepal + "' is a palindrome.");
		else
			System.out.println("'" + validatepal + "' is NOT a palindrome.");

		obj = null;
		obj = new QueuePalindromeApp();
		validatepal = "Hello";
		System.out.println("\n\nValidate '" + validatepal
				+ "' is palindrome or not using queue");
		if (obj.test(validatepal))
			System.out.println("'" + validatepal + "' is a palindrome.");
		else
			System.out.println("'" + validatepal + "' is NOT a palindrome.");

	}

}
