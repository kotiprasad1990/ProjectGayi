package com.mani.gayi.ds.list;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	
	public static void main(String[] args) {
		
		Nodee nod = new Nodee();
		nod.data=10;
		
		List l1 = new ArrayList<>();
		
		l1.add(new Integer(10));
		
		l1.add(new Double(50));
		l1.add(nod);
		
		System.out.println("L1 value "+l1.get(1));
		
		
		// getting the custom object 
		System.out.println("Custom Object "+l1.get(2));
		
		Nodee n = (Nodee )l1.get(2);
		System.out.println(" Node value "+n.data);
	}

}


class Nodee
{
	int data;
	Nodee node;
	
	@Override
	public String toString() {
		
		return data+"";
	}
}