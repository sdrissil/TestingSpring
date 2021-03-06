package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;

	public Student student() {
		System.out.println("in bean constructor");
		return new Student();
	}

	public String getName() {
		System.out.println("getting the name of the student : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void learn() {
		System.out.println("Student is learning'");
	}

}
