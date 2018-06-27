package com.alacriti.demo.singleton.reflection;

public class Reflection {
	
	private static Reflection reflection = null;
	
	private Reflection(){
		if(reflection != null){
			throw new RuntimeException("SingleClass object should not be created multiple times..");
		}
		System.out.println("Creating....");
	}
	
	public static Reflection getInstance(){
		if(reflection == null){
			reflection = new Reflection();
		}
		return reflection;
	}
}