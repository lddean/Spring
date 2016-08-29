package com.tutorialspoint;

public class Logging {
	
	public void beforeAdvice(){
		System.out.println("Going to setup student profile.");
	}
	
	public void afterAdvice(){
		System.out.println("Student profiles has been setup");
	}
	
	public void afterReturningAdvice(Object retVal){
		
		System.out.println("Returning : " + retVal.toString());
	}
	
	public void AfterThrowingAdvice(IllegalArgumentException ex){
		
		System.out.println("There has been an excepting : " + ex.toString());
	}
}
