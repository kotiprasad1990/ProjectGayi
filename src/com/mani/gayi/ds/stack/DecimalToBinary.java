package com.mani.gayi.ds.stack;

import java.util.Stack;

public class DecimalToBinary {

	public static String convertDecial(int n) {
		String counter = "";

		while (n >= 1) {
			counter = (n % 2) + counter;
			n = n / 2;
		}
		return counter;
	}

	public static String convertDecialToBinary(int number) {
		StringBuilder binary = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		if (number == 0) {
			binary.append("0");
		} else {
			while (number != 0) {
				stack.push(number % 2);
				number = number / 2;
			}
		}
		while (!stack.isEmpty()) {
			try {
				binary.append(stack.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return binary.toString();
	}

	public static void main(String a[]) {
		System.out.println("Binary value of 2 is: " + convertDecialToBinary(2));
		System.out.println("Binary value of 15 is: " + convertDecial(15));
		System.out.println("Binary value of 23 is: "
				+ convertDecialToBinary(23));
	}

}
