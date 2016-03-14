package com.mani.gayi.threads.sync;

class Student {
	private String studentnname;

	public  synchronized void addWhiteSpace() {
		int length = studentnname.length();
		char[] name = studentnname.toCharArray();
		studentnname = "";
		for (int i = 0; i < length + 3; i++) {
			if (name.length > i)
				studentnname = studentnname + name[i];
			else
				studentnname = studentnname + "-";
		}
		System.out.println("student name "+studentnname);
	}

	public String getStudentnname() {
		return studentnname;
	}

	public void setStudentnname(String studentnname) {
		this.studentnname = studentnname;
	}

	
//	
//	public static void main(String[] args) {
//		
//		Student s = new Student();
//		s.setStudentnname("Mani");
//		s.addWhiteSpace();
//		
//		Student s1 = new Student();
//		s1.setStudentnname("Hani");
//		s1.addWhiteSpace();
//		
//		Student s2 = new Student();
//		s2.setStudentnname("Sani");
//		s2.addWhiteSpace();
//		
//	}

}