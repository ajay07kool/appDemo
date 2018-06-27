package com.alacriti.demo.singleton.clonable;

public class ClonableTest{
	public static void main(String[] args) throws Exception {
		Clonable c1 = Clonable.getInstance();
		Clonable c2 = Clonable.getInstance();
		
		print("c1", c1);
		print("c2", c2);
		
		Clonable c3 = (Clonable)c2.clone();
		print("c3", c3);
		
	}
	
	static void print(String name, Clonable obj){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, obj.hashCode()));
	}
}