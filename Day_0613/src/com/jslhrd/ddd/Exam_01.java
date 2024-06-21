package com.jslhrd.ddd;

public class Exam_01 {

	public static void main(String[] args) {
		MathExam me= new SubExam();
		int max1=me.max(10,20);
		int max2=me.max(10,20,30,40,50);
		int min1=me.min(10,20);
		int min2=me.min(20,30,50,40);
		System.out.printf("최대1:%d\n최대2:%d\n최소1:%d\n최소2:%d\n",max1,max2,min1,min2);
	}
	
}
