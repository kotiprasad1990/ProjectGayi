package com.mani.gayi.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutate {
	
	public List<List<Character>> permute(char[] num) {  
	    List<List<Character>> result = new ArrayList<>();  
	    perm(result, num, 0);  
	    return result;  
	}  
	  
	public void perm(List<List<Character>> result, char[] num, int pos) {  
	    if(pos == num.length) {  
	        List<Character> list = new ArrayList<Character>();  
	        for(char a:num) list.add(a);  
	        result.add(list);  
	        return;  
	    }  
	    
	    // 
	    for(int i=pos; i<num.length; i++) {  
	        swap(num, i, pos);  
	        perm(result, num, pos+1);  
	        swap(num, i, pos);  
	    }  
	}  
	  
	private void swap(char[] num, int i, int j) {  
		
		if(i==j)
			return;
		char tmp = num[i];  
	    num[i] = num[j];  
	    num[j] = tmp;  
	}  
	
	public static void main(String[] args) {
		
		char number[] = {'a','b','c'};
		
		List<List<Character>> list = new Permutate().permute(number);
		for(List l1 : list)
		{
			System.out.println("List "+l1);
		}
	}

}
