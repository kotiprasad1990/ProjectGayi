package com.mani.gayi.ds.stack;

import java.util.Stack;

public class MyWordReverse {

	public String reverseWord(String word) {

		StringBuilder sb = new StringBuilder();
		int size = word.length();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < size; i++) {
			stack.push(word.charAt(i));
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	public static void main(String a[]) {
		MyWordReverse mwr = new MyWordReverse();
		String strRev = "Hello";
		System.out.println("Reverse the " + strRev + " is "
				+ mwr.reverseWord(strRev));
		strRev = "World";
		System.out.println("Reverse the " + strRev + " is "
				+ mwr.reverseWord(strRev));
	}
}
