package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// ApplicationContext context = new AnnotationConfigApplicationContext(
		// Student.class);

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		appContext.refresh();
		Student student = (Student) appContext.getBean("student");
		student.getName();

		student.learn();
	}

}