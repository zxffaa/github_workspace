package com.jslhrd.aaa;

//함수적 인터페이스:인터페이스 안에 오로지 메소드가 하나 있는것
@FunctionalInterface // 어노테이션
//이벤트가 발생할떄 자주쓴다
interface AA {
	// int add(int m);
	void test();
}

public class Exam_04 {

	public static void main(String[] args) {
		AA aa = () -> {
			String str = "Hello World";
			System.out.println("str=" + str);
		};
		aa.test();
		aa = () -> {
			System.out.println("Hello World 2 !");
		};
		aa.test();

		aa = () -> System.out.println("Hello World 3 !");
		aa.test();

	}

}
