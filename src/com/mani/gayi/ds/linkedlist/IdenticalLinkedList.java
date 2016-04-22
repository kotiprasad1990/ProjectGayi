package com.mani.gayi.ds.linkedlist;

class ListNodeIdentical {
	int val;
	ListNodeIdentical next;

	ListNodeIdentical(int x) {
		val = x;
		next = null;
	}
}

public class IdenticalLinkedList {
	public static boolean areIdentical(ListNodeIdentical a, ListNodeIdentical b) {
		if (a == null && b == null) {
			return true;
		}

		if (a == null && b != null) {
			return false;
		}

		if (a != null && b == null) {
			return false;
		}

		if (a.val != b.val) {
			return false;
		}

		return areIdentical(a.next, b.next);
	}

	public static void main(String[] args) {
		ListNodeIdentical n1 = new ListNodeIdentical(21);
		ListNodeIdentical n2 = new ListNodeIdentical(52);
		ListNodeIdentical n3 = new ListNodeIdentical(33);
		ListNodeIdentical n4 = new ListNodeIdentical(21);
		ListNodeIdentical n5 = new ListNodeIdentical(67);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		System.out.print("Print the first list  items: ");
		printList(n1);
		System.out.print("Print the secound list  items: ");
		printList(n1);
		System.out.println("Validate Identical list: " + areIdentical(n1, n1));

		System.out.println();

		ListNodeIdentical n11 = new ListNodeIdentical(56);
		ListNodeIdentical n22 = new ListNodeIdentical(87);
		ListNodeIdentical n33 = new ListNodeIdentical(63);
		ListNodeIdentical n44 = new ListNodeIdentical(91);
		ListNodeIdentical n55 = new ListNodeIdentical(69);

		n11.next = n22;
		n22.next = n33;
		n33.next = n44;
		n44.next = n55;

		System.out.print("Print the first list  items: ");
		printList(n1);
		System.out.print("Print the secound list  items: ");
		printList(n11);
		System.out.println("Validate Identical list: " + areIdentical(n1, n11));
	}

	public static void printList(ListNodeIdentical n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
