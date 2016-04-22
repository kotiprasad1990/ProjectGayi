package com.mani.gayi.ds.linkedlist;

class ListNodePair {
	int val;
	ListNodePair next;

	ListNodePair(int x) {
		val = x;
		next = null;
	}
}

public class PairwiseSwapItems {

	public static ListNodePair swapPairwiseIteratively(ListNodePair head) {
		if (head == null || head.next == null)
			return head;

		ListNodePair headRef = new ListNodePair(-1);
		headRef.next = head;
		ListNodePair pre = headRef;
		ListNodePair cur = head;

		while (cur != null) {
			ListNodePair temp = cur.next;
			if (temp == null)
				break;
			cur.next = temp.next;
			temp.next = cur;
			pre.next = temp;
			pre = cur;
			cur = cur.next;
		}

		return headRef.next;
	}

	public static ListNodePair swapPairRecursively(ListNodePair head) {
		if (head == null || head.next == null)
			return head;

		ListNodePair temp = head.next;
		head.next = head.next.next;
		temp.next = head;
		head.next = swapPairRecursively(head.next);

		return temp;
	}

	public static void main(String[] args) {
		ListNodePair n1 = new ListNodePair(21);
		ListNodePair n2 = new ListNodePair(52);
		ListNodePair n3 = new ListNodePair(33);
		ListNodePair n4 = new ListNodePair(21);
		ListNodePair n5 = new ListNodePair(67);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		System.out.print("Print the list of items: ");
		printList(n1);
		ListNodePair rd = swapPairRecursively(n1);
		System.out.print("Print the list of items after pairwise Swap: ");
		printList(rd);

	}

	public static void printList(ListNodePair n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
