package com.jslhrd.bbb;
class SuperA{
	
}

class SuperB{
	
}
// 클래스는 다중상속 지원을 안한다 
//ex:class SubA extends SuperA,SuperB
	
interface InterA{
	
}

interface InterB{
	
}
//인터페이스는 다중으로 사용가능하다
class SubInter implements InterA,InterB{
	
}
class SubAA extends SuperA implements InterA,InterB{
	
}
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
