package com.mani.gayi.ds.linkedlist;

class DeleteNode {
	int val;
	DeleteNode next;

	DeleteNode(int x) {
		val = x;
		next = null;
	}
}

public class SortLinkedList {

	public static void sort(DeleteNode head) {
		int[] count = { 0, 0, 0 };

		DeleteNode current = head;
		while (current != null) {
			if (current.val == 0) {
				count[0]++;
			} else if (current.val == 1) {
				count[1]++;
			} else {
				count[2]++;
			}
			current = current.next;
		}

		current = head;
		while (current != null) {
			if (count[0] > 0) {
				current.val = 0;
				count[0]--;
			} else if (count[1] > 0) {
				current.val = 1;
				count[1]--;
			} else {
				current.val = 2;
				count[2]--;
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		DeleteNode n1 = new DeleteNode(1);
		DeleteNode n2 = new DeleteNode(0);
		DeleteNode n3 = new DeleteNode(2);
		DeleteNode n4 = new DeleteNode(2);

		DeleteNode n5 = new DeleteNode(1);
		DeleteNode n6 = new DeleteNode(0);
		DeleteNode n7 = new DeleteNode(1);
		DeleteNode n8 = new DeleteNode(2);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;

		System.out.print("Print the list of items: ");
		printList(n1);

		sort(n1);
		System.out
				.print("Print the list of items after sort '0', '1' and '2' elements: ");
		printList(n1);

	}

	public static void printList(DeleteNode n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
