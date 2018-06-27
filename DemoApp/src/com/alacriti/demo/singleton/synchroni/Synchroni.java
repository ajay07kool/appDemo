package com.alacriti.demo.singleton.synchroni;

import java.io.Serializable;

public class Synchroni implements Serializable{
	
	private static volatile Synchroni synchroni = null;
	
	private Synchroni(){
		System.out.println("Creating....");
	}
	
	public static Synchroni getInstance(){
		//Double check locking
		
		if(synchroni == null){  //check 1
			synchronized(Synchroni.class){
				if(synchroni == null){ //check 2
					synchroni = new Synchroni();
				}
			}
		}
		return synchroni;
	}
}