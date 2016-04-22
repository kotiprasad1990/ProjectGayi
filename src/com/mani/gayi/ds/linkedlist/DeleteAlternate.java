package com.mani.gayi.ds.linkedlist;

class ListNodeDel {
	int val;
	ListNodeDel next;

	ListNodeDel(int x) {
		val = x;
		next = null;
	}
}

public class DeleteAlternate {

	public static void deleteAlternate(ListNodeDel first) {
		for (ListNodeDel node = first; node != null && node.next != null;) {
			node = node.next = node.next.next;
		}
	}

	public static void main(String[] args) {
		ListNodeDel n1 = new ListNodeDel(21);
		ListNodeDel n2 = new ListNodeDel(52);
		ListNodeDel n3 = new ListNodeDel(33);
		ListNodeDel n4 = new ListNodeDel(21);
		ListNodeDel n5 = new ListNodeDel(67);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		System.out.print("Print the list of items: ");
		printList(n1);
		deleteAlternate(n1);
		System.out.print("Print the list of items after remove duplicate: ");

		printList(n1);
	}

	public static void printList(ListNodeDel n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
