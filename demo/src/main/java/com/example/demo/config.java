package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

	@Bean(name= {"beans","mybean"})
	public service getParticipant()
	{
		return new service();
	}
	
}
