package com.alacriti.demo.singleton.clonable;

import java.io.Serializable;

public class Clonable  implements Cloneable{
	
	private static Clonable clonable = null;
	
	private Clonable(){
		System.out.println("Creating....");
	}
	
	public static Clonable getInstance(){
		if(clonable == null){
			clonable = new Clonable();
		}
		return clonable;
	}
	
	public Object clone() throws CloneNotSupportedException{
		System.out.println("Cloning...");
		//throw new CloneNotSupportedException("Can't clone Singleton...");
		return clonable;
	}

}