package com.mani.gayi.string;


/* Source : LinkedIn
 * Desc   : http://yuanhsh.iteye.com/blog/2232583
 * Author : Manidhar.
 * Two words are called isomorphic if the letters in one word can be remapped to get the second word. 
Remapping a letter means replacing all occurrences of it with another letter while the ordering of the letters 
remains unchanged. No two letters may map to the same letter, but a letter may map to itself.

Examples: 

Given 'foo', 'app', returns true
We can map 'f' -> 'a' and 'o' -> 'p'

Given 'bar', 'foo', returns false
We can’t map both 'a' and 'r' to 'o'

Given 'turtle', 'tletur', returns true
We can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' -'r'

Given 'ab', 'ca', returns true
We can map 'a' -> 'c', 'b' -> 'a'*/

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {
	
	// this is a function which takes input as 2 strings s and t.
	public boolean isIsomorphic(String input1, String input2) {  
		
		// first consider the length of input1 and input2.
	    if(input1.length() != input2.length()) return false; 
	    
	    // take 2 map's which stores key and value as characters.
	   
	    Map<Character, Character> mapinput1 = new HashMap<>();
	    Map<Character, Character> mapinput2 = new HashMap<>();  
	    
	    // iterate the loop till the length of the string.
	    for(int i=0; i<input1.length(); i++) {  
	        
	    	// finding the character at index for the string input1
	    	char cs = input1.charAt(i);  
	    	
	    	// finding the character at index for the string input2
	        char ct = input2.charAt(i);  
	        
	        // if the map for the input 1 doesn't contains the key
	        if(!mapinput1.containsKey(cs)) {  
	        	// then insert it in to the map i.e. letter mapping in the index of input1 to the same index mapping of input2.
	        	mapinput1.put(cs, ct);  
	        } 
	        // if it contains, get the letter previously inserted and if not equal to the previously inserted letter finish it.
	        else if(mapinput1.get(cs) != ct) {  
	            return false;  
	        }  
	          
	        // if the map for the input 2 doesn't contains the key
	        if(!mapinput2.containsKey(ct)) {  
	        	// then insert it in to the map i.e. letter mapping in the index of input2 to the same index mapping of input1.
	        	mapinput2.put(ct, cs);  
	        } 
	        // if it contains, get the letter previously inserted and if not equal to the previously inserted letter finish it.
	        else if(mapinput2.get(ct) != cs) {  
	            return false;  
	        }  
	    }  
	    
	    // if every thing goes fine Happy Christmas... :-)
	    return true;  
	}  

	
	public static void main(String[] args) {
		
		
		boolean value = new IsoMorphicStrings().isIsomorphic("foo", "abc");
		System.out.println("Value is "+value);
	}
}
