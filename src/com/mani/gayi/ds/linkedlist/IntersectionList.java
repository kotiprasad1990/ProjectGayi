package com.mani.gayi.ds.linkedlist;

import java.util.ArrayList;
import java.util.Hashtable;

public class IntersectionList {
	public static ArrayList<Integer> findIntersection(ArrayList<Integer> s1,
			ArrayList<Integer> s2) {
		Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		for (int i = 0; i < s1.size(); i++) {
			if (s1.get(i) != null) {
				if (hashTable.get(s1.get(i)) != null) {
					hashTable.put(s1.get(i), hashTable.get(s1.get(i)) + 1);
				} else {
					hashTable.put(s1.get(i), 1);
				}
			}
		}

		for (int i = 0; i < s2.size(); i++) {
			int s2Val = s2.get(i);
			int value;
			if (hashTable.get(s2Val) != null) {
				value = hashTable.get(s2Val);
			} else {
				continue;
			}

			if (hashTable.get(s2Val) != 0) {
				hashTable.put(s2Val, value - 1);
				intersection.add(s2Val);
			}
		}

		return intersection;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(1);
		a1.add(1);
		a1.add(4);
		System.out.println("Items from the first list: " + a1.toString());
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(2);
		a2.add(2);
		a2.add(2);
		a2.add(1);
		a2.add(4);
		System.out.println("Items from the Secound list: " + a1.toString());

		ArrayList<Integer> a3 = findIntersection(a1, a2);
		System.out.println("Intersection  Items: " + a3.toString());
	}
}
