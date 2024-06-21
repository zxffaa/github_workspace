package com.jslhrd.bbb;

public class Exam_05 {

	public static void main(String[] args) {
		//부모를 통한 호출 
		MultiAB ab=new MultiAB();
		ab.method01();
		ab.method01();
		ab.method02();
		ab.method03();
		ab.method04();
		
		//자식를 통한 호출
		A_interface a=new MultiAB();
		a.method01();
		a.method02();
		
		B_interface b=new MultiAB();
		b.method03();
		b.method04();

	}

}
