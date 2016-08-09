package com.spring.test;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStoppedEvent;

@Configuration
public class CStopEventHandler implements
		ApplicationListener<ContextStoppedEvent> {

	@Bean 
	public CStopEventHandler cStopEventHandler()
	{
		return new CStopEventHandler();
	}
	
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStoppedEvent Received");
	}
}