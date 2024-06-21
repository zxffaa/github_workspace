package com.jslhrd.bbb;

//import com.jslhrd.aaa.AA;
import com.jslhrd.aaa.*;//메모리 낭비가 없음
public class Exam_02 {

	public static void main(String[] args) {
		AA aa=new AA();
		//aa.a=100;//private로 인한 다른클래스에서 접근 불가
		//aa.b=100;//default로 다른패키지에서 접근 불가
		//aa.c=100;//protected로 다른패키지에서 접근 불가 단 상속관계일떄는 가능
		aa.d=100;
	}

}
