package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Student {

	private String name;
	
	@Bean
	public Student student()
	{
		return new Student();
	}
	
	public String getName() {
		System.out.println("getting the name of the student : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
