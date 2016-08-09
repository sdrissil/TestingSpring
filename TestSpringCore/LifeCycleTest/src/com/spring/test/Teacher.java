package com.spring.test;

public class Teacher {

	private String name;

	public String getName() {
		System.out.println("getting the name of the teacher : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("initializing the teacher");
	}
	
	public void destroy()
	{
		System.out.println("destroying the teacher");
	}
	
}
