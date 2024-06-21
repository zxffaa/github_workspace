package com.jslhrd.aaa;
class SuperC{
	private int a=10;//상속도 불
	int b=20;
	void exam() {
		System.out.print("SuperC.a="+a);
		System.out.print("SuperC.b="+b);
	}
}
class ChildC extends SuperC{
	void test() {
		//System.out.print("SuperC.a="+a);
		System.out.print("SuperC.b="+b);
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
