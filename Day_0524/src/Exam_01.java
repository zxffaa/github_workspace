//재귀메소드(함수):recursion [자기자신을 호출]
public class Exam_01 {
	static void function() {
		System.out.println("Hello world");
		function();
	}
	public static void main(String[] args) {
		function();

	}

}
