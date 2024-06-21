package com.jslhrd.aaa;

public class Exam_01 {

	public static void main(String[] args) {
		AA aa=new AA();
		//맴버변수 접근
		//aa.a=100;//private로 인한 메소드 접근 불가
		aa.b=200;
		aa.c=300;
		aa.d=400;
		//맴버메소드 접근
		//aa.printA();//private로 인한 메소드 접근 불가

		aa.printB();
		aa.printC();
		aa.printD();
	}

}
