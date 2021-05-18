package com.Gupta.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	public Dao() {
		System.out.println("Dao :: Constructor");
	}
	
	public boolean saveData(String name, String email)
	{
		System.out.println(name + ":" + email);
		System.out.println("Record has been saved");
		return true;
	}

}
