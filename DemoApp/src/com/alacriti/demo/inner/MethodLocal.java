package com.alacriti.demo.inner;

public class MethodLocal {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		MethodLocal obj = new MethodLocal();
		obj.display();
	}
}