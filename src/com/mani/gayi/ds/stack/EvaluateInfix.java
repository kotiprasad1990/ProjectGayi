package com.mani.gayi.ds.stack;

import java.util.Stack;
import java.util.StringTokenizer;

public class EvaluateInfix {
	public static String evaluateInfix(String exps) {
		exps = exps.replaceAll("\\s+", "");
		Stack<String> stack = new Stack<String>();
		StringTokenizer tokens = new StringTokenizer(exps, "{}()*/+-", true);
		while (tokens.hasMoreTokens()) {
			String tkn = tokens.nextToken();
			if (tkn.equals("(") || tkn.equals("{") || tkn.matches("[0-9]+")
					|| tkn.equals("*") || tkn.equals("/") || tkn.equals("+")
					|| tkn.equals("-")) {
				stack.push(tkn);
			} else if (tkn.equals("}") || tkn.equals(")")) {
				try {
					int op2 = Integer.parseInt(stack.pop());
					String oprnd = stack.pop();
					int op1 = Integer.parseInt(stack.pop());
					if (!stack.isEmpty()) {
						stack.pop();
					}
					int result = 0;
					if (oprnd.equals("*")) {
						result = op1 * op2;
					} else if (oprnd.equals("/")) {
						result = op1 / op2;
					} else if (oprnd.equals("+")) {
						result = op1 + op2;
					} else if (oprnd.equals("-")) {
						result = op1 - op2;
					}
					stack.push(result + "");
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		String result = "";
		try {
			result = stack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String a[]) {
		String infix = "((3*6)+9)";
		System.out.println("Infix Expression: " + infix);
		System.out.println("Evaluate Infix Result: " + evaluateInfix(infix));
	}
}
