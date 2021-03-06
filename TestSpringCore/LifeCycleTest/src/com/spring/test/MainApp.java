package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.setName("hey");

		Teacher teacher = (Teacher) context.getBean("teacher");
		teacher.getName();

		context.registerShutdownHook();
	}

}