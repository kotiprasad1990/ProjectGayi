package com.mani.gayi.string;
public class StringPoolExamples {
	
	
	private static String hi ="Hi";
	
	public void add()
	{
		hi ="Bye";
	}
	
	public static void main(String[] args) {
		
		String firstCreated = new String ("Gayi");
		String firstCreatedLiteral = "Gayi";
		System.out.println("firstCreated: "+firstCreated.hashCode());
		System.out.println("firstCreatedLiteral: "+firstCreatedLiteral.hashCode());
		String secondLiteral = "Lakshmi";
		String secondNewCreation = new String("Lakshmi");
		System.out.println("secondLiteral: "+secondLiteral.hashCode());
		System.out.println("secondNewCreation: "+secondNewCreation.hashCode());
		
	} 

}
