package com.mani.gayi.string;

import java.util.Stack;

/*Given a string with parentheses, 
 * return a string with balanced parentheses  
 * by removing the fewest characters possible. 
 * You cannot add anything to the string. 
 * Examples: 
 * balance("()") -> "()" 
 * balance("(((((") -> "" 
 * balance("(()()(") -> "()()" 
 * balance(")(())(") -> "(())"
 */
public class BalancingParentheses {
	
	// getting the balanced strings only i.e. balanced paratheses...
	public String balance(String s) { 
		
		// creating a stack.
	    Stack<Integer> stack = new Stack<>();  
	    // creating a string builder object.
	    StringBuilder sb = new StringBuilder(s);  
	    
	    // iterate till the string length.
	    for(int i=0; i<s.length(); i++) {  
	    	// finding the character at particular index.
	        int c = s.charAt(i);  
	        // if the stack is empty 
	        if(stack.isEmpty() || c == '(') {  
	            stack.push(i);  
	        } else {  
	            int top = stack.peek();  
	            if(s.charAt(top) == ')') {  
	                stack.push(i);  
	            } else {  
	                stack.pop();  
	            }  
	        }  
	    }  
	    while(!stack.isEmpty()) {  
	        sb.deleteCharAt(stack.pop());  
	    }  
	    return sb.toString();  
	}  

}
