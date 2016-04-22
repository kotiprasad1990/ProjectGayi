package com.mani.gayi.ds.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedListDelete {

	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedListDelete() {
		size = 0;
	}

	private class Node {
		int element;
		Node next;
		Node prev;

		public Node(int element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(int element) {
		Node tmp = new Node(element, head, null);
		if (head != null) {
			head.prev = tmp;
		}
		head = tmp;
		if (tail == null) {
			tail = tmp;
		}
		size++;
	}

	public void addLast(int element) {
		Node tmp = new Node(element, null, tail);
		if (tail != null) {
			tail.next = tmp;
		}
		tail = tmp;
		if (head == null) {
			head = tmp;
		}
		size++;
	}

	public void iterateForward() {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.element + " ");
			tmp = tmp.next;
		}
	}

	public void iterateBackward() {
		Node tmp = tail;
		while (tmp != null) {
			System.out.print(tmp.element + " ");
			tmp = tmp.prev;
		}
	}

	public int removeFirst() {
		if (size == 0)
			throw new NoSuchElementException();

		Node tmp = head;
		head = head.next;
		head.prev = null;
		size--;

		return tmp.element;
	}

	public int removeLast() {
		if (size == 0)
			throw new NoSuchElementException();

		Node tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		return tmp.element;
	}

	public static void main(String a[]) {

		DoublyLinkedListDelete dll = new DoublyLinkedListDelete();
		System.out.println("Add 34 and 10 to the list.");
		dll.addFirst(10);
		dll.addFirst(34);
		System.out.println("Add 56 and 364 to the list.");
		dll.addLast(56);
		dll.addLast(364);

		System.out.print("Iterate the elements forward from Linked list : ");

		dll.iterateForward();
		System.out.println();

		System.out.println("Remove first element from the list: "
				+ dll.removeFirst());

		System.out.println("Remove last element from the list: "
				+ dll.removeLast());

		System.out.print("Iterate the elements Backward from Linked list : ");
		dll.iterateBackward();
	}
}
