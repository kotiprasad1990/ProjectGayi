package com.mani.gayi.ds.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
	public static <T> void reverseStack(Stack<T> stack) {
		if (stack.isEmpty()) {
			return;
		}

		T bottom = popBottom(stack);
		reverseStack(stack);
		stack.push(bottom);
	}

	private static <T> T popBottom(Stack<T> stack) {
		T top = stack.pop();
		if (stack.isEmpty()) {
			return top;
		} else {
			T bottom = popBottom(stack);
			stack.push(top);
			return bottom;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println("Stack Values before reverse:"
				+ Arrays.toString(stack.toArray()));
		reverseStack(stack);
		System.out.println("Stack Values after Reverse:"
				+ Arrays.toString(stack.toArray()));
	}
}
