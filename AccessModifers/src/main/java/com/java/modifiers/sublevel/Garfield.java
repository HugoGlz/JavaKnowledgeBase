package com.java.modifiers.sublevel;

import com.java.modifiers.Felino;

public class Garfield extends Felino {
	
	public static void main(String[] args){
		Garfield gardfield = new Garfield();
//		gardfield.defaultMethod();
		gardfield.protectedMethod();
		gardfield.publicMethod();
//		felino.privateMethod();
	}
	
	
	public void callProtectedMethod(){
		this.protectedMethod();
		
	}
}
