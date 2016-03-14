package com.mani.gayi.threads.sync;

class SThread extends Thread {
	Student s1;

	public void setStudent(Student s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.addWhiteSpace();
	}
}
