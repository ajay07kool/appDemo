package com.alacriti.test;

public interface FirstInterface {
	
	public default void m1(){;
	
		System.out.println("From firstInterface...");
	}
	
	public default void m2(){;
	
	System.out.println("From firstInterface...");
}

}
