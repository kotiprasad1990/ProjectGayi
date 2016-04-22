package com.mani.gayi.ds.linkedlist;

public class CircularLinkedList {
	private Node start;
	private int count;

	private static class Node {
		int data;
		Node link;

		public Node(int data) {
			this.data = data;
		}

		@SuppressWarnings("unused")
		public Node(int data, Node link) {
			this.data = data;
			this.link = link;
		}
	}

	public void append(int x) {
		count++;
		Node temp = new Node(x);
		if (start == null) {
			start = temp;
		} else {
			Node tp = start;
			while (tp.link != start) {
				tp = tp.link;
			}
			tp.link = temp;
		}
		temp.link = start;
	}

	public void addBeg(int x) {
		count++;
		Node temp = new Node(x);
		if (start == null) {
			temp.link = temp;
		} else {
			Node tp = start;
			while (tp.link != start) {
				tp = tp.link;
			}
			tp.link = temp;
			temp.link = start;
		}
		start = temp;
	}

	public void addAt(int pos, int x) {
		Node temp, tp;
		temp = new Node(x);
		tp = start;
		for (int i = 0; i < pos; i++) {
			if (tp.link == start)
				break;
			tp = tp.link;
		}
		temp.link = tp.link;
		tp.link = temp;
		count++;
	}

	public void displayList() {
		if (start == null)
			System.out.println("List is empty..");
		else {
			Node temp = start;
			while (temp.link != start) {
				System.out.print(temp.data + "->");
				temp = temp.link;
			}
			System.out.println(temp.data);
		}
		System.out.println();
	}

	public int deleteAt(int position) {
		Node current = start;
		Node previous = start;
		for (int i = 0; i < position; i++) {
			if (current.link == start)
				break;
			previous = current;
			current = current.link;
		}

		if (position == 0)
			deleteFirst();
		else
			previous.link = current.link;
		count--;

		return current.data;
	}

	public void deleteFirst() {
		Node temp = start;
		while (temp.link != start) {
			temp = temp.link;
		}
		temp.link = start.link;
		start = start.link;
		count--;
	}

	public int getCount() {
		return count;
	}

	public static void main(String args[]) {
		CircularLinkedList ccl = new CircularLinkedList();
		System.out
				.println("Insert items in the circular linked list: 41, 25, 63, 84");
		ccl.addBeg(41);
		ccl.append(25);
		ccl.append(63);
		ccl.append(84);
		ccl.displayList();

		System.out.println("Insert item at 2nd position: 10");
		ccl.addAt(1, 10);
		ccl.displayList();

		System.out.println("Insert item in the circular linked list: 53, 12");
		ccl.append(53);
		ccl.append(12);
		ccl.displayList();

		System.out.println("Delete the item in the position 1:"
				+ ccl.deleteAt(1) + "\n"); // index starts from zero
		System.out.println("Linked List items:");
		ccl.displayList();
	}

}
