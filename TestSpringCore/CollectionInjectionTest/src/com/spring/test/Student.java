package com.spring.test;

import java.util.List;

public class Student {

	private List<Class> classes;

	public List<Class> getClasses() {
		for (Class class1 : classes) {
			System.out.println(class1.getName());
		}
		return classes;
	}

	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}

}
