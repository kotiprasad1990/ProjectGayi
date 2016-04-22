package com.mani.gayi.ds.linkedlist;

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}
}

public class MergesortLinkList {

	public static ListNode mergeSortList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		int count = 0;
		ListNode p = head;
		while (p != null) {
			count++;
			p = p.next;
		}

		int middle = count / 2;

		ListNode l = head, r = null;
		ListNode p2 = head;
		int countHalf = 0;
		while (p2 != null) {
			countHalf++;
			ListNode next = p2.next;

			if (countHalf == middle) {
				p2.next = null;
				r = next;
			}
			p2 = next;
		}

		ListNode h1 = mergeSortList(l);
		ListNode h2 = mergeSortList(r);

		ListNode merged = merge(h1, h2);

		return merged;
	}

	public static ListNode merge(ListNode l, ListNode r) {
		ListNode p1 = l;
		ListNode p2 = r;

		ListNode fakeHead = new ListNode(100);
		ListNode pNew = fakeHead;

		while (p1 != null || p2 != null) {

			if (p1 == null) {
				pNew.next = new ListNode(p2.val);
				p2 = p2.next;
				pNew = pNew.next;
			} else if (p2 == null) {
				pNew.next = new ListNode(p1.val);
				p1 = p1.next;
				pNew = pNew.next;
			} else {
				if (p1.val < p2.val) {
					pNew.next = new ListNode(p1.val);
					p1 = p1.next;
					pNew = pNew.next;
				} else if (p1.val == p2.val) {
					pNew.next = new ListNode(p1.val);
					pNew.next.next = new ListNode(p1.val);
					pNew = pNew.next.next;
					p1 = p1.next;
					p2 = p2.next;

				} else {
					pNew.next = new ListNode(p2.val);
					p2 = p2.next;
					pNew = pNew.next;
				}
			}
		}

		return fakeHead.next;
	}

	public static void main(String[] args) {
		System.out.println("Insert items  in LinkedList:9");
		ListNode n1 = new ListNode(9);
		System.out.println("Insert items  in LinkedList:43");
		ListNode n2 = new ListNode(43);
		System.out.println("Insert items  in LinkedList:34");
		ListNode n3 = new ListNode(34);

		System.out.println("Insert items  in LinkedList:11");
		ListNode n4 = new ListNode(11);

		System.out.println("Insert items  in LinkedList:78");
		ListNode n5 = new ListNode(78);

		System.out.println("Insert items  in LinkedList:55");
		ListNode n6 = new ListNode(55);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		System.out.print("Sort items  in LinkedList:");
		n1 = mergeSortList(n1);

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
