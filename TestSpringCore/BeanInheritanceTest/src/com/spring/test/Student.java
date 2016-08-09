package com.spring.test;

public class Student {

	private String name;
	private String age;

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
