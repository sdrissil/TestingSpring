package com.spring.test;

public class Person {

	private String age;

	public String getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void init()
	{
		System.out.println("initializing the Person");
	}
	
	public void destroy()
	{
		System.out.println("destroying the Person");
	}
	
}
