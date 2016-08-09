package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.spellCheck();

		context.registerShutdownHook();
	}

}