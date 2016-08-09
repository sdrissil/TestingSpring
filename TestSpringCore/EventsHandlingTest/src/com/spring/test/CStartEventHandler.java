package com.spring.test;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;

@Configuration
public class CStartEventHandler implements
		ApplicationListener<ContextStartedEvent> {

	@Bean 
	public CStartEventHandler cStartEventHandler()
	{
		return new CStartEventHandler();
	}
	
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}
}