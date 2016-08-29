package com.tutorialspoint;

public class TextEditor {
	
	private SpellChecker spellChecker;
	private String name;
	
	public void setSpellChecker(SpellChecker spellChecker){
		System.out.println("Inside setSpellchecker.");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		System.out.println(name);
		return name;
	}

}
