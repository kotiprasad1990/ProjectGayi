package com.mani.gayi.ds.linkedlist;

class MergeNode {
	int val;
	MergeNode next;

	MergeNode(int x) {
		val = x;
		next = null;
	}
}

public class MergeLinkedList {

	public static MergeNode merge(MergeNode n1, MergeNode n2) {

		if (n1 == null)
			return n2;

		if (n2 == null)
			return n1;

		if (n1.val < n2.val) {
			n1.next = merge(n1.next, n2);
			return n1;
		} else {
			n2.next = merge(n2.next, n1);
			return n2;
		}
	}

	public static void main(String[] args) {
		MergeNode n1 = new MergeNode(1);
		MergeNode n2 = new MergeNode(2);
		MergeNode n3 = new MergeNode(3);
		MergeNode n4 = new MergeNode(4);

		MergeNode n5 = new MergeNode(5);
		MergeNode n6 = new MergeNode(6);
		MergeNode n7 = new MergeNode(7);
		MergeNode n8 = new MergeNode(8);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		n5.next = n6;
		n6.next = n7;
		n7.next = n8;

		System.out.print("Print the list of items: ");
		printList(n1);

		System.out.print("Print the list of items: ");
		printList(n5);

		MergeNode m = merge(n1, n5);
		System.out.print("Print the list of items after pairwise Swap: ");
		printList(m);

	}

	public static void printList(MergeNode n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
