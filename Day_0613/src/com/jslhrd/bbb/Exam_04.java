package com.jslhrd.bbb;
class A{
	
}
class SubA extends A{
	
}
public class Exam_04 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new SubA();//업케스팅(Upcasting)
		//SubA as =(SubA)a1; 컴파일에서는 실행되지만 실행시
		SubA sa=(SubA)a2;
		SubA s1=new SubA();
		A a3=s1;//업
		SubA s2=(SubA)a3;//다운
	}

}
