package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				Student.class);

		Student student = (Student) context.getBean("student");
		student.setName("a student has no name");
		student.getName();

	}

}