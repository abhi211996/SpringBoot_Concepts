package com.Gupta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gupta.repository.Dao;

@Service
public class Bus {
	
	private Dao dao=null;
	
	//@Autowired
	/*If you have more than 1 constructor then we need to write @Autowired otherwise it will work 
	without @Autowired annotation as well because we don't have constructor overloading here*/
	/*when run method call object created and component scanning and everything happend 
	this time only. DI and all everything ready
	default scope of spring bean class is singleton
	default constructor call by java compiler*/
	@Autowired
	public Bus(Dao dao) {
		this.dao=dao;
	}
	public void save() {
		boolean b =  dao.saveData("Abhishek", "abhishek@gmail.com");
		
		if(b) {
			System.out.println("saved!!");
		}
		else
		{
			System.out.println("failed to saved!!");
		}
		
	}
}
