package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		Student student = (Student) appContext.getBean("student");
		student.getName();

		student.learn();
	}

}