package com.mani.gayi.ds.linkedlist;

class SplitCircularListNode {
	private int value;
	private SplitCircularListNode previous;
	private SplitCircularListNode next;

	public SplitCircularListNode(int v) {
		this.value = v;
		this.previous = null;
		this.next = null;
	}

	public void setPrevious(SplitCircularListNode prev) {
		this.previous = prev;
	}

	public void setNext(SplitCircularListNode n) {
		this.next = n;
	}

	public int getValue() {
		return this.value;
	}

	public SplitCircularListNode getNext() {
		return this.next;
	}

	public SplitCircularListNode getPrevious() {
		return this.previous;
	}
}

public class SplitCircularList {

	public static void main(String args[]) {
		CreateCircularList ll = new CreateCircularList();

		System.out
				.println("Create circular linked list which head pointer next node point to tail node of the list");
		SplitCircularListNode head = ll.createList(7, 1);
		System.out.print("Display circualr linked list: ");
		ll.displayCircularList(head);

		System.out.println("Split the circular list ");
		SplitCircularListNode secondHead = ll.splitList(head);

		System.out.print("Display first list: ");
		ll.displayCircularList(head);

		System.out.print("Display second list: ");
		ll.displayCircularList(secondHead);
	}
}

class CreateCircularList {

	public SplitCircularListNode createList(int length, int data) {
		SplitCircularListNode head = new SplitCircularListNode(data++);
		SplitCircularListNode pointer = head;
		for (int i = 1; i < length; i++) {
			SplitCircularListNode temp = new SplitCircularListNode(data++);
			pointer.setNext(temp);
			pointer = temp;
		}
		pointer.setNext(head);
		return head;
	}

	public void displayCircularList(SplitCircularListNode head) {
		SplitCircularListNode temp = head;
		while (temp.getNext() != head) {
			System.out.print(temp.getValue() + "->");
			temp = temp.getNext();
		}
		System.out.println(temp.getValue());
	}

	public SplitCircularListNode splitList(SplitCircularListNode head) {
		SplitCircularListNode tortoisePointer = head;
		SplitCircularListNode harePointer = head.getNext();

		while (harePointer != head && harePointer.getNext() != head) {
			harePointer = harePointer.getNext().getNext();
			tortoisePointer = tortoisePointer.getNext();
		}
		SplitCircularListNode secondHead = tortoisePointer.getNext();
		tortoisePointer.setNext(head);
		SplitCircularListNode temp = secondHead;
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}
		temp.setNext(secondHead);
		return secondHead;
	}
}
