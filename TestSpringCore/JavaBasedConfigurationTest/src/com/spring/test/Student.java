package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Student {

	private String name;

	@Bean
	public Student student()
	{
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
	
	public void init()
	{
		System.out.println("initializing the student");
	}
	
	public void destroy()
	{
		System.out.println("destroying the student");
	}
	
}
