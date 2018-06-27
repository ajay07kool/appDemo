package com.alacriti.demo.singleton.reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest{
	public static void main(String[] args) throws Exception {
		Reflection r1 = Reflection.getInstance();
		Reflection r2 = Reflection.getInstance();
		
		print("r1", r1);
		print("r2", r2);
		
		System.out.println("Using Reflection API");
		Class cl = Class.forName("com.alacriti.demo.singleton.reflection.Reflection");
		Constructor<Reflection> ctr =cl.getDeclaredConstructor();
		ctr.setAccessible(true);
		
		Reflection r3 = ctr.newInstance();
		print("r3", r3);
	}
	
	static void print(String name, Reflection obj){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, obj.hashCode()));
	}
}