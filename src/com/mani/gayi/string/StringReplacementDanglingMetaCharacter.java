package com.mani.gayi.string;




//I have a string, say 1++++----2 and 
//I want to replace ++++---- with a certain string, say string. 
//The I use the java function replaceAll, 
//but it keep warning Dangling metacharacter every time I use it


public class StringReplacementDanglingMetaCharacter {
	
	public static void main(String[] args) {
		
		String input = "5++++----2";
		System.out.println("Input String "+input);
		
		// Replacement ++++----
		
//		String output = input.replaceAll("\\+-+", "");
		
		String output = input.replace("++++----", "");
		
		System.out.println("Output : "+output);
	}

}
