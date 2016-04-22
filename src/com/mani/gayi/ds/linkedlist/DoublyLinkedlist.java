package com.mani.gayi.ds.linkedlist;

class DoublyNode {
	public int data;
	public DoublyNode next;
	public DoublyNode previous;

	public DoublyNode(int d) {
		data = d;
	}

	public void displayLink() {
		System.out.print(data);
	}
}

public class DoublyLinkedlist {

	private DoublyNode first;
	private DoublyNode last;

	public DoublyLinkedlist() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int dd) {
		DoublyNode newNode = new DoublyNode(dd);

		if (isEmpty())
			last = newNode;
		else
			first.previous = newNode;

		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int dd) {
		DoublyNode newNode = new DoublyNode(dd);

		if (isEmpty())
			first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}

		last = newNode;
	}

	public DoublyNode deleteFirst() {
		DoublyNode temp = first;

		if (first.next == null)
			last = null;
		else
			first.next.previous = null;

		first = first.next;
		return temp;
	}

	public DoublyNode deleteLast() {
		DoublyNode temp = last;

		if (first.next == null)
			first = null;
		else
			last.previous.next = null;

		last = last.previous;
		return temp;
	}

	public boolean insertAfter(long key, int dd) {
		DoublyNode current = first;

		while (current.data != key) {
			current = current.next;

			if (current == null)
				return false;
		}

		DoublyNode newNode = new DoublyNode(dd);

		if (current == last) {
			newNode.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}

		newNode.previous = current;
		current.next = newNode;
		return true;
	}

	public DoublyNode deleteItem(long key) {
		DoublyNode current = first;

		while (current.data != key) {
			current = current.next;

			if (current == null)
				return null;
		}

		if (current == first)
			first = current.next;
		else
			current.previous.next = current.next;

		if (current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;

		return current;
	}

	public void display() {
		System.out.print("List : ");
		DoublyNode current = first;
		while (current != null) {
			current.displayLink();
			System.out.print("->");
			current = current.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {

		DoublyLinkedlist theList = new DoublyLinkedlist();
		System.out.println("insert at front: 9, 56, 74");
		theList.insertFirst(9);
		theList.insertFirst(56);
		theList.insertFirst(74);
		theList.display();

		System.out.println("insert at rear: 34, 47, 99");
		theList.insertLast(34);
		theList.insertLast(47);
		theList.insertLast(99);
		theList.display();
		System.out.println();

		System.out.println("Delete first item from List");
		theList.deleteFirst();
		System.out.println("Delete last item from List");
		theList.deleteLast();
		theList.display();
		System.out.println();

		System.out.println("Delete  item '34' from List");
		theList.deleteItem(34);
		theList.display();
		System.out.println();

		System.out.println("insert 11 after 9  in List");
		theList.insertAfter(9, 11);

		theList.display();
	}

}
