package com.alacriti.test;

public class Child extends Parent{
	
	protected void m1(){
		System.out.println("from m1 of Child...");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
	}

}
