package com.alacriti.demo.singleton.enumm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EnumSingletonTest{
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(EnumSingletonTest::useSingleton);
		service.submit(EnumSingletonTest::useSingleton);
		
		service.shutdown();
	}
	
	static void useSingleton(){
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		print("enumSingleton", enumSingleton);
	}
	
	static void print(String name, EnumSingleton obj){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, obj.hashCode()));
	}
}