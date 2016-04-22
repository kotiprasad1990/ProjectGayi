package com.mani.gayi.ds.linkedlist;

public class InsSortLinkedlist {

	public static ListNode insertionSortList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode newHead = new ListNode(head.val);
		ListNode pointer = head.next;

		while (pointer != null) {

			ListNode innerPointer = newHead;
			ListNode next = pointer.next;

			if (pointer.val <= newHead.val) {
				ListNode oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} else {
				while (innerPointer.next != null) {

					if (pointer.val > innerPointer.val
							&& pointer.val <= innerPointer.next.val) {
						ListNode oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}

					innerPointer = innerPointer.next;
				}

				if (innerPointer.next == null && pointer.val > innerPointer.val) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}

			pointer = next;
		}

		return newHead;
	}

	public static void main(String[] args) {
		System.out.println("Insert items  in LinkedList:9");
		ListNode n1 = new ListNode(9);
		System.out.println("Insert items in LinkedList:43");
		ListNode n2 = new ListNode(43);
		System.out.println("Insert items in LinkedList:34");
		ListNode n3 = new ListNode(34);

		System.out.println("Insert items in LinkedList:11");
		ListNode n4 = new ListNode(11);

		System.out.println("Insert items in LinkedList:78");
		ListNode n5 = new ListNode(78);

		System.out.println("Insert items in LinkedList:55");
		ListNode n6 = new ListNode(55);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		n1 = insertionSortList(n1);
		System.out.print("Sort items in LinkedList:");
		printList(n1);

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
