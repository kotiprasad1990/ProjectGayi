package com.mani.gayi.ds.linkedlist;

import java.util.LinkedHashMap;

class ListNodedup {
	int val;
	ListNodedup next;

	ListNodedup(int x) {
		val = x;
		next = null;
	}
}

public class RemoveDuplicate {

	private static LinkedHashMap<Integer, Boolean> deleteDupslist(ListNodedup n) {
		LinkedHashMap<Integer, Boolean> table = new LinkedHashMap<Integer, Boolean>();
		ListNodedup previous = null;
		while (n != null) {
			if (table.containsKey(n.val)) {
				previous.next = n.next;
			} else {
				table.put(n.val, true);
				previous = n;
			}
			n = n.next;
		}
		return table;
	}

	public static void main(String[] args) {
		ListNodedup n1 = new ListNodedup(21);
		ListNodedup n2 = new ListNodedup(52);
		ListNodedup n3 = new ListNodedup(33);
		ListNodedup n4 = new ListNodedup(21);
		ListNodedup n5 = new ListNodedup(67);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		System.out.print("Print the list of items: ");
		printList(n1);
		LinkedHashMap<Integer, Boolean> rd = deleteDupslist(n1);
		System.out.print("Print the list of items after remove duplicate: ");

		for (Integer key : rd.keySet()) {
			System.out.print(key + "->");
		}

		System.out.print("NULL");

	}

	public static void printList(ListNodedup n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
