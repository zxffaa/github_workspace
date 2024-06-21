package com.jslhrd.bbb;

class D {

}

class SubD extends D {

}

public class Exam_06 {

	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new SubD();
		if (d1 instanceof SubD) {
			System.out.println("같은 객체임");
		} else {
			System.out.println("다른 객체임");
		}
		System.out.println("-----------------");
		if (d2 instanceof SubD) {
			System.out.println("같은객체");
			SubD dd = (SubD) d2;
		} else {
			System.out.println("다른객체");
		}
	}

}
