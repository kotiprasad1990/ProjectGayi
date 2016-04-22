package com.mani.gayi.ds.linkedlist;

class ListNodeMoveLast {
	int val;
	ListNodeMoveLast next;

	ListNodeMoveLast(int x) {
		val = x;
		next = null;
	}
}

public class MoveLastItemFirst {

	public static void swap(ListNodeMoveLast head, int n, int k) {
		if (k > n || 2 * k + 1 == n)
			return;

		ListNodeMoveLast headRef = new ListNodeMoveLast(-1);
		headRef.next = head;

		ListNodeMoveLast pre = null;
		ListNodeMoveLast cur = headRef;
		for (int i = 0; i < k; i++) {
			pre = cur;
			cur = cur.next;
		}
		ListNodeMoveLast pre1 = pre;
		ListNodeMoveLast cur1 = cur;
		ListNodeMoveLast pre2 = headRef;
		ListNodeMoveLast cur2 = head;
		while (cur.next != null) {
			cur = cur.next;
			pre2 = cur2;
			cur2 = cur2.next;
		}

		pre1.next = cur2;
		ListNodeMoveLast temp = cur2.next;
		cur2.next = cur1.next;
		pre2.next = cur1;
		cur1.next = temp;
	}

	public static void main(String[] args) {
		ListNodeMoveLast n1 = new ListNodeMoveLast(1);
		ListNodeMoveLast n2 = new ListNodeMoveLast(2);
		ListNodeMoveLast n3 = new ListNodeMoveLast(3);
		ListNodeMoveLast n4 = new ListNodeMoveLast(4);
		ListNodeMoveLast n5 = new ListNodeMoveLast(5);
		ListNodeMoveLast n6 = new ListNodeMoveLast(6);
		ListNodeMoveLast n7 = new ListNodeMoveLast(7);
		ListNodeMoveLast n8 = new ListNodeMoveLast(8);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;

		System.out.print("Print the list of items: ");
		printList(n1);
		swap(n1, 8, 2);
		System.out.print("Print the list of items after pairwise Swap: ");
		printList(n1);

	}

	public static void printList(ListNodeMoveLast n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
