package com.alacriti.demo.inner;

class MemberInner {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		//TestMemberOuter1 obj = new TestMemberOuter1();
		MemberInner.Inner in = new MemberInner().new Inner();
		in.msg();
	}
}