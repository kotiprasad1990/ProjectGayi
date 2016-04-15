package com.mani.gayi.typecasting;

public class TypeCasting extends Object{
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		
		Child c = (Child)p;
		
		
	}

}


class Parent{
	
	
	public void show()
	{
		
	}
	
}

class Child extends Parent{
	
	public void show()
	{
		
	}
	
	
}