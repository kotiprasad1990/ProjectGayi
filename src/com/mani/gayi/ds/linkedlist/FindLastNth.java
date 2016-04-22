package com.mani.gayi.ds.linkedlist;

class Node {
	public int val;
	public Node nextNode;

	public Node(int x) {
		val = x;
		nextNode = null;
	}
}

public class FindLastNth {
	static Node FindnthToLast(Node head, int n) {

		if (n < 1 || head == null)
			return null;

		Node pntr1 = head, pntr2 = head;

		for (int i = 0; i < n - 1; ++i) {
			if (pntr2 == null)
				return null;
			else
				pntr2 = pntr2.nextNode;
		}

		while (pntr2.nextNode != null) {
			pntr1 = pntr1.nextNode;
			pntr2 = pntr2.nextNode;
		}

		return pntr1;

	}

	public static void main(String[] args) {
		System.out.println("Insert itmes in LinkedList:9, 43, 34, 11, 78, 55");
		Node n1 = new Node(9);
		Node n2 = new Node(43);
		Node n3 = new Node(34);
		Node n4 = new Node(11);
		Node n5 = new Node(78);
		Node n6 = new Node(55);
		Node n7 = null;

		n1.nextNode = n2;
		n2.nextNode = n3;
		n3.nextNode = n4;
		n4.nextNode = n5;
		n5.nextNode = n6;
		n6.nextNode = n7;

		printList(n1);

		System.out
				.println("Last 3 rd Item from linked list using single iteration:"
						+ FindnthToLast(n1, 3).val);

	}

	public static void printList(Node x) {
		if (x != null) {
			System.out.print(x.val + "->");
			while (x.nextNode != null) {
				System.out.print(x.nextNode.val + "->");
				x = x.nextNode;
			}
			System.out.println("NULL");
		}

	}
}
