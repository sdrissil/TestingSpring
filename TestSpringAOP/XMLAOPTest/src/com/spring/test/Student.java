package com.spring.test;

public class Student {

	private String name;

	public String getName() {
		System.out.println("getting the name of the student : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void learn()
	{
		System.out.println("Student is learning'");
	}

}
