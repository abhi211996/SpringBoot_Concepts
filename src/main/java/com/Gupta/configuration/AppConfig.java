package com.Gupta.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Gupta.beans.BeanClass;

@Configuration
public class AppConfig {
	 
	public AppConfig()
	{
		System.out.println("Configration:: Constructor");
	}
	
	//Want to call Bean class as its not a spring beans class. 
	@Bean
	public BeanClass  getBean()
	{
		BeanClass b = new BeanClass();
		return b;
	}

}
