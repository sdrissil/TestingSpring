package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

//		AbstractApplicationContext context = new
//		 AnnotationConfigApplicationContext(
//		 Student.class);
//		 context.register(CStopEventHandler.class, CStartEventHandler.class);
//		
//		 context.start();
//		
//		 Student student = (Student) context.getBean("student");
//		 student.setName("a student has no name");
//		 student.getName();
//		
//		 context.stop();

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Let us raise a start event.
		context.start();

		Student student = (Student) context.getBean("student");
		student.setName("a student has no name");
		student.getName();

		// Let us raise a stop event.
		context.stop();
	}

}