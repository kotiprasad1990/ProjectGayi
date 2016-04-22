package com.mani.gayi.ds.linkedlist;

class ListNodeReverse {
	int val;
	ListNodeReverse next;

	ListNodeReverse(int x) {
		val = x;
		next = null;
	}
}

public class ReverseOrderList {
	public static void main(String[] args) {
		ListNodeReverse n1 = new ListNodeReverse(21);
		ListNodeReverse n2 = new ListNodeReverse(52);
		ListNodeReverse n3 = new ListNodeReverse(33);
		ListNodeReverse n4 = new ListNodeReverse(47);
		ListNodeReverse n5 = new ListNodeReverse(67);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		System.out.print("Print the list of items: ");
		printList(n1);
		reorderList(n1);
		System.out.print("Print the list of items after reverse the order: ");
		printList(n1);
	}

	public static void reorderList(ListNodeReverse head) {

		if (head != null && head.next != null) {
			ListNodeReverse slow = head;
			ListNodeReverse fast = head;

			while (fast != null && fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			ListNodeReverse second = slow.next;
			slow.next = null;

			second = reverseOrder(second);
			ListNodeReverse p1 = head;
			ListNodeReverse p2 = second;

			while (p2 != null) {
				ListNodeReverse temp1 = p1.next;
				ListNodeReverse temp2 = p2.next;
				p1.next = p2;
				p2.next = temp1;
				p1 = temp1;
				p2 = temp2;

			}
		}
	}

	public static ListNodeReverse reverseOrder(ListNodeReverse head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNodeReverse pre = head;
		ListNodeReverse curr = head.next;

		while (curr != null) {
			ListNodeReverse temp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = temp;
		}
		head.next = null;
		return pre;
	}

	public static void printList(ListNodeReverse n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
