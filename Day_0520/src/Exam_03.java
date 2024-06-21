//메소드(함수) : 특정한 기능(작업)을 수행하기위한 명령문의 집합 
public class Exam_03 {
	//
	static void test() {
		System.out.println("test() 메소드 호출");
		return;//반환 또는 메소드의 끝
		//System.out.println("test() 메소드 호출");
	}
	
	public static void main(String[] args) {
		//메소드 호출
		test();
		System.out.println("----------");
		test();
		
	}
	//
}
