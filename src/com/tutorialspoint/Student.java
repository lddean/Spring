package com.tutorialspoint;

import org.springframework.beans.factory.annotation.*;

public class Student {
	private int age;
	
	private String name;
	
	@Required
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	@Required
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void printThrowException(){
		System.out.println("Exception raised");
		
		throw new IllegalArgumentException();
	}

}
