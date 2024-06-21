package com.jslhrd.aaa;
class AA{
	int x;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			return true;
		}else {
			return false;
		}
	}
}
public class Exam_01 {

	public static void main(String[] args) {
		AA a =new AA();
		AA b=new AA();
		AA c =a;
		// ==기호는 값을 비교할떄 쓴다
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a==c:"+(a==c));
		System.out.println("a.equals(b):"+a.equals(b));
		System.out.println("a.equals(c):"+a.equals(c));
	}

}
