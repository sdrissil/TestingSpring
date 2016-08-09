package com.spring.test;

import org.springframework.beans.factory.annotation.Required;

public class Student {

	private String name;
	private String age;

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		System.out.println("Age : " + age);
		return age;
	}
	@Required
	public void setAge(String age) {
		this.age = age;
	}
}
