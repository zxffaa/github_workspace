package com.jslhrd.aaa;
class B{
	int bun;
	String name;
	//B(){}
	B(int bun,String name){
		this.bun=bun;
		this.name=name;
	}
	void print() {
		System.out.println("번호:"+bun);
		System.out.println("이름:"+name);
	}
}
class SubB extends B{
	int age;
	SubB(){
		super(1,"김학생");//상속클래스 
	}
	SubB(int bun,String name,int age){
		super(bun,name);
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	void print() {
		System.out.println("나이"+age);
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		B b=new B(1,"aaa");
		SubB sb=new SubB();
		SubB a=new SubB(2,"bbb",30);
	}

}
