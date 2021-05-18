package com.Gupta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Gupta.service.Bus;

@SpringBootApplication
@ComponentScan(basePackages= {"com.Gupta", "in.Gupta"})
public class SpringConceptsApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ac= SpringApplication.run(SpringConceptsApplication.class, args);
		Bus bus =ac.getBean(Bus.class);
		bus.save();
	}

}
