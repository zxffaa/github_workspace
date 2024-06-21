package com.jslhrd.aaa;

class SuperF {
	int a = 10;
}

class ChildF extends SuperF {
	int b = 20;
}

final class ChildFF extends SuperF{ //최종마지막 상속일떄
	int b=20;
}

class SubChildF extends ChildF {
	int c = 30;
}

public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
