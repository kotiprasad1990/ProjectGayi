package com.mani.gayi.string;

import java.util.ArrayList;
import java.util.List;

public class String18Problem {
	
	
	public List<String> compress(String word)
	{
		List<String> wordslist = new ArrayList<String>();
		
		if(word.length()<2){
			wordslist.add(word);
			return wordslist;
		}
		 
		for(int i=1; i<=word.length()-2; i++) {  
		        for(int j=1; i+j<word.length(); j++) {  
//Debugging statement System.out.println("word "+word.substring(0,j)+" i : "+i+" word.substring(i+j) " +word.substring(i+j));
		        	wordslist.add(word.substring(0,j)+i+word.substring(i+j));  
		        }  
		        System.out.println("------------");
		    }  
		    return wordslist;  
		
	}

	public static void main(String[] args) {
		
	List<String> words = new String18Problem().compress("Manidhar");
	for(String word : words)
	{
		System.out.println("words "+word);
	}
	}
	
}
