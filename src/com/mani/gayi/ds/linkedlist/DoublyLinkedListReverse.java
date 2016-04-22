package com.mani.gayi.ds.linkedlist;

class DoublyLinkedListNode {
	private int value;
	private DoublyLinkedListNode previous;
	private DoublyLinkedListNode next;

	public DoublyLinkedListNode(int v) {
		this.value = v;
		this.previous = null;
		this.next = null;
	}

	public void setPrevious(DoublyLinkedListNode prev) {
		this.previous = prev;
	}

	public void setNext(DoublyLinkedListNode n) {
		this.next = n;
	}

	public int getValue() {
		return this.value;
	}

	public DoublyLinkedListNode getNext() {
		return this.next;
	}

	public DoublyLinkedListNode getPrevious() {
		return this.previous;
	}
}

public class DoublyLinkedListReverse {
	private static DoublyLinkedListNode tail = null;
	private static DoublyLinkedListNode head = null;

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(i);
			if (head == null) {
				head = node;
				tail = node;
			}
			if (i != 0) {
				tail.setNext(node);
				node.setPrevious(tail);
				tail = node;
			}
		}
		printList(head);

		System.out.println("");
		System.out.println("Reversing the list");

		printList(reverseList(head));
	}

	private static DoublyLinkedListNode reverseList(DoublyLinkedListNode head) {
		DoublyLinkedListNode start = head;
		DoublyLinkedListNode temp = null;

		while (head != null) {
			temp = head.getNext();
			head.setNext(head.getPrevious());
			head.setPrevious(temp);

			if (head.getPrevious() == null) {
				head.setPrevious(start);
				break;
			}
			head = head.getPrevious();
		}
		return head;
	}

	private static void printList(DoublyLinkedListNode head) {
		System.out.print("List : ");
		while (head != null) {
			System.out.print(head.getValue() + "->");
			head = head.getNext();
		}
		System.out.print("NULL");
	}
}
