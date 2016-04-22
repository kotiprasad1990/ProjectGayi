package com.mani.gayi.ds.linkedlist;

class NodeCyclic {
	public int val;
	public NodeCyclic next;

	public NodeCyclic(int x) {
		val = x;
		next = null;
	}
}

public class Findcyclic {

	public static boolean hasLoop(NodeCyclic first) {

		if (first == null)
			return false;

		NodeCyclic slow, fast;

		slow = fast = first;

		while (true) {
			slow = slow.next;

			if (fast.next != null)
				fast = fast.next.next;
			else
				return false;

			if (slow == null || fast == null)
				return false;

			if (slow == fast)
				return true;
		}
	}

	public static void main(String[] args) {
		System.out.println("Insert itmes in LinkedList:9, 43, 34, 11, 78, 55");
		NodeCyclic n1 = new NodeCyclic(9);
		NodeCyclic n2 = new NodeCyclic(43);
		NodeCyclic n3 = new NodeCyclic(34);
		NodeCyclic n4 = new NodeCyclic(11);
		NodeCyclic n5 = new NodeCyclic(78);
		NodeCyclic n6 = new NodeCyclic(55);
		NodeCyclic n7 = null;

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		printList(n1);

		System.out.println("Does the listed list contain loop:" + hasLoop(n1));

	}

	public static void printList(NodeCyclic x) {
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
