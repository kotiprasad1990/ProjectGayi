package com.mani.gayi.ds.stack;

import java.util.Stack;

public class InfixToPostfix {
 
    private boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
            return true;
        return false;
    }
 
    private boolean checkPrecedence(char c1, char c2) {
        if ((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
            return true;
        else if ((c2 == '*' || c2 == '/')
                && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else if ((c2 == '^')
                && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
            return true;
        else
            return false;
    }
 
    public String convert(String infix) {
        String postfix = "";
        Stack < Character > s = new Stack < Character >();
        s.push('*');
 
        for (int i = 0; i < infix.length(); i++) {
 
            char inputSymbol = infix.charAt(i);
 
            if (isOperator(inputSymbol)) {
 
                if (s.size() > 1) {
                    while (checkPrecedence(inputSymbol, s.peek()))
                        postfix += s.pop();
                }
 
                s.push(inputSymbol);
 
            } else if (inputSymbol == '(')
                s.push(inputSymbol);
            else if (inputSymbol == ')') {
 
                while (s.peek() != '(')
                    postfix += s.pop();
 
                s.pop();
            } else {
                postfix += inputSymbol;
            }
        }
 
        while (s.peek() != '*') {
            postfix += s.pop();
        }
 
        return postfix;
    }
 
    public static void main(String[] args) {
        InfixToPostfix obj = new InfixToPostfix();
        String infix="A+(B*C)";
        System.out.println("Infix : \t"+infix);
        System.out.println("Postfix : \t" + obj.convert(infix));
    }
}                  
