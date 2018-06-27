package com.alacriti.demo.singleton.synchroni;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchroniTest{
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(SynchroniTest::useSingleton);
		service.submit(SynchroniTest::useSingleton);
		
		service.shutdown();
		
	}
	
	static void useSingleton(){
		Synchroni synchroni = Synchroni.getInstance();
		print("synchroni", synchroni);
	}
	
	static void print(String name, Synchroni obj){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, obj.hashCode()));
	}
}