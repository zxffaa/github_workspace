package com.jslhrd.aaa;
class BB{
	int x;
	BB(int x){
		this.x=x;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BB) {
			return true;
		}else {
			return false;
		}
	}
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BB) {
			return x==((BB)obj).x;
		}else {
			return false;
		}
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		BB b1=new BB(10);
		BB b2=new BB(20);
		BB b3=new BB(10);
		System.out.println("b1.equals(b):"+b1.equals(b2));
		System.out.println("b1.equals(b):"+b1.equals(b3));
		System.out.println("b2.equals(b):"+b2.equals(b3));
	}

}
