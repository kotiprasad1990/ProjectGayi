package com.mani.gayi.threads.sync;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String... args) {
		List<String> values = getList();

		Student s1 = new Student();
		for (String values1 : values) {
			s1.setStudentnname(values1);
			Thread t1 = new SThread();
			t1.start();

		}
	}

	private static List<String> getList() {
		List<String> name = new ArrayList<String>();
		name.add("Mani");
		name.add("Sani");
		name.add("Kavi");

		return name;
	}

}
