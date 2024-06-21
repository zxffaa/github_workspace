package com.jslhrd.aaa;

class SuperD{
	void add() {
		System.out.println("1+2="+3);
	}
	void add(int a){//SuperD내에서 메소드 오버로딩 
		
	}
}
class ChildD extends SuperD{
	void add() { //메소드 오버라이딩-재정의[안에 내용이 다를경우]
		System.out.print("1+2="+5);
	}
	void add(int a,int b) {//ChildD함수내에서 오버로딩
		System.out.print(a+"+"+b+"="+(a+b));
	}
}
//호출시 마지막으로 정의된것을 호출한다
public class Exam_04 {

	public static void main(String[] args) {
		SuperD d=new SuperD();
		d.add();
		d.add(10);
		ChildD cd=new ChildD();
		cd.add(); //오버라이딩된 메소드 호출
	}

}
