package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student singleton1 = (Student) context.getBean("singleton");
		singleton1.getName();
		singleton1.setName("dont be a singleton");
		singleton1.getName();
		Student singleton2 = (Student) context.getBean("singleton");
		singleton2.getName();

		Student prototype1 = (Student) context.getBean("prototype");
		prototype1.getName();
		prototype1.setName("don't be a prototype");
		prototype1.getName();

		Student prototype2 = (Student) context.getBean("prototype");
		prototype2.getName();

		context.registerShutdownHook();
	}

}