package com.mani.gayi.ds.stack;

import java.util.Stack;

public class BalanceSymbol {

	private static final char L_PAREN = '(';
	private static final char R_PAREN = ')';

	private static final char L_BRACE = '{';
	private static final char R_BRACE = '}';

	private static final char L_BRACKET = '[';
	private static final char R_BRACKET = ']';
	private static Stack<Character> stack = new Stack<Character>();

	public static boolean isBalanced(String str) {

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);

			if (c == L_PAREN)
				stack.push(L_PAREN);
			else if (c == L_BRACE)
				stack.push(L_BRACE);
			else if (c == L_BRACKET)
				stack.push(L_BRACKET);

			else if (c == R_PAREN) {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_PAREN)
					return false;
			} else if (c == R_BRACE) {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_BRACE)
					return false;
			}

			else if (c == R_BRACKET) {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_BRACKET)
					return false;
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String bsy1 = "{()){}";
		String bsy2 = "{(){}}";
		System.out.println("symbol for validating the balance:" + bsy1 + " \n"
				+ "Result:" + isBalanced(bsy1));
		System.out.println("symbol for validating the balance" + bsy2 + " \n"
				+ "Result:" + isBalanced(bsy2));

	}

}