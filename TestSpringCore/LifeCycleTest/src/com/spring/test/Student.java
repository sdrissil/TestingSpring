package com.spring.test;

public class Student {

	private String name;

	public String getName() {
		System.out.println("getting the name of the student : " + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("setting the name");
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("initializing the student");
	}
	
	public void destroy()
	{
		System.out.println("destroying the student");
	}
	
}
