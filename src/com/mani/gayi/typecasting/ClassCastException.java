package com.mani.gayi.typecasting;

public class ClassCastException {
	public static void main(String[] args) {
		Object obj = new Integer(100);
		System.out.println((String) obj);
		
		System.out.println("Class is "+obj.getClass().getName());
	}
}

