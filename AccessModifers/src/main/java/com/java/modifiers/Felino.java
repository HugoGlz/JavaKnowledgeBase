package com.java.modifiers;

public class Felino {

	private void privateMethod(){
		System.out.println("Hi, I'm a private method");
	}
	
	public void publicMethod(){
		System.out.println("Hi, I'm a public method");
	}
	
	protected void protectedMethod(){
		System.out.println("Hi, I'm a protected method");
	}
	
	void defaultMethod(){
		System.out.println("Hi, I'm a default method");
	}
	
}
