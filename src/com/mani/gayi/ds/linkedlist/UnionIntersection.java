package com.mani.gayi.ds.linkedlist;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class UnionIntersection {
	public List<Integer> union(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set = new HashSet<Integer>();

		set.addAll(list1);
		set.addAll(list2);

		return new ArrayList<Integer>(set);
	}

	public List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<Integer>();

		for (Integer t : list1) {
			if (list2.contains(t)) {
				list.add(t);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(11, 22, 33));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(22, 33, 44,
				55, 66));

		System.out.println("Find Union and Intersection list 1: " + list1);
		System.out.println("Find Union and Intersection list 2: " + list2);
		System.out.println();

		System.out.println("Intersection of list1 and list2: "
				+ new UnionIntersection().intersection(list1, list2));
		System.out.println("Union of list1 and list2: "
				+ new UnionIntersection().union(list1, list2));

	}

}
