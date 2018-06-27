package com.alacriti.demo.singleton.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest{
	public static void main(String[] args) throws Exception {
		Serialization r1 = Serialization.getInstance();
		Serialization r2 = Serialization.getInstance();
		
		print("r1", r1);
		print("r2", r2);
		
		System.out.println("Using Serialization API");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/ajaykumar/Documents/txt.ser"));
		oos.writeObject(r2);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/ajaykumar/Documents/txt.ser"));
		Serialization r3 = (Serialization)ois.readObject();
		print("r3", r3);
		
		
	}
	
	static void print(String name, Serialization obj){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, obj.hashCode()));
	}
}