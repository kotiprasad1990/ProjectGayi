package com.mani.gayi.ds.linkedlist;

import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.asList;

public class FlatteningLinkedList {

	public static List<Integer> flatten(List<?> list) {
		List<Integer> ret = new LinkedList<Integer>();
		flattenHelper(list, ret);
		return ret;
	}

	public static void flattenHelper(List<?> nestedList, List<Integer> flatList) {
		for (Object item : nestedList) {
			if (item instanceof List<?>) {
				flattenHelper((List<?>) item, flatList);
			} else {
				flatList.add((Integer) item);
			}
		}
	}

	public static void main(String[] args) {

		List<Object> nestedList = lst(1, lst(2, lst(3, 4)), lst(5, 6, 7), 8,
				lst(lst(9, 10)));
		List<Integer> flatList = flatten(nestedList);

		System.out.println("Nested list of elements: " + nestedList);
		System.out.println("After remove flat  list: " + flatList);
	}

	private static List<Object> lst(Object... objs) {
		return asList(objs);
	}

}
