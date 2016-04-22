package com.mani.gayi.ds.linkedlist;

public class FindmiddleElement {

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = linkedList.head();
		linkedList.add(new LinkedList.Node("11"));
		linkedList.add(new LinkedList.Node("78"));
		linkedList.add(new LinkedList.Node("45"));
		linkedList.add(new LinkedList.Node("34"));
		linkedList.add(new LinkedList.Node("57"));

		System.out.print("Linked List items: ");
		LinkedList.Node current = head;
		int length = 0;
		LinkedList.Node middle = head;

		while (current.next() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			System.out.print(current.data() + "->");
			current = current.next();
		}

		System.out.println(current.data() + "->NULL");

		if (length % 2 == 1) {
			middle = middle.next();
		}

		System.out.println("Length of Linked List: " + length);
		System.out.println("Middle element of Linked List : " + middle);

	}
}

class LinkedList {
	private Node head;
	private Node tail;

	public LinkedList() {
		this.head = new Node("head");
		tail = head;
	}

	public Node head() {
		return head;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		public String data() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {
			return this.data;
		}
	}
}
