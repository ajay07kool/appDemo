package com.alacriti.demo.singleton.serialization;

import java.io.Serializable;

public class Serialization implements Serializable{
	
	private static Serialization reflection = null;
	
	private Serialization(){
		System.out.println("Creating....");
	}
	
	public static Serialization getInstance(){
		if(reflection == null){
			reflection = new Serialization();
		}
		return reflection;
	}
	
	private Object readResolve(){
		System.out.println("ReadResolve....");
		return reflection;
	}
}