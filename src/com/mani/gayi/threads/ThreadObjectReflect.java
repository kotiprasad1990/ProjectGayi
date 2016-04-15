package com.mani.gayi.threads;

public class ThreadObjectReflect {


	
	public static void main(String[] args) {
		
		
		Stu s = new Stu();
		s.setId(0);
		
		
		Thread t1 = new T1(s);
		Thread t2 = new T2(s);
		


		t1.start();
		
		t2.start();
		
		System.out.println("Student s "+s.getId());
		
		
	}
	
	
	
}




class T1 extends Thread
{
	Stu s;
	public T1(Stu s)
	{
		this.s = s;
	}
	
	public void run()
	{
		
	s.setId(20);
	}
}


class T2 extends Thread
{
	Stu s;
	public T2(Stu s)
	{
		this.s = s;
	}
	
	public void run()
	{
		s.setId(30);
	}
}












class Stu
{
	 int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
}
