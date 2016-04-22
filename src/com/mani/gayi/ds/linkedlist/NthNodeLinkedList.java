package com.mani.gayi.ds.linkedlist;

class NodeNth {
	int val;
	NodeNth next;

	NodeNth(int x) {
		val = x;
		next = null;
	}
}

public class NthNodeLinkedList {

	static NodeNth FindnthList(NodeNth head, int n) {

		if (n < 1 || head == null)
			return null;

		NodeNth pntr2 = head;

		for (int i = 0; i < n - 1; ++i) {
			if (pntr2 == null)
				return null;
			else
				pntr2 = pntr2.next;
		}

		return pntr2;

	}

	public static void main(String[] args) {
		System.out.println("Insert itmes in LinkedList:9, 43, 34, 11, 78, 55");
		NodeNth n1 = new NodeNth(9);
		NodeNth n2 = new NodeNth(43);
		NodeNth n3 = new NodeNth(34);
		NodeNth n4 = new NodeNth(11);
		NodeNth n5 = new NodeNth(78);
		NodeNth n6 = new NodeNth(55);
		NodeNth n7 = null;

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		printList(n1);

		System.out
				.println("\n3 rd Item from linked list using single iteration:"
						+ FindnthList(n1, 3).val);

	}

	public static void printList(NodeNth x) {
		if (x != null) {
			System.out.print(x.val + "->");
			while (x.next != null) {
				System.out.print(x.next.val + "->");
				x = x.next;
			}
			System.out.println("NULL");
		}

	}

}
