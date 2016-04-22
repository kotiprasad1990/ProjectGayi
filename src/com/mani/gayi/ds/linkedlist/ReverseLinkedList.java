package com.mani.gayi.ds.linkedlist;

public class ReverseLinkedList {

	public static void ReversePrint(ListNode head) {
		if (head == null)
			return;
		ReversePrint(head.next);
		System.out.print(head.val + "->");
	}

	public static void main(String args[]) {

		System.out.println("Insert itmes in LinkedList:9, 43, 34, 11, 78, 55");
		ListNode n1 = new ListNode(9);
		ListNode n2 = new ListNode(43);
		ListNode n3 = new ListNode(34);
		ListNode n4 = new ListNode(11);
		ListNode n5 = new ListNode(78);
		ListNode n6 = new ListNode(55);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		System.out.print("Itmes in LinkedList before reverse:");
		printList(n1);
		System.out.print("Itmes in LinkedList After reverse :");
		ReversePrint(n1);
		System.out.println("NULL");
	}

	public static void printList(ListNode x) {
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
